package GUI;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class imageupload {

    private JFrame frame;
    private JTextField filePathTextField;
    private JLabel imageLabel;
    private JTextField dateTextField;
    private JComboBox<String> locationComboBox;
    private JTextArea memoTextArea;
    private File selectedFile; // 파일 변수 선언

    
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                imageupload window = new imageupload();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
    
    /**
     * @wbp.parser.entryPoint  //windowbuilder를 위해 자동으로 코드를 변환해주는 주석 위치에 따라서 windowbuilder 실행 안될수도 있음.
     */
    public imageupload() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 1200, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 1200, 800);
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        //Select boutton 주석
        JButton btnSelect = new JButton("Select"); 
        btnSelect.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {  //button에 FileChooser기능 할당
                JFileChooser fileChooser = new JFileChooser();
                int result = fileChooser.showOpenDialog(null);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    filePathTextField.setText(selectedFile.getAbsolutePath());
                    displayImage(selectedFile.getAbsolutePath());
                }
                System.out.println(selectedFile.getAbsolutePath());
            }
        });
        btnSelect.setBounds(45, 30, 100, 30);
        panel.add(btnSelect);

        JButton btnUpload = new JButton("Upload");
        btnUpload.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
                    System.out.println(selectedFile.getAbsolutePath());
			}
        	
        });
        btnUpload.setBounds(170, 30, 100, 30);
        panel.add(btnUpload);
        
        JLabel lblFilePath = new JLabel("File Path:");
        lblFilePath.setBounds(303, 30, 70, 30);
        panel.add(lblFilePath);

        filePathTextField = new JTextField();
        filePathTextField.setEditable(false);
        filePathTextField.setBounds(375, 31, 400, 30);
        panel.add(filePathTextField);
        filePathTextField.setColumns(10);

        imageLabel = new JLabel();
        imageLabel.setBounds(30, 80, 600, 600);
        panel.add(imageLabel);
        
        JLabel lblDate = new JLabel("Date:");
        lblDate.setBounds(733, 334, 70, 30);
        panel.add(lblDate);

        dateTextField = new JTextField();
        dateTextField.setBounds(875, 335, 150, 30);
        panel.add(dateTextField);
        dateTextField.setColumns(10);

        JLabel lblLocation = new JLabel("Location:");
        lblLocation.setBounds(733, 417, 70, 30);
        panel.add(lblLocation);

        // Options for location
        String[] locationOptions = {"Area 1", "Area 2", "Area 3", "Area 4", "Area 5", "Area 6", "Area 7", "Area 8"};
        locationComboBox = new JComboBox<>(locationOptions);
        locationComboBox.setBounds(886, 417, 150, 30);
        panel.add(locationComboBox);

        JLabel lblMemo = new JLabel("Memo:");
        lblMemo.setBounds(733, 594, 70, 30);
        panel.add(lblMemo);

        memoTextArea = new JTextArea();
        memoTextArea.setBounds(839, 573, 300, 70);
        panel.add(memoTextArea);
        
        
    }

    
    private void displayImage(String path) {
    	ImageIcon originalIcon = new ImageIcon(path);
        // Get the dimensions of the label
        int labelWidth = imageLabel.getWidth();
        int labelHeight = imageLabel.getHeight();

        // Scale the image while maintaining its aspect ratio
        Image image = originalIcon.getImage();
        Image scaledImage = image.getScaledInstance(labelWidth, labelHeight, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        // Set the scaled image icon to the label
        imageLabel.setIcon(scaledIcon);
    }
}