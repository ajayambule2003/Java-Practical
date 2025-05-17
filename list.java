// Java program to Insert Elements in LinkedList at first and last position to showcase addFirst() and addlast() Method 

import java.util.*;

public class list {

    public static void main(String args[]) { 
        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.add("e");
        linkedList.add("e");
        linkedList.add("k");
        System.out.println("Linked list: " + linkedList);

        linkedList.addFirst("G");

        linkedList.addLast("s");

        System.out.println("Updated Linked list: "
                + linkedList);
    }
}
