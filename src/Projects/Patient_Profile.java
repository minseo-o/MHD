package Projects;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

public class Patient_Profile extends CommonFrame {
	// 버튼 선언
	JButton Profilebtn = new JButton(new ImageIcon("images/pt_pf_ch_bt.png"));
	JButton Showbtn = new JButton(new ImageIcon("images/pt_show_pt.png"));
	JButton Profileeditbtn = new JButton(new ImageIcon("images/pt_pf_bt.png"));
	JLabel nameLabel = new JLabel();
    JLabel idLabel= new JLabel();
    JLabel birthLabel= new JLabel();
    JLabel ageLabel= new JLabel();
    JLabel genderLabel= new JLabel();
    JLabel addressLabel= new JLabel();
    JLabel weightLabel= new JLabel();
    JLabel heightLabel= new JLabel();
   
   
	public Patient_Profile() {
		super("Patient_Profile", Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		// 버튼 투명하게 만들기
		
		Profilebtn.setBorderPainted(false);
		Profilebtn.setContentAreaFilled(false);
		Profilebtn.setFocusPainted(false);

		Showbtn.setBorderPainted(false);
		Showbtn.setContentAreaFilled(false);
		Showbtn.setFocusPainted(false);

		Profileeditbtn.setBorderPainted(false);
		Profileeditbtn.setContentAreaFilled(false);
		Profileeditbtn.setFocusPainted(false);

		Profilebtn.setBounds(59, 107, 104, 80);
		add(Profilebtn);

		Showbtn.setBounds(59, 252, 104, 80);
		add(Showbtn);

		Profileeditbtn.setBounds(59, 397, 104, 80);
		add(Profileeditbtn);
		
        nameLabel.setBounds(463,135,452,42);
        add(nameLabel);
        idLabel.setBounds(463,197,452,42);
        add(idLabel);
        birthLabel.setBounds(463,261,452,42);
        add(birthLabel);
        ageLabel.setBounds(463,324,452,42);
        add(ageLabel);
        genderLabel.setBounds(463,387,452,42);
        add(genderLabel);
        addressLabel.setBounds(463,451,452,42);
        add(addressLabel);
        heightLabel.setBounds(463,508,452,42);
        add(heightLabel);
        weightLabel.setBounds(463,573,452,42);
        add(weightLabel);
        
        
        
        displayMedicalData();
        
		JLabel lb = new JLabel(getIcon("images/Patient_Profile.png", Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT));
		lb.setBounds(0, 0, Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		add(lb);
		
		Profilebtn.addActionListener(e -> {
			   dispose();
			   new Patient_Profile().setVisible(true);
		 });
	     
	     Showbtn.addActionListener(e -> {
			   dispose();
			   new Patient_Show().setVisible(true);
		 });
	     
	     Profileeditbtn.addActionListener(e -> {
			   dispose();
			   new Patient_Profile_Edit().setVisible(true);
		 });		
	}
	
	
    private void displayMedicalData() {
        try {
            // Establish a connection to the database
            // SQL query to select data from the "medical" table
        	
        	var rs = getResult("select * from patient_info where id = ?", id_check);

            // Check if there is a result
            if (rs.next()) {
                nameLabel.setText(rs.getString("name"));
                idLabel.setText(rs.getString("id"));
                birthLabel.setText(rs.getString("birth"));
                ageLabel.setText(rs.getString("age"));
                genderLabel.setText(rs.getString("gender"));
                addressLabel.setText(rs.getString("address"));
                weightLabel.setText(rs.getString("weight"));
                heightLabel.setText(rs.getString("height"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
}
