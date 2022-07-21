//3. Core i 7 HP laptop price is 76000 tk and cash payment discount 10%. What will be the purchase price?
package string_manipulation;

public class DiscountPrice {
    public static void main(String[] args) {
        String str = "HP laptop price is 76000 tk and cash payment discount 10%";
        str = str.replaceAll("[^\\d]", " ");
        str = str.trim();
        str = str.replaceAll(" +", " ");
        String[] arr = (str.split(" "));
        double laptop_Price = Double.parseDouble(arr[0]);
        double discount = Double.parseDouble(arr[1]);
        double discount_price =laptop_Price-(laptop_Price*discount/100);
        System.out.println("Purchase price is " + discount_price);

    }
}
