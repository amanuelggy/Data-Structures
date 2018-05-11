package com.amanuel.sets;
import java.util.*;
public class SetInterface {

	public static void main(String[] args) {
		Set<Integer> hashset = new HashSet<Integer>();
        hashset.add(4);
        hashset.add(45);
        hashset.add(6);
        hashset.add(9);
        hashset.add(4);
        System.out.println("HashSet: " + hashset);
        
        Set<String> strset = new HashSet<String>();
        strset.add("happy");
        strset.add("appy");
        strset.add("bappy");
        strset.add("sappy");
        strset.add("happy");
       System.out.println("HashSet2: " + strset);
       
       Set<String> tree = new TreeSet<String>();
        tree.add("happy");
        tree.add("appy");
        tree.add("bappy");
        tree.add("sappy");
        tree.add("happy");
       System.out.println("treeSet: " + tree);
       System.out.println("size: " + tree.size());
       
       Set<String> sorted = new HashSet<String>();
       sorted.add("d");
       sorted.add("b");
       sorted.add("a");
       sorted.add("c");
       sorted.add("happy");
       System.out.println("hashSet3: " + sorted);
       
       Set<String> union = new HashSet<String>(strset);
       union.addAll(sorted);
       System.out.println("union of set3 & sorted: " + union);
       
       Set<String> intersection = new HashSet<String>(strset);
       intersection.retainAll(sorted);
       System.out.println("intersection: " + intersection);
       Set<String> diff = new HashSet<String>(strset);
       diff.removeAll(sorted);
       System.out.println("Difference: " + diff);
       
       Set<String> linkedset = new LinkedHashSet<String>();
       linkedset.add("m");
       linkedset.add("o");
       linkedset.add("n");
       linkedset.add("q");
       System.out.println("LinkedHashSet: " + linkedset);
       

	}

}
