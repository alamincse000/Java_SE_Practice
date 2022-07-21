//1. Extract the transaction ID from the HTML body
//<html>
//<title>Test</title>
//<body>
//Your trnx is successful. Trnx Id is: TXN123456
//</body>
//</html>
//Output: TXN123456
package string_manipulation;

public class FindTRXID {
    public static void main(String[] args) {
        String str ="TXN123456";
        System.out.println(str.substring(0,9));

    }
}
