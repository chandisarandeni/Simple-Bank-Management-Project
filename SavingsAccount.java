package OOP02;

public class SavingsAccount extends Bank {

    public float calculateInterest(float interestRate) {

        return super.Balance * (interestRate / 100);
    }
}
