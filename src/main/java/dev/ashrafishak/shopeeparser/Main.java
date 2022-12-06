package dev.ashrafishak.shopeeparser;

import dev.ashrafishak.shopeeparser.output.OrderOutput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    private File inputFolder;
    private File outputFolder;
    private ArrayList<OrderOutput> outputs;

    public Main() {
        this.outputs = new ArrayList<OrderOutput>();
    }

    class OrderComparator implements Comparator<OrderOutput>{
        @Override
        public int compare(OrderOutput o1, OrderOutput o2) {
            if (o1.getDate().equals(o2.getDate())){
                return 0; // regardless whether the date is N/A or not
            } else {
                if (o1.getDate().equals("N/A")){
                    return 1;
                } else if (o2.getDate().equals("N/A")){
                    return -1;
                } else {
                    // Actual date calculation
                    if (o1.getDateCalendar().before(o2.getDateCalendar())){
                        return 1;
                    } else if (o2.getDateCalendar().before(o1.getDateCalendar())) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
            }
        }
    }


    private void createWindow() {
        JFrame frame = new JFrame("Shopee Parser");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createUI(frame);
        frame.setSize(560, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void createUI(final JFrame frame){

        JPanel panel = new JPanel();
        LayoutManager layout = new FlowLayout();
        panel.setLayout(layout);
        final JLabel label = new JLabel();
        JButton button = new JButton("Choose input folder");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                int option = fileChooser.showOpenDialog(frame);
                if(option == JFileChooser.APPROVE_OPTION){
                    inputFolder = fileChooser.getSelectedFile();
                    label.setText("Input : " + inputFolder.getAbsolutePath());
                }else{
                    label.setText("Open command canceled");
                }
            }
        });
        panel.add(button);
        panel.add(label);
        frame.getContentPane().add(panel, BorderLayout.NORTH);


        JPanel panel2 = new JPanel();
        LayoutManager layout2 = new FlowLayout();
        panel2.setLayout(layout2);
        final JLabel label2 = new JLabel();
        JButton button2 = new JButton("Choose output folder");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                int option = fileChooser.showOpenDialog(frame);
                if(option == JFileChooser.APPROVE_OPTION){
                    outputFolder = fileChooser.getSelectedFile();
                    label2.setText("Output : " + outputFolder.getAbsolutePath());
                }else{
                    label2.setText("Open command canceled");
                }
            }
        });
        panel2.add(button2);
        panel2.add(label2);
        frame.getContentPane().add(panel2, BorderLayout.CENTER);

        JPanel panelSubmit = new JPanel();
        LayoutManager layout3 = new FlowLayout();
        panelSubmit.setLayout(layout3);
        JButton submit = new JButton("Go!");
        final JLabel label3 = new JLabel();
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Parser parser = new Parser();
                parser.parseFolder(inputFolder, outputs);
                Collections.sort(outputs, new OrderComparator());
                Writer writer = new Writer();
                writer.writeText(outputFolder, outputs);
                writer.writeExcel(outputFolder, outputs);
                label3.setText("Process completed!");
            }
        });
        panelSubmit.add(submit);
        panelSubmit.add(label3);
        frame.getContentPane().add(panelSubmit, BorderLayout.SOUTH);

    }

    public static void main(String[] args){
        Main main = new Main();
        main.createWindow();

    }
}
