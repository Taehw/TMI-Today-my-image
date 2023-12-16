package GUI;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import DB.LoginDBconnection;

public class firstpage extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JTextField newUsernameField;
    private JPasswordField newPasswordField;

    private JPanel loginPanel;
    private JPanel registerPanel;

    private Map<String, String> registeredUsers;

    public firstpage() {
        setTitle("로그인");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200, 800); // 창 크기 조정
        setLocationRelativeTo(null);

        registeredUsers = new HashMap<>();

        createLoginPanel();
        createRegisterPanel();

        getContentPane().add(loginPanel);
    }

    private void createLoginPanel() {
        loginPanel = new JPanel();
        loginPanel.setLayout(new GridLayout(3, 2, 10, 10)); // 아이디와 비밀번호 입력 라인 조정

        JLabel usernameLabel = new JLabel("아이디:");
        usernameLabel.setHorizontalAlignment(SwingConstants.CENTER);
        usernameField = new JTextField();

        JLabel passwordLabel = new JLabel("비밀번호:");
        passwordLabel.setHorizontalAlignment(SwingConstants.CENTER);
        passwordField = new JPasswordField();

        JButton loginButton = new JButton("로그인");
        loginButton.addActionListener(new ActionListener() {
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
                        dispose();
                        return;
                    }
                }
                JOptionPane.showMessageDialog(null, "아이디 또는 비밀번호가 잘못되었습니다.");
                usernameField.setText("");
                passwordField.setText("");
            }
        });

        JButton goToRegisterButton = new JButton("회원가입");
        goToRegisterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                remove(loginPanel);
                getContentPane().add(registerPanel);
                revalidate();
                repaint();
            }
        });

        loginPanel.add(usernameLabel);
        loginPanel.add(usernameField);
        loginPanel.add(passwordLabel);
        loginPanel.add(passwordField);
        loginPanel.add(loginButton);
        loginPanel.add(goToRegisterButton);
    }

    private void createRegisterPanel() {
        registerPanel = new JPanel();
        registerPanel.setLayout(new GridLayout(3, 2, 10, 10)); // 회원가입 창 레이아웃 조정

        JLabel newUsernameLabel = new JLabel("새로운 아이디:");
        newUsernameField = new JTextField();

        JLabel newPasswordLabel = new JLabel("새로운 비밀번호:");
        newPasswordField = new JPasswordField();

        JButton registerButton = new JButton("회원가입");
        registerButton.addActionListener(new ActionListener() {

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
                remove(registerPanel);
                getContentPane().add(loginPanel);
                revalidate();
                repaint();
            }
        });

        JButton goToLoginButton = new JButton("로그인 화면으로");
        goToLoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                newUsernameField.setText("");
                newPasswordField.setText("");
                remove(registerPanel);
                getContentPane().add(loginPanel);
                revalidate();
                repaint();
            }
        });

        registerPanel.add(newUsernameLabel);
        registerPanel.add(newUsernameField);
        registerPanel.add(newPasswordLabel);
        registerPanel.add(newPasswordField);
        registerPanel.add(registerButton);
        registerPanel.add(goToLoginButton);
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

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                firstpage loginFrame = new firstpage();
                loginFrame.setVisible(true);
            }
        });
    }
}