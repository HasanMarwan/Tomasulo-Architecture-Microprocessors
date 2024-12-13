package gui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import sim.Instruction;
import sim.Micro;

import java.util.List;

public class GUI {
    public static void main(String[] args) {

        // Create a new instance of the Micro class
        Micro micro = new Micro();
        // Create the frame
        JFrame frame = new JFrame("Micro");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Create a panel to hold the components
        JPanel panel = new JPanel();


        //(int registerFileSize, int memRSsize, int arthRSsize, int memorySize)
        // Create a text field
        JTextField registerFileSize = new JTextField(20);

        JTextField memRSsize = new JTextField(20);

        JTextField arthRSsize = new JTextField(20);

        JTextField memorySize = new JTextField(20);

        // Sample data array
        String[][] data = {
                {"1", "John", "Doe"},
                {"2", "Jane", "Smith"},
                {"3", "Mike", "Johnson"}
        };

        // Column names
        String[] columnNames = {"ID", "First Name", "Last Name"};

        DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(tableModel);

        // Create a button
        JButton button = new JButton("Submit");
        button.addActionListener(e -> {
            int registerFileSizeContent = Integer.parseInt(registerFileSize.getText());
            int memRSsizeContent = Integer.parseInt(memRSsize.getText());
            int arthRSsizeContent = Integer.parseInt(arthRSsize.getText());
            int memorySizeContent = Integer.parseInt(memorySize.getText());
            micro.sizeInit(registerFileSizeContent, memRSsizeContent, arthRSsizeContent, memorySizeContent);
            micro.populateInstructionQueue("instructions.txt");
            for (Instruction inst : micro.getInstructionQueue()) {
                System.out.println("instruction " + inst.toString());
            }
        });

        JScrollPane scrollPane = new JScrollPane(table);

        // Add components to the panel
        panel.add(new JLabel("Register File Size:"));
        panel.add(registerFileSize);
        panel.add(new JLabel("Mem RS Size:"));
        panel.add(memRSsize);
        panel.add(new JLabel("Arth RS Size:"));
        panel.add(arthRSsize);
        panel.add(new JLabel("Memory Size:"));
        panel.add(memorySize);
        panel.add(button);
        panel.add(scrollPane);

        // Add the panel to the frame
        frame.add(panel);

        // Make the frame visible
        frame.setVisible(true);
    }
}