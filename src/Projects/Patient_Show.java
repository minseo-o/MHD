package Projects;

import java.awt.Component;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

public class Patient_Show extends CommonFrame {

	// 버튼 선언
	JButton finishbtn = new JButton(new ImageIcon("images/Patient_finish_Bt.png"));
	JButton Profilebtn = new JButton(new ImageIcon("images/pt_pf_bt.png"));
	JButton Showbtn = new JButton(new ImageIcon("images/pt_show_ch_bt.png"));
	JButton Profileeditbtn = new JButton(new ImageIcon("images/pt_pf_edit_bt.png"));
	JTable medicalTable;
	public Patient_Show() {
		super("Patient_Show", Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		
		//버튼 투명하게 만들기 
		finishbtn.setBorderPainted(false);
		finishbtn.setContentAreaFilled(false);
		finishbtn.setFocusPainted(false);
		
		Profilebtn.setBorderPainted(false);
		Profilebtn.setContentAreaFilled(false);
		Profilebtn.setFocusPainted(false);

		Showbtn.setBorderPainted(false);
		Showbtn.setContentAreaFilled(false);
		Showbtn.setFocusPainted(false);

		Profileeditbtn.setBorderPainted(false);
		Profileeditbtn.setContentAreaFilled(false);
		Profileeditbtn.setFocusPainted(false);

		finishbtn.setBounds(1062,77,163,60);
		add(finishbtn);
		
		Profilebtn.setBounds(59, 107, 104, 80);
		add(Profilebtn);

		Showbtn.setBounds(59, 252, 104, 80);
		add(Showbtn);

		Profileeditbtn.setBounds(59, 397, 104, 80);
		add(Profileeditbtn);
		// Initialize JTable
        medicalTable = new JTable();
        JScrollPane scrollPane = new JScrollPane(medicalTable);
        scrollPane.setBounds(215, 162, 1000, 506);
        add(scrollPane);
        medicalTable.setFont(new Font("조선신명조", Font.PLAIN, 18));
        medicalTable.setRowHeight(40);
        // Fetch and display data in the JTable
        displayMedicalData();
		
		JLabel lb = new JLabel(getIcon("images/Patient_Show.png", Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT));//배경 설정 !! 주의 배경 설정은 버튼 아래에다가 넣을 것 !
	      lb.setBounds(0, 0, Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
	      add(lb);
	    //버튼 클릭하면 ... 
	      finishbtn.addActionListener(e -> {
		   dispose();
		   
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
	private void displayMedicalData() {
        try {
            // Establish a connection to the database
            // SQL query to select all data from the "medical" table
            var rs = getResult("select date, doctor_name, department, record, recipe from medical where id = ?", id_check);
            
            // Create a table model to hold the data
            DefaultTableModel tableModel = new DefaultTableModel("date,doctor_name,department,record,recipe".split(","), 0) {
            	@Override
            	public boolean isCellEditable(int row, int column) {
            		return false;
            	}
            };

            // Add rows to the table model
            while (rs.next()) {
            	tableModel.addRow(new Object[] {
            			rs.getString(1),
            			rs.getString(2),
            			rs.getString(3),
            			rs.getString(4),
            			rs.getString(5),
            	});
            }

            // Set the table model for the JTable
            medicalTable.setModel(tableModel);
            
            // Close resources
            rs.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	public void resizeColumnWidth(JTable table) {
	    final TableColumnModel columnModel = table.getColumnModel();
	    for (int column = 0; column < table.getColumnCount(); column++) {
	        int width = 50; // Min width
	        for (int row = 0; row < table.getRowCount(); row++) {
	            TableCellRenderer renderer = table.getCellRenderer(row, column);
	            Component comp = table.prepareRenderer(renderer, row, column);
	            width = Math.max(comp.getPreferredSize().width +1 , width);
	        }
	        columnModel.getColumn(column).setPreferredWidth(width);
	    }
	}
}
