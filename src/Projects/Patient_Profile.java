package Projects;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Patient_Profile extends CommonFrame {
	// 버튼 선언
	JButton Profilebtn = new JButton(new ImageIcon("images/pt_pf_ch_bt.png"));
	JButton Showbtn = new JButton(new ImageIcon("images/pt_show_pt.png"));
	JButton Profileeditbtn = new JButton(new ImageIcon("images/pt_pf_bt.png"));

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
}
