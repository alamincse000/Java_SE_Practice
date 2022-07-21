//6. Write  a program to find the factorial of a given number
package conditional_statement;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Please enter factorial number :");
        int number = scanner.nextInt();
        int fact=1;
        for (int i =1; i<=number;i++){
            fact =fact*i;

        }
        System.out.println("Factorial number is = "+ fact);

    }
}
