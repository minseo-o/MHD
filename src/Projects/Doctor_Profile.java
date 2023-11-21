package Projects;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Doctor_Profile extends CommonFrame {
	// 버튼 선언
	JButton Writebtn = new JButton(new ImageIcon("images/dc_write_bt.png"));
	JButton Showbtn = new JButton(new ImageIcon("images/dc_show_pt.png"));
	JButton Profilebtn = new JButton(new ImageIcon("images/dc_pf_ch_bt.png"));
	JLabel nameLabel = new JLabel();
    JLabel idLabel= new JLabel();
    JLabel birthLabel= new JLabel();
    JLabel ageLabel= new JLabel();
    JLabel genderLabel= new JLabel();
    JLabel addressLabel= new JLabel();
    JLabel weightLabel= new JLabel();
    JLabel heightLabel= new JLabel();
	public Doctor_Profile() {
		super("Doctor_Write", Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);

		// 버튼 투명하게 만들기
		Writebtn.setBorderPainted(false);
		Writebtn.setContentAreaFilled(false);
		Writebtn.setFocusPainted(false);

		Showbtn.setBorderPainted(false);
		Showbtn.setContentAreaFilled(false);
		Showbtn.setFocusPainted(false);

		Profilebtn.setBorderPainted(false);
		Profilebtn.setContentAreaFilled(false);
		Profilebtn.setFocusPainted(false);

		Writebtn.setBounds(59, 107, 104, 80);
		add(Writebtn);

		Showbtn.setBounds(59, 252, 104, 80);
		add(Showbtn);

		Profilebtn.setBounds(59, 397, 104, 80);
		add(Profilebtn);

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
        
		JLabel lb = new JLabel(getIcon("images/Doctor_Patient_Profile.png", Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT));// 배경 설정 !! 주의																									// 것 !
		lb.setBounds(0, 0, Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		add(lb);
		
		// 버튼 클릭하면 ...
		Writebtn.addActionListener(e -> {
			dispose();
			new Doctor_Write().setVisible(true);
		});

		Showbtn.addActionListener(e -> {
			dispose();
			new Doctor_Show().setVisible(true);
		});

		Profilebtn.addActionListener(e -> {
			dispose();
			new Doctor_Profile().setVisible(true);
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
