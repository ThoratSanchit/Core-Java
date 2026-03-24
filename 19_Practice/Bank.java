package javaPractice;

import java.util.Scanner;

public class Bank {
    Scanner sc = new Scanner(System.in);
    double money;
    double ammount;

    public void desposite() {
        System.out.println("Enter the money that u want to deposite: ");
        ammount = sc.nextDouble();
        money = money + ammount;
        System.out.println("Current balance is :" + money);
        openBank();
    }

    public void checkBalance() {
        System.out.println("Available balance is : " + money);
        openBank();
    }

    public void withdraw() {
        System.out.println("Enter ammount that u wants to withdraw : " + ammount);
        ammount = sc.nextDouble();
        double withdraw = money - ammount;
        if (money > 0 && ammount <= money) {
            System.out.println(" Money withdraw successfull. " + withdraw);
        } else {
            System.out.println("Insuffuicient fund.");
        }
        System.out.println("Available balance is : " + money);
        openBank();
    }

    public void openBank() {
        System.out.println("Enter 1 for checkBalance \n Enter 2 for desposite \n Enter 3 for withdraw.");
        int opt = sc.nextInt();
        if (opt == 1) {
            checkBalance();
        } else if (opt == 2) {
            desposite();
        } else if (opt == 3) {
            withdraw();
        } else {
            System.out.println("Please select the valid option.");
            openBank();
        }
    }

    public static void main(String[] args) {
        Bank newBank = new Bank();
        newBank.openBank();
    }
}
