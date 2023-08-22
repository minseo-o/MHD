package Projects;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CommonFrame extends JFrame {
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
}
class ImagePanel extends JPanel {
    private Image img;

    /**
     * 이미지의 환경을 구성해주는 메소드 입니다.
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
     * @param g the <code>Graphics</code> object to protect
     */
    public void paintComponent(Graphics g) {
        g.drawImage(img, 0, 0, null);
    }
}