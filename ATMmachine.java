package ATMmachine;
import java.util.Scanner;

class ATM {
    float Balance;
    int PIN = 5674;
    Scanner s = new Scanner(System.in);

    public void checkpin() {
        System.out.println("Enter your pin: ");
        int enteredpin = s.nextInt();
        if (enteredpin == PIN) {
            menu();
        } else {
            System.out.println("Enter a valid pin");
        }
    }

    public void menu() {
        System.out.println("Enter Your Choice: ");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");

        int opt = s.nextInt();
        if (opt == 1) {
            checkBalance();
        } else if (opt == 2) {
            withdrawMoney();
        } else if (opt == 3) {
            depositMoney();
        } else if (opt == 4) {
            return;
        } else {
            System.out.println("Enter a valid choice ");
        }
    }

    public void depositMoney() {
        System.out.println("Enter the Amount: ");
        float amount = s.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money Deposited Successfully");
        menu();
    }

    public void withdrawMoney() {
        System.out.println("Enter Amount to Withdraw");
        float amount = s.nextFloat();
        if (amount > Balance) {
            System.out.println("Insufficient Balance");
        } else {
            Balance = Balance - amount;
            System.out.println("Money Withdrawal Successful");
        }
        menu();
    }

    public void checkBalance() {
        System.out.println("Balance: " + Balance);
        menu();
    }
}

public class ATMmachine {

    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkpin();
    }
}
