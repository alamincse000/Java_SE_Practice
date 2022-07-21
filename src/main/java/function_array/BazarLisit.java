//4. Create your todays bazar list/pocket expenditure which includes the item name and price. Then create a function named searchItem(String item) which will be used to search any item from your HashMap and return the price. If found no item, then print message as "No item found" and another function named totalSum() which will return total price of items.
package function_array;

import java.util.HashMap;

public class BazarLisit {
    public static void main(String[] args) {
        HashMap<String, Integer> bazarList = new HashMap<String, Integer>();
        searchItem(String.valueOf(bazarList));
        bazarList.put("Egg", 250);
        bazarList.put("Fish", 150);
        bazarList.put("Vegetable", 120);
        bazarList.put("Appel", 140);
        bazarList.put("Oil", 200);
        System.out.println(bazarList);
        System.out.println(bazarList.get("Oil"));


    }

    public static String searchItem(String item) {

        for (int i = 0; i < item.length(); i++) {

        }
        return item;


    }

    private static String getItem(String item) {
        return item;
    }

    public static void totalSum() {


    }
}
