package Exam;

public class ViewBalance extends Transaction{

    public void excute(BankAccount acc, Double amount){

        System.out.println("Your money: "+acc.getAmount());
    }
    
}
