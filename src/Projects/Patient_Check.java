package Projects;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Patient_Check extends CommonFrame {
	
	//버튼 선언
	JButton submitbtn = new JButton(new ImageIcon("images/Doctor_check_Bt.png"));
		
	//textField 선언 
	JTextField PatientIDtx = new JTextField();
	JTextField PatientNametx = new JTextField();
	
	public Patient_Check() {
		super("Patient_check", Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		
		//버튼 투명하게 만들기 
		submitbtn.setBorderPainted(false);
		submitbtn.setContentAreaFilled(false);
		submitbtn.setFocusPainted(false);
		submitbtn.setBounds(736,450,145,54);
		add(submitbtn);
				
		PatientNametx.setBounds(507,271,374,57); 
		PatientNametx.revalidate();// 왜 추가 했지? 자동 레이아웃 설정 가능하게 하는 코드 
		PatientNametx.setBackground(Color.decode("#CACACA"));// textField 색상 변경
		PatientNametx.setBorder(null); // textField 테두리 삭제 
		PatientNametx.setFont(new Font("조선신명조", Font.PLAIN, 18)); // 입력받을 때, 문자 크기 및 폰트 설정
        add(PatientNametx);//textField 추가 
        
		PatientIDtx.setBounds(507,356,374,57); 
		PatientIDtx.revalidate();// 왜 추가 했지? 자동 레이아웃 설정 가능하게 하는 코드 
		PatientIDtx.setBackground(Color.decode("#CACACA"));// textField 색상 변경
		PatientIDtx.setBorder(null); // textField 테두리 삭제 
		PatientIDtx.setFont(new Font("조선신명조", Font.PLAIN, 18)); // 입력받을 때, 문자 크기 및 폰트 설정
        add(PatientIDtx);//textField 추가 
        
       
	    
		
		JLabel lb = new JLabel(getIcon("images/Doctor_Patient_Check.png", Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT));
	      lb.setBounds(0, 0, Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
	      add(lb);
	}
	
}
