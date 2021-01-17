package step;

public class Business_Card {
	private int ID_Card;
	private String TypeCard;
	private String Serial;
	protected Profile Clt;
	protected int ID_Profile;
	
	public Business_Card() {}
	public Business_Card(int ID,String serial, String typeCard) {
		ID_Card=ID;
		Serial=serial;
		TypeCard=typeCard;
	}
	
	public void setID_Card(int ID) {
		ID_Card=ID;
	}
	public int getID_Card() {
		return ID_Card;
	}
	
	public int getID_Profile() {
		return ID_Profile;
	}
	public void setID_Profile(int iD_Profile) {
		ID_Profile = iD_Profile;
	}
	public void setSerial(String serial) {
		Serial=serial;
	}
	public String getSerial() {
		return Serial;
	}
	public void setTypeCard(String typeCard) {
		TypeCard=typeCard;
	}
	public String getTypeCard() {
		return TypeCard;
	}
	public void setProfile(Profile P) {
		Clt=P;
	}
	public Profile getProfile(){      
		return Clt;    
	}
	
	
	public void ToString() {
		System.out.println("Card n°"+ ID_Card+"avec le serial num: "+Serial+"de type: "+TypeCard+" correspond au profile" +Clt.getID_Profile()+" "+Clt.getName());
	}

}