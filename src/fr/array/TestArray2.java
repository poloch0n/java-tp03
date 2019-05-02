package fr.array;

public class TestArray2 {
	public static void main(String [] args) {
		
		int [] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		// Quelle est la moyenne des éléments du tableau ?
		System.out.println("\n Quelle est la moyenne des éléments du tableau ?");
		int somme = 0;
		if(array.length > 0) {

			for (int element : array) {
				somme += element;
			}
			
			float moyenne = somme/array.length;
			System.out.println(moyenne);
		}
		
		// Quel est l’index dans le tableau de l’entier 15 ?
		System.out.println("\n Quelle est l’index dans le tableau de l’entier 15?");
		for (int i = 0; i < array.length; i++) {
			if(array[i] == 15) {
				System.out.println(i);
				break;
			}
		}
		
		// Ecrire un algorithme pour trouver le nombre d’entiers en doublon dans le tableau
		System.out.println("\n Ecrire un algorithme pour trouver le nombre d’entiers en doublon dans le tablea");
		int nombreDeDoublons =0;
		int [] doublons;
		for (int i = 0; i < array.length; i++) {
			int compteur = 0;
			for(int j = i; j < array.length; j++) {
				if(array[j] == array[i]) {
					compteur++;
				}
			}
			if(compteur > 1) {
				nombreDeDoublons++;
			}
		}
		System.out.println("il y a "+ nombreDeDoublons + " doublons");
	}
}
