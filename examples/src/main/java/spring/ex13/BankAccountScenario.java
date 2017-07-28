package spring.ex13;

/**
 * sinario class is business function constracted with multi service classes.
 *
 */
public class BankAccountScenario {

    //@Autowired
    BankAccountService queryService;
    //@Autowired
    BankAccountUpdateService updateService;


    // need transaction lock before execution ?
    Amount withdraw(Amount amount){
        if (! queryService.canWithdraw(amount)) throw new IllegalStateException("Your deposit is not enough.");

        updateService.withdraw(amount);
        return queryService.balance();
    }
}
