package Projects;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Patient_Show extends CommonFrame {

	// 버튼 선언
	JButton finishbtn = new JButton(new ImageIcon("images/Patient_finish_Bt.png"));
	JButton Profilebtn = new JButton(new ImageIcon("images/pt_pf_bt.png"));
	JButton Showbtn = new JButton(new ImageIcon("images/pt_show_ch_bt.png"));
	JButton Profileeditbtn = new JButton(new ImageIcon("images/pt_pf_edit_bt.png"));
	
	public Patient_Show() {
		super("Patient_Show", Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		
		//버튼 투명하게 만들기 
		finishbtn.setBorderPainted(false);
		finishbtn.setContentAreaFilled(false);
		finishbtn.setFocusPainted(false);
		
		Profilebtn.setBorderPainted(false);
		Profilebtn.setContentAreaFilled(false);
		Profilebtn.setFocusPainted(false);

		Showbtn.setBorderPainted(false);
		Showbtn.setContentAreaFilled(false);
		Showbtn.setFocusPainted(false);

		Profileeditbtn.setBorderPainted(false);
		Profileeditbtn.setContentAreaFilled(false);
		Profileeditbtn.setFocusPainted(false);

		finishbtn.setBounds(1062,77,163,60);
		add(finishbtn);
		
		Profilebtn.setBounds(59, 107, 104, 80);
		add(Profilebtn);

		Showbtn.setBounds(59, 252, 104, 80);
		add(Showbtn);

		Profileeditbtn.setBounds(59, 397, 104, 80);
		add(Profileeditbtn);
		
		
		
		JLabel lb = new JLabel(getIcon("images/Patient_Show.png", Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT));//배경 설정 !! 주의 배경 설정은 버튼 아래에다가 넣을 것 !
	      lb.setBounds(0, 0, Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
	      add(lb);
	    //버튼 클릭하면 ... 
	      finishbtn.addActionListener(e -> {
		   dispose();
		   
	     });
	     
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
			   new Patient_Show().setVisible(true);
		 });	   
	}
}
