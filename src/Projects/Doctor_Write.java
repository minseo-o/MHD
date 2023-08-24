package Projects;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Doctor_Write extends CommonFrame{
	
	//버튼 선언
	JButton Submitbtn = new JButton(new ImageIcon("images/Doctor_finish_Bt.png"));
    JButton Writebtn = new JButton(new ImageIcon("images/dc_write_ch_bt.png"));
    JButton Showbtn = new JButton(new ImageIcon("images/dc_show_pt.png"));
    JButton Profilebtn = new JButton(new ImageIcon("images/dc_pf_bt.png"));
    
    //textField 선언 
  	JTextField Daytx = new JTextField();
  	JTextField Doctornametx = new JTextField();
  	JTextField departmenttx= new JTextField();
  	JTextField recordtx = new JTextField();
  	JTextField recipetx = new JTextField();
  	
	public Doctor_Write() {
		super("Doctor_Write", Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		
		//버튼 투명하게 만들기 
		Submitbtn.setBorderPainted(false);
		Submitbtn.setContentAreaFilled(false);
		Submitbtn.setFocusPainted(false);

		Writebtn.setBorderPainted(false);
		Writebtn.setContentAreaFilled(false);
		Writebtn.setFocusPainted(false);

		Showbtn.setBorderPainted(false);
		Showbtn.setContentAreaFilled(false);
		Showbtn.setFocusPainted(false);
		
		Profilebtn.setBorderPainted(false);
		Profilebtn.setContentAreaFilled(false);
		Profilebtn.setFocusPainted(false);
		
		Submitbtn.setBounds(1081,646,163,60);
		add(Submitbtn);

		Writebtn.setBounds(59,107,104,80);
		add(Writebtn);

		Showbtn.setBounds(59,252,104,80);
		add(Showbtn);
		
		Profilebtn.setBounds(59,397,104,80);
		add(Profilebtn);
		
		//textField 설정
		Daytx.setBounds(424,92,526,50); 
		Daytx.revalidate();// 왜 추가 했지? 자동 레이아웃 설정 가능하게 하는 코드 
		Daytx.setBackground(Color.decode("#CACACA"));// textField 색상 변경
		Daytx.setBorder(null); // textField 테두리 삭제 
		Daytx.setFont(new Font("조선신명조", Font.PLAIN, 18)); // 입력받을 때, 문자 크기 및 폰트 설정
		add(Daytx);//textField 추가 
		
		Doctornametx.setBounds(424,158,526,50); 
		Doctornametx.revalidate();// 왜 추가 했지? 자동 레이아웃 설정 가능하게 하는 코드 
		Doctornametx.setBackground(Color.decode("#CACACA"));// textField 색상 변경
		Doctornametx.setBorder(null); // textField 테두리 삭제 
		Doctornametx.setFont(new Font("조선신명조", Font.PLAIN, 18)); // 입력받을 때, 문자 크기 및 폰트 설정
		add(Doctornametx);//textField 추가 
		
		departmenttx.setBounds(424,225,526,50); 
		departmenttx.revalidate();// 왜 추가 했지? 자동 레이아웃 설정 가능하게 하는 코드 
		departmenttx.setBackground(Color.decode("#CACACA"));// textField 색상 변경
		departmenttx.setBorder(null); // textField 테두리 삭제 
		departmenttx.setFont(new Font("조선신명조", Font.PLAIN, 18)); // 입력받을 때, 문자 크기 및 폰트 설정
		add(departmenttx);//textField 추가 
		
		recordtx.setBounds(424,294,820,154); 
		recordtx.revalidate();// 왜 추가 했지? 자동 레이아웃 설정 가능하게 하는 코드 
		recordtx.setBackground(Color.decode("#CACACA"));// textField 색상 변경
		recordtx.setBorder(null); // textField 테두리 삭제 
		recordtx.setFont(new Font("조선신명조", Font.PLAIN, 18)); // 입력받을 때, 문자 크기 및 폰트 설정
		add(recordtx);//textField 추가 
		
		recipetx.setBounds(424,472,820,154); 
		recipetx.revalidate();// 왜 추가 했지? 자동 레이아웃 설정 가능하게 하는 코드 
		recipetx.setBackground(Color.decode("#CACACA"));// textField 색상 변경
		recipetx.setBorder(null); // textField 테두리 삭제 
		recipetx.setFont(new Font("조선신명조", Font.PLAIN, 18)); // 입력받을 때, 문자 크기 및 폰트 설정
		add(recipetx);//textField 추가 
		
		JLabel lb = new JLabel(getIcon("images/Doctor_Write.png", Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT));//배경 설정 !! 주의 배경 설정은 버튼 아래에다가 넣을 것 !
	      lb.setBounds(0, 0, Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
	      add(lb);
	}

}
