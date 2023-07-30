package main;
public class Main 
{

    public static void main(String[] args) 
    {
       double checkingBalance=1000000;
       double savingsBalance=20000000;
       
       CheckingAccount checkingAccount=new CheckingAccount("CH12",checkingBalance);
       SavingsAccount savingsAccount= new SavingsAccount("SA34",savingsBalance);
       
        double checkingInterest = checkingAccount.calculateInterest();
        double savingsInterest = savingsAccount.calculateInterest();

        System.out.println("Interest for Checking Account is: $" + checkingInterest);
        System.out.println("Interest for Savings Account is: $" + savingsInterest);

    }
    
}
