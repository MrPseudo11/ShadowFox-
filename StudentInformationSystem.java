
import javax.swing.*;
        import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentInformationSystem {
    private JFrame frame;
    private JTable table;
    private DefaultTableModel tableModel;
    private JTextField nameField, idField, ageField, deptField;

    public StudentInformationSystem() {
        frame = new JFrame("Student Information System");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        JLabel idLabel = new JLabel("ID:");
        idLabel.setBounds(20, 20, 80, 25);
        frame.add(idLabel);
        idField = new JTextField();
        idField.setBounds(100, 20, 150, 25);
        frame.add(idField);
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(20, 60, 80, 25);
        frame.add(nameLabel);
        nameField = new JTextField();
        nameField.setBounds(100, 60, 150, 25);
        frame.add(nameField);
        JLabel ageLabel = new JLabel("Age:");
        ageLabel.setBounds(20, 100, 80, 25);
        frame.add(ageLabel);
        ageField = new JTextField();
        ageField.setBounds(100, 100, 150, 25);
        frame.add(ageField);
        JLabel deptLabel = new JLabel("Department:");
        deptLabel.setBounds(20, 140, 80, 25);
        frame.add(deptLabel);
        deptField = new JTextField();
        deptField.setBounds(100, 140, 150, 25);
        frame.add(deptField);
        tableModel = new DefaultTableModel(new String[]{"ID", "Name", "Age", "Department"}, 0);
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(280, 20, 300, 200);
        frame.add(scrollPane);
        JButton addButton = new JButton("Add");
        addButton.setBounds(20, 200, 100, 25);
        frame.add(addButton);
        JButton updateButton = new JButton("Update");
        updateButton.setBounds(130, 200, 100, 25);
        frame.add(updateButton);
        JButton deleteButton = new JButton("Delete");
        deleteButton.setBounds(20, 240, 100, 25);
        frame.add(deleteButton);
        JButton clearButton = new JButton("Clear");
        clearButton.setBounds(130, 240, 100, 25);
        frame.add(clearButton);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = idField.getText();
                String name = nameField.getText();
                String age = ageField.getText();
                String dept = deptField.getText();

                if (id.isEmpty() || name.isEmpty() || age.isEmpty() || dept.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please fill all fields!");
                } else {
                    tableModel.addRow(new Object[]{id, name, age, dept});
                    clearFields();
                }
            }
        });

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow >= 0) {
                    tableModel.setValueAt(idField.getText(), selectedRow, 0);
                    tableModel.setValueAt(nameField.getText(), selectedRow, 1);
                    tableModel.setValueAt(ageField.getText(), selectedRow, 2);
                    tableModel.setValueAt(deptField.getText(), selectedRow, 3);
                    clearFields();
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a row to update!");
                }
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow >= 0) {
                    tableModel.removeRow(selectedRow);
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a row to delete!");
                }
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearFields();
            }
        });
        frame.setVisible(true);
    }
    private void clearFields() {
        idField.setText("");
        nameField.setText("");
        ageField.setText("");
        deptField.setText("");
    }
    public static void main(String[] args) {
        new StudentInformationSystem();
    }
}
