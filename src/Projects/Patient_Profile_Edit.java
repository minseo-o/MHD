package Projects;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Patient_Profile_Edit extends CommonFrame {
	// 버튼 선언
	JButton Submitbtn = new JButton(new ImageIcon("images/Patient_Submit_Bt.png"));
	JButton Profilebtn = new JButton(new ImageIcon("images/pt_pf_bt.png"));
	JButton Showbtn = new JButton(new ImageIcon("images/pt_show_pt.png"));
	JButton Profileeditbtn = new JButton(new ImageIcon("images/pt_pf_edit_ch_bt.png"));
	// textField 선언
	JTextField birthtx = new JTextField();
	JTextField agetx = new JTextField();
	JRadioButton  girl = new JRadioButton("여성");
	JRadioButton boy= new JRadioButton("남성");
	JTextField addtx = new JTextField();
	JTextField heighttx = new JTextField();
	JTextField weighttx = new JTextField();
	ButtonGroup gender = new ButtonGroup();
	String GENDER ="";
	public Patient_Profile_Edit() {
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

		Submitbtn.setBorderPainted(false);
		Submitbtn.setContentAreaFilled(false);
		Submitbtn.setFocusPainted(false);

		Submitbtn.setBounds(752, 564, 163, 60);
		add(Submitbtn);

		Profilebtn.setBounds(59, 107, 104, 80);
		add(Profilebtn);

		Showbtn.setBounds(59, 252, 104, 80);
		add(Showbtn);

		Profileeditbtn.setBounds(59, 397, 104, 80);
		add(Profileeditbtn);

		// textField 설정
		
		birthtx.setBounds(463,196,452,42);
		birthtx.revalidate();// 왜 추가 했지? 자동 레이아웃 설정 가능하게 하는 코드
		birthtx.setBackground(Color.decode("#CACACA"));// textField 색상 변경
		birthtx.setBorder(null); // textField 테두리 삭제
		birthtx.setFont(new Font("조선신명조", Font.PLAIN, 18)); // 입력받을 때, 문자 크기 및 폰트 설정
		add(birthtx);// textField 추가
		
		agetx.setBounds(463,260,452,42);
		agetx.revalidate();// 왜 추가 했지? 자동 레이아웃 설정 가능하게 하는 코드
		agetx.setBackground(Color.decode("#CACACA"));// textField 색상 변경
		agetx.setBorder(null); // textField 테두리 삭제
		agetx.setFont(new Font("조선신명조", Font.PLAIN, 18)); // 입력받을 때, 문자 크기 및 폰트 설정
		add(agetx);// textField 추가
		
		girl.setBounds(463,318,80,42);
		girl.revalidate();// 왜 추가 했지? 자동 레이아웃 설정 가능하게 하는 코드
		girl.setBorderPainted(false);
		girl.setContentAreaFilled(false);
		girl.setFocusPainted(false);
		girl.setFont(new Font("조선신명조", Font.PLAIN, 18)); // 입력받을 때, 문자 크기 및 폰트 설정
		add(girl);
		boy.setBounds(600,318,80,42);
		boy.revalidate();// 왜 추가 했지? 자동 레이아웃 설정 가능하게 하는 코드
		boy.setBorderPainted(false);
		boy.setContentAreaFilled(false);
		boy.setFocusPainted(false);
		boy.setFont(new Font("조선신명조", Font.PLAIN, 18)); // 입력받을 때, 문자 크기 및 폰트 설정
		add(boy);
		gender.add(girl);
		gender.add(boy);
		this.add(girl);
		this.add(boy);
		
		
		addtx.setBounds(463,382,452,42);
		addtx.revalidate();// 왜 추가 했지? 자동 레이아웃 설정 가능하게 하는 코드
		addtx.setBackground(Color.decode("#CACACA"));// textField 색상 변경
		addtx.setBorder(null); // textField 테두리 삭제
		addtx.setFont(new Font("조선신명조", Font.PLAIN, 18)); // 입력받을 때, 문자 크기 및 폰트 설정
		add(addtx);// textField 추가
		
		heighttx.setBounds(463,440,452,42);
		heighttx.revalidate();// 왜 추가 했지? 자동 레이아웃 설정 가능하게 하는 코드
		heighttx.setBackground(Color.decode("#CACACA"));// textField 색상 변경
		heighttx.setBorder(null); // textField 테두리 삭제
		heighttx.setFont(new Font("조선신명조", Font.PLAIN, 18)); // 입력받을 때, 문자 크기 및 폰트 설정
		add(heighttx);// textField 추가
		
		weighttx.setBounds(463,500,452,42);
		weighttx.revalidate();// 왜 추가 했지? 자동 레이아웃 설정 가능하게 하는 코드
		weighttx.setBackground(Color.decode("#CACACA"));// textField 색상 변경
		weighttx.setBorder(null); // textField 테두리 삭제
		weighttx.setFont(new Font("조선신명조", Font.PLAIN, 18)); // 입력받을 때, 문자 크기 및 폰트 설정
		add(weighttx);// textField 추가
		if(girl.isSelected()) {
			 GENDER= "여성";
		}
		if(boy.isSelected()) {
			GENDER = "남성";
		}
		girl.addActionListener(e -> {
		    GENDER = "여성";
		});
		boy.addActionListener(e -> {
		    GENDER = "남성";
		});
		
		JLabel lb = new JLabel(getIcon("images/Patient_Profile_Edit.png", Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT));
		lb.setBounds(0, 0, Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		add(lb);
		Submitbtn.addActionListener(e -> {
			 signUp();
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
			new Patient_Profile_Edit().setVisible(true);
		});
	}

	private void signUp() {
	
        String birth =  birthtx.getText();
        String age = agetx.getText();
        String address = addtx.getText();
        String height = heighttx.getText();
        String weight = weighttx.getText();
        
      
        // JDBC를 사용하여 MySQL 데이터베이스에 연결
        // DatabaseConnection 클래스로부터 Connection을 가져옴
        
        try {
        	update("UPDATE patient_info set birth =?, age = ?, gender =?, address = ?, weight = ?, height = ? Where id =?",birth, age, GENDER, address, weight, height, id_check);
        	new Patient_Profile().setVisible(true);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "업데이트 실패!");
			e.printStackTrace();
		}
    }
}
