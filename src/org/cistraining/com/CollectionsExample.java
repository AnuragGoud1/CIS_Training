package org.cistraining.com;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionsExample {
    public static void main(String[] args) {
        ArrayList<String>  arr= new ArrayList<>();
        arr.add("Rav");
        arr.add("anu");
        arr.add("messi");
        arr.add("Kohli");
        arr.add("selena");

        System.out.println(" For Loop");

        for(int i=0;i< arr.size();i++){
            System.out.println(arr.get(i));
        }
        System.out.println();
        System.out.println(" Enhanced For Loop");
        for(String i: arr){
            System.out.println(i);
        }

        System.out.println();
        System.out.println(" For Each Loop");
       arr.forEach(e-> System.out.println(e));

        System.out.println();
        System.out.println(" Iterator Loop");
        Iterator<String> it = arr.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println();
        System.out.println(" Parallel Stream");
        arr.parallelStream().forEach(element -> System.out.println(element));
    }
}
