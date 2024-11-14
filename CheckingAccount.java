public class CheckingAccount extends BankAccount{
    private MonetaryValue OverDraftLimit;
    public CheckingAccount(String accountNumber,MonetaryValue Balance, MonetaryValue OverDraftLimit){
        super(accountNumber,Balance);
        this.OverDraftLimit = OverDraftLimit;
    }
    public MonetaryValue getOverdraftLimit(){
        return OverDraftLimit;
    }
    @Override
    protected boolean withdrawalNotAllowed(MonetaryValue amount) {
        return  amount.isNegative() || (OverDraftLimit.plus(getBalance())).isLessThan(amount);
    }
}