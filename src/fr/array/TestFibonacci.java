package fr.array;

import java.util.Scanner;

public class TestFibonacci {

	private static Scanner questionUser;
	
	public static void main(String [] args) {
		// Affichage du premier message
		System.out.println("*****  Exercice 5 *****\r\n" );
		exercice();
	}
	
	/** fonction courante */
	public static void exercice() {
		showMainMenu();
		
		int N = getNumberFromMenu();
		
		if(N > 0) {
			//calcul du rang
			System.out.println("Le nombre de rang "+N+" de la suite de Fibonacci vaut "+ calculFibonacci(N) );
			//affichage du rang
		} else {
			System.out.println("Mais qu'est ce que vous avez tapé ? j'vais être patient et vous le redemander gentillement ..");
		}
		exercice();
	}
	
	/** calcul de fibonacci */
	private static int calculFibonacci(Integer rang) {
		int n1=1, n2 = 1, n3 = 0;
		
		for (int i = 0; i < rang; i++) {
			n3 = n2 + n1;
			n1 = n2;
			n2 = n3;
		}
		return n3;
		
	}

	/** Affichage du menu principale */
	private static void showMainMenu() {
		System.out.println("Choisissez un rang N");
	}
	
	/** Récupération du nombre tapé depuis le menu */
	private static int getNumberFromMenu() {
		questionUser = new Scanner(System.in);
		try {
			return questionUser.nextInt();
		} catch(Exception e)  {
			// Gestion des cas où l'utilisateur ne rentre pas un nombre
			return 0;
		}
	}
	
}
