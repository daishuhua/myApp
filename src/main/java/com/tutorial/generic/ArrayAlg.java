package com.tutorial.generic;

public class ArrayAlg {
	public static <T extends Comparable> Pair<T> minmax(T[] a) {
		if (a == null || a.length == 0)
			return null;
		T min = a[0];
		T max = a[0];

		for (int i = 1; i < a.length; i++) {
			if (min.compareTo(a[i]) > 0) {
				min = a[i];
			} else if (min.compareTo(a[i]) < 0) {
				max = a[i];
			}
		}
		
		
		
		Pair<String>[] table = (Pair<String>[])new Pair<?>[10];
		
		return new Pair<>(min, max);
	}
	
}
