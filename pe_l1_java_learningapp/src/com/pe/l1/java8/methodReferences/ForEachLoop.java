package com.pe.l1.java8.methodReferences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ForEachLoop {

	public static void main(String[] args) {
		final List<Integer> list = Arrays.asList(3, 2, 1, 4);
		// shallow copies
		List<List<Integer>> list2 = Collections.nCopies(1, list);
		List<Integer> list3 = Arrays.asList(new Integer[list.size()]);
		Collections.copy(list3, list);
		Collections.sort(list);
		List<Integer> list4 = new ArrayList<>();
		// deep copy
		for (Integer num : list) {
			list4.add(num);
		}
		System.out.println(list.get(2));
		System.out.println(list2);
		System.out.println(list3);
		for (int i = 0; i < list.size(); i++) {
			ForEachLoop.print(list.get(i));
		}

		// Java 5-7
		for (int number : list) {
			ForEachLoop.print(number);
		}

		// lambda expression
		// variable -> class.method(value)
		list.forEach(number -> ForEachLoop.print(number));

		// Static method reference
		// Method reference
		// class :: method
		list.forEach(ForEachLoop::print);
		list.forEach(System.out::println); // Just standard output of the list
	}

	public static void print(final int number) {
		System.out.println("Number: " + number);
	}
}
