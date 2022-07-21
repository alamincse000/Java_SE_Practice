//4. Writea program that will give following output:
//Input: chattogram
//Output: C8M
package string_manipulation;

public class FindNumber {
    public static void main(String[] args) {
        String str = "chattogram";
        String firstLetter = String.valueOf(str.charAt(0)).toUpperCase();
        int num = str.length() - 2;
        String lastLetter = String.valueOf(str.charAt(9)).toUpperCase();
        System.out.println(firstLetter + num + lastLetter);
    }
}
