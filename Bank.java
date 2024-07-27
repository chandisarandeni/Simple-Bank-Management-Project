package OOP02;

import java.util.Scanner;

public class Bank {
    protected String AccNumber;
    protected String AccHolderName;
    protected float Balance;
    protected float Deposit;
    protected float Withdraw;
    protected int status;
    protected String exitSignal;
    protected float Interest;

    public Bank() {
        AccNumber = null;
        AccHolderName = null;
        Balance = 0;
        Deposit = 0;
        Withdraw = 0;
        status = 2;
        exitSignal = "0";
    }

    //set Account Holder details through parameters
    public void setDetails(String accNumber, String accHolderName) {
        this.AccNumber = accNumber;
        this.AccHolderName = accHolderName;

        System.out.println("Name \t\t\t: " + this.AccHolderName);
        System.out.println("Account Number \t: " + this.AccNumber);
        System.out.println("-----------------------------------------------------");
    }

    //Set deposit amount
    public void depositMoney(float deposit) {
        this.Deposit = deposit;
    }

    //Set withdrawal amount
    public void withdrawMoney(float withdraw) {
        this.Withdraw = withdraw;
    }

    //Check customer need
    //---> Deposit or withdrawal
    public void checkNeed() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("If you want to Deposit please enter \"1\"");
        System.out.print("If you want to Withdraw please enter \"0\" -----> ");
        status = scanner.nextInt();
        System.out.println("-----------------------------------------------------");
    }

    //Check the condition for the deposit or withdrawal
    //Do the calculation for the deposit ot withdrawal
    //return the balance
    public void calculateBalance() {
        //Deposit the amount
        if (this.status == 1) {
            System.out.print("Enter the deposit amount : Rs. ");
            Scanner scanner = new Scanner(System.in);
            depositMoney(scanner.nextFloat());

            Balance += Deposit;
            System.out.println("Deposited successfully...!");
            return;
        } else if (this.status == 0) { //Input withdrawal amount
            System.out.print("Enter the withdraw amount : Rs. ");
            Scanner scanner = new Scanner(System.in);
            withdrawMoney(scanner.nextFloat());

            //Check withdrawal amount with the balance
            if (Balance >= Withdraw) {
                Balance -= Withdraw;
                System.out.println("Withdrawal successfully...!");
            } else {
                System.out.println("Sorry, you cannot withdraw money because you have not enough money...");
            }
            return;

        }
        System.out.println("You entered a wrong value");
    }

    //Display balance
    public void displayBalance(float interest) {
        this.Interest = interest;
        System.out.println("Interest for the current amount : "+ interest);
        System.out.println("Balance \t: Rs. " + (Balance + interest));
    }

}
