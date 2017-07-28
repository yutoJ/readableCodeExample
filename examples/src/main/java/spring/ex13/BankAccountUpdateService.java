package spring.ex13;

import spring.ex13.dataAccess.BankAccountRepository;

public class BankAccountUpdateService {

    //Autowired
    BankAccountRepository repository;

    //Fixed Code1 : update
    void withdraw(Amount amount){
        repository.withdraw(amount);
    }

}
