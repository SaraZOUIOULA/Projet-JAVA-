package step;

import java.util.*;

public class ProfileManager {


	Scanner sc = new Scanner(System.in);
	Profile P=new Profile();
	public Vector<Profile> vect_Profile=new Vector<Profile>();
	
	public void AddProfile(Profile P) {
		vect_Profile.addElement(P);	
	}
	public void RemoveProfile(Profile P) {
		vect_Profile.removeElement(P);	
	}
	public Profile RechercheIdProfile(int id) {
		for(int i=0; i<vect_Profile.size();i++) {

			if(id==vect_Profile.elementAt(i).getID_Profile())
			{
				System.out.println("le profile que vous cherchez existe !");
			}
		}
		return P;
	}
	Vector<Profile> ResultatRechercheNomProfile=new Vector<Profile>();
	public Vector<Profile> RechercheNomProfile(String Nom) {
		
		for(int i=0; i<vect_Profile.size();i++) {
			System.out.println(vect_Profile.elementAt(i).getName().toString());

			if(Nom.equals(vect_Profile.elementAt(i).getName()))
			{
				
				//System.out.println("les profiles qui ont le nom "+Nom+" sont: ");
				ResultatRechercheNomProfile.addElement(vect_Profile.elementAt(i));
			}
		}
		return ResultatRechercheNomProfile;
	}
	
	
	
	
	public void ModifierProfile(int id, Profile P) {

		System.out.println("entrez votre identifiant: ");
		id=sc.nextInt();
		for(int i=0; i<vect_Profile.size();i++) {

			if(id==vect_Profile.elementAt(i).getID_Profile())
			{
				vect_Profile.elementAt(i).setName(P.getName());
				vect_Profile.elementAt(i).setCompany(P.getCompany());
				vect_Profile.elementAt(i).setEmail(P.getEmail());
				vect_Profile.elementAt(i).setTel(P.getTel());
			}
		}
	}
}