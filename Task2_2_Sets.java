package Task2_2;

import java.util.HashSet;
import java.util.Map;
import java.util.TreeSet;

/**
 * Created by Георгий on 30.09.2017.
 */
public class Task2_2_Sets {
    public static void main(String[] args){
        HashSet<String> hashSet = new HashSet<String>();
        TreeSet<String> treeSet = new TreeSet<String>();
        fillingHashSet(hashSet);
        fillingTreeSet(treeSet);
        System.out.println();
        searchingHashSet(hashSet);
        searchingTreeSet(treeSet);
        System.out.println();
        deletingHashSet(hashSet);
        deletingTreeSet(treeSet);
    }

    public static void fillingHashSet(HashSet<String> hashSet){
        long startTimeHash = System.currentTimeMillis();
        for (int i=1; i<=10000; i++){
            hashSet.add(String.format("Item%S",i));
        }
        long totalTimeHash = System.currentTimeMillis() - startTimeHash;
        System.out.println("HashSet was being added for: " + totalTimeHash + " milliseconds");
    }

    public static void fillingTreeSet(TreeSet<String> treeSet){
        long startTimeTree = System.currentTimeMillis();
        for (int k=1; k<=10000; k++){
            treeSet.add(String.format("Item%S",k));
        }
        long totalTimeTree = System.currentTimeMillis() - startTimeTree;
        System.out.println("TreeSet was being added for: " + totalTimeTree + " milliseconds");
    }

    public static void searchingHashSet(HashSet<String> hashSet){
        long startTimeHash = System.nanoTime();
        for (String i: hashSet){
            if (i.equals("Item5000")){
                break;
            }
        }
        long totalTimeHash = System.nanoTime() - startTimeHash;
        System.out.println("Element was being found in HashSet for: " + totalTimeHash + " nanoseconds");
    }

    public static void searchingTreeSet(TreeSet<String> treeSet){
        long startTimeTree = System.nanoTime();
        for (String i: treeSet){
            if (i.equals("Item5000")){
                break;
            }
        }
        long totalTimeTree = System.nanoTime() - startTimeTree;
        System.out.println("Element was being found in TreeSet for: " + totalTimeTree + " nanoseconds");
    }

    public static void deletingHashSet(HashSet<String> hashSet){
        long startTimeHash = System.nanoTime();
        hashSet.remove("Item5000");
        long totalTimeHash = System.nanoTime() - startTimeHash;
        System.out.println("Element was being deleted in HashSet for: " + totalTimeHash + " nanoseconds");
    }

    public static void deletingTreeSet(TreeSet<String> treeSet){
        long startTimeTree = System.nanoTime();
        treeSet.remove("Item5000");
        long totalTimeTree = System.nanoTime() - startTimeTree;
        System.out.println("Element was being deleted in TreeSet for: " + totalTimeTree + " nanoseconds");
    }
}

/*
        if (totalTimeTree > totalTimeHash){
            System.out.println("HashSet is faster for filling than TreeSet.");
        }
        else {System.out.println("TreeSet is faster for filling than HashSet.");}
        System.out.println();

        //searching
        if (totalTimeTree > totalTimeHash){
            System.out.println("HashSet is faster for searching than TreeSet.");
        }
        else {System.out.println("TreeSet is faster for searching than HashSet.");}
        System.out.println();


        //deleting
        if (totalTimeTree > totalTimeHash){
            System.out.println("HashSet is faster for searching than TreeSet.");
        }
        else {System.out.println("TreeSet is faster for searching than HashSet.");}
    }*/
