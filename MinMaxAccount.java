public class MinMaxAccount extends BankAccount{
    MonetaryValue min;
    MonetaryValue max;
    public MinMaxAccount(String AccountNumber, MonetaryValue Balance){
        super(AccountNumber,Balance);
        min = Balance;
        max = Balance;
    }
    public MonetaryValue getMin(){
        return min;
    }

    public MonetaryValue getMax() {
        return max;
    }

    @Override
    public String toString() {
        return super.toString() + "[min=" +min +", max=" + max +"]";
    }

    @Override
    public boolean deposit(MonetaryValue amount) {
        if(super.deposit(amount)) {
            if (getBalance().isGreaterThan(max)) {
                max = getBalance();
            }
            return true;
        }
        return false;
    }
    @Override
    public boolean withdraw(MonetaryValue amount) {
        if(super.withdraw(amount)){
            if (getBalance().isLessThan(min)) {
                min = getBalance();
            }
            return true;
        }
        return false;
    }
}
