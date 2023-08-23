package Projects;

import javax.swing.JLabel;

public class Patient_Login extends CommonFrame{
	public Patient_Login() {
		super("Patient_Login", Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
				

		JLabel lb = new JLabel(getIcon("images/pt_login.png", Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT));
		lb.setBounds(0, 0, Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		add(lb);
	}
}
