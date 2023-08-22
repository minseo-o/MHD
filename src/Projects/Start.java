package Projects;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Start extends CommonFrame {
   
   public Start() {
      super("title", Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
      
      JButton Doctorbtn = new JButton(new ImageIcon("images/dc_bt.png"));
      JButton Patientbtn = new JButton(new ImageIcon("images/pt_bt.png"));
      
      Doctorbtn.setBorderPainted(false);
      Doctorbtn.setContentAreaFilled(false);
      Doctorbtn.setFocusPainted(false);
      
      Patientbtn.setBorderPainted(false);
      Patientbtn.setContentAreaFilled(false);
      Patientbtn.setFocusPainted(false);
      
      Doctorbtn.setBounds(95, 471, 432, 171);
      add(Doctorbtn);
      Patientbtn.setBounds(753, 471, 432, 171);
      add(Patientbtn);
      
      JLabel lb = new JLabel(getIcon("images/start.png", Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT));
      lb.setBounds(0, 0, Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
      add(lb);
   }
}