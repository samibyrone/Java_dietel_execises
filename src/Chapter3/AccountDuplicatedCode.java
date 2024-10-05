package Chapter3;

import java.util.Scanner;

public class AccountDuplicatedCode {

    private String name;
    private Double Balance;

    public AccountDuplicatedCode(String Name, Double Balance) {
        setName(Name);
        setBalance(Balance);
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public String getName() {
        return this.name;
    }

    public void setBalance(double Balance) {
        if(Balance > 0.0) this.Balance = Balance;
    }

    public double getBalance() {
        return Balance;
    }

    public void deposit(double Amount) {
        if(Amount > 0.0) Balance += Amount;
        else System.out.println("Invalid Deposit Amount!!!, You Don't Have Enough Money Biko");
    }

    public static void main(String[] args) {
        Scanner samibyrone = new Scanner(System.in);

        System.out.print("\nEnter Your Account Name: ");
        String Name = samibyrone.nextLine();

        System.out.print("\nKindly Enter Your Deposit Amount " + Name +": ");
        double Amount = samibyrone.nextDouble();

        AccountDuplicatedCode account = new AccountDuplicatedCode(Name, Amount);
        System.out.println("\nYour Account Name: " + account.getName());
        System.out.println("\nYou Deposited " + Amount + " into Your Account.");
        System.out.print("\nYour Account Details "+ account.getName() +" With Available Balance of: "+ account.getBalance());
    }
}
