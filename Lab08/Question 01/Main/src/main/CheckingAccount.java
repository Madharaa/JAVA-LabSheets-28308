package main;
public class CheckingAccount extends BankAccount
{
    public CheckingAccount(String accountNumber, double balance)
    {
        super(accountNumber, balance);
    }
    
    @Override
    public double calculateInterest()
    {
        double interestRate=0.02;
        return getBalance()* interestRate;
    }
}
