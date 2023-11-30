package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import API.weather;


public class Factorofcamera extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Factorofcamera frame = new Factorofcamera();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the frame.
	 */
	public Factorofcamera() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" 조리개 : ");
		lblNewLabel.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		lblNewLabel.setBounds(99, 101, 284, 122);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("셔터스피드 : ");
		lblNewLabel_1.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		lblNewLabel_1.setBounds(99, 233, 284, 122);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("ISO :");
		lblNewLabel_1_1.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		lblNewLabel_1_1.setBounds(99, 365, 284, 122);
		contentPane.add(lblNewLabel_1_1);
	}
}
