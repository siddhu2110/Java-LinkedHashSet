package com.linkedhashset;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(25);
        linkedHashSet.add(52);
        linkedHashSet.add(35);
        linkedHashSet.add(47);
        linkedHashSet.add(93);
        linkedHashSet.addFirst(13);
        linkedHashSet.addLast(86);
        linkedHashSet.add(57);
        System.out.println(linkedHashSet);
        System.out.println(linkedHashSet.removeFirst());
        System.out.println(linkedHashSet.addAll(Arrays.asList(91,20,61,64)));
        System.out.println(linkedHashSet);
        System.out.println(linkedHashSet.contains(57));
        System.out.println(linkedHashSet.containsAll(Arrays.asList(65,82,93,02)));
        System.out.println(linkedHashSet);
        System.out.println(linkedHashSet.isEmpty());
        System.out.println(linkedHashSet.remove(96));
        System.out.println(linkedHashSet.removeAll(Arrays.asList(100,56,93)));
        System.out.println(linkedHashSet.getClass());
//        linkedHashSet.reversed();
//        System.out.println(linkedHashSet);
        System.out.println(linkedHashSet.reversed());
        linkedHashSet.stream().sorted();
        System.out.println(linkedHashSet);



    }
}





//        LinkedHashSet<Integer> linkedhashset1 = new LinkedHashSet<>();
//        linkedhashset1.add(12);
//        linkedhashset1.add(36);
//        linkedhashset1.add(81);
//        linkedhashset1.add(61);
//        linkedhashset1.add(25);
//        linkedhashset1.add(42);
//        linkedhashset1.add(91);
//        linkedhashset1.add(75);
//        ArrayList<Integer> arraylist=new ArrayList<>(linkedhashset1);
//        Collections.sort(arraylist);
//        linkedhashset1.clear();
//        linkedhashset1.addAll(arraylist);
//        System.out.println(linkedhashset1);
