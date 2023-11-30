package GUI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class mapimageselect {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mapimageselect window = new mapimageselect();
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
	public mapimageselect() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1200, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		ImageIcon backgroundImage = new ImageIcon("./image/지도.jpg");
		JPanel mainpage = new JPanel();
		mainpage.setBounds(0, 0, 1212, 761);
		frame.getContentPane().add(mainpage);
		mainpage.setLayout(null);
		
		JButton btngyeong = new JButton("경기도");
		btngyeong.setBounds(485, 194, 97, 23);
		mainpage.add(btngyeong);
		
		JButton btngang = new JButton("강원도");
		btngang.setBounds(622, 162, 97, 23);
		mainpage.add(btngang);
		
		JButton btncbuk = new JButton("충청북도");
		btncbuk.setBounds(566, 288, 97, 23);
		mainpage.add(btncbuk);
		
		JButton btncnam = new JButton("충청남도");
		btncnam.setBounds(442, 325, 97, 23);
		mainpage.add(btncnam);
		
		JButton btnjbuk = new JButton("전라북도");
		btnjbuk.setBounds(472, 439, 97, 23);
		mainpage.add(btnjbuk);
		
		JButton btnjnam = new JButton("전라남도");
		btnjnam.setBounds(427, 538, 97, 23);
		mainpage.add(btnjnam);
		
		JButton btngbuk = new JButton("경상북도");
		btngbuk.setBounds(664, 387, 97, 23);
		mainpage.add(btngbuk);
		
		JButton btngnam = new JButton("경상남도");
		btngnam.setBounds(622, 506, 97, 23);
		mainpage.add(btngnam);
		
		JButton btnjeju = new JButton("제주도");
		btnjeju.setBounds(383, 683, 97, 23);
		mainpage.add(btnjeju);
		JLabel backgroundLabel = new JLabel("New label");
		backgroundLabel.setIcon(backgroundImage);
		
		JPanel pagejbuk = new JPanel();
		pagejbuk.setBounds(0, 0, 1184, 761);
		frame.getContentPane().add(pagejbuk);
		pagejbuk.setLayout(null);
		
		JPanel pagecbuk = new JPanel();
		pagecbuk.setBounds(0, 0, 1184, 761);
		frame.getContentPane().add(pagecbuk);
		pagecbuk.setLayout(null);
		
		JButton btnbackcbuk = new JButton("이전화면");
		btnbackcbuk.setBounds(384, 216, 97, 23);
		pagecbuk.add(btnbackcbuk);
		
		JPanel pagejeju = new JPanel();
		pagejeju.setBounds(0, 0, 1184, 761);
		frame.getContentPane().add(pagejeju);
		pagejeju.setLayout(null);
		
		JPanel pagegnam = new JPanel();
		pagegnam.setBounds(0, 0, 1184, 761);
		frame.getContentPane().add(pagegnam);
		pagegnam.setLayout(null);
		
		JPanel pagegang = new JPanel();
		pagegang.setBounds(0, 0, 1184, 761);
		frame.getContentPane().add(pagegang);
		pagegang.setLayout(null);
		
		JPanel pagegyeong = new JPanel();
		pagegyeong.setBounds(0, 0, 1184, 761);
		frame.getContentPane().add(pagegyeong);
		pagegyeong.setLayout(null);
		
		JPanel pagecnam = new JPanel();
		pagecnam.setBounds(0, 0, 1184, 761);
		frame.getContentPane().add(pagecnam);
		pagecnam.setLayout(null);
		
		JPanel pagegbuk = new JPanel();
		pagegbuk.setBounds(0, 0, 1184, 761);
		frame.getContentPane().add(pagegbuk);
		pagegbuk.setLayout(null);
		
		JPanel pagejnam = new JPanel();
		pagejnam.setBounds(0, 0, 1184, 761);
		frame.getContentPane().add(pagejnam);
		pagejnam.setLayout(null);
		
		// JLabel의 크기를 이미지 크기로 설정합니다.
		backgroundLabel.setSize(backgroundImage.getIconWidth(), backgroundImage.getIconHeight());
		int x = (mainpage.getWidth() - backgroundLabel.getWidth()) / 2;
		int y = (mainpage.getHeight() - backgroundLabel.getHeight()) / 2;
		backgroundLabel.setBounds(x, y, backgroundLabel.getWidth(), backgroundLabel.getHeight());
		
				mainpage.add(backgroundLabel);
				
				btngyeong.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						pagegyeong.setVisible(true);
						mainpage.setVisible(false);
					}
					
				});
				btncbuk.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pagecbuk.setVisible(true);
				mainpage.setVisible(false);
			}
			
		});
				btncnam.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pagecnam.setVisible(true);
				mainpage.setVisible(false);
			}
			
		});
				btnjbuk.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pagejbuk.setVisible(true);
				mainpage.setVisible(false);
			}
			
		});
				btnjnam.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pagejnam.setVisible(true);
				mainpage.setVisible(false);
			}
			
		});
				btngbuk.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pagegbuk.setVisible(true);
				mainpage.setVisible(false);
			}
			
		});
				btngnam.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pagegnam.setVisible(true);
				mainpage.setVisible(false);
			}
			
		});
				btnjeju.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pagejeju.setVisible(true);
				mainpage.setVisible(false);
			}
			
		});
				btngang.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						pagegang.setVisible(true);
						mainpage.setVisible(false);
					}
					
				});
		
		
		
		JButton btnbackjbuk = new JButton("이전화면");
		btnbackjbuk.setBounds(884, 165, 97, 23);
		pagejbuk.add(btnbackjbuk);
		pagejbuk.setVisible(false);
		btnbackjbuk.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pagejbuk.setVisible(false);
				mainpage.setVisible(true);
			}
			
		});
		
		
		
		JButton btnbackjeju = new JButton("이전화면");
		btnbackjeju.setBounds(551, 5, 81, 23);
		pagejeju.add(btnbackjeju);
		pagejeju.setVisible(false);
		
		btnbackjeju.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pagejeju.setVisible(false);
				mainpage.setVisible(true);
			}
			
		});
		
		
		
		JButton btnbackgnam = new JButton("이전화면");
		btnbackgnam.setBounds(0, 0, 97, 23);
		pagegnam.add(btnbackgnam);
		pagegnam.setVisible(false);
		btnbackgnam.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pagegnam.setVisible(false);
				mainpage.setVisible(true);
			}
			
		});
		
		
		JButton btnbackgang = new JButton("이전화면");
		btnbackgang.setBounds(470, 452, 97, 23);
		pagegang.add(btnbackgang);
		
        
        pagegang.setVisible(false);
        btnbackgang.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pagegang.setVisible(false);
				mainpage.setVisible(true);
			}
        	
        });
		
        
		
		JButton btnbackgyeong = new JButton("이전화면");
		btnbackgyeong.setBounds(261, 386, 97, 23);
		pagegyeong.add(btnbackgyeong);
		pagegyeong.setVisible(false);
		btnbackgyeong.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pagegyeong.setVisible(false);
				mainpage.setVisible(true);
			}
			
		});
		
		
		JButton btnbackcnam = new JButton("이전화면");
		btnbackcnam.setBounds(116, 500, 97, 23);
		pagecnam.add(btnbackcnam);
		pagecnam.setVisible(false);
		btnbackcnam.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pagecnam.setVisible(false);
				mainpage.setVisible(true);
			}
			
		});
		
		
		
		
		JButton btnbackjnam = new JButton("이전화면");
		btnbackjnam.setBounds(27, 345, 97, 23);
		pagejnam.add(btnbackjnam);
		pagejnam.setVisible(false);
		btnbackjnam.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pagejnam.setVisible(false);
				mainpage.setVisible(true);
			}
			
		});
		
		
		
		JButton btnbackgbuk = new JButton("이전화면");
		btnbackgbuk.setBounds(162, 203, 97, 23);
		pagegbuk.add(btnbackgbuk);
		pagegbuk.setVisible(false);
		btnbackgbuk.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pagegbuk.setVisible(false);
				mainpage.setVisible(true);
			}
			
		});
		
		
		
		btnbackcbuk.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pagecbuk.setVisible(false);
				mainpage.setVisible(true);
			}
			
		});
        
	}
}