package spring.ex13;

//@controller
public class BankAccountController {

    //@Autowired
    BankAccountService queryService;

    //@Autowired
    BankAccountUpdateService updateService;

    String withdraw(Amount amount, Model model){
        if(! queryService.canWithdraw(amount)){
            return "Balance missing view";
        }

        updateService.withdraw(amount);
        Amount balance = queryService.balance();
        model.addAttribute("balance", balance);

        return "withdraw complate view";
    }




}
