package Projects;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Doctor_Show extends CommonFrame {

	// 버튼 선언
	JButton finishbtn = new JButton(new ImageIcon("images/Doctor_finish_Bt.png"));
	JButton Writebtn = new JButton(new ImageIcon("images/dc_write_bt.png"));
	JButton Showbtn = new JButton(new ImageIcon("images/dc_show_ch_bt.png"));
	JButton Profilebtn = new JButton(new ImageIcon("images/dc_pf_bt.png"));
	
	public Doctor_Show() {
		super("Doctor_Show", Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		
		//버튼 투명하게 만들기 
		finishbtn.setBorderPainted(false);
		finishbtn.setContentAreaFilled(false);
		finishbtn.setFocusPainted(false);
		
		Writebtn.setBorderPainted(false);
		Writebtn.setContentAreaFilled(false);
		Writebtn.setFocusPainted(false);

		Showbtn.setBorderPainted(false);
		Showbtn.setContentAreaFilled(false);
		Showbtn.setFocusPainted(false);
		
		Profilebtn.setBorderPainted(false);
		Profilebtn.setContentAreaFilled(false);
		Profilebtn.setFocusPainted(false);

		finishbtn.setBounds(1062,77,163,60);
		add(finishbtn);
		
		Writebtn.setBounds(59,107,104,80);
		add(Writebtn);

		Showbtn.setBounds(59,252,104,80);
		add(Showbtn);
		
		Profilebtn.setBounds(59,397,104,80);
		add(Profilebtn);
		
		
		
		JLabel lb = new JLabel(getIcon("images/Doctor_Show.png", Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT));//배경 설정 !! 주의 배경 설정은 버튼 아래에다가 넣을 것 !
	      lb.setBounds(0, 0, Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
	      add(lb);
	    //버튼 클릭하면 ... 
	      finishbtn.addActionListener(e -> {
		   dispose();
		   
	     });
	     
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
			   new Doctor_Show().setVisible(true);
		 });	   
	}
}
