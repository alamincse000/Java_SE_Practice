//3. Input 2 decimal numbers and check if they are both same or different up to two decimal places.
package conditional_statement;

import java.util.Scanner;

public class DecimalNumberCheck {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first decimal number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Input second decimal number: ");
        double num2 = scanner.nextDouble();
        scanner.close();

        if (Math.abs(num1 - num2) <= 0.01) {
            System.out.println("These number are same");
        } else {
            System.out.println("These number are different");
        }

    }
}
