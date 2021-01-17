package step;

public interface IProfile {

	public void addProfile(Profile P);
	public void deleteProfile(int ID_Profile);
	public void updateProfile(Profile P,int ID_Profile);
	public void addBusinessCard(Business_Card BC,int ID_Profile);
	public void deleteBusinessCard(int ID_Card);
	public void updateBusinessCard(Business_Card BC,int ID_Card);
}
