package Exam;

public class Withdraw extends Transaction{

    public void excute(BankAccount acc, Double amount){

       if (acc.getAmount()<amount) {
        System.out.println("Your current balance: "+acc.getAmount());
        System.out.println("Withdraw money: -"+amount);
           System.out.println("Sorry your balance is not enough");
       } else {
        System.out.println("Your current balance: "+acc.getAmount());
        acc.setAmount(acc.getAmount()-amount);
        System.out.println("Withdraw money: -"+amount);
        System.out.println("Your balance: "+acc.getAmount());
       }
    }
    
}
