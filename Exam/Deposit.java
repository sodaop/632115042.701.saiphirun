package Exam;

public class Deposit extends Transaction{
    public void excute(BankAccount acc, Double amount){
        System.out.println("Your current balance: "+acc.getAmount());
        acc.setAmount(acc.getAmount()+amount);
        System.out.println("Deposit money: +"+amount);
        System.out.println("Your balance: "+acc.getAmount());
    }
    
}
