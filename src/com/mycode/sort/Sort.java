package com.mycode.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*7. Implement the method void luckySort(ArrayList<String> strings, Comparator<String>
comp) that keeps calling Collections.shuffle on the array list until the elements
are in increasing order, as determined by the comparator.*/

public class Sort {

   public static void luckySort(ArrayList<String> strings, Comparator<String> comp){
       List<String> list = new ArrayList<>(strings);
       list.sort(comp);

       do {
           Collections.shuffle(strings);
       } while (!list.equals(strings));
   }

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("my");
        strings.add("your");
        strings.add("her");
        strings.add("his");

        luckySort(strings, Comparator.naturalOrder());
        System.out.println(strings);
    }
}






