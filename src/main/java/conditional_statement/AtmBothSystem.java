//4. Write a program to check balance and withdraw money from ATM booth using if else or switch case
package conditional_statement;

import java.util.Scanner;

public class AtmBothSystem {
    public static void main(String[] args) {
        int balance = 10000, withdraw, deposited;
        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("Automated Teller machine!");
            System.out.println("Choose 1 for withdraw money");
            System.out.println("Choose 2 for deposited money");
            System.out.println("Choose 3 for check balance");
            System.out.println("Choose 4 exits");
            System.out.println("Choose operation you want to program");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter money to be withdraw");
                    withdraw = scan.nextInt();
                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("Please collect money");
                    } else {
                        System.out.println("Insufficient balance");
                        break;
                    }
                case 2:
                    System.out.println("Enter money deposited");
                    deposited = scan.nextInt();
                    balance = balance + deposited;
                    System.out.println("Money deposited successfully done ");
                    break;

                case 3:

                    System.out.println("Please check balance ");
                    System.out.println("Total balance = " + balance);
                    break;
                case 4:
                    System.exit(0);

            }
        }
    }

}
