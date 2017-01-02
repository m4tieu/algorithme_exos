<<<<<<< HEAD
import java.util.Scanner;

public class exo6{
	public static void main(String[] args){
		boolean flag = false;

		while(flag == false){
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un mot :");
		String str = sc.nextLine();
		System.out.println("Vous avez saisi : " + str);

			Scanner clavier = new Scanner(System.in);
=======
//Ceci importe la class Scanner du package java.util nous n'avons pas juger utile d'importer toutes la bibliotheque java
import java.util.Scanner;

public class exo6{
//appel du fichier compile
	public static void main(String[] args){
		boolean flag = false;
//on initialise un flag a false

		while(flag == false){
//tant que flage egale false
		Scanner sc = new Scanner(System.in);
//on creer un nouvel objet de type Scanner
		System.out.println("Veuillez saisir un mot :");
//Sortie standard qui permet d'afficher la phrase ci-dessus
		String str = sc.nextLine();
//la méthode nextLine() récupère le contenu de toute la ligne saisie et replace la « tête de lecture » au début d'une autre ligne
		System.out.println("Vous avez saisi : " + str);

//Sortie standard qui permet d'afficher la phrase ci-dessus
			Scanner clavier = new Scanner(System.in);
//on creer un nouvel objet de type Scanner : clavier
>>>>>>> 36c8a0e51a10bd8747c6810f5374f91fe8ebdfa1
			boolean quittez = false;
			while(quittez==false){
			System.out.print("\n Voulez vous quittez (o ou n)? ");
            		char reponse = clavier.next().charAt(0);
            		if (reponse == 'o' || reponse == 'O') {
<<<<<<< HEAD
=======
//si la reponse est egale a o ou O on quitte le programme
>>>>>>> 36c8a0e51a10bd8747c6810f5374f91fe8ebdfa1
                		System.exit(0);
				}else if (reponse =='n' || reponse == 'N') {
			quittez = true;
		}else
		System.out.print("J'ai pas compris ' Voulez vous quittez (o ou n)? ");
		}
	}
	}
}
