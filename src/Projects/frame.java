package Projects;

import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class frame {
	public frame() {
		JFrame frame = new JFrame();
		frame.setBounds(0,0,1280,720);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
