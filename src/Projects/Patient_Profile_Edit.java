package Projects;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Patient_Profile_Edit extends CommonFrame {
	// 버튼 선언
	JButton Submitbtn = new JButton(new ImageIcon("images/Patient_Submit_Bt.png"));
	JButton Profilebtn = new JButton(new ImageIcon("images/pt_pf_b.png"));
	JButton Showbtn = new JButton(new ImageIcon("images/pt_show_pt.png"));
	JButton Profileeditbtn = new JButton(new ImageIcon("images/pt_pf_edit_ch_bt.png"));
	// textField 선언
	JTextField nametx = new JTextField();
	JTextField IDtx = new JTextField();
	JTextField birthtx = new JTextField();
	JTextField agetx = new JTextField();
	JTextField sextx = new JTextField();
	JTextField addtx = new JTextField();
	JTextField heighttx = new JTextField();
	JTextField weighttx = new JTextField();

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

		Submitbtn.setBounds(752, 630, 163, 60);
		add(Submitbtn);

		Profilebtn.setBounds(59, 107, 104, 80);
		add(Profilebtn);

		Showbtn.setBounds(59, 252, 104, 80);
		add(Showbtn);

		Profileeditbtn.setBounds(59, 397, 104, 80);
		add(Profileeditbtn);

		// textField 설정
		nametx.setBounds(463,135,452,42);
		nametx.revalidate();// 왜 추가 했지? 자동 레이아웃 설정 가능하게 하는 코드
		nametx.setBackground(Color.decode("#CACACA"));// textField 색상 변경
		nametx.setBorder(null); // textField 테두리 삭제
		nametx.setFont(new Font("조선신명조", Font.PLAIN, 18)); // 입력받을 때, 문자 크기 및 폰트 설정
		add(nametx);// textField 추가
		
		IDtx.setBounds(463,197,452,42);
		IDtx.revalidate();// 왜 추가 했지? 자동 레이아웃 설정 가능하게 하는 코드
		IDtx.setBackground(Color.decode("#CACACA"));// textField 색상 변경
		IDtx.setBorder(null); // textField 테두리 삭제
		IDtx.setFont(new Font("조선신명조", Font.PLAIN, 18)); // 입력받을 때, 문자 크기 및 폰트 설정
		add(IDtx);// textField 추가
		
		birthtx.setBounds(463,261,452,42);
		birthtx.revalidate();// 왜 추가 했지? 자동 레이아웃 설정 가능하게 하는 코드
		birthtx.setBackground(Color.decode("#CACACA"));// textField 색상 변경
		birthtx.setBorder(null); // textField 테두리 삭제
		birthtx.setFont(new Font("조선신명조", Font.PLAIN, 18)); // 입력받을 때, 문자 크기 및 폰트 설정
		add(birthtx);// textField 추가
		
		agetx.setBounds(463,324,452,42);
		agetx.revalidate();// 왜 추가 했지? 자동 레이아웃 설정 가능하게 하는 코드
		agetx.setBackground(Color.decode("#CACACA"));// textField 색상 변경
		agetx.setBorder(null); // textField 테두리 삭제
		agetx.setFont(new Font("조선신명조", Font.PLAIN, 18)); // 입력받을 때, 문자 크기 및 폰트 설정
		add(agetx);// textField 추가
		
		sextx.setBounds(463,387,452,42);
		sextx.revalidate();// 왜 추가 했지? 자동 레이아웃 설정 가능하게 하는 코드
		sextx.setBackground(Color.decode("#CACACA"));// textField 색상 변경
		sextx.setBorder(null); // textField 테두리 삭제
		sextx.setFont(new Font("조선신명조", Font.PLAIN, 18)); // 입력받을 때, 문자 크기 및 폰트 설정
		add(sextx);// textField 추가
		
		addtx.setBounds(463,451,452,42);
		addtx.revalidate();// 왜 추가 했지? 자동 레이아웃 설정 가능하게 하는 코드
		addtx.setBackground(Color.decode("#CACACA"));// textField 색상 변경
		addtx.setBorder(null); // textField 테두리 삭제
		addtx.setFont(new Font("조선신명조", Font.PLAIN, 18)); // 입력받을 때, 문자 크기 및 폰트 설정
		add(addtx);// textField 추가
		
		heighttx.setBounds(463,508,452,42);
		heighttx.revalidate();// 왜 추가 했지? 자동 레이아웃 설정 가능하게 하는 코드
		heighttx.setBackground(Color.decode("#CACACA"));// textField 색상 변경
		heighttx.setBorder(null); // textField 테두리 삭제
		heighttx.setFont(new Font("조선신명조", Font.PLAIN, 18)); // 입력받을 때, 문자 크기 및 폰트 설정
		add(heighttx);// textField 추가
		
		weighttx.setBounds(463,573,452,42);
		weighttx.revalidate();// 왜 추가 했지? 자동 레이아웃 설정 가능하게 하는 코드
		weighttx.setBackground(Color.decode("#CACACA"));// textField 색상 변경
		weighttx.setBorder(null); // textField 테두리 삭제
		weighttx.setFont(new Font("조선신명조", Font.PLAIN, 18)); // 입력받을 때, 문자 크기 및 폰트 설정
		add(weighttx);// textField 추가
		
		JLabel lb = new JLabel(getIcon("images/Patient_Profile.png", Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT));
		lb.setBounds(0, 0, Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		add(lb);
		Submitbtn.addActionListener(e -> {
			dispose();
			new Patient_Profile().setVisible(true);
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
}
