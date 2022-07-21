//1. Take input from a user and check if the number exists in the array
//let the array is [1,3,5,7,2,4,6,8]
package function_array;

import java.util.Scanner;

public class CheckExitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 3, 5, 7, 2, 4, 6, 8};
        System.out.println("Enter Exit element : ");
        int toFind = sc.nextInt();

        boolean found = false;

        for (int n : arr) {
            if (n == toFind) {
                found = true;
                break;
            }

        }
        if (found)
            System.out.println("Found Element");
        else
            System.out.println("No Found element");

    }
}
