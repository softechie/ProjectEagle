package com.pe.l1.underConstruction1;

import java.util.*;
import java.awt.Point;

public class collection {

	final static int SIZE = 10;

	public static void main(String[] args) {

		// experiment1();
		// experiment2();
		// experiment3();
		// experiment4();
		// experiment5();
		// experiment6();
		// experiment7();
		experiment8();

	}

	public static void experiment1() {
		// IDIOM:Item-0006: Code to contracts (eg. List), not implementations (eg.
		// ArrayList)
		List<Integer> mylist = new ArrayList(10);
		int count = 0;
		while (count < 10) {
			mylist.add(new Integer(count + 1));
			++count;
		}
		System.out.println(mylist);
	}

	public static void experiment2() {
		List<Integer> mylist = new ArrayList(SIZE);
		int count = 0;
		while (count < SIZE) {
			mylist.add(new Integer(count + 1));
			++count;
		}
		Collections.shuffle(mylist);
		System.out.println(mylist);

	}

	public static void experiment3() {

		// setup
		List<Integer> mylist = new ArrayList(SIZE);
		int count = 0;
		while (count < SIZE) {
			mylist.add(new Integer(count + 1));
			++count;
		}
		Collections.shuffle(mylist);
		System.out.println(mylist);

		// search
		Integer value = new Integer(5);

		if (Collections.frequency(mylist, value) == 0)
			System.out.println("5 is not in the list");
		else
			System.out.println("5 is in the list");

		ArrayList<Integer> target = new ArrayList<Integer>(1);
		target.add(value);

		int index = Collections.indexOfSubList(mylist, target);
		if (index == -1)
			System.out.println("5 is not in the list");
		else
			System.out.println("5 is in the list at index" + index);
	}

	public static void experiment4() {

		List<Integer> mylist = new ArrayList(SIZE);
		int count = 0;
		while (count < SIZE) {
			mylist.add(new Integer(count + 1));
			++count;
		}
		Collections.shuffle(mylist);
		System.out.println(mylist);

		Collections.sort(mylist);
		System.out.println(mylist);
	}

	public static void experiment5() {
		List<Point> mylist = new ArrayList<Point>(SIZE);
		int count = 0;
		while (count < SIZE) {
			mylist.add(new Point(count + 1, count + 1));
			++count;
		}
		Collections.shuffle(mylist);
		System.out.println(mylist);

		// Collections.sort(mylist);
		System.out.println(mylist);
	}

	public static void experiment6() {
		List<Integer> mylist = new ArrayList(SIZE);
		int count = 0;
		while (count < SIZE) {
			mylist.add(new Integer(count + 1));
			++count;
		}
		Collections.shuffle(mylist);
		System.out.println(mylist);

		Collections.sort(mylist);
		System.out.println(mylist);

		Integer value = new Integer(-3);
		System.out.println(Collections.binarySearch(mylist, value));
	}

	public static void experiment7() {
		List<Integer> mylist = new ArrayList(SIZE);
		int count = 0;
		while (count < SIZE) {
			mylist.add(new Integer(count + 1));
			++count;
		}
		Collections.shuffle(mylist);
		System.out.println(mylist);

		System.out.println(" the minimum is " + Collections.min(mylist));
		System.out.println(" the maximum is " + Collections.max(mylist));
	}

	public static void experiment8() {

		List<String> stringList = Arrays.asList("a", "b", "c");
		//IDIOM:Item-0131: Prefer immutable collections
		stringList = Collections.unmodifiableList(stringList);
		System.out.println(stringList);
	}
}
