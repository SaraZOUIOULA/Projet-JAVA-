package ihm;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import step.Business_Card;
import step.Profile;
import step.ProfileBusinessCardImpl;
import step.SingletonConnection;

public class FenetreBusinessClass {

	public static void main(String[] args) {
		JTextField txtIDCard = new JTextField(10);
	    JTextField txtSerial = new JTextField(10);
	    JTextField txtTypeCard = new JTextField(10);
	    JTextField txtIDProfile = new JTextField(10);
 
	 
	    JLabel lblIDCard = new JLabel("IDCard", JLabel.RIGHT);
	    lblIDCard.setDisplayedMnemonic('C');
	    lblIDCard.setLabelFor(txtIDCard);
	 
	    JLabel lblSerial = new JLabel("Serial", JLabel.RIGHT);
	    lblSerial.setDisplayedMnemonic('S');
	    lblSerial.setLabelFor(txtSerial);
	    
		JLabel lblTypeCard = new JLabel("TypeCard", JLabel.RIGHT);
	    lblTypeCard.setDisplayedMnemonic('T');
	    lblTypeCard.setLabelFor(txtTypeCard);	
	    
	    JLabel lblIDProfile = new JLabel("IDProfile", JLabel.RIGHT);
	    lblIDProfile.setDisplayedMnemonic('I');
	    lblIDProfile.setLabelFor(txtIDProfile);

	    JPanel b1 = new JPanel();
	    b1.setLayout(new BoxLayout(b1, BoxLayout.LINE_AXIS));
	    
	    b1.setLayout(new GridLayout(5,2,50,10));

	    b1.add(lblIDCard);
	    b1.add(txtIDCard);
	    b1.add(lblSerial);
	    b1.add(txtSerial);
		b1.add(lblTypeCard);
	    b1.add(txtTypeCard);  	 
	    b1.add(lblIDProfile);
	    b1.add(txtIDProfile);
	    	    
	    JPanel b2 = new JPanel();
	    b2.setLayout(new BoxLayout(b2, BoxLayout.LINE_AXIS));
	    JButton boutonAdd=new JButton("ADD CARD");
	    b2.add(boutonAdd);
	    boutonAdd.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				ProfileBusinessCardImpl businessCard=new ProfileBusinessCardImpl();
				businessCard.addBusinessCard(new Business_Card(1,txtSerial.getText(),txtTypeCard.getText()),Integer.parseInt(txtIDProfile.getText()));		
			}
		});
	    
	    JButton boutonDelete=new JButton("DELETE CARD");
	    b2.add(boutonDelete);
	    boutonDelete.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				ProfileBusinessCardImpl businessCard=new ProfileBusinessCardImpl();
				businessCard.deleteBusinessCard(Integer.parseInt(txtIDCard.getText()));		
			}
		});
	    
	    JButton boutonUpdate=new JButton("UPDATE CARD");
	    b2.add(boutonUpdate);
	    boutonUpdate.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				ProfileBusinessCardImpl businessCard=new ProfileBusinessCardImpl();
				businessCard.updateBusinessCard(new Business_Card(Integer.parseInt(txtIDCard.getText()),txtSerial.getText(),txtTypeCard.getText()),Integer.parseInt(txtIDProfile.getText()));		
			}
		});
	    
	    JButton boutonClear=new JButton("CLEAR");
	    b2.add(boutonClear);
	    boutonClear.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
					txtIDCard.setText("");
					txtIDProfile.setText("");
					txtSerial.setText("");
					txtTypeCard.setText("");
			}
		});

	    JPanel b3 = new JPanel();
	    b3.setLayout(new BoxLayout(b3, BoxLayout.PAGE_AXIS));
	    b3.setLayout(new BorderLayout());
	    b3.add(b1, BorderLayout.CENTER);
	    b3.add(b2, BorderLayout.SOUTH);
	    
	    JFrame f = new JFrame("Comptes");
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    f.setLocationRelativeTo(null);
	    f.getContentPane().add(b3);
	    f.pack( );
	    f.setVisible(true);
	  }


}