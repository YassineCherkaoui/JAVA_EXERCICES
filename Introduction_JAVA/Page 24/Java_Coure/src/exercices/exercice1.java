package exercices;

import java.util.Scanner;


public class exercice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nbr;
		Scanner scanner = new Scanner (System.in);
		System.out.println("Entrez un nombre :");
		nbr = scanner.nextInt();
		scanner.close();
		//Le programme n�accepte que les nombres positifs
		if (nbr > 0 ) {
			/*�crivez un programme qui calcule la racine carr�e de nombres fournis en donn�e (les
			nombres doivent �tre saisies au clavier)*/
		System.out.println("le raccine de "+nbr+" est "+ Math.sqrt(nbr));
	}
		//Si on introduit un nombre n�gatif, on re�oit un message d�information
		
		if (nbr < 0){
		System.out.println("le nombre est n�gatif");
	}
		//Tapez 0 pour sortir du programme
		if (nbr == 0) {
			System.out.println("good bye");
		}
	}


}
