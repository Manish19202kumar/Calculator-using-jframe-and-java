package demo;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class main {



    private JPanel panel;
    private JLabel label;
    private JTable table;
    private DefaultTableModel model;
    private JButton addButton, updateButton, deleteButton;

    public {
        // Create the frame
        frame = new JFrame("CRUD Example");

        // Create the panel
        panel = new JPanel(new BorderLayout());

        // Create the label
        label = new JLabel("CRUD Operations", SwingConstants.CENTER);
        panel.add(label, BorderLayout.NORTH);

        // Create the table
        String[] columnNames = {"ID", "Name", "Age"};
        model = new DefaultTableModel(columnNames, 0);
        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        panel.add(scrollPane, BorderLayout.CENTER);

        // Create buttons
        addButton = new JButton("Add");
        updateButton = new JButton("Update");
        deleteButton = new JButton("Delete");

        // Add action listeners to buttons
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add a new row to the table
                model.addRow(new Object[]{"", "", ""});
            }
        });

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get selected row index
                int row = table.getSelectedRow();
                if (row != -1) {
                    // Update data in the selected row
                    model.setValueAt("Updated Name", row, 1);
                    model.setValueAt(30, row, 2);
                } else {
                    JOptionPane.showMessageDialog(frame, "Select a row to update");
                }
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get selected row index
                int row = table.getSelectedRow();
                if (row != -1) {
                    // Remove the selected row
                    model.removeRow(row);
                } else {
                    JOptionPane.showMessageDialog(frame, "Select a row to delete");
                }
            }
        });

        // Add buttons to panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(updateButton);
        buttonPanel.add(deleteButton);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        // Add the panel to the frame
        frame.add(panel);

        // Set frame properties
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Run the CRUDExample
        new CRUDExample();
    }
}



}
