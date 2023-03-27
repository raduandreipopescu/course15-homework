package generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Shop<Clothes> clothesShop = new Shop<>(new ArrayList<>());

        clothesShop.addItem(new Clothes("Jeans", 300, Category.NEW));
        clothesShop.addItem(new Clothes("T shirt", 100, Category.NEW));
        clothesShop.addItem(new Clothes("Jacket", 500, Category.REFURBISHED));
        clothesShop.addItem(new Clothes("Jacket", 250, Category.ON_SALE));

        System.out.println("Initial " + clothesShop);

        System.out.println("\nOn sale items: " + clothesShop.findByCategory(Category.ON_SALE));
        System.out.println("\nCheaper than 300 items: " + clothesShop.findWithLowerPrice(300));
        System.out.println("\nThe clothes shop has jeans? " + clothesShop.findByName("jeans"));

        System.out.println("\nFound any jeans to remove? " + clothesShop.removeItem("jeans"));
        System.out.println();

        System.out.println("After removing jeans " + clothesShop);
        System.out.println();

        System.out.println("Shop has jackets? " + clothesShop.findAllByName("jacket"));
        System.out.println();

        clothesShop.removeAllItemsByName("jacket");
        System.out.println("After removing all jackets " + clothesShop);
    }
}
