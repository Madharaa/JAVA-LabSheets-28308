package main;
public class SavingsAccount extends BankAccount
{
    public SavingsAccount(String accountNumber, double balance)
    {
        super(accountNumber,balance);
    }
    @Override
    public double calculateInterest()
    {
        double interestRate=0.12;
        return getBalance()*interestRate;
    }
}
