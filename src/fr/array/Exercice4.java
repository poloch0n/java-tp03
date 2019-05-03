package fr.array;

import java.util.Scanner;

public class Exercice4 {

	private static Scanner questionUser;
	private static long [] arrays;
	
	public static void main(String [] args) {
		arrays = null;
		
		// Affichage du premier message
		System.out.println("*****  Exercice 4 *****\r\n" );
		exercice();
	}
	
	public static void exercice() {
		showMainMenu();

		int answer = getNumberFromMenu();
		// Récupération du premier nombre tapé
		
		switch(answer) {

		case 1:
			//Demander le nombre
			// ajouter le nombre au tableau

			showSecondaryMenu();
			int number = getNumber();
			arrays = ajustArray(arrays,number);
		    break;
		case 2:
			// afficher le tableau
			if(arrays != null) {
				System.out.println("\r\nL'état actuel du tableau est :");
				for (long element : arrays) {
					System.out.print( element + " ");
				}
				System.out.println("\r\n");
				break;
			}
		case 0:
			System.out.println("\r\nVous n'avez pas choisir une option valide");
		default:
		    break;
		}

		exercice();
	}
	
	private static long[] ajustArray(long[] arrayInit, int integer) {
		long[] arrayTemporary;
		if(arrayInit != null) {
			arrayTemporary = new long[arrayInit.length + 1];
			if(arrayInit.length != 0) {
				for (int i = 0; i < arrayInit.length; i++) {
					arrayTemporary[i] = arrayInit[i];
				}
			}
			arrayTemporary[arrayInit.length] = integer;
		} else {
			arrayTemporary = new long[1];
			arrayTemporary[0] = integer;
		}
		return arrayTemporary;
	}

	private static void showMainMenu() {
		System.out.println("Veuillez choisir une des options\r\n"+ 
				"Option 1 : Ajouter un nombre \r\n"+ 
				"Option 2 : Afficher le tableau\r\n");
	}
	
	private static void showSecondaryMenu() {
		System.out.println("Veuillez entrer un nombre entier");
	}
	
	// Récupération du nombre tapé depuis le menu
	private static int getNumberFromMenu() {
		questionUser = new Scanner(System.in);
		try {
			return questionUser.nextInt();
		} catch(Exception e)  {
			// Gestion des cas où l'utilisateur ne rentre pas un nombre
			return 0;
		}
	}
	
	// Récupération du nombre tapé
	private static int getNumber() {
		questionUser = new Scanner(System.in);
		try {
			return questionUser.nextInt();
		} catch(Exception e)  {
			// Gestion des cas où l'utilisateur ne rentre pas un nombre
			int random =  (int) (Math.random()*100 +1);
			System.out.println("\r\nYou didn't enter a number, so we choose "+random+" for you");
			return random;
		}
	}
	
}
