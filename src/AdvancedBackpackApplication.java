import com.sun.beans.editors.ShortEditor;

import java.util.*;

public class AdvancedBackpackApplication {
    public static void main(String[] args) {
        Set<Item> item = new HashSet();
        System.out.println("\nBackpack: " + item);
        Item itemN = new Item("Lighter");
        Item itemM = new Item("GPS");
        Item itemL = new Item("Sleeping bag");
        item.add(itemN);
        item.add(itemM);
        item.add(itemL);
        System.out.println("\n Backpack:" + item.toString());
        Item itemS = new Item("Sleeping bag");
        if (itemS.equals(itemL)) {
            System.out.println("\n The backpack contains Sleeping bag");
            System.out.println("\n " + item);
            item.remove(itemS);
            item.remove(itemL);
            System.out.println(item);
            System.out.println("\n The backpack no longer contains Sleeping bag");
        }
        else {
            System.out.println("\n " + item.toString());
        }
        if (!item.contains(itemS)) {
            System.out.println(item);
        }
        else {
        item.add(itemM);
        System.out.println(item);
        System.out.println(item.size());
        }
    }
}
