package step;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class ProfileBusinessCardImpl implements IProfile{

	@Override
	public void addProfile(Profile P) {
		Connection conn=SingletonConnection.getConnection();
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement("insert into ktrprofile(Name, Company, Email, Tel) values (?,?,?,?)");
			ps.setString(1,P.getName());
			ps.setString(2,P.getCompany());
			ps.setString(3,P.getEmail());
			ps.setString(4,P.getTel());
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}



	}

	@Override
	public void deleteProfile(int ID_Profile) {
		Connection conn=SingletonConnection.getConnection();
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement("delete from ktrprofile where ID_Profile = ?");
			ps.setLong(1,ID_Profile);
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	public void updateProfile(Profile P,int ID_Profile) {
		Connection conn=SingletonConnection.getConnection();
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement("update ktrprofile set Name = ?, Company = ?, Email = ?, Tel = ?  where ID_Profile = ?");
			ps.setString(1,P.getName());
			ps.setString(2,P.getCompany());
			ps.setString(3,P.getEmail());
			ps.setString(4,P.getTel());
			ps.setLong(5,P.getID_Profile());
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}

	@Override
	public void addBusinessCard(Business_Card BC, int ID_Profile) {
		Connection conn=SingletonConnection.getConnection();
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement("insert into businesscard(Serial, ID_Profile, TypeCard) values (?,?,?)");
			ps.setString(1,BC.getSerial());
			ps.setLong(2,BC.getID_Profile());
			ps.setString(3,BC.getTypeCard());
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void deleteBusinessCard(int ID_Card) {
		Connection conn=SingletonConnection.getConnection();
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement("delete from businesscard where ID_Card = ?");
			ps.setLong(1,ID_Card);
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	

	}

	@Override
	public void updateBusinessCard(Business_Card BC, int ID_Card) {
		Connection conn=SingletonConnection.getConnection();
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement("update businesscard set ID_Card =?, Serial=?, ID_Profile=?, TypeCard=?  where ID_Card = ?");
			ps.setLong(1,BC.getID_Card());
			ps.setString(2,BC.getSerial());
			ps.setLong(3,BC.getID_Profile());
			ps.setString(4,BC.getTypeCard());
			ps.setLong(5,BC.getID_Profile());
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	

	}
}
