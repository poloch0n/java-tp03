package fr.array;

public class TestArray1 {

	public static void main(String [] args) {
	
		int [] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
	
		// Afficher l'ensemble des éléments des tableau grâce a une boucle
		System.out.println("\n Afficher l'ensemble des éléments des tableau grâce a une boucle");
		for (int element : array) {
			System.out.print( element + " ");
		}
		
		// Afficher l’ensemble des éléments dans l’ordre inverse du tableau
		System.out.println("\n Afficher l’ensemble des éléments dans l’ordre inverse du tableau");
		for (int i = array.length -1; i>0; i--) {
			System.out.print( array[i]+ " ");
		}
		
		// Faire une boucle et un test de manière à n’afficher que les entiers supérieurs à 3 
		System.out.println("\n Faire une boucle et un test de manière à n’afficher que les entiers supérieurs à 3 ");
		for (int element : array) {
			if(element > 2 && element%1 == 0) {
				System.out.print( element + " ");
			}
		}
		
		// Faire une boucle qui affiche uniquement les entiers pairs 
		System.out.println("\n Faire une boucle qui affiche uniquement les entiers pairs  ");
		for (int element : array) {
			if(element%2 == 0) {
				System.out.print( element + " ");
			}
		}
		
		// Afficher le plus grand élément du tableau 
		System.out.println("\n Afficher le plus grand élément du tableau ");
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		System.out.print( max + " ");
		
		// Afficher le plus petit élément du tableau 
		System.out.println("\n Afficher le plus petit élément du tableau ");
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if(min > array[i]) {
				min = array[i];
			}
		}
		System.out.print( min + " ");
		
	}
}
