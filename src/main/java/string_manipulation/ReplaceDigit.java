//6. Replace "R" from Rahim with "F" from the given String:
//Input: Ratul and Rahim lives in Rangpur
//Output: Ratul and Fahim lives in Rangpur
package string_manipulation;

public class ReplaceDigit {
    public static void main(String[] args) {
        String str ="Ratul and Rahim lives in Rangpur";
        String replace = str.replace("Rahim","Fahim");
        System.out.println(replace);

    }
}
