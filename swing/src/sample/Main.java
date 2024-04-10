package sample;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class Main {
//	 public static void main(String[] args) {
//	        // Create a new JFrame
//	        JFrame frame = new JFrame("My Swing Application");
//
//	        // Set the size of the frame
//	        frame.setSize(400, 300);
//
//	        // Set the default close operation
//	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//	        // Set the visibility of the frame
//	        frame.setVisible(true);
//	    }
	 public static void main(String[] args) {
	        // Create a new JFrame
	        JFrame frame = new JFrame("Java Swing Example");

	        // Create a panel to hold components
	        JPanel panel = new JPanel();
	        panel.setLayout(new BorderLayout());

	        // Create a label
	        JLabel label = new JLabel("Welcome to Java Swing!");
	        label.setHorizontalAlignment(SwingConstants.CENTER);
	        panel.add(label, BorderLayout.NORTH);

	        // Create a table
	        String[] columnNames = {"Name", "Age"};
	        Object[][] data = {
	                {"John", 30},
	                {"Doe", 25},
	                {"Jane", 35}
	        };
	        DefaultTableModel model = new DefaultTableModel(data, columnNames);
	        JTable table = new JTable(model);
	        JScrollPane scrollPane = new JScrollPane(table);
	        panel.add(scrollPane, BorderLayout.CENTER);

	        // Create a button
	        JButton button = new JButton("Click Me");
	        button.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                JOptionPane.showMessageDialog(frame, "Button clicked!");
	            }
	        });
	        panel.add(button, BorderLayout.SOUTH);

	        // Add the panel to the frame
	        frame.add(panel);

	        // Set frame properties
	        frame.setSize(400, 300);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setLocationRelativeTo(null); // Center the frame
	        frame.setVisible(true);
	    }
}
