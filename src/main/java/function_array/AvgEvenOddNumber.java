//5. Take 5 numbers from users in an array. Then find out the average number, how many even and how many odd numbers using these functions: average(), countEvenNumbers(), countOddNumbers()
package function_array;

import java.util.Scanner;

public class AvgEvenOddNumber {
    public static void main(String[] args) {
        average();
        countEvenNumbers();
        countOddNumbers();

    }

    public static void average() {
        Scanner sc = new Scanner(System.in);
        double[] num = new double[5];
        System.out.println("Enter five number : ");

        double sum = 0, avg = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextDouble();
            sum += num[i];
            avg = sum / 5;

        }
        System.out.println("Average five number = " + avg);
    }

    public static void countEvenNumbers() {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        System.out.println("Enter five value :");

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
            if (num[i] % 2 == 0) {


                System.out.println(num[i]);

            }
        }


    }

    public static void countOddNumbers() {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        System.out.println("Enter five integer value : ");


        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
            if (num[i] % 2 != 0) {


                System.out.println(num[i]);
            }
        }


    }
}
