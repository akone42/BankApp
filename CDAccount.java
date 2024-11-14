import java.time.LocalDate;
import java.time.Period;
public class CDAccount extends BankAccount{
    LocalDate StartDate;
    Period Term;
    public CDAccount(String AccountNumber, MonetaryValue Balance, LocalDate StartDate, Period Term){
        super(AccountNumber, Balance);
        this.StartDate = StartDate;
        this.Term = Term;
    }
    public LocalDate getTermEnd(){
        return StartDate.plus(Term);
    }
    @Override
    public boolean withdrawalNotAllowed(MonetaryValue amount){
        LocalDate today = LocalDate.now();
        return super.withdrawalNotAllowed(amount) || today.isBefore(StartDate.plus(Term));
    }
}
