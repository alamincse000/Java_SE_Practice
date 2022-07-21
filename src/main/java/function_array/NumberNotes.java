//2. Input an amount from the user and find out the number of notes from input amount in given array
//        [1000,500,100,50,20,10,5,2,1]
//        Input: 1256
//        Output:
//        1000 1
//        100 2
//        50 1
//        2 3
package function_array;

import java.util.Scanner;

public class NumberNotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1000, 500, 100, 50, 20, 10, 5, 2, 1};
        System.out.println(" Please enter amount : ");
        int totalAmount = sc.nextInt();
        int temp = totalAmount;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Number is " + arr[i] + " Notes " + temp / arr[i]);
            temp = temp % arr[i];
        }

    }
}
