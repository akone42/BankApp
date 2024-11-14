public class BonusAccount extends BankAccount{
    MonetaryValue Bonus;
    public BonusAccount(String AccountNumber, MonetaryValue Balance, MonetaryValue Bonus){
        super(AccountNumber, Balance);
        this.Bonus = Bonus;
    }
    @Override
    public boolean deposit(MonetaryValue amount){
        if(super.deposit(amount)){
            if(amount.isGreaterThan(new MonetaryValue("100"))){
                super.deposit(Bonus);
            }
            return true;
        }
        return false;
    }
}
