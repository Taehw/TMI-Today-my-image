package opensw;

import java.awt.EventQueue;
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

import newopensw.login_form;

public class LoginFrame2 {

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
					LoginFrame2 window = new LoginFrame2();
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
	public LoginFrame2() {
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
		JLabel ID = new JLabel("아이디 : ");
		ID.setBounds(228, 190, 57, 15);
		loginpanel.add(ID);
		
		JLabel PWD = new JLabel("비밀번호 : ");
		PWD.setBounds(228, 230, 86, 15);
		loginpanel.add(PWD);
		
		usernameField = new JTextField();
		usernameField.setBounds(326, 187, 116, 21);
		loginpanel.add(usernameField);
		usernameField.setColumns(10);
		
		JButton btnLogin = new JButton("로그인");
		btnLogin.setBounds(216, 272, 97, 23);
		loginpanel.add(btnLogin);
		
		JButton btnSignup = new JButton("회원가입");
		btnSignup.setBounds(345, 272, 97, 23);
		loginpanel.add(btnSignup);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(326, 227, 116, 21);
		loginpanel.add(passwordField);
		btnLogin.addActionListener(new ActionListener() {
            login_form login = new login_form();

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
		JLabel newID = new JLabel("새로운 아이디");
		newID.setBounds(162, 67, 194, 132);
		signpanel.add(newID);
		
		JLabel newPWD = new JLabel("새로운 비밀번호");
		newPWD.setBounds(162, 241, 194, 132);
		signpanel.add(newPWD);
		
		JButton btnSign = new JButton("회원가입");
		btnSign.setBounds(191, 570, 97, 23);
		signpanel.add(btnSign);
		
		JButton btnback = new JButton("로그인 화면");
		btnback.setBounds(421, 570, 106, 23);
		signpanel.add(btnback);
		
		newUsernameField = new JTextField();
		newUsernameField.setBounds(421, 123, 116, 21);
		signpanel.add(newUsernameField);
		newUsernameField.setColumns(10);
		
		newPasswordField = new JPasswordField();
		newPasswordField.setBounds(421, 297, 116, 21);
		signpanel.add(newPasswordField);
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

            login_form login = new login_form();

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
}
