package Projects;

import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Start extends CommonFrame {
    JButton Doctorbtn = new JButton(new ImageIcon("images/Doctor_bt.png"));
    JButton Patientbtn = new JButton(new ImageIcon("images/Patient_bt.png"));
   public Start() {
      super("title", Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
      
      Doctorbtn.setBorderPainted(false);
      Doctorbtn.setContentAreaFilled(false);
      Doctorbtn.setFocusPainted(false);
      
      Patientbtn.setBorderPainted(false);
      Patientbtn.setContentAreaFilled(false);
      Patientbtn.setFocusPainted(false);
      
      Doctorbtn.setBounds(210, 493, 299, 118);
      add(Doctorbtn);
      Patientbtn.setBounds(771,493,299,118);
      add(Patientbtn);
      
      JLabel lb = new JLabel(getIcon("images/Start.png", Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT));
      lb.setBounds(0, 0, Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
      add(lb);

      Doctorbtn.addActionListener(e -> {
         dispose();
         new Doctor_Login().setVisible(true);
      });
      Patientbtn.addActionListener(e -> {
          dispose();
          new Patient_Login().setVisible(true);
       });
      
   }   
}