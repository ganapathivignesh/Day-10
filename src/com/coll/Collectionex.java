package com.coll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Collectionex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		ArrayList al=new ArrayList();
		al.add(45);
		al.add(41);
		al.add(26);
		al.add(63);
		System.out.println(al);
		int c[]={1,2,3,4,5,6,7};
		int d[]=null;
		Object[] a=al.toArray();
		for(Object l:a)
		{
			System.out.println(l);
		}
		Object[] b=Arrays.copyOfRange(a, 1, 3);
		System.out.println();
		
		
		for(Object l1:a)
		{
			System.out.println(l1);
		}
		d=Arrays.copyOfRange(c, 2, 4);
		
		for(int l:d)
		{
			System.out.println(l);
		}
		
		System.out.println(Arrays.binarySearch(a,45));
		System.out.println();
		
		
		
		Arrays.fill(a,9);
		for(Object l:a)
		{
			System.out.println(l);
		}

		System.out.println(Arrays.equals(c,d));

		System.out.println(Arrays.asList(a));
		
		int n[]=Arrays.copyOf(d, 4);
		
		for(int u:n)
		{
			System.out.println(u);
		}
		System.out.println(Arrays.deepHashCode(a));
		
		Arrays.parallelSort(n);
		for(int u:n)
		{
			System.out.println(u);
		}
		
		Arrays.sort(b);
		for(Object u:b)
		{
			System.out.println(u);
		}
		
	}

}
