package spring.ex13.dataAccess;

import spring.ex13.Amount;

public interface BankAccountRepository {

    public boolean canWithdraw(Amount amount);

    public Amount balance();

    public void withDraw(Amount amount);
}
