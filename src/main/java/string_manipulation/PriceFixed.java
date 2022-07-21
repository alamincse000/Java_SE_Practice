//2. Price of a formal shirt is 1200 tk and Sharee is 3500 tk. If you buy 2 shirt and 1 sharee, then 400 tk will be discounted. After your purchase what will be your total cost?
package string_manipulation;

public class PriceFixed {
    public static void main(String[] args) {
        String str = "Price of a formal shirt is 1200 tk and Sharee is 3500 tk";
        str = str.replaceAll("[^\\d]", " ");
        str = str.trim();
        str = str.replaceAll(" +", " ");
        String[] arr = (str.split(" "));
        double shirt_price = (Double.parseDouble(arr[0]) * 2);
        double sharee = Double.parseDouble(arr[1]);
        double total = shirt_price + sharee - 400;
        System.out.println("Total price " + total);

    }
}
