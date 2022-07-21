//7. Write a program to print prime numbers from 2 to n
package conditional_statement;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Prime number : ");
        int n = scan.nextInt();
        boolean flag = true;
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }

        if (flag == true)
            System.out.println(n + " is a prime number.");
        else
            System.out.println(n + " is not a prime number.");


    }
}
