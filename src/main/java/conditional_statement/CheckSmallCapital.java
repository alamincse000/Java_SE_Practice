// 1. Write a program to check if inputted letter is small or capital
package conditional_statement;

import java.util.Scanner;

public class CheckSmallCapital {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
            System.out.println("Enter small or capital letter :");
            char letter = scan.next().charAt(0);

            if (letter >= 'a' && letter <= 'z') {
                System.out.println("Showing small letter");
            } else {
                System.out.println("Can't find small letter");
            }

    }
}
