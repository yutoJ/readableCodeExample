package spring.ex13;

import spring.ex13.dataAccess.BankAccountRepository;

//@service
public class BankAccountService {

    //Autowired
    BankAccountRepository repository;

    //Bad Code: this method has 2 responsibility, refer, and update
    Amount withdraw(Amount amount){
        //
        repository.withdraw(amount);
        return repository.balance();
    }

    //Fixed Code1 : refer
    Amount balance(){
        return repository.balance();
    }

    boolean canWithdraw(Amount amount){
        Amount balance = balance();
        return balance.has(amount);
    }
}
