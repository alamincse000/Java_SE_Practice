//2. Write a program to calculate GPA and find grade
package conditional_statement;

import java.util.Scanner;

public interface Calculate_CGPA {
    public static void main(String[] args) {
        int marks[] = new int[6];
        int i;
        float total = 0, avg;
        Scanner scanner = new Scanner(System.in);


        for (i = 0; i < 6; i++) {
            System.out.print("Enter Marks of Subject" + (i + 1) + ":");
            marks[i] = scanner.nextInt();
            total = total + marks[i];
        }

        avg = total / 6;
        System.out.print("The student Grade is: ");
        if (avg >= 80) {
            System.out.print("A+");
        } else if (avg >= 70 && avg < 80) {
            System.out.print("A");
        } else if (avg >= 60 && avg < 70) {
            System.out.print("B");
        } else if (avg >= 50 && avg < 60) {
            System.out.print("C");
        } else if (avg >= 40 && avg < 50) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
