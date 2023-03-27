package generics;

import java.util.ArrayList;
import java.util.List;

public class Shop<T extends ShopItem> {
    private List<T> shopItems;

    public Shop(List<T> items) {
        this.shopItems = new ArrayList<>();
        shopItems.addAll(items);
    }

    public void addItem(T item) {
        shopItems.add(item);
    }

    public List<T> findByCategory(Category cat) {
        List<T> results = new ArrayList<>();
        for (T item : shopItems) {
            if (item.getCategory().equals(cat)) {
                results.add(item);
            }
        }
        return results;
    }

    public List<T> findWithLowerPrice(int maxPrice) {
        List<T> results = new ArrayList<>();
        for (T item : shopItems) {
            if (item.getPrice() < maxPrice) {
                results.add(item);
            }
        }
        return results;
    }

    public T findByName(String name) {
        for (T item : shopItems) {
            if (item.getName().equalsIgnoreCase(name)) {
                return item;
            }
        }
        return null;
    }

    public T removeItem(String name) {
        T removedItem = null;
        for (T item : shopItems) {
            if (item.getName().equalsIgnoreCase(name)) {
                removedItem = item;
            }
        }
        shopItems.remove(removedItem);
        return removedItem;
    }

    public List<T> findAllByName(String name) {
        List<T> results = new ArrayList<>();
        for (T item : shopItems) {
            if (item.getName().equalsIgnoreCase(name)) {
                results.add(item);
            }
        }
        return results;
    }

    public void removeAllItemsByName(String name) {
        List<T> itemsToRemove = new ArrayList<>();
        for (T item : shopItems) {
            if (item.getName().equalsIgnoreCase(name)) {
                itemsToRemove.add(item);
            }
        }
        shopItems.removeAll(itemsToRemove);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Shop items:");
        for (T item : shopItems) {
            stringBuilder.append("\nItem: " + item.getName()
                    + ", price " + item.getPrice()
                    + ", category " + item.getCategory());
        }
        return stringBuilder.toString();
    }
}
