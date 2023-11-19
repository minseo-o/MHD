package Projects;

import java.awt.Dimension;


import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CommonFrame extends JFrame {
	static Connection con;
	static Statement stmt;
	static String id_check;


	
	static {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3308/mdh?serverTimezone=UTC", "root", "0000");
			stmt = con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public CommonFrame(String title, int w, int h) {
		setTitle(title);
		setSize(w, h);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);
	}

	public ImageIcon getIcon(String path, int w, int h) {
		return new ImageIcon(Toolkit.getDefaultToolkit().getImage(path).getScaledInstance(w, h, Image.SCALE_SMOOTH));
	}
	
	public static ResultSet getResult(String sql, Object...p) throws Exception {
		var pst = con.prepareStatement(sql);
		for (int i = 0; i < p.length; i++) {
			pst.setObject(i + 1, p[i]);
		}
		return pst.executeQuery();
	}
	
	public static void update(String sql, Object ...p) throws Exception {
		var pst = con.prepareStatement(sql);
		for (int i = 0; i < p.length; i++) {
			pst.setObject(i + 1, p[i]);
		}
		pst.executeUpdate();
	}

}

class ImagePanel extends JPanel {
	private Image img;

	/**
	 * 이미지의 환경을 구성해주는 메소드 입니다.
	 * 
	 * @param img
	 */
	public ImagePanel(Image img) {
		this.img = img;
		setSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		setPreferredSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		setLayout(null);
	}

	/**
	 * 이미지를 그리는 메소드 입니다.
	 * 
	 * @param g the <code>Graphics</code> object to protect
	 */
	public void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, null);
	}
}