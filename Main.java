package OOP02;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount();
        Scanner scanner = new Scanner(System.in);

        //set Acc number and Acc Holder Name
        savingsAccount.setDetails("123456789", "Your Name");

        //Give instructions for exit and continue
        System.out.println("if you want to exit please enter \"x\"");
        System.out.println("if you want to continue again please enter \"c\"");
        System.out.println("if you want close the cmd please enter \"e\"");
        System.out.println("-----------------------------------------------------");

        while (true) {
            System.out.print("Do you want to exit (y/n) ---> ");
            String userInput = scanner.nextLine();
            System.out.println("-----------------------------------------------------");

            if (Objects.equals(userInput, "y")) {
                System.out.println("Exiting...");
                System.exit(0);

            } else if (Objects.equals(userInput, "n")) {
                //Check the condition for deposit or withdrawal
                savingsAccount.checkNeed();

                //Take deposit or give withdrawal
                savingsAccount.calculateBalance();

                //Print the balance after taking deposit or withdrawal
                savingsAccount.displayBalance(savingsAccount.calculateInterest(12));

            } else {
                System.out.println("Sorry, you entered a wrong keyword please try again..!");
            }
        }
    }
}
