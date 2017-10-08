package Task2_2;

import java.security.Timestamp;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Георгий on 30.09.2017.
 */
public class Task2_2_Lists {
    public static void main(String[] args){
        ArrayList<String> arrayList = new ArrayList<String>();
        LinkedList<String> linkedList = new LinkedList<String>();
        fillingArrayList(arrayList);
        fillingLinkedList(linkedList);
        System.out.println();
        searchingArrayList(arrayList);
        searchingLinkedList(linkedList);
        System.out.println();
        deletingArrayList(arrayList);
        deletingLinkedList(linkedList);
    }

    public static void fillingArrayList(ArrayList<String> arrayList){
        long startTimeArray = System.currentTimeMillis();
        for (int i=1; i<=10000; i++){
            arrayList.add(String.format("Item%S",i));
        }
        long totalTimeArray = System.currentTimeMillis() - startTimeArray;
        System.out.println("ArrayList was being added for: " + totalTimeArray + " milliseconds");
    }


    public static void fillingLinkedList(LinkedList<String> linkedList){
        long startTimeLinked = System.currentTimeMillis();
        for (int k=1; k<=10000; k++){
            linkedList.add(String.format("Item%S",k));
        }
        long totalTimeLinked = System.currentTimeMillis() - startTimeLinked;
        System.out.println("LinkedList was being added for: " + totalTimeLinked + " milliseconds");
    }

    public static void searchingArrayList(ArrayList<String> arrayList){
        long startTimeArray = System.nanoTime();
        arrayList.get(5000);
        long totalTimeArray = System.nanoTime() - startTimeArray;
        System.out.println("Element was being found in ArrayList for: " + totalTimeArray + " nanoseconds");
    }

    public static void searchingLinkedList(LinkedList<String> linkedList){
        long startTimeLinked = System.nanoTime();
        linkedList.get(5000);
        long totalTimeLinked = System.nanoTime() - startTimeLinked;
        System.out.println("Element was being found in LinkedList for: " + totalTimeLinked + " nanoseconds");
    }

    public static void deletingArrayList(ArrayList<String> arrayList){
        long startTimeArray = System.nanoTime();
        arrayList.remove(5000);
        long totalTimeArray = System.nanoTime() - startTimeArray;
        System.out.println("Element was being deleted in ArrayList for: " + totalTimeArray + " nanoseconds");
    }

    public static void deletingLinkedList(LinkedList<String> linkedList){
        long startTimeLinked = System.nanoTime();
        linkedList.remove(5000);
        long totalTimeLinked = System.nanoTime() - startTimeLinked;
        System.out.println("Element was being deleted in LinkedList for: " + totalTimeLinked + " nanoseconds");
    }
}

/*
if (totalTimeArray> totalTimeLinked){
            System.out.println("LinkedList is faster for filling than ArrayList.");
        }
        else {System.out.println("ArrayList is faster for filling than LinkedList.");}
        System.out.println();

         if (totalTimeArray> totalTimeLinked){
            System.out.println("LinkedList is faster for searching than ArrayList.");
        }
        else {System.out.println("ArrayList is faster for searching than LinkedList.");}
        System.out.println();

          if (totalTimeArray> totalTimeLinked){
            System.out.println("LinkedList is faster for deleting than ArrayList.");
        }
        else {System.out.println("ArrayList is faster for deleting than LinkedList.");}
*/
