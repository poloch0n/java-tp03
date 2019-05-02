package fr.array;

import java.util.*;

public class TestArrayTri {

	public static void main(String [] args) {
		int [] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

		// tri de l'array
        Arrays.sort(array);
		for (int element : array) {
			System.out.print( element + " ");
		}
	}
}
