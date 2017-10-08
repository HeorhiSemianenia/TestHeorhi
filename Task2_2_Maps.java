package Task2_2;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * Created by Георгий on 01.10.2017.
 */
public class Task2_2_Maps {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        fillingHashMap(hashMap);
        fillingTreeMap(treeMap);
        System.out.println();
        searchingHashMap(hashMap);
        searchingTreeMap(treeMap);
        System.out.println();
        deletingHashMap(hashMap);
        deletingTreeMap(treeMap);
    }

    public static void fillingHashMap(HashMap<Integer, String> hashMap){
        long startTimeHash = System.currentTimeMillis();
        for (int i=1; i<=10000; i++){
            hashMap.put(i,String.format("Item%S",i));
        }
        long totalTimeHash = System.currentTimeMillis() - startTimeHash;
        System.out.println("HashMap was being added for: " + totalTimeHash + " milliseconds");}

    public static void fillingTreeMap(TreeMap<Integer, String> treeMap){
        long startTimeTree = System.currentTimeMillis();
        for (int k=1; k<=10000; k++){
            treeMap.put(k,String.format("Item%S",k));
        }
        long totalTimeTree = System.currentTimeMillis() - startTimeTree;
        System.out.println("TreeMap was being added for: " + totalTimeTree + " milliseconds");}

    public static void searchingHashMap(HashMap<Integer, String> hashMap){
        long startTimeHash = System.nanoTime();
        hashMap.get(5000);
        long totalTimeHash = System.nanoTime() - startTimeHash;
        System.out.println("HashMap was being found for: " + totalTimeHash + " nanoseconds");}


    public static void searchingTreeMap(TreeMap<Integer, String> treeMap){
        long startTimeTree = System.nanoTime();
        treeMap.get(5000);
        long totalTimeTree = System.nanoTime() - startTimeTree;
        System.out.println("TreeMap was being found for: " + totalTimeTree + " nanoseconds");}

    public static void deletingHashMap(HashMap<Integer, String> hashMap){
        long startTimeHash = System.nanoTime();
        hashMap.remove(5000);
        long totalTimeHash = System.nanoTime() - startTimeHash;
        System.out.println("HashMap was being deleting for: " + totalTimeHash + " nanoseconds");}


    public static void deletingTreeMap(TreeMap<Integer, String> treeMap){
        long startTimeTree = System.nanoTime();
        treeMap.remove(5000);
        long totalTimeTree = System.nanoTime() - startTimeTree;
        System.out.println("TreeMap was being deleting for: " + totalTimeTree + " nanoseconds");}
}
