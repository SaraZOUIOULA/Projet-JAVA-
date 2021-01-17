package Main;

import step.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Connection conn=SingletonConnection.getConnection();
		
		
/*		
		int Id_BC=1;
		int Id_P=1;
		Scanner sc = new Scanner(System.in);
		Profile P=new Profile();
		ProfileManager profileManager=new ProfileManager();
		//Vector<Profile> vect_Profile=new Vector<Profile>(); 
		System.out.println("voulez vous saisir un profile oui/non: ");
		char choix ='n';
		choix=sc.nextLine().charAt(0);
		while(choix=='o')
		{
			System.out.println("saisissez le nom:");
			String nom=sc.nextLine();
			System.out.println("saisissez le nom de l'entreprise:");
			String entreprise=sc.nextLine();
			System.out.println("saisissez l'email:");
			String email=sc.nextLine();
			System.out.println("saisissez le numéro de tél:");
			String tel=sc.nextLine();
			P=new Profile(Id_P++, nom, entreprise, email, tel);
			profileManager.AddProfile(P);
			System.out.println("voulez vous créer une Business card: ");
			char choice ='n';
			choice=sc.nextLine().charAt(0);
			while(choice=='o')
			{
				System.out.println("Veuillez entrez le type de la carte: ");
				String TypeCard= sc.nextLine();
				Business_Card BC=new Business_Card(Id_BC++,TypeCard,P);
				P.Business_Card_v.add(BC);
				System.out.println("voulez vous créer une autre Business card: ");
				choice=sc.nextLine().charAt(0);
			}
			System.out.println("voulez vous saisir un autre profile oui/non: ");
			choix=sc.nextLine().charAt(0);
		}
		
		for(int i=0;i<profileManager.vect_Profile.size();i++) {
			profileManager.vect_Profile.elementAt(i).ToString();
		}
		
		System.out.println("++++++++++++++");
		profileManager.RechercheIdProfile(1);
		profileManager.RechercheNomProfile("zz");
		System.out.println("++++++++++++++");
		//profileManager.ModifierProfile(2, vect_Profile.elementAt(2));
		
*/		
	  
		
		
	}

}
