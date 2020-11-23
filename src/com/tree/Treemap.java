package com.tree;

import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            TreeMap tm=new TreeMap();
            tm.put(1,"one");
            tm.put(2,"two");
            tm.put(3,"three");
            tm.put(4,"four");
            tm.put(5,"five");
            System.out.println(tm);
            System.out.println(tm.ceilingKey(3));
            System.out.println(tm.values());
            System.out.println(tm.clone());
            System.out.println(tm.containsKey(4));
            System.out.println(tm.firstKey());
            System.out.println(tm.floorKey(2));
            System.out.println(tm.isEmpty());
            System.out.println(tm.lastKey());
            System.out.println(tm.pollFirstEntry());
       
            
	}

}
