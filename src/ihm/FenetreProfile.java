package ihm;

import javax.swing.BoxLayout;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import step.Profile;
import step.ProfileBusinessCardImpl;

public class FenetreProfile {

	public static void main(String[] args) {
		
	    	JTextField txtID = new JTextField(10);
		    JTextField txtName = new JTextField(10);
		    JTextField txtCompany = new JTextField(10);
		    JTextField txtEmail = new JTextField(10);
		    JTextField txtTel = new JTextField(10);
     
		 
		    JLabel lblName = new JLabel("Name", JLabel.RIGHT);
		    lblName.setDisplayedMnemonic('N');
		    lblName.setLabelFor(txtName);
		 
		    JLabel lblCompany = new JLabel("Company", JLabel.RIGHT);
		    lblCompany.setDisplayedMnemonic('C');
		    lblCompany.setLabelFor(txtCompany);
		    
			JLabel lblEmail = new JLabel("Email", JLabel.RIGHT);
		    lblEmail.setDisplayedMnemonic('E');
		    lblEmail.setLabelFor(txtEmail);	
		    
		    JLabel lblTel = new JLabel("Tel", JLabel.RIGHT);
		    lblTel.setDisplayedMnemonic('T');
		    lblTel.setLabelFor(txtTel);
		    
		    JLabel lblID = new JLabel("ID", JLabel.RIGHT);
		    lblID.setDisplayedMnemonic('I');
		    lblID.setLabelFor(txtID);
		 
		    JPanel b1 = new JPanel();
		    b1.setLayout(new BoxLayout(b1, BoxLayout.LINE_AXIS));
		    
		    b1.setLayout(new GridLayout(5,2,50,10));

		    b1.add(lblName);
		    b1.add(txtName);
		    b1.add(lblCompany);
		    b1.add(txtCompany);
			b1.add(lblEmail);
		    b1.add(txtEmail);  	 
		    b1.add(lblTel);
		    b1.add(txtTel);
		    b1.add(lblID);
		    b1.add(txtID); 
		    
		    JPanel b3 = new JPanel();
		    b3.setLayout(new BoxLayout(b3, BoxLayout.LINE_AXIS));
		    JButton boutonAdd=new JButton("ADD PROFILE");
		    b3.add(boutonAdd);
		    boutonAdd.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					ProfileBusinessCardImpl profile=new ProfileBusinessCardImpl();
					profile.addProfile(new Profile(1,txtName.getText(),txtCompany.getText(),txtEmail.getText(), txtTel.getText()));		
				}
			});
		    
		    JButton boutonDelete=new JButton("DELETE PROFILE");
		    b3.add(boutonDelete);
		    boutonDelete.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					ProfileBusinessCardImpl profile=new ProfileBusinessCardImpl();
					profile.deleteProfile(Integer.parseInt(txtID.getText()));		
				}
			});
		    
		    JButton boutonUpdate=new JButton("UPDATE PROFILE");
		    b3.add(boutonUpdate);
		    boutonUpdate.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					ProfileBusinessCardImpl profile=new ProfileBusinessCardImpl();
					profile.updateProfile(new Profile(Integer.parseInt(txtID.getText()),txtName.getText(),txtCompany.getText(),txtEmail.getText(), txtTel.getText()),Integer.parseInt(txtID.getText()));		
				}
			});
		    
		    
		    JPanel b4 = new JPanel();
		    b4.setLayout(new BoxLayout(b4, BoxLayout.PAGE_AXIS));
		    b4.setLayout(new BorderLayout());
		    b4.add(b1, BorderLayout.CENTER);
		    //b4.add(b2, BorderLayout.CENTER);
		    b4.add(b3, BorderLayout.SOUTH);
		    
		    JFrame f = new JFrame("Comptes");
		    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    f.setLocationRelativeTo(null);
		    f.getContentPane().add(b3);
		    f.pack( );
		    f.setVisible(true);
		  }
}