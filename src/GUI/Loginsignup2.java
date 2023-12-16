package GUI;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import DB.LoginDBconnection;
import java.awt.Color;

public class Loginsignup2  {

   private JFrame frame;
   private JTextField usernameField;
   private JTextField newUsernameField;
   private Map<String, String> registeredUsers;
   private JPasswordField passwordField;
   private JPasswordField newPasswordField;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               Loginsignup2 window = new Loginsignup2();
               window.frame.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   /**
    * Create the application.
    */
   public Loginsignup2() {
      initialize();
      registeredUsers = new HashMap<>();
   }

   /**
    * Initialize the contents of the frame.
    */
   private void initialize() {
      frame = new JFrame();
      frame.setBounds(100, 100, 1200, 800);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLocationRelativeTo(null);
      frame.setResizable(false);
      frame.getContentPane().setLayout(null);
      JPanel loginpanel = new JPanel();
      loginpanel.setBounds(0, 0, 1184, 761);
      frame.getContentPane().add(loginpanel);
      loginpanel.setLayout(null);
      
      JLabel lblNewLabel_2 = new JLabel("Today My Image");
      lblNewLabel_2.setForeground(new Color(255, 255, 255));
      lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 41));
      lblNewLabel_2.setBounds(414, 144, 350, 123);
      loginpanel.add(lblNewLabel_2);
      JLabel ID = new JLabel("아이디 : ");
      ID.setForeground(new Color(255, 255, 255));
      ID.setBounds(435, 273, 105, 47);
      loginpanel.add(ID);
      
      JLabel PWD = new JLabel("비밀번호 : ");
      PWD.setForeground(new Color(255, 255, 255));
      PWD.setBounds(435, 376, 69, 47);
      loginpanel.add(PWD);
      
      usernameField = new JTextField();
      usernameField.setBounds(610, 273, 116, 48);
      loginpanel.add(usernameField);
      usernameField.setColumns(10);
      
      JButton btnLogin = new JButton("로그인");
      btnLogin.setBounds(424, 481, 116, 48);
      loginpanel.add(btnLogin);
      
      JButton btnSignup = new JButton("회원가입");
      btnSignup.setBounds(610, 481, 116, 48);
      loginpanel.add(btnSignup);
      
      passwordField = new JPasswordField();
      passwordField.setBounds(610, 376, 116, 48);
      loginpanel.add(passwordField);
      
      JLabel lblNewLabel = new JLabel("");
      lblNewLabel.setBounds(0, 0, 1184, 761);
      loginpanel.add(lblNewLabel);
      try {
            // 이미지 파일 경로
            File imgFile = new File("C:\\Users\\82103\\TMI\\TMI2\\image\\Loginbackground.jpg");
            BufferedImage originalImage = ImageIO.read(imgFile);

            // JLabel 크기에 맞게 이미지 조절
            ImageIcon imageIcon = new ImageIcon(getScaledImage(originalImage, lblNewLabel.getWidth(), lblNewLabel.getHeight()));
            lblNewLabel.setIcon(imageIcon);
        } catch (IOException e) {
            e.printStackTrace();
        }
      btnLogin.addActionListener(new ActionListener() {
            LoginDBconnection login = new LoginDBconnection();

            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                char[] passwordChars = passwordField.getPassword();
                String password = new String(passwordChars);

                login.sign_in(username, password);

                if (registeredUsers.containsKey(username)) {
                    String storedPassword = registeredUsers.get(username);
                    if (storedPassword.equals(password)) {
                        System.out.println("로그인 성공! 아이디: " + username);
                        createUniqueUserFrame(username);
                        frame.dispose();
                        return;
                    }
                }
                JOptionPane.showMessageDialog(null, "아이디 또는 비밀번호가 잘못되었습니다.");
                usernameField.setText("");
                passwordField.setText("");
            }
        });
      
      
      JPanel signpanel = new JPanel();
      signpanel.setBounds(0, 0, 1184, 761);
      frame.getContentPane().add(signpanel);
      signpanel.setLayout(null);
      signpanel.setVisible(false);
      JLabel lblNewLabel_3 = new JLabel("Today My Image");
      lblNewLabel_3.setForeground(new Color(255, 255, 255));
      lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_3.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 41));
      lblNewLabel_3.setBounds(414, 144, 350, 123);
      signpanel.add(lblNewLabel_3); 
      JLabel newID = new JLabel("새로운 아이디");
      newID.setForeground(new Color(255, 255, 255));
      newID.setBounds(435, 273, 105, 47);
      signpanel.add(newID);
      
      JLabel newPWD = new JLabel("새로운 비밀번호");
      newPWD.setForeground(new Color(255, 255, 255));
      newPWD.setBounds(435, 376, 105, 47);
      signpanel.add(newPWD);
      
      JButton btnSign = new JButton("회원가입");
      btnSign.setBounds(424, 481, 116, 48);
      signpanel.add(btnSign);
      
      JButton btnback = new JButton("로그인 화면");
      btnback.setBounds(610, 481, 116, 48);
      signpanel.add(btnback);
      
      newUsernameField = new JTextField();
      newUsernameField.setBounds(610, 273, 116, 48);
      signpanel.add(newUsernameField);
      newUsernameField.setColumns(10);
      
      newPasswordField = new JPasswordField();
      newPasswordField.setBounds(610, 376, 116, 48);
      signpanel.add(newPasswordField);
      
      JLabel lblNewLabel_1 = new JLabel("");
      lblNewLabel_1.setBounds(0, 0, 1184, 761);
      signpanel.add(lblNewLabel_1);
      try {
            // 이미지 파일 경로
            File imgFile = new File("C:\\Users\\82103\\TMI\\TMI2\\image\\Loginbackground.jpg");
            BufferedImage originalImage = ImageIO.read(imgFile);

            // JLabel 크기에 맞게 이미지 조절
            ImageIcon imageIcon = new ImageIcon(getScaledImage(originalImage, lblNewLabel_1.getWidth(), lblNewLabel_1.getHeight()));
            lblNewLabel_1.setIcon(imageIcon);
        } catch (IOException e) {
            e.printStackTrace();
        }
      btnSignup.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            loginpanel.setVisible(false);
            signpanel.setVisible(true);
            
         }
      
      });
      btnback.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            loginpanel.setVisible(true);
            signpanel.setVisible(false);
            
         }
         
      });
      btnSign.addActionListener(new ActionListener() {

          LoginDBconnection login = new LoginDBconnection();

            public void actionPerformed(ActionEvent e) {
                String newUsername = newUsernameField.getText();
                char[] newPasswordChars = newPasswordField.getPassword();
                String newPassword = new String(newPasswordChars);

                // Check if any field is empty
                if (newUsername.isEmpty() || newPassword.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "정보를 입력하세요.");
                    return;
                }
                login.sign_up(newUsername, newPassword);

                registeredUsers.put(newUsername, newPassword);
                JOptionPane.showMessageDialog(null, "회원가입이 완료되었습니다.");

                newUsernameField.setText("");
                newPasswordField.setText("");
                loginpanel.setVisible(true);
                signpanel.setVisible(false);
            }
        });
   }
    private void createUniqueUserFrame(String username) {
           JFrame userFrame = new JFrame("사용자: " + username);
           userFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
           userFrame.setSize(400, 250); // 창 크기 조정
           userFrame.setLocationRelativeTo(null);

           JLabel welcomeLabel = new JLabel("환영합니다, " + username + " 님!");
           welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);

           userFrame.getContentPane().add(welcomeLabel);
           userFrame.setVisible(true);
       }
    private Image getScaledImage(Image srcImg, int width, int height) {
           BufferedImage resizedImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
           Graphics2D g2d = resizedImg.createGraphics();

           g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
           g2d.drawImage(srcImg, 0, 0, width, height, null);
           g2d.dispose();

           return resizedImg;
       }
}