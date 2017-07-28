package spring.ex13.dataAccess;

import spring.ex13.Amount;

public class BankAccountDatasource implements BankAccountRepository {


    /**
    Compare amount and deposit, return true if deposit has enough to withdraw.
     */
    @Override
    public boolean canWithdraw(Amount amount) {

        return false;
    }


    @Override
    public Amount balance() {
        return null;
    }

    @Override
    public void withDraw(Amount amount) {

    }
}
