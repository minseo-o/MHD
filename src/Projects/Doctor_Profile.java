package Projects;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Doctor_Profile extends CommonFrame {
	// 버튼 선언
	JButton Writebtn = new JButton(new ImageIcon("images/dc_write_bt.png"));
	JButton Showbtn = new JButton(new ImageIcon("images/dc_show_pt.png"));
	JButton Profilebtn = new JButton(new ImageIcon("images/dc_pf_ch_bt.png"));

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
}
