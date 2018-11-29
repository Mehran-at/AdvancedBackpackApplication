// Hansel is preparing himself for a trip and wants to make sure he has packed at least one of everything.
// . Create the AdvancedBackpackApplication class and write the following instructions in its main method:
// . Create the Item class that has one name.
// . Create an empty backpack set of Item and display it.
// . Create three different Item objects.
// . Add them to the backpack set and display it. To display the Item class create the toString method.
// . Create a new Item with the same name as a previous one and use it to ask if is contained in the set and display the answer. To compare an Item automatically you need to create the equals method in the Item class. Specify that two Items are the same if their name is the same.
// . Use the last Item you created to remove the original one from the set. To remove an Item automatically you need to create the equals method in the Item class.
// . Ask if the element you just removed is not contained in the set and display the answer.
// . Add one of the existing items twice and display the set.
// . Display its size.
//    Hints:
//   >Use Intellij shortcuts to create the toString and equals methods.

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
