package step;

import java.util.Vector;

public class Profile {

	private int ID_Profile;
	private String Name;
	private String Company;
	private String Email;
	private String Tel;

	public Profile() {}
	public Profile(int ID, String name,String company,String email, String tel) {
		this.ID_Profile=ID;
		this.Name = name;
		this.Company = company;
		this.Email = email;
		this.Tel = tel;
	}
	public int getID_Profile() 
	{
		return ID_Profile;
	}
	public String getName()
	{
		return Name;
	}
	public String getCompany()
	{
		return Company;
	}
	public String getEmail()
	{
		return Email;
	}
	public String getTel()
	{
		return Tel;
	}
	public void setID(int PID)
	{
		ID_Profile=PID;
	}
	public void setName(String PName)
	{
		Name = PName;
	}
	public void setCompany(String PCompany)
	{
		Company = PCompany;
	}
	public void setEmail(String PEmail)
	{
		Email = PEmail;
	}
	public void setTel(String PTel)
	{
		Tel = PTel;
	}
	public void ToString() {
		System.out.println("votre Pofile n° "+ID_Profile+"\n"+"Name "+Name+"\n"+"Company "+Company+"\n"+"Email "+Email+"\n"+"Tél "+Tel);
		for(int i=0; i<Business_Card_v.size(); i++)
		{
			Business_Card_v.elementAt(i).ToString();
		}
	}
	public Vector<Business_Card> Business_Card_v=new Vector<Business_Card>();
}
