package Projects;

import javax.swing.JLabel;

public class Start extends CommonFrame {
	
	public Start() {
		super("title", Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		JLabel lb = new JLabel(getIcon("images/start.png", Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT));
		lb.setBounds(0, 0, Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		add(lb);
	}
	
}
