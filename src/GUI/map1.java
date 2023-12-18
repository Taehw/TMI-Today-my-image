package opensw;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import newopensw.loader;

public class test1 {

	private JFrame frame;
	private JTextField filePathTextField;
    private JLabel imageLabel;
    private JTextField dateTextField;
    private JComboBox<String> locationComboBox;
    private JTextArea memoTextArea;
    private JTextField textField;
	private int countercbuk = 0;
	private int countercbuk1 = 0;
	private int countercbuk2 = 0;
	private int countercnam = 0;
	private int countercnam1 = 0;
	private int countercnam2 = 0;
	private int counterjnam = 0;
	private int counterjnam1 = 0;
	private int counterjnam2 = 0;
	private int counterjbuk = 0;
	private int counterjbuk1 = 0;
	private int counterjbuk2 = 0;
	private int countergnam = 0;
	private int countergnam1 = 0;
	private int countergnam2 = 0;
	private int countergbuk = 0;
	private int countergbuk1 = 0;
	private int countergbuk2 = 0;
	private int countergang = 0;
	private int countergang1 = 0;
	private int countergang2 = 0;
	private int countergyeong = 0;
	private int countergyeong1 = 0;
	private int countergyeong2 = 0;
	private int counterjeju = 0;
	private int counterjeju1 = 0;
	private int counterjeju2 = 0;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test1 window = new test1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public test1() {
		initialize();
	}


	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 1200, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.getContentPane().setLayout(null);
		ImageIcon backgroundImage = new ImageIcon("./image/map.jpg");
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
		
		JPanel pagecbuk = new JPanel();
		pagecbuk.setBounds(0, 0, 1184, 761);
		frame.getContentPane().add(pagecbuk);
		pagecbuk.setLayout(null);
		
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
		
		JPanel pagejbuk = new JPanel();
		pagejbuk.setBounds(0, 0, 1184, 761);
		frame.getContentPane().add(pagejbuk);
		pagejbuk.setLayout(null);
	
		JPanel gyeongphoto1 = new JPanel();
		gyeongphoto1.setBounds(0, 0, 1184, 761);
		frame.getContentPane().add(gyeongphoto1);
		gyeongphoto1.setLayout(null);
		
		JButton backphoto1 = new JButton("갤러리로 돌아가기");
		backphoto1.setBounds(750, 200, 150, 23);
		gyeongphoto1.add(backphoto1);
		
		JPanel gyeongphoto2 = new JPanel();
		gyeongphoto2.setLayout(null);
		gyeongphoto2.setBounds(0, 0, 1184, 761);
		frame.getContentPane().add(gyeongphoto2);
		
		JButton backphoto2 = new JButton("갤러리로 돌아가기");
		backphoto2.setBounds(750, 200, 150, 23);
		gyeongphoto2.add(backphoto2);
		
		JPanel gyeongphoto3 = new JPanel();
		gyeongphoto3.setLayout(null);
		gyeongphoto3.setBounds(0, 0, 1184, 761);
		frame.getContentPane().add(gyeongphoto3);
		
		JButton backphoto3 = new JButton("갤러리로 돌아가기");
		backphoto3.setBounds(750, 200, 150, 23);
		gyeongphoto3.add(backphoto3);
		//cbuk
		JPanel cbukphoto1 = new JPanel();
		cbukphoto1.setBounds(0, 0, 1184, 761);
		frame.getContentPane().add(cbukphoto1);
		cbukphoto1.setLayout(null);

		JButton backcbukphoto1 = new JButton("갤러리로 돌아가기");
		backcbukphoto1.setBounds(750, 200, 150, 23);
		cbukphoto1.add(backcbukphoto1);

		JPanel cbukphoto2 = new JPanel();
		cbukphoto2.setLayout(null);
		cbukphoto2.setBounds(0, 0, 1184, 761);
		frame.getContentPane().add(cbukphoto2);

		JButton backcbukphoto2 = new JButton("갤러리로 돌아가기");
		backcbukphoto2.setBounds(750, 200, 150, 23);
		cbukphoto2.add(backcbukphoto2);

		JPanel cbukphoto3 = new JPanel();
		cbukphoto3.setLayout(null);
		cbukphoto3.setBounds(0, 0, 1184, 761);
		frame.getContentPane().add(cbukphoto3);
		
		JButton backcbukphoto3 = new JButton("갤러리로 돌아가기");
		backcbukphoto3.setBounds(750, 200, 150, 23);
		cbukphoto3.add(backcbukphoto3);
		
		//cnam
		JPanel cnamphoto1 = new JPanel();
		cnamphoto1.setBounds(0, 0, 1184, 761);
		frame.getContentPane().add(cnamphoto1);
		cnamphoto1.setLayout(null);

		JButton backcnamphoto1 = new JButton("갤러리로 돌아가기");
		backcnamphoto1.setBounds(750, 200, 150, 23);
		cnamphoto1.add(backcnamphoto1);

		JPanel cnamphoto2 = new JPanel();
		cnamphoto2.setLayout(null);
		cnamphoto2.setBounds(0, 0, 1184, 761);
		frame.getContentPane().add(cnamphoto2);

		JButton backcnamphoto2 = new JButton("갤러리로 돌아가기");
		backcnamphoto2.setBounds(750, 200, 150, 23);
		cnamphoto2.add(backcnamphoto2);

		JPanel cnamphoto3 = new JPanel();
		cnamphoto3.setLayout(null);
		cnamphoto3.setBounds(0, 0, 1184, 761);
		frame.getContentPane().add(cnamphoto3);

		JButton backcnamphoto3 = new JButton("갤러리로 돌아가기");
		backcnamphoto3.setBounds(750, 200, 150, 23);
		cnamphoto3.add(backcnamphoto3);

		//jbuk
		JPanel jbukphoto1 = new JPanel();
		jbukphoto1.setBounds(0, 0, 1184, 761);
		frame.getContentPane().add(jbukphoto1);
		jbukphoto1.setLayout(null);

		JButton backjbukphoto1 = new JButton("갤러리로 돌아가기");
		backjbukphoto1.setBounds(750, 200, 150, 23);
		jbukphoto1.add(backjbukphoto1);

		JPanel jbukphoto2 = new JPanel();
		jbukphoto2.setLayout(null);
		jbukphoto2.setBounds(0, 0, 1184, 761);
		frame.getContentPane().add(jbukphoto2);

		JButton backjbukphoto2 = new JButton("갤러리로 돌아가기");
		backjbukphoto2.setBounds(750, 200, 150, 23);
		jbukphoto2.add(backjbukphoto2);

		JPanel jbukphoto3 = new JPanel();
		jbukphoto3.setLayout(null);
		jbukphoto3.setBounds(0, 0, 1184, 761);
		frame.getContentPane().add(jbukphoto3);

		JButton backjbukphoto3 = new JButton("갤러리로 돌아가기");
		backjbukphoto3.setBounds(750, 200, 150, 23);
		jbukphoto3.add(backjbukphoto3);

		//jnam
		JPanel jnamphoto1 = new JPanel();
		jnamphoto1.setBounds(0, 0, 1184, 761);
		frame.getContentPane().add(jnamphoto1);
		jnamphoto1.setLayout(null);

		JButton backjnamphoto1 = new JButton("갤러리로 돌아가기");
		backjnamphoto1.setBounds(750, 200, 150, 23);
		jnamphoto1.add(backjnamphoto1);

		JPanel jnamphoto2 = new JPanel();
		jnamphoto2.setLayout(null);
		jnamphoto2.setBounds(0, 0, 1184, 761);
		frame.getContentPane().add(jnamphoto2);

		JButton backjnamphoto2 = new JButton("갤러리로 돌아가기");
		backjnamphoto2.setBounds(750, 200, 150, 23);
		jnamphoto2.add(backjnamphoto2);

		JPanel jnamphoto3 = new JPanel();
		jnamphoto3.setLayout(null);
		jnamphoto3.setBounds(0, 0, 1184, 761);
		frame.getContentPane().add(jnamphoto3);

		JButton backjnamphoto3 = new JButton("갤러리로 돌아가기");
		backjnamphoto3.setBounds(750, 200, 150, 23);
		jnamphoto3.add(backjnamphoto3);
		//gbuk
		JPanel gbukphoto1 = new JPanel();
		gbukphoto1.setBounds(0, 0, 1184, 761);
		frame.getContentPane().add(gbukphoto1);
		gbukphoto1.setLayout(null);

		JButton backgbukphoto1 = new JButton("갤러리로 돌아가기");
		backgbukphoto1.setBounds(750, 200, 150, 23);
		gbukphoto1.add(backgbukphoto1);

		JPanel gbukphoto2 = new JPanel();
		gbukphoto2.setLayout(null);
		gbukphoto2.setBounds(0, 0, 1184, 761);
		frame.getContentPane().add(gbukphoto2);

		JButton backgbukphoto2 = new JButton("갤러리로 돌아가기");
		backgbukphoto2.setBounds(750, 200, 150, 23);
		gbukphoto2.add(backgbukphoto2);

		JPanel gbukphoto3 = new JPanel();
		gbukphoto3.setLayout(null);
		gbukphoto3.setBounds(0, 0, 1184, 761);
		frame.getContentPane().add(gbukphoto3);

		JButton backgbukphoto3 = new JButton("갤러리로 돌아가기");
		backgbukphoto3.setBounds(750, 200, 150, 23);
		gbukphoto3.add(backgbukphoto3);

		//gnam
		JPanel gnamphoto1 = new JPanel();
		gnamphoto1.setBounds(0, 0, 1184, 761);
		frame.getContentPane().add(gnamphoto1);
		gnamphoto1.setLayout(null);

		JButton backgnamphoto1 = new JButton("갤러리로 돌아가기");
		backgnamphoto1.setBounds(750, 200, 150, 23);
		gnamphoto1.add(backgnamphoto1);

		JPanel gnamphoto2 = new JPanel();
		gnamphoto2.setLayout(null);
		gnamphoto2.setBounds(0, 0, 1184, 761);
		frame.getContentPane().add(gnamphoto2);

		JButton backgnamphoto2 = new JButton("갤러리로 돌아가기");
		backgnamphoto2.setBounds(750, 200, 150, 23);
		gnamphoto2.add(backgnamphoto2);

		JPanel gnamphoto3 = new JPanel();
		gnamphoto3.setLayout(null);
		gnamphoto3.setBounds(0, 0, 1184, 761);
		frame.getContentPane().add(gnamphoto3);

		JButton backgnamphoto3 = new JButton("갤러리로 돌아가기");
		backgnamphoto3.setBounds(750, 200, 150, 23);
		gnamphoto3.add(backgnamphoto3);
		//gang
		JPanel gangphoto1 = new JPanel();
		gangphoto1.setBounds(0, 0, 1184, 761);
		frame.getContentPane().add(gangphoto1);
		gangphoto1.setLayout(null);

		JButton backgangphoto1 = new JButton("갤러리로 돌아가기");
		backgangphoto1.setBounds(750, 200, 150, 23);
		gangphoto1.add(backgangphoto1);

		JPanel gangphoto2 = new JPanel();
		gangphoto2.setLayout(null);
		gangphoto2.setBounds(0, 0, 1184, 761);
		frame.getContentPane().add(gangphoto2);

		JButton backgangphoto2 = new JButton("갤러리로 돌아가기");
		backgangphoto2.setBounds(750, 200, 150, 23);
		gangphoto2.add(backgangphoto2);

		JPanel gangphoto3 = new JPanel();
		gangphoto3.setLayout(null);
		gangphoto3.setBounds(0, 0, 1184, 761);
		frame.getContentPane().add(gangphoto3);

		JButton backgangphoto3 = new JButton("갤러리로 돌아가기");
		backgangphoto3.setBounds(750, 200, 150, 23);
		gangphoto3.add(backgangphoto3);

		//jeju
		JPanel jejuphoto1 = new JPanel();
		jejuphoto1.setBounds(0, 0, 1184, 761);
		frame.getContentPane().add(jejuphoto1);
		jejuphoto1.setLayout(null);

		JButton backjejuphoto1 = new JButton("갤러리로 돌아가기");
		backjejuphoto1.setBounds(750, 200, 150, 23);
		jejuphoto1.add(backjejuphoto1);

		JPanel jejuphoto2 = new JPanel();
		jejuphoto2.setLayout(null);
		jejuphoto2.setBounds(0, 0, 1184, 761);
		frame.getContentPane().add(jejuphoto2);

		JButton backjejuphoto2 = new JButton("갤러리로 돌아가기");
		backjejuphoto2.setBounds(750, 200, 150, 23);
		jejuphoto2.add(backjejuphoto2);

		JPanel jejuphoto3 = new JPanel();
		jejuphoto3.setLayout(null);
		jejuphoto3.setBounds(0, 0, 1184, 761);
		frame.getContentPane().add(jejuphoto3);

		JButton backjejuphoto3 = new JButton("갤러리로 돌아가기");
		backjejuphoto3.setBounds(750, 200, 150, 23);
		jejuphoto3.add(backjejuphoto3);
		// JLabel의 크기를 이미지 크기로 설정합니다.
		backgroundLabel.setSize(backgroundImage.getIconWidth(), backgroundImage.getIconHeight());
		int x = (mainpage.getWidth() - backgroundLabel.getWidth()) / 2;
		int y = (mainpage.getHeight() - backgroundLabel.getHeight()) / 2;
		backgroundLabel.setBounds(x, y, backgroundLabel.getWidth(), backgroundLabel.getHeight());
		
				mainpage.add(backgroundLabel);
				
				 
				pagegyeong.setVisible(false);
				
				btngyeong.addActionListener(new ActionListener() {

					@Override
					 public void actionPerformed(ActionEvent e) {
		                  pagegyeong.setVisible(true);
		                  mainpage.setVisible(false);
		                  loader my_loader= new loader();
		                  ArrayList<String> urlArray = my_loader.downloadImg("경기");
		                  int iterationIndex=0;
		                  JLabel lblNewLabel = null;
		                   if(!urlArray.isEmpty()) {
		                     Iterator<String> iter = urlArray.iterator(); 
		                     while(iter.hasNext()){
		                     ImageIcon icon = new ImageIcon(iter.next());
		                     Image image = icon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH); // 이미지 크기 조정
		                     lblNewLabel = new JLabel(new ImageIcon(image));
		                     int x=103+300*iterationIndex;
		                     lblNewLabel.setBounds(x, 71, 200, 200);
		                     pagegyeong.add(lblNewLabel);
		             		 iterationIndex++;
		                     }
		                     for(int i=0;i<iterationIndex;i++) {
		                    	
			                     JLabel countgyeong = new JLabel("");
			                     JButton goodgyeong = new JButton(new ImageIcon("C:\\Users\\ebmmq\\Desktop\\good3.png"));
			             		goodgyeong.addActionListener(new ActionListener() {
			             			public void actionPerformed(ActionEvent e) {
			             				updateLabel=()->countgyeong.setText(Integer.toString(countergyeong));
			             				countergyeong++;
			             				updateLabel();
			             			}
			             		});
			             		JButton photo = new JButton("사진 설명");
			    				photo.addActionListener(new ActionListener() {
			    					public void actionPerformed(ActionEvent e) {
			    						pagegyeong.setVisible(false);
			    						gyeongphoto1.setVisible(true);
			    						loader loader2= new loader();
			    						int index=0;
			    				        ImageIcon icon = new ImageIcon(loader2.get_img_url(urlArray,index));
			    				        Image image = icon.getImage().getScaledInstance(600, 600, Image.SCALE_SMOOTH); // 이미지 크기 조정
			    				        imageLabel = new JLabel(new ImageIcon(image));
			    				        imageLabel.setBounds(30, 80, 600, 600);
			    				        gyeongphoto1.add(imageLabel);
			    				           
			    				        JLabel lblDate = new JLabel("Date:");
			    				        lblDate.setBounds(733, 334, 70, 30);
			    				        gyeongphoto1.add(lblDate);
			    				           
			    				        String img_2_date=loader2.get_img_date(urlArray,index);
			    				        dateTextField = new JTextField(img_2_date);
			    				        dateTextField.setBounds(839, 335, 150, 30);
			    				        gyeongphoto1.add(dateTextField);

			    				        JLabel lblLocation = new JLabel("Location:");
			    				        lblLocation.setBounds(733, 417, 70, 30);
			    				        gyeongphoto1.add(lblLocation);
			    				           
			    				        textField = new JTextField("경기");
			    				        textField.setColumns(10);
			    				        textField.setBounds(839, 417, 150, 30);
			    				        gyeongphoto1.add(textField);

			    				        JLabel lblMemo = new JLabel("Memo:");
			    				        lblMemo.setBounds(733, 594, 70, 30);
			    				        gyeongphoto1.add(lblMemo);
			    				        String img_2_memo=loader2.get_memo(urlArray,index);
			    				        memoTextArea = new JTextArea(img_2_memo);
			    				        memoTextArea.setBounds(839, 573, 300, 70);
			    				        gyeongphoto1.add(memoTextArea);
			    					}
			    				});
			             		JLabel countgyeong1 = new JLabel("");
			             		JButton goodgyeong1 = new JButton(new ImageIcon("C:\\Users\\ebmmq\\Desktop\\good3.png"));
			             		goodgyeong1.addActionListener(new ActionListener() {
			             			public void actionPerformed(ActionEvent e) {
			             				updateLabel=()->countgyeong1.setText(Integer.toString(countergyeong1));
			             				countergyeong1++;
			             				updateLabel();
			             			}
			             		});
			             		JButton photo1 = new JButton("사진 설명");
			    				photo1.addActionListener(new ActionListener() {
			    					public void actionPerformed(ActionEvent e) {
			    						pagegyeong.setVisible(false);
			    						gyeongphoto2.setVisible(true);
			    						loader loader2= new loader();
			    						int index=1;
			    				        ImageIcon icon = new ImageIcon(loader2.get_img_url(urlArray,index));
			    				        Image image = icon.getImage().getScaledInstance(600, 600, Image.SCALE_SMOOTH); // 이미지 크기 조정
			    				        imageLabel = new JLabel(new ImageIcon(image));
			    				        imageLabel.setBounds(30, 80, 600, 600);
			    				        gyeongphoto2.add(imageLabel);
			    				           
			    				        JLabel lblDate = new JLabel("Date:");
			    				        lblDate.setBounds(733, 334, 70, 30);
			    				        gyeongphoto2.add(lblDate);
			    				           
			    				        String img_2_date=loader2.get_img_date(urlArray,index);
			    				        dateTextField = new JTextField(img_2_date);
			    				        dateTextField.setBounds(839, 335, 150, 30);
			    				        gyeongphoto2.add(dateTextField);

			    				        JLabel lblLocation = new JLabel("Location:");
			    				        lblLocation.setBounds(733, 417, 70, 30);
			    				        gyeongphoto2.add(lblLocation);
			    				           
			    				        textField = new JTextField("경기");
			    				        textField.setColumns(10);
			    				        textField.setBounds(839, 417, 150, 30);
			    				        gyeongphoto2.add(textField);

			    				        JLabel lblMemo = new JLabel("Memo:");
			    				        lblMemo.setBounds(733, 594, 70, 30);
			    				        gyeongphoto2.add(lblMemo);
			    				        String img_2_memo=loader2.get_memo(urlArray,index);
			    				        memoTextArea = new JTextArea(img_2_memo);
			    				        memoTextArea.setBounds(839, 573, 300, 70);
			    				        gyeongphoto2.add(memoTextArea);
			    					}
			    				});
			    				JLabel countgyeong2 = new JLabel("");
			             		JButton goodgyeong2 = new JButton(new ImageIcon("C:\\Users\\ebmmq\\Desktop\\good3.png"));
			             		goodgyeong2.addActionListener(new ActionListener() {
			             			public void actionPerformed(ActionEvent e) {
			             				updateLabel=()->countgyeong1.setText(Integer.toString(countergyeong2));
			             				countergyeong2++;
			             				updateLabel();
			             			}
			             		});
			             		JButton photo2 = new JButton("사진 설명");
			    				photo2.addActionListener(new ActionListener() {
			    					public void actionPerformed(ActionEvent e) {
			    						pagegyeong.setVisible(false);
			    						gyeongphoto3.setVisible(true);
			    						loader loader2= new loader();
			    						int index=2;
			    				        ImageIcon icon = new ImageIcon(loader2.get_img_url(urlArray,index));
			    				        Image image = icon.getImage().getScaledInstance(600, 600, Image.SCALE_SMOOTH); // 이미지 크기 조정
			    				        imageLabel = new JLabel(new ImageIcon(image));
			    				        imageLabel.setBounds(30, 80, 600, 600);
			    				        gyeongphoto3.add(imageLabel);
			    				           
			    				        JLabel lblDate = new JLabel("Date:");
			    				        lblDate.setBounds(733, 334, 70, 30);
			    				        gyeongphoto3.add(lblDate);
			    				           
			    				        String img_2_date=loader2.get_img_date(urlArray,index);
			    				        dateTextField = new JTextField(img_2_date);
			    				        dateTextField.setBounds(839, 335, 150, 30);
			    				        gyeongphoto3.add(dateTextField);

			    				        JLabel lblLocation = new JLabel("Location:");
			    				        lblLocation.setBounds(733, 417, 70, 30);
			    				        gyeongphoto3.add(lblLocation);
			    				           
			    				        textField = new JTextField("경기");
			    				        textField.setColumns(10);
			    				        textField.setBounds(839, 417, 150, 30);
			    				        gyeongphoto3.add(textField);

			    				        JLabel lblMemo = new JLabel("Memo:");
			    				        lblMemo.setBounds(733, 594, 70, 30);
			    				        gyeongphoto2.add(lblMemo);
			    				        String img_2_memo=loader2.get_memo(urlArray,index);
			    				        memoTextArea = new JTextArea(img_2_memo);
			    				        memoTextArea.setBounds(839, 573, 300, 70);
			    				        gyeongphoto3.add(memoTextArea);
			    					}
			    				});
			             		 switch(iterationIndex) {
			             		 case 3:
			             			photo2.setBounds(703, 286, 103, 30);
				             		 pagegyeong.add(photo2);
			             			 goodgyeong2.setBounds(818, 286, 38, 30);
				                     countgyeong2.setBounds(870, 295, 57, 15);
				                     pagegyeong.add(goodgyeong2);
				             		 pagegyeong.add(countgyeong2);
			             		 case 2:
			             			photo1.setBounds(403, 286, 103, 30);
				             		 pagegyeong.add(photo1);
			             			 goodgyeong1.setBounds(518, 286, 38, 30);
				                     countgyeong1.setBounds(570, 295, 57, 15);
				                     pagegyeong.add(goodgyeong1);
				             		 pagegyeong.add(countgyeong1);
			             		 case 1:
			             			 photo.setBounds(103, 286, 103, 30);
				             		 pagegyeong.add(photo);
			             			 goodgyeong.setBounds(218, 286, 38, 30);
				                     countgyeong.setBounds(270, 295, 57, 15);
				                     pagegyeong.add(goodgyeong);
				             		 pagegyeong.add(countgyeong);
				             		 
				             		 break;
			             		 }
			                     
			                     
		                     }
		                   }else {
		                      System.out.println("아무것도 없습니다.");
		                   }
		                  
		               }
					
				});
                btncbuk.addActionListener(new ActionListener() {

					@Override
					 public void actionPerformed(ActionEvent e) {
		                  pagecbuk.setVisible(true);
		                  mainpage.setVisible(false);
		                  loader my_loader= new loader();
		                  ArrayList<String> urlArray = my_loader.downloadImg("충북");
		                  int iterationIndex=0;
		                  JLabel lblNewLabel = null;
		                   if(!urlArray.isEmpty()) {
		                     Iterator<String> iter = urlArray.iterator(); 
		                     while(iter.hasNext()){
		                     ImageIcon icon = new ImageIcon(iter.next());
		                     Image image = icon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH); // 이미지 크기 조정
		                     lblNewLabel = new JLabel(new ImageIcon(image));
		                     int x=103+300*iterationIndex;
		                     lblNewLabel.setBounds(x, 71, 200, 200);
		                     pagecbuk.add(lblNewLabel);
		             		 iterationIndex++;
		                     }
		                     for(int i=0;i<iterationIndex;i++) {
		                    	
			                     JLabel countcbuk = new JLabel("");
			                     JButton goodcbuk = new JButton(new ImageIcon("C:\\Users\\ebmmq\\Desktop\\good3.png"));
			             		goodcbuk.addActionListener(new ActionListener() {
			             			public void actionPerformed(ActionEvent e) {
			             				updateLabel=()->countcbuk.setText(Integer.toString(countercbuk));
			             				countercbuk++;
			             				updateLabel();
			             			}
			             		});
			             		JButton photo = new JButton("사진 설명");
			    				photo.addActionListener(new ActionListener() {
			    					public void actionPerformed(ActionEvent e) {
			    						pagecbuk.setVisible(false);
			    						cbukphoto1.setVisible(true);
			    						loader loader2= new loader();
			    						int index=0;
			    				        ImageIcon icon = new ImageIcon(loader2.get_img_url(urlArray,index));
			    				        Image image = icon.getImage().getScaledInstance(600, 600, Image.SCALE_SMOOTH); // 이미지 크기 조정
			    				        imageLabel = new JLabel(new ImageIcon(image));
			    				        imageLabel.setBounds(30, 80, 600, 600);
			    				        cbukphoto1.add(imageLabel);
			    				           
			    				        JLabel lblDate = new JLabel("Date:");
			    				        lblDate.setBounds(733, 334, 70, 30);
			    				        cbukphoto1.add(lblDate);
			    				           
			    				        String img_2_date=loader2.get_img_date(urlArray,index);
			    				        dateTextField = new JTextField(img_2_date);
			    				        dateTextField.setBounds(839, 335, 150, 30);
			    				        cbukphoto1.add(dateTextField);

			    				        JLabel lblLocation = new JLabel("Location:");
			    				        lblLocation.setBounds(733, 417, 70, 30);
			    				        cbukphoto1.add(lblLocation);
			    				           
			    				        textField = new JTextField("충북");
			    				        textField.setColumns(10);
			    				        textField.setBounds(839, 417, 150, 30);
			    				        cbukphoto1.add(textField);

			    				        JLabel lblMemo = new JLabel("Memo:");
			    				        lblMemo.setBounds(733, 594, 70, 30);
			    				        cbukphoto1.add(lblMemo);
			    				        String img_2_memo=loader2.get_memo(urlArray,index);
			    				        memoTextArea = new JTextArea(img_2_memo);
			    				        memoTextArea.setBounds(839, 573, 300, 70);
			    				        cbukphoto1.add(memoTextArea);
			    					}
			    				});
			             		JLabel countcbuk1 = new JLabel("");
			             		JButton goodcbuk1 = new JButton(new ImageIcon("C:\\Users\\ebmmq\\Desktop\\good3.png"));
			             		goodcbuk1.addActionListener(new ActionListener() {
			             			public void actionPerformed(ActionEvent e) {
			             				updateLabel=()->countcbuk1.setText(Integer.toString(countercbuk1));
			             				countercbuk1++;
			             				updateLabel();
			             			}
			             		});
			             		JButton photo1 = new JButton("사진 설명");
			    				photo1.addActionListener(new ActionListener() {
			    					public void actionPerformed(ActionEvent e) {
			    						pagecbuk.setVisible(false);
			    						cbukphoto2.setVisible(true);
			    						loader loader2= new loader();
			    						int index=1;
			    				        ImageIcon icon = new ImageIcon(loader2.get_img_url(urlArray,index));
			    				        Image image = icon.getImage().getScaledInstance(600, 600, Image.SCALE_SMOOTH); // 이미지 크기 조정
			    				        imageLabel = new JLabel(new ImageIcon(image));
			    				        imageLabel.setBounds(30, 80, 600, 600);
			    				        cbukphoto2.add(imageLabel);
			    				           
			    				        JLabel lblDate = new JLabel("Date:");
			    				        lblDate.setBounds(733, 334, 70, 30);
			    				        cbukphoto2.add(lblDate);
			    				           
			    				        String img_2_date=loader2.get_img_date(urlArray,index);
			    				        dateTextField = new JTextField(img_2_date);
			    				        dateTextField.setBounds(839, 335, 150, 30);
			    				        cbukphoto2.add(dateTextField);

			    				        JLabel lblLocation = new JLabel("Location:");
			    				        lblLocation.setBounds(733, 417, 70, 30);
			    				        cbukphoto2.add(lblLocation);
			    				           
			    				        textField = new JTextField("충북");
			    				        textField.setColumns(10);
			    				        textField.setBounds(839, 417, 150, 30);
			    				        cbukphoto2.add(textField);

			    				        JLabel lblMemo = new JLabel("Memo:");
			    				        lblMemo.setBounds(733, 594, 70, 30);
			    				        cbukphoto2.add(lblMemo);
			    				        String img_2_memo=loader2.get_memo(urlArray,index);
			    				        memoTextArea = new JTextArea(img_2_memo);
			    				        memoTextArea.setBounds(839, 573, 300, 70);
			    				        cbukphoto2.add(memoTextArea);
			    					}
			    				});
			    				JLabel countcbuk2 = new JLabel("");
			             		JButton goodcbuk2 = new JButton(new ImageIcon("C:\\Users\\ebmmq\\Desktop\\good3.png"));
			             		goodcbuk2.addActionListener(new ActionListener() {
			             			public void actionPerformed(ActionEvent e) {
			             				updateLabel=()->countcbuk2.setText(Integer.toString(countercbuk2));
			             				countercbuk2++;
			             				updateLabel();
			             			}
			             		});
			             		JButton photo2 = new JButton("사진 설명");
			    				photo2.addActionListener(new ActionListener() {
			    					public void actionPerformed(ActionEvent e) {
			    						pagecbuk.setVisible(false);
			    						cbukphoto3.setVisible(true);
			    						loader loader2= new loader();
			    						int index=2;
			    				        ImageIcon icon = new ImageIcon(loader2.get_img_url(urlArray,index));
			    				        Image image = icon.getImage().getScaledInstance(600, 600, Image.SCALE_SMOOTH); // 이미지 크기 조정
			    				        imageLabel = new JLabel(new ImageIcon(image));
			    				        imageLabel.setBounds(30, 80, 600, 600);
			    				        cbukphoto3.add(imageLabel);
			    				           
			    				        JLabel lblDate = new JLabel("Date:");
			    				        lblDate.setBounds(733, 334, 70, 30);
			    				        cbukphoto3.add(lblDate);
			    				           
			    				        String img_2_date=loader2.get_img_date(urlArray,index);
			    				        dateTextField = new JTextField(img_2_date);
			    				        dateTextField.setBounds(839, 335, 150, 30);
			    				        cbukphoto3.add(dateTextField);

			    				        JLabel lblLocation = new JLabel("Location:");
			    				        lblLocation.setBounds(733, 417, 70, 30);
			    				        cbukphoto3.add(lblLocation);
			    				           
			    				        textField = new JTextField("충북");
			    				        textField.setColumns(10);
			    				        textField.setBounds(839, 417, 150, 30);
			    				        cbukphoto3.add(textField);

			    				        JLabel lblMemo = new JLabel("Memo:");
			    				        lblMemo.setBounds(733, 594, 70, 30);
			    				        cbukphoto3.add(lblMemo);
			    				        String img_2_memo=loader2.get_memo(urlArray,index);
			    				        memoTextArea = new JTextArea(img_2_memo);
			    				        memoTextArea.setBounds(839, 573, 300, 70);
			    				        cbukphoto3.add(memoTextArea);

			    					}
			    				});
			             		 switch(iterationIndex) {
			             		 case 3:
			             			photo2.setBounds(703, 286, 103, 30);
				             		 pagecbuk.add(photo2);
			             			 goodcbuk2.setBounds(818, 286, 38, 30);
				                     countcbuk2.setBounds(870, 295, 57, 15);
				                     pagecbuk.add(goodcbuk2);
				             		 pagecbuk.add(countcbuk2);
			             		 case 2:
			             			photo1.setBounds(403, 286, 103, 30);
				             		 pagecbuk.add(photo1);
			             			 goodcbuk1.setBounds(518, 286, 38, 30);
				                     countcbuk1.setBounds(570, 295, 57, 15);
				                     pagecbuk.add(goodcbuk1);
				             		 pagecbuk.add(countcbuk1);
			             		 case 1:
			             			 photo.setBounds(103, 286, 103, 30);
				             		 pagecbuk.add(photo);
			             			 goodcbuk.setBounds(218, 286, 38, 30);
				                     countcbuk.setBounds(270, 295, 57, 15);
				                     pagecbuk.add(goodcbuk);
				             		 pagecbuk.add(countcbuk);
				             		 
				             		 break;
			             		 }
			                     
			                     
		                     }
		                   }else {
		                      System.out.println("아무것도 없습니다.");
		                   }
		                  
		               }
					
				});
                //cnam
                btncnam.addActionListener(new ActionListener() {

					@Override
					 public void actionPerformed(ActionEvent e) {
		                  pagecnam.setVisible(true);
		                  mainpage.setVisible(false);
		                  loader my_loader= new loader();
		                  ArrayList<String> urlArray = my_loader.downloadImg("충남");
		                  int iterationIndex=0;
		                  JLabel lblNewLabel = null;
		                   if(!urlArray.isEmpty()) {
		                     Iterator<String> iter = urlArray.iterator(); 
		                     while(iter.hasNext()){
		                     ImageIcon icon = new ImageIcon(iter.next());
		                     Image image = icon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH); // 이미지 크기 조정
		                     lblNewLabel = new JLabel(new ImageIcon(image));
		                     int x=103+300*iterationIndex;
		                     lblNewLabel.setBounds(x, 71, 200, 200);
		                     pagecnam.add(lblNewLabel);
		             		 iterationIndex++;
		                     }
		                     for(int i=0;i<iterationIndex;i++) {
		                    	
			                     JLabel countcnam = new JLabel("");
			                     JButton goodcnam = new JButton(new ImageIcon("C:\\Users\\ebmmq\\Desktop\\good3.png"));
			             		goodcnam.addActionListener(new ActionListener() {
			             			public void actionPerformed(ActionEvent e) {
			             				updateLabel=()->countcnam.setText(Integer.toString(countercnam));
			             				countercnam++;
			             				updateLabel();
			             			}
			             		});
			             		JButton photo = new JButton("사진 설명");
			    				photo.addActionListener(new ActionListener() {
			    					public void actionPerformed(ActionEvent e) {
			    						pagecnam.setVisible(false);
			    						cnamphoto1.setVisible(true);
			    						loader loader2= new loader();
			    						int index=0;
			    				        ImageIcon icon = new ImageIcon(loader2.get_img_url(urlArray,index));
			    				        Image image = icon.getImage().getScaledInstance(600, 600, Image.SCALE_SMOOTH); // 이미지 크기 조정
			    				        imageLabel = new JLabel(new ImageIcon(image));
			    				        imageLabel.setBounds(30, 80, 600, 600);
			    				        cnamphoto1.add(imageLabel);
			    				           
			    				        JLabel lblDate = new JLabel("Date:");
			    				        lblDate.setBounds(733, 334, 70, 30);
			    				        cnamphoto1.add(lblDate);
			    				           
			    				        String img_2_date=loader2.get_img_date(urlArray,index);
			    				        dateTextField = new JTextField(img_2_date);
			    				        dateTextField.setBounds(839, 335, 150, 30);
			    				        cnamphoto1.add(dateTextField);

			    				        JLabel lblLocation = new JLabel("Location:");
			    				        lblLocation.setBounds(733, 417, 70, 30);
			    				        cnamphoto1.add(lblLocation);
			    				           
			    				        textField = new JTextField("충남");
			    				        textField.setColumns(10);
			    				        textField.setBounds(839, 417, 150, 30);
			    				        cnamphoto1.add(textField);

			    				        JLabel lblMemo = new JLabel("Memo:");
			    				        lblMemo.setBounds(733, 594, 70, 30);
			    				        cnamphoto1.add(lblMemo);
			    				        String img_2_memo=loader2.get_memo(urlArray,index);
			    				        memoTextArea = new JTextArea(img_2_memo);
			    				        memoTextArea.setBounds(839, 573, 300, 70);
			    				        cnamphoto1.add(memoTextArea);
			    					}
			    				});
			             		JLabel countcnam1 = new JLabel("");
			             		JButton goodcnam1 = new JButton(new ImageIcon("C:\\Users\\ebmmq\\Desktop\\good3.png"));
			             		goodcnam1.addActionListener(new ActionListener() {
			             			public void actionPerformed(ActionEvent e) {
			             				updateLabel=()->countcnam1.setText(Integer.toString(countercnam1));
			             				countercnam1++;
			             				updateLabel();
			             			}
			             		});
			             		JButton photo1 = new JButton("사진 설명");
			    				photo1.addActionListener(new ActionListener() {
			    					public void actionPerformed(ActionEvent e) {
			    						pagecnam.setVisible(false);
			    						cnamphoto2.setVisible(true);
			    						loader loader2= new loader();
			    						int index=1;
			    				        ImageIcon icon = new ImageIcon(loader2.get_img_url(urlArray,index));
			    				        Image image = icon.getImage().getScaledInstance(600, 600, Image.SCALE_SMOOTH); // 이미지 크기 조정
			    				        imageLabel = new JLabel(new ImageIcon(image));
			    				        imageLabel.setBounds(30, 80, 600, 600);
			    				        cnamphoto2.add(imageLabel);
			    				           
			    				        JLabel lblDate = new JLabel("Date:");
			    				        lblDate.setBounds(733, 334, 70, 30);
			    				        cnamphoto2.add(lblDate);
			    				           
			    				        String img_2_date=loader2.get_img_date(urlArray,index);
			    				        dateTextField = new JTextField(img_2_date);
			    				        dateTextField.setBounds(839, 335, 150, 30);
			    				        cnamphoto2.add(dateTextField);

			    				        JLabel lblLocation = new JLabel("Location:");
			    				        lblLocation.setBounds(733, 417, 70, 30);
			    				        cnamphoto2.add(lblLocation);
			    				           
			    				        textField = new JTextField("충남");
			    				        textField.setColumns(10);
			    				        textField.setBounds(839, 417, 150, 30);
			    				        cnamphoto2.add(textField);

			    				        JLabel lblMemo = new JLabel("Memo:");
			    				        lblMemo.setBounds(733, 594, 70, 30);
			    				        cnamphoto2.add(lblMemo);
			    				        String img_2_memo=loader2.get_memo(urlArray,index);
			    				        memoTextArea = new JTextArea(img_2_memo);
			    				        memoTextArea.setBounds(839, 573, 300, 70);
			    				        cnamphoto2.add(memoTextArea);
			    					}
			    				});
			    				JLabel countcnam2 = new JLabel("");
			             		JButton goodcnam2 = new JButton(new ImageIcon("C:\\Users\\ebmmq\\Desktop\\good3.png"));
			             		goodcnam2.addActionListener(new ActionListener() {
			             			public void actionPerformed(ActionEvent e) {
			             				updateLabel=()->countcnam1.setText(Integer.toString(countercnam2));
			             				countercnam2++;
			             				updateLabel();
			             			}
			             		});
			             		JButton photo2 = new JButton("사진 설명");
			    				photo2.addActionListener(new ActionListener() {
			    					public void actionPerformed(ActionEvent e) {
			    						pagecnam.setVisible(false);
			    						cnamphoto3.setVisible(true);
			    						loader loader2= new loader();
			    						int index=2;
			    				        ImageIcon icon = new ImageIcon(loader2.get_img_url(urlArray,index));
			    				        Image image = icon.getImage().getScaledInstance(600, 600, Image.SCALE_SMOOTH); // 이미지 크기 조정
			    				        imageLabel = new JLabel(new ImageIcon(image));
			    				        imageLabel.setBounds(30, 80, 600, 600);
			    				        cnamphoto3.add(imageLabel);
			    				           
			    				        JLabel lblDate = new JLabel("Date:");
			    				        lblDate.setBounds(733, 334, 70, 30);
			    				        cnamphoto3.add(lblDate);
			    				           
			    				        String img_2_date=loader2.get_img_date(urlArray,index);
			    				        dateTextField = new JTextField(img_2_date);
			    				        dateTextField.setBounds(839, 335, 150, 30);
			    				        cnamphoto3.add(dateTextField);

			    				        JLabel lblLocation = new JLabel("Location:");
			    				        lblLocation.setBounds(733, 417, 70, 30);
			    				        cnamphoto3.add(lblLocation);
			    				           
			    				        textField = new JTextField("충남");
			    				        textField.setColumns(10);
			    				        textField.setBounds(839, 417, 150, 30);
			    				        cnamphoto3.add(textField);

			    				        JLabel lblMemo = new JLabel("Memo:");
			    				        lblMemo.setBounds(733, 594, 70, 30);
			    				        cnamphoto3.add(lblMemo);
			    				        String img_2_memo=loader2.get_memo(urlArray,index);
			    				        memoTextArea = new JTextArea(img_2_memo);
			    				        memoTextArea.setBounds(839, 573, 300, 70);
			    				        cnamphoto3.add(memoTextArea);
			    					}
			    				});
			             		 switch(iterationIndex) {
			             		 case 3:
			             			photo2.setBounds(703, 286, 103, 30);
				             		 pagecnam.add(photo2);
			             			 goodcnam2.setBounds(818, 286, 38, 30);
				                     countcnam2.setBounds(870, 295, 57, 15);
				                     pagecnam.add(goodcnam2);
				             		 pagecnam.add(countcnam2);
			             		 case 2:
			             			photo1.setBounds(403, 286, 103, 30);
				             		 pagecnam.add(photo1);
			             			 goodcnam1.setBounds(518, 286, 38, 30);
				                     countcnam1.setBounds(570, 295, 57, 15);
				                     pagecnam.add(goodcnam1);
				             		 pagecnam.add(countcnam1);
			             		 case 1:
			             			 photo.setBounds(103, 286, 103, 30);
				             		 pagecnam.add(photo);
			             			 goodcnam.setBounds(218, 286, 38, 30);
				                     countcnam.setBounds(270, 295, 57, 15);
				                     pagecnam.add(goodcnam);
				             		 pagecnam.add(countcnam);
				             		 
				             		 break;
			             		 }
			                     
			                     
		                     }
		                   }else {
		                      System.out.println("아무것도 없습니다.");
		                   }
		                  
		               }
					
				});
                //jbuk
                btnjbuk.addActionListener(new ActionListener() {

					@Override
					 public void actionPerformed(ActionEvent e) {
		                  pagejbuk.setVisible(true);
		                  mainpage.setVisible(false);
		                  loader my_loader= new loader();
		                  ArrayList<String> urlArray = my_loader.downloadImg("전북");
		                  int iterationIndex=0;
		                  JLabel lblNewLabel = null;
		                   if(!urlArray.isEmpty()) {
		                     Iterator<String> iter = urlArray.iterator(); 
		                     while(iter.hasNext()){
		                     ImageIcon icon = new ImageIcon(iter.next());
		                     Image image = icon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH); // 이미지 크기 조정
		                     lblNewLabel = new JLabel(new ImageIcon(image));
		                     int x=103+300*iterationIndex;
		                     lblNewLabel.setBounds(x, 71, 200, 200);
		                     pagejbuk.add(lblNewLabel);
		             		 iterationIndex++;
		                     }
		                     for(int i=0;i<iterationIndex;i++) {
		                    	
			                     JLabel countjbuk = new JLabel("");
			                     JButton goodjbuk = new JButton(new ImageIcon("C:\\Users\\ebmmq\\Desktop\\good3.png"));
			             		goodjbuk.addActionListener(new ActionListener() {
			             			public void actionPerformed(ActionEvent e) {
			             				updateLabel=()->countjbuk.setText(Integer.toString(counterjbuk));
			             				counterjbuk++;
			             				updateLabel();
			             			}
			             		});
			             		JButton photo = new JButton("사진 설명");
			    				photo.addActionListener(new ActionListener() {
			    					public void actionPerformed(ActionEvent e) {
			    						pagejbuk.setVisible(false);
			    						jbukphoto1.setVisible(true);
			    						loader loader2= new loader();
			    						int index=0;
			    				        ImageIcon icon = new ImageIcon(loader2.get_img_url(urlArray,index));
			    				        Image image = icon.getImage().getScaledInstance(600, 600, Image.SCALE_SMOOTH); // 이미지 크기 조정
			    				        imageLabel = new JLabel(new ImageIcon(image));
			    				        imageLabel.setBounds(30, 80, 600, 600);
			    				        jbukphoto1.add(imageLabel);
			    				           
			    				        JLabel lblDate = new JLabel("Date:");
			    				        lblDate.setBounds(733, 334, 70, 30);
			    				        jbukphoto1.add(lblDate);
			    				           
			    				        String img_2_date=loader2.get_img_date(urlArray,index);
			    				        dateTextField = new JTextField(img_2_date);
			    				        dateTextField.setBounds(839, 335, 150, 30);
			    				        jbukphoto1.add(dateTextField);

			    				        JLabel lblLocation = new JLabel("Location:");
			    				        lblLocation.setBounds(733, 417, 70, 30);
			    				        jbukphoto1.add(lblLocation);
			    				           
			    				        textField = new JTextField("전북");
			    				        textField.setColumns(10);
			    				        textField.setBounds(839, 417, 150, 30);
			    				        jbukphoto1.add(textField);

			    				        JLabel lblMemo = new JLabel("Memo:");
			    				        lblMemo.setBounds(733, 594, 70, 30);
			    				        jbukphoto1.add(lblMemo);
			    				        String img_2_memo=loader2.get_memo(urlArray,index);
			    				        memoTextArea = new JTextArea(img_2_memo);
			    				        memoTextArea.setBounds(839, 573, 300, 70);
			    				        jbukphoto1.add(memoTextArea);
			    					}
			    				});
			             		JLabel countjbuk1 = new JLabel("");
			             		JButton goodjbuk1 = new JButton(new ImageIcon("C:\\Users\\ebmmq\\Desktop\\good3.png"));
			             		goodjbuk1.addActionListener(new ActionListener() {
			             			public void actionPerformed(ActionEvent e) {
			             				updateLabel=()->countjbuk1.setText(Integer.toString(counterjbuk1));
			             				counterjbuk1++;
			             				updateLabel();
			             			}
			             		});
			             		JButton photo1 = new JButton("사진 설명");
			    				photo1.addActionListener(new ActionListener() {
			    					public void actionPerformed(ActionEvent e) {
			    						pagejbuk.setVisible(false);
			    						jbukphoto2.setVisible(true);
			    						loader loader2= new loader();
			    						int index=1;
			    				        ImageIcon icon = new ImageIcon(loader2.get_img_url(urlArray,index));
			    				        Image image = icon.getImage().getScaledInstance(600, 600, Image.SCALE_SMOOTH); // 이미지 크기 조정
			    				        imageLabel = new JLabel(new ImageIcon(image));
			    				        imageLabel.setBounds(30, 80, 600, 600);
			    				        jbukphoto2.add(imageLabel);
			    				           
			    				        JLabel lblDate = new JLabel("Date:");
			    				        lblDate.setBounds(733, 334, 70, 30);
			    				        jbukphoto2.add(lblDate);
			    				           
			    				        String img_2_date=loader2.get_img_date(urlArray,index);
			    				        dateTextField = new JTextField(img_2_date);
			    				        dateTextField.setBounds(839, 335, 150, 30);
			    				        jbukphoto2.add(dateTextField);

			    				        JLabel lblLocation = new JLabel("Location:");
			    				        lblLocation.setBounds(733, 417, 70, 30);
			    				        jbukphoto2.add(lblLocation);
			    				           
			    				        textField = new JTextField("전북");
			    				        textField.setColumns(10);
			    				        textField.setBounds(839, 417, 150, 30);
			    				        jbukphoto2.add(textField);

			    				        JLabel lblMemo = new JLabel("Memo:");
			    				        lblMemo.setBounds(733, 594, 70, 30);
			    				        jbukphoto2.add(lblMemo);
			    				        String img_2_memo=loader2.get_memo(urlArray,index);
			    				        memoTextArea = new JTextArea(img_2_memo);
			    				        memoTextArea.setBounds(839, 573, 300, 70);
			    				        jbukphoto2.add(memoTextArea);
			    					}
			    				});
			    				JLabel countjbuk2 = new JLabel("");
			             		JButton goodjbuk2 = new JButton(new ImageIcon("C:\\Users\\ebmmq\\Desktop\\good3.png"));
			             		goodjbuk2.addActionListener(new ActionListener() {
			             			public void actionPerformed(ActionEvent e) {
			             				updateLabel=()->countjbuk1.setText(Integer.toString(counterjbuk2));
			             				counterjbuk2++;
			             				updateLabel();
			             			}
			             		});
			             		JButton photo2 = new JButton("사진 설명");
			    				photo2.addActionListener(new ActionListener() {
			    					public void actionPerformed(ActionEvent e) {
			    						pagejbuk.setVisible(false);
			    						jbukphoto3.setVisible(true);
			    						loader loader2= new loader();
			    						int index=2;
			    				        ImageIcon icon = new ImageIcon(loader2.get_img_url(urlArray,index));
			    				        Image image = icon.getImage().getScaledInstance(600, 600, Image.SCALE_SMOOTH); // 이미지 크기 조정
			    				        imageLabel = new JLabel(new ImageIcon(image));
			    				        imageLabel.setBounds(30, 80, 600, 600);
			    				        jbukphoto3.add(imageLabel);
			    				           
			    				        JLabel lblDate = new JLabel("Date:");
			    				        lblDate.setBounds(733, 334, 70, 30);
			    				        jbukphoto3.add(lblDate);
			    				           
			    				        String img_2_date=loader2.get_img_date(urlArray,index);
			    				        dateTextField = new JTextField(img_2_date);
			    				        dateTextField.setBounds(839, 335, 150, 30);
			    				        jbukphoto3.add(dateTextField);

			    				        JLabel lblLocation = new JLabel("Location:");
			    				        lblLocation.setBounds(733, 417, 70, 30);
			    				        jbukphoto3.add(lblLocation);
			    				           
			    				        textField = new JTextField("전북");
			    				        textField.setColumns(10);
			    				        textField.setBounds(839, 417, 150, 30);
			    				        jbukphoto3.add(textField);

			    				        JLabel lblMemo = new JLabel("Memo:");
			    				        lblMemo.setBounds(733, 594, 70, 30);
			    				        jbukphoto3.add(lblMemo);
			    				        String img_2_memo=loader2.get_memo(urlArray,index);
			    				        memoTextArea = new JTextArea(img_2_memo);
			    				        memoTextArea.setBounds(839, 573, 300, 70);
			    				        jbukphoto3.add(memoTextArea);
			    					}
			    				});
			             		 switch(iterationIndex) {
			             		 case 3:
			             			photo2.setBounds(703, 286, 103, 30);
				             		 pagejbuk.add(photo2);
			             			 goodjbuk2.setBounds(818, 286, 38, 30);
				                     countjbuk2.setBounds(870, 295, 57, 15);
				                     pagejbuk.add(goodjbuk2);
				             		 pagejbuk.add(countjbuk2);
			             		 case 2:
			             			photo1.setBounds(403, 286, 103, 30);
				             		 pagejbuk.add(photo1);
			             			 goodjbuk1.setBounds(518, 286, 38, 30);
				                     countjbuk1.setBounds(570, 295, 57, 15);
				                     pagejbuk.add(goodjbuk1);
				             		 pagejbuk.add(countjbuk1);
			             		 case 1:
			             			 photo.setBounds(103, 286, 103, 30);
				             		 pagejbuk.add(photo);
			             			 goodjbuk.setBounds(218, 286, 38, 30);
				                     countjbuk.setBounds(270, 295, 57, 15);
				                     pagejbuk.add(goodjbuk);
				             		 pagejbuk.add(countjbuk);
				             		 
				             		 break;
			             		 }
			                     
			                     
		                     }
		                   }else {
		                      System.out.println("아무것도 없습니다.");
		                   }
		                  
		               }
					
				});
                //jnam
                btnjnam.addActionListener(new ActionListener() {

					@Override
					 public void actionPerformed(ActionEvent e) {
		                  pagejnam.setVisible(true);
		                  mainpage.setVisible(false);
		                  loader my_loader= new loader();
		                  ArrayList<String> urlArray = my_loader.downloadImg("전남");
		                  int iterationIndex=0;
		                  JLabel lblNewLabel = null;
		                   if(!urlArray.isEmpty()) {
		                     Iterator<String> iter = urlArray.iterator(); 
		                     while(iter.hasNext()){
		                     ImageIcon icon = new ImageIcon(iter.next());
		                     Image image = icon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH); // 이미지 크기 조정
		                     lblNewLabel = new JLabel(new ImageIcon(image));
		                     int x=103+300*iterationIndex;
		                     lblNewLabel.setBounds(x, 71, 200, 200);
		                     pagejnam.add(lblNewLabel);
		             		 iterationIndex++;
		                     }
		                     for(int i=0;i<iterationIndex;i++) {
		                    	
			                     JLabel countjnam = new JLabel("");
			                     JButton goodjnam = new JButton(new ImageIcon("C:\\Users\\ebmmq\\Desktop\\good3.png"));
			             		goodjnam.addActionListener(new ActionListener() {
			             			public void actionPerformed(ActionEvent e) {
			             				updateLabel=()->countjnam.setText(Integer.toString(counterjnam));
			             				counterjnam++;
			             				updateLabel();
			             			}
			             		});
			             		JButton photo = new JButton("사진 설명");
			    				photo.addActionListener(new ActionListener() {
			    					public void actionPerformed(ActionEvent e) {
			    						pagejnam.setVisible(false);
			    						jnamphoto1.setVisible(true);
			    						loader loader2= new loader();
			    						int index=0;
			    				        ImageIcon icon = new ImageIcon(loader2.get_img_url(urlArray,index));
			    				        Image image = icon.getImage().getScaledInstance(600, 600, Image.SCALE_SMOOTH); // 이미지 크기 조정
			    				        imageLabel = new JLabel(new ImageIcon(image));
			    				        imageLabel.setBounds(30, 80, 600, 600);
			    				        jnamphoto1.add(imageLabel);
			    				           
			    				        JLabel lblDate = new JLabel("Date:");
			    				        lblDate.setBounds(733, 334, 70, 30);
			    				        jnamphoto1.add(lblDate);
			    				           
			    				        String img_2_date=loader2.get_img_date(urlArray,index);
			    				        dateTextField = new JTextField(img_2_date);
			    				        dateTextField.setBounds(839, 335, 150, 30);
			    				        jnamphoto1.add(dateTextField);

			    				        JLabel lblLocation = new JLabel("Location:");
			    				        lblLocation.setBounds(733, 417, 70, 30);
			    				        jnamphoto1.add(lblLocation);
			    				           
			    				        textField = new JTextField("전남");
			    				        textField.setColumns(10);
			    				        textField.setBounds(839, 417, 150, 30);
			    				        jnamphoto1.add(textField);

			    				        JLabel lblMemo = new JLabel("Memo:");
			    				        lblMemo.setBounds(733, 594, 70, 30);
			    				        jnamphoto1.add(lblMemo);
			    				        String img_2_memo=loader2.get_memo(urlArray,index);
			    				        memoTextArea = new JTextArea(img_2_memo);
			    				        memoTextArea.setBounds(839, 573, 300, 70);
			    				        jnamphoto1.add(memoTextArea);
			    					}
			    				});
			             		JLabel countjnam1 = new JLabel("");
			             		JButton goodjnam1 = new JButton(new ImageIcon("C:\\Users\\ebmmq\\Desktop\\good3.png"));
			             		goodjnam1.addActionListener(new ActionListener() {
			             			public void actionPerformed(ActionEvent e) {
			             				updateLabel=()->countjnam1.setText(Integer.toString(counterjnam1));
			             				counterjnam1++;
			             				updateLabel();
			             			}
			             		});
			             		JButton photo1 = new JButton("사진 설명");
			    				photo1.addActionListener(new ActionListener() {
			    					public void actionPerformed(ActionEvent e) {
			    						pagejnam.setVisible(false);
			    						jnamphoto2.setVisible(true);
			    						loader loader2= new loader();
			    						int index=1;
			    				        ImageIcon icon = new ImageIcon(loader2.get_img_url(urlArray,index));
			    				        Image image = icon.getImage().getScaledInstance(600, 600, Image.SCALE_SMOOTH); // 이미지 크기 조정
			    				        imageLabel = new JLabel(new ImageIcon(image));
			    				        imageLabel.setBounds(30, 80, 600, 600);
			    				        jnamphoto2.add(imageLabel);
			    				           
			    				        JLabel lblDate = new JLabel("Date:");
			    				        lblDate.setBounds(733, 334, 70, 30);
			    				        jnamphoto2.add(lblDate);
			    				           
			    				        String img_2_date=loader2.get_img_date(urlArray,index);
			    				        dateTextField = new JTextField(img_2_date);
			    				        dateTextField.setBounds(839, 335, 150, 30);
			    				        jnamphoto2.add(dateTextField);

			    				        JLabel lblLocation = new JLabel("Location:");
			    				        lblLocation.setBounds(733, 417, 70, 30);
			    				        jnamphoto2.add(lblLocation);
			    				           
			    				        textField = new JTextField("전남");
			    				        textField.setColumns(10);
			    				        textField.setBounds(839, 417, 150, 30);
			    				        jnamphoto2.add(textField);

			    				        JLabel lblMemo = new JLabel("Memo:");
			    				        lblMemo.setBounds(733, 594, 70, 30);
			    				        jnamphoto2.add(lblMemo);
			    				        String img_2_memo=loader2.get_memo(urlArray,index);
			    				        memoTextArea = new JTextArea(img_2_memo);
			    				        memoTextArea.setBounds(839, 573, 300, 70);
			    				        jnamphoto2.add(memoTextArea);
			    					}
			    				});
			    				JLabel countjnam2 = new JLabel("");
			             		JButton goodjnam2 = new JButton(new ImageIcon("C:\\Users\\ebmmq\\Desktop\\good3.png"));
			             		goodjnam2.addActionListener(new ActionListener() {
			             			public void actionPerformed(ActionEvent e) {
			             				updateLabel=()->countjnam1.setText(Integer.toString(counterjnam2));
			             				counterjnam2++;
			             				updateLabel();
			             			}
			             		});
			             		JButton photo2 = new JButton("사진 설명");
			    				photo2.addActionListener(new ActionListener() {
			    					public void actionPerformed(ActionEvent e) {
			    						pagejnam.setVisible(false);
			    						jnamphoto3.setVisible(true);
			    						loader loader2= new loader();
			    						int index=2;
			    				        ImageIcon icon = new ImageIcon(loader2.get_img_url(urlArray,index));
			    				        Image image = icon.getImage().getScaledInstance(600, 600, Image.SCALE_SMOOTH); // 이미지 크기 조정
			    				        imageLabel = new JLabel(new ImageIcon(image));
			    				        imageLabel.setBounds(30, 80, 600, 600);
			    				        jnamphoto3.add(imageLabel);
			    				           
			    				        JLabel lblDate = new JLabel("Date:");
			    				        lblDate.setBounds(733, 334, 70, 30);
			    				        jnamphoto3.add(lblDate);
			    				           
			    				        String img_2_date=loader2.get_img_date(urlArray,index);
			    				        dateTextField = new JTextField(img_2_date);
			    				        dateTextField.setBounds(839, 335, 150, 30);
			    				        jnamphoto3.add(dateTextField);

			    				        JLabel lblLocation = new JLabel("Location:");
			    				        lblLocation.setBounds(733, 417, 70, 30);
			    				        jnamphoto3.add(lblLocation);
			    				           
			    				        textField = new JTextField("전남");
			    				        textField.setColumns(10);
			    				        textField.setBounds(839, 417, 150, 30);
			    				        jnamphoto3.add(textField);

			    				        JLabel lblMemo = new JLabel("Memo:");
			    				        lblMemo.setBounds(733, 594, 70, 30);
			    				        jnamphoto3.add(lblMemo);
			    				        String img_2_memo=loader2.get_memo(urlArray,index);
			    				        memoTextArea = new JTextArea(img_2_memo);
			    				        memoTextArea.setBounds(839, 573, 300, 70);
			    				        jnamphoto3.add(memoTextArea);
			    					}
			    				});
			             		 switch(iterationIndex) {
			             		 case 3:
			             			photo2.setBounds(703, 286, 103, 30);
				             		 pagejnam.add(photo2);
			             			 goodjnam2.setBounds(818, 286, 38, 30);
				                     countjnam2.setBounds(870, 295, 57, 15);
				                     pagejnam.add(goodjnam2);
				             		 pagejnam.add(countjnam2);
			             		 case 2:
			             			photo1.setBounds(403, 286, 103, 30);
				             		 pagejnam.add(photo1);
			             			 goodjnam1.setBounds(518, 286, 38, 30);
				                     countjnam1.setBounds(570, 295, 57, 15);
				                     pagegyeong.add(goodjnam1);
				             		 pagegyeong.add(countjnam1);
			             		 case 1:
			             			 photo.setBounds(103, 286, 103, 30);
				             		 pagejnam.add(photo);
			             			 goodjnam.setBounds(218, 286, 38, 30);
				                     countjnam.setBounds(270, 295, 57, 15);
				                     pagejnam.add(goodjnam);
				             		 pagejnam.add(countjnam);
				             		 
				             		 break;
			             		 }
			                     
			                     
		                     }
		                   }else {
		                      System.out.println("아무것도 없습니다.");
		                   }
		                  
		               }
					
				});
                //gbuk
                btngbuk.addActionListener(new ActionListener() {

					@Override
					 public void actionPerformed(ActionEvent e) {
		                  pagegbuk.setVisible(true);
		                  mainpage.setVisible(false);
		                  loader my_loader= new loader();
		                  ArrayList<String> urlArray = my_loader.downloadImg("경북");
		                  int iterationIndex=0;
		                  JLabel lblNewLabel = null;
		                   if(!urlArray.isEmpty()) {
		                     Iterator<String> iter = urlArray.iterator(); 
		                     while(iter.hasNext()){
		                     ImageIcon icon = new ImageIcon(iter.next());
		                     Image image = icon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH); // 이미지 크기 조정
		                     lblNewLabel = new JLabel(new ImageIcon(image));
		                     int x=103+300*iterationIndex;
		                     lblNewLabel.setBounds(x, 71, 200, 200);
		                     pagegbuk.add(lblNewLabel);
		             		 iterationIndex++;
		                     }
		                     for(int i=0;i<iterationIndex;i++) {
		                    	
			                     JLabel countgbuk = new JLabel("");
			                     JButton goodgbuk = new JButton(new ImageIcon("C:\\Users\\ebmmq\\Desktop\\good3.png"));
			             		goodgbuk.addActionListener(new ActionListener() {
			             			public void actionPerformed(ActionEvent e) {
			             				updateLabel=()->countgbuk.setText(Integer.toString(countergbuk));
			             				countergbuk++;
			             				updateLabel();
			             			}
			             		});
			             		JButton photo = new JButton("사진 설명");
			    				photo.addActionListener(new ActionListener() {
			    					public void actionPerformed(ActionEvent e) {
			    						pagegbuk.setVisible(false);
			    						gbukphoto1.setVisible(true);
			    						loader loader2= new loader();
			    						int index=0;
			    				        ImageIcon icon = new ImageIcon(loader2.get_img_url(urlArray,index));
			    				        Image image = icon.getImage().getScaledInstance(600, 600, Image.SCALE_SMOOTH); // 이미지 크기 조정
			    				        imageLabel = new JLabel(new ImageIcon(image));
			    				        imageLabel.setBounds(30, 80, 600, 600);
			    				        gbukphoto1.add(imageLabel);
			    				           
			    				        JLabel lblDate = new JLabel("Date:");
			    				        lblDate.setBounds(733, 334, 70, 30);
			    				        gbukphoto1.add(lblDate);
			    				           
			    				        String img_2_date=loader2.get_img_date(urlArray,index);
			    				        dateTextField = new JTextField(img_2_date);
			    				        dateTextField.setBounds(839, 335, 150, 30);
			    				        gbukphoto1.add(dateTextField);

			    				        JLabel lblLocation = new JLabel("Location:");
			    				        lblLocation.setBounds(733, 417, 70, 30);
			    				        gbukphoto1.add(lblLocation);
			    				           
			    				        textField = new JTextField("경북");
			    				        textField.setColumns(10);
			    				        textField.setBounds(839, 417, 150, 30);
			    				        gbukphoto1.add(textField);

			    				        JLabel lblMemo = new JLabel("Memo:");
			    				        lblMemo.setBounds(733, 594, 70, 30);
			    				        gbukphoto1.add(lblMemo);
			    				        String img_2_memo=loader2.get_memo(urlArray,index);
			    				        memoTextArea = new JTextArea(img_2_memo);
			    				        memoTextArea.setBounds(839, 573, 300, 70);
			    				        gbukphoto1.add(memoTextArea);
			    					}
			    				});
			             		JLabel countgbuk1 = new JLabel("");
			             		JButton goodgbuk1 = new JButton(new ImageIcon("C:\\Users\\ebmmq\\Desktop\\good3.png"));
			             		goodgbuk1.addActionListener(new ActionListener() {
			             			public void actionPerformed(ActionEvent e) {
			             				updateLabel=()->countgbuk1.setText(Integer.toString(countergbuk1));
			             				countergbuk1++;
			             				updateLabel();
			             			}
			             		});
			             		JButton photo1 = new JButton("사진 설명");
			    				photo1.addActionListener(new ActionListener() {
			    					public void actionPerformed(ActionEvent e) {
			    						pagegbuk.setVisible(false);
			    						gbukphoto2.setVisible(true);
			    						loader loader2= new loader();
			    						int index=1;
			    				        ImageIcon icon = new ImageIcon(loader2.get_img_url(urlArray,index));
			    				        Image image = icon.getImage().getScaledInstance(600, 600, Image.SCALE_SMOOTH); // 이미지 크기 조정
			    				        imageLabel = new JLabel(new ImageIcon(image));
			    				        imageLabel.setBounds(30, 80, 600, 600);
			    				        gbukphoto2.add(imageLabel);
			    				           
			    				        JLabel lblDate = new JLabel("Date:");
			    				        lblDate.setBounds(733, 334, 70, 30);
			    				        gbukphoto2.add(lblDate);
			    				           
			    				        String img_2_date=loader2.get_img_date(urlArray,index);
			    				        dateTextField = new JTextField(img_2_date);
			    				        dateTextField.setBounds(839, 335, 150, 30);
			    				        gbukphoto2.add(dateTextField);

			    				        JLabel lblLocation = new JLabel("Location:");
			    				        lblLocation.setBounds(733, 417, 70, 30);
			    				        gbukphoto2.add(lblLocation);
			    				           
			    				        textField = new JTextField("경북");
			    				        textField.setColumns(10);
			    				        textField.setBounds(839, 417, 150, 30);
			    				        gbukphoto2.add(textField);

			    				        JLabel lblMemo = new JLabel("Memo:");
			    				        lblMemo.setBounds(733, 594, 70, 30);
			    				        gbukphoto2.add(lblMemo);
			    				        String img_2_memo=loader2.get_memo(urlArray,index);
			    				        memoTextArea = new JTextArea(img_2_memo);
			    				        memoTextArea.setBounds(839, 573, 300, 70);
			    				        gbukphoto2.add(memoTextArea);
			    					}
			    				});
			    				JLabel countgbuk2 = new JLabel("");
			             		JButton goodgbuk2 = new JButton(new ImageIcon("C:\\Users\\ebmmq\\Desktop\\good3.png"));
			             		goodgbuk2.addActionListener(new ActionListener() {
			             			public void actionPerformed(ActionEvent e) {
			             				updateLabel=()->countgbuk1.setText(Integer.toString(countergbuk2));
			             				countergbuk2++;
			             				updateLabel();
			             			}
			             		});
			             		JButton photo2 = new JButton("사진 설명");
			    				photo2.addActionListener(new ActionListener() {
			    					public void actionPerformed(ActionEvent e) {
			    						pagegbuk.setVisible(false);
			    						gbukphoto3.setVisible(true);
			    						loader loader2= new loader();
			    						int index=2;
			    				        ImageIcon icon = new ImageIcon(loader2.get_img_url(urlArray,index));
			    				        Image image = icon.getImage().getScaledInstance(600, 600, Image.SCALE_SMOOTH); // 이미지 크기 조정
			    				        imageLabel = new JLabel(new ImageIcon(image));
			    				        imageLabel.setBounds(30, 80, 600, 600);
			    				        gbukphoto3.add(imageLabel);
			    				           
			    				        JLabel lblDate = new JLabel("Date:");
			    				        lblDate.setBounds(733, 334, 70, 30);
			    				        gbukphoto3.add(lblDate);
			    				           
			    				        String img_2_date=loader2.get_img_date(urlArray,index);
			    				        dateTextField = new JTextField(img_2_date);
			    				        dateTextField.setBounds(839, 335, 150, 30);
			    				        gbukphoto3.add(dateTextField);

			    				        JLabel lblLocation = new JLabel("Location:");
			    				        lblLocation.setBounds(733, 417, 70, 30);
			    				        gbukphoto3.add(lblLocation);
			    				           
			    				        textField = new JTextField("경북");
			    				        textField.setColumns(10);
			    				        textField.setBounds(839, 417, 150, 30);
			    				        gbukphoto3.add(textField);

			    				        JLabel lblMemo = new JLabel("Memo:");
			    				        lblMemo.setBounds(733, 594, 70, 30);
			    				        gbukphoto3.add(lblMemo);
			    				        String img_2_memo=loader2.get_memo(urlArray,index);
			    				        memoTextArea = new JTextArea(img_2_memo);
			    				        memoTextArea.setBounds(839, 573, 300, 70);
			    				        gbukphoto3.add(memoTextArea);
			    					}
			    				});
			             		 switch(iterationIndex) {
			             		 case 3:
			             			photo2.setBounds(703, 286, 103, 30);
				             		 pagegbuk.add(photo2);
			             			 goodgbuk2.setBounds(818, 286, 38, 30);
				                     countgbuk2.setBounds(870, 295, 57, 15);
				                     pagegbuk.add(goodgbuk2);
				             		 pagegbuk.add(countgbuk2);
			             		 case 2:
			             			photo1.setBounds(403, 286, 103, 30);
				             		 pagegbuk.add(photo1);
			             			 goodgbuk1.setBounds(518, 286, 38, 30);
				                     countgbuk1.setBounds(570, 295, 57, 15);
				                     pagegbuk.add(goodgbuk1);
				             		 pagegbuk.add(countgbuk1);
			             		 case 1:
			             			 photo.setBounds(103, 286, 103, 30);
				             		 pagegbuk.add(photo);
			             			 goodgbuk.setBounds(218, 286, 38, 30);
				                     countgbuk.setBounds(270, 295, 57, 15);
				                     pagegbuk.add(goodgbuk);
				             		 pagegbuk.add(countgbuk);
				             		 
				             		 break;
			             		 }
			                     
			                     
		                     }
		                   }else {
		                      System.out.println("아무것도 없습니다.");
		                   }
		                  
		               }
					
				});
                //gnam
                btngnam.addActionListener(new ActionListener() {

					@Override
					 public void actionPerformed(ActionEvent e) {
		                  pagegnam.setVisible(true);
		                  mainpage.setVisible(false);
		                  loader my_loader= new loader();
		                  ArrayList<String> urlArray = my_loader.downloadImg("경남");
		                  int iterationIndex=0;
		                  JLabel lblNewLabel = null;
		                   if(!urlArray.isEmpty()) {
		                     Iterator<String> iter = urlArray.iterator(); 
		                     while(iter.hasNext()){
		                     ImageIcon icon = new ImageIcon(iter.next());
		                     Image image = icon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH); // 이미지 크기 조정
		                     lblNewLabel = new JLabel(new ImageIcon(image));
		                     int x=103+300*iterationIndex;
		                     lblNewLabel.setBounds(x, 71, 200, 200);
		                     pagegnam.add(lblNewLabel);
		             		 iterationIndex++;
		                     }
		                     for(int i=0;i<iterationIndex;i++) {
		                    	
			                     JLabel countgnam = new JLabel("");
			                     JButton goodgnam = new JButton(new ImageIcon("C:\\Users\\ebmmq\\Desktop\\good3.png"));
			             		goodgnam.addActionListener(new ActionListener() {
			             			public void actionPerformed(ActionEvent e) {
			             				updateLabel=()->countgnam.setText(Integer.toString(countergnam));
			             				countergnam++;
			             				updateLabel();
			             			}
			             		});
			             		JButton photo = new JButton("사진 설명");
			    				photo.addActionListener(new ActionListener() {
			    					public void actionPerformed(ActionEvent e) {
			    						pagegnam.setVisible(false);
			    						gnamphoto1.setVisible(true);
			    						loader loader2= new loader();
			    						int index=0;
			    				        ImageIcon icon = new ImageIcon(loader2.get_img_url(urlArray,index));
			    				        Image image = icon.getImage().getScaledInstance(600, 600, Image.SCALE_SMOOTH); // 이미지 크기 조정
			    				        imageLabel = new JLabel(new ImageIcon(image));
			    				        imageLabel.setBounds(30, 80, 600, 600);
			    				        gnamphoto1.add(imageLabel);
			    				           
			    				        JLabel lblDate = new JLabel("Date:");
			    				        lblDate.setBounds(733, 334, 70, 30);
			    				        gnamphoto1.add(lblDate);
			    				           
			    				        String img_2_date=loader2.get_img_date(urlArray,index);
			    				        dateTextField = new JTextField(img_2_date);
			    				        dateTextField.setBounds(839, 335, 150, 30);
			    				        gnamphoto1.add(dateTextField);

			    				        JLabel lblLocation = new JLabel("Location:");
			    				        lblLocation.setBounds(733, 417, 70, 30);
			    				        gnamphoto1.add(lblLocation);
			    				           
			    				        textField = new JTextField("경남");
			    				        textField.setColumns(10);
			    				        textField.setBounds(839, 417, 150, 30);
			    				        gnamphoto1.add(textField);

			    				        JLabel lblMemo = new JLabel("Memo:");
			    				        lblMemo.setBounds(733, 594, 70, 30);
			    				        gnamphoto1.add(lblMemo);
			    				        String img_2_memo=loader2.get_memo(urlArray,index);
			    				        memoTextArea = new JTextArea(img_2_memo);
			    				        memoTextArea.setBounds(839, 573, 300, 70);
			    				        gnamphoto1.add(memoTextArea);
			    					}
			    				});
			             		JLabel countgnam1 = new JLabel("");
			             		JButton goodgnam1 = new JButton(new ImageIcon("C:\\Users\\ebmmq\\Desktop\\good3.png"));
			             		goodgnam1.addActionListener(new ActionListener() {
			             			public void actionPerformed(ActionEvent e) {
			             				updateLabel=()->countgnam1.setText(Integer.toString(countergnam1));
			             				countergnam1++;
			             				updateLabel();
			             			}
			             		});
			             		JButton photo1 = new JButton("사진 설명");
			    				photo1.addActionListener(new ActionListener() {
			    					public void actionPerformed(ActionEvent e) {
			    						pagegnam.setVisible(false);
			    						gnamphoto2.setVisible(true);
			    						loader loader2= new loader();
			    						int index=1;
			    				        ImageIcon icon = new ImageIcon(loader2.get_img_url(urlArray,index));
			    				        Image image = icon.getImage().getScaledInstance(600, 600, Image.SCALE_SMOOTH); // 이미지 크기 조정
			    				        imageLabel = new JLabel(new ImageIcon(image));
			    				        imageLabel.setBounds(30, 80, 600, 600);
			    				        gnamphoto2.add(imageLabel);
			    				           
			    				        JLabel lblDate = new JLabel("Date:");
			    				        lblDate.setBounds(733, 334, 70, 30);
			    				        gnamphoto2.add(lblDate);
			    				           
			    				        String img_2_date=loader2.get_img_date(urlArray,index);
			    				        dateTextField = new JTextField(img_2_date);
			    				        dateTextField.setBounds(839, 335, 150, 30);
			    				        gnamphoto2.add(dateTextField);

			    				        JLabel lblLocation = new JLabel("Location:");
			    				        lblLocation.setBounds(733, 417, 70, 30);
			    				        gnamphoto2.add(lblLocation);
			    				           
			    				        textField = new JTextField("경남");
			    				        textField.setColumns(10);
			    				        textField.setBounds(839, 417, 150, 30);
			    				        gnamphoto2.add(textField);

			    				        JLabel lblMemo = new JLabel("Memo:");
			    				        lblMemo.setBounds(733, 594, 70, 30);
			    				        gnamphoto2.add(lblMemo);
			    				        String img_2_memo=loader2.get_memo(urlArray,index);
			    				        memoTextArea = new JTextArea(img_2_memo);
			    				        memoTextArea.setBounds(839, 573, 300, 70);
			    				        gnamphoto2.add(memoTextArea);
			    					}
			    				});
			    				JLabel countgnam2 = new JLabel("");
			             		JButton goodgnam2 = new JButton(new ImageIcon("C:\\Users\\ebmmq\\Desktop\\good3.png"));
			             		goodgnam2.addActionListener(new ActionListener() {
			             			public void actionPerformed(ActionEvent e) {
			             				updateLabel=()->countgnam1.setText(Integer.toString(countergnam2));
			             				countergnam2++;
			             				updateLabel();
			             			}
			             		});
			             		JButton photo2 = new JButton("사진 설명");
			    				photo2.addActionListener(new ActionListener() {
			    					public void actionPerformed(ActionEvent e) {
			    						pagegnam.setVisible(false);
			    						gnamphoto3.setVisible(true);
			    						loader loader2= new loader();
			    						int index=2;
			    				        ImageIcon icon = new ImageIcon(loader2.get_img_url(urlArray,index));
			    				        Image image = icon.getImage().getScaledInstance(600, 600, Image.SCALE_SMOOTH); // 이미지 크기 조정
			    				        imageLabel = new JLabel(new ImageIcon(image));
			    				        imageLabel.setBounds(30, 80, 600, 600);
			    				        gnamphoto3.add(imageLabel);
			    				           
			    				        JLabel lblDate = new JLabel("Date:");
			    				        lblDate.setBounds(733, 334, 70, 30);
			    				        gnamphoto3.add(lblDate);
			    				           
			    				        String img_2_date=loader2.get_img_date(urlArray,index);
			    				        dateTextField = new JTextField(img_2_date);
			    				        dateTextField.setBounds(839, 335, 150, 30);
			    				        gnamphoto3.add(dateTextField);

			    				        JLabel lblLocation = new JLabel("Location:");
			    				        lblLocation.setBounds(733, 417, 70, 30);
			    				        gnamphoto3.add(lblLocation);
			    				           
			    				        textField = new JTextField("경남");
			    				        textField.setColumns(10);
			    				        textField.setBounds(839, 417, 150, 30);
			    				        gnamphoto3.add(textField);

			    				        JLabel lblMemo = new JLabel("Memo:");
			    				        lblMemo.setBounds(733, 594, 70, 30);
			    				        gnamphoto3.add(lblMemo);
			    				        String img_2_memo=loader2.get_memo(urlArray,index);
			    				        memoTextArea = new JTextArea(img_2_memo);
			    				        memoTextArea.setBounds(839, 573, 300, 70);
			    				        gnamphoto3.add(memoTextArea);
			    					}
			    				});
			             		 switch(iterationIndex) {
			             		 case 3:
			             			photo2.setBounds(703, 286, 103, 30);
				             		 pagegnam.add(photo2);
			             			 goodgnam2.setBounds(818, 286, 38, 30);
				                     countgnam2.setBounds(870, 295, 57, 15);
				                     pagegnam.add(goodgnam2);
				             		 pagegnam.add(countgnam2);
			             		 case 2:
			             			photo1.setBounds(403, 286, 103, 30);
				             		 pagegnam.add(photo1);
			             			 goodgnam1.setBounds(518, 286, 38, 30);
				                     countgnam1.setBounds(570, 295, 57, 15);
				                     pagegnam.add(goodgnam1);
				             		 pagegnam.add(countgnam1);
			             		 case 1:
			             			 photo.setBounds(103, 286, 103, 30);
				             		 pagegnam.add(photo);
			             			 goodgnam.setBounds(218, 286, 38, 30);
				                     countgnam.setBounds(270, 295, 57, 15);
				                     pagegnam.add(goodgnam);
				             		 pagegnam.add(countgnam);
				             		 
				             		 break;
			             		 }
			                     
			                     
		                     }
		                   }else {
		                      System.out.println("아무것도 없습니다.");
		                   }
		                  
		               }
					
				});
                //jeju
                btnjeju.addActionListener(new ActionListener() {

					@Override
					 public void actionPerformed(ActionEvent e) {
		                  pagejeju.setVisible(true);
		                  mainpage.setVisible(false);
		                  loader my_loader= new loader();
		                  ArrayList<String> urlArray = my_loader.downloadImg("제주도");
		                  int iterationIndex=0;
		                  JLabel lblNewLabel = null;
		                   if(!urlArray.isEmpty()) {
		                     Iterator<String> iter = urlArray.iterator(); 
		                     while(iter.hasNext()){
		                     ImageIcon icon = new ImageIcon(iter.next());
		                     Image image = icon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH); // 이미지 크기 조정
		                     lblNewLabel = new JLabel(new ImageIcon(image));
		                     int x=103+300*iterationIndex;
		                     lblNewLabel.setBounds(x, 71, 200, 200);
		                     pagejeju.add(lblNewLabel);
		             		 iterationIndex++;
		                     }
		                     for(int i=0;i<iterationIndex;i++) {
		                    	
			                     JLabel countjeju = new JLabel("");
			                     JButton goodjeju = new JButton(new ImageIcon("C:\\Users\\ebmmq\\Desktop\\good3.png"));
			             		goodjeju.addActionListener(new ActionListener() {
			             			public void actionPerformed(ActionEvent e) {
			             				updateLabel=()->countjeju.setText(Integer.toString(counterjeju));
			             				counterjeju++;
			             				updateLabel();
			             			}
			             		});
			             		JButton photo = new JButton("사진 설명");
			    				photo.addActionListener(new ActionListener() {
			    					public void actionPerformed(ActionEvent e) {
			    						pagejeju.setVisible(false);
			    						jejuphoto1.setVisible(true);
			    						loader loader2= new loader();
			    						int index=0;
			    				        ImageIcon icon = new ImageIcon(loader2.get_img_url(urlArray,index));
			    				        Image image = icon.getImage().getScaledInstance(600, 600, Image.SCALE_SMOOTH); // 이미지 크기 조정
			    				        imageLabel = new JLabel(new ImageIcon(image));
			    				        imageLabel.setBounds(30, 80, 600, 600);
			    				        jejuphoto1.add(imageLabel);
			    				           
			    				        JLabel lblDate = new JLabel("Date:");
			    				        lblDate.setBounds(733, 334, 70, 30);
			    				        jejuphoto1.add(lblDate);
			    				           
			    				        String img_2_date=loader2.get_img_date(urlArray,index);
			    				        dateTextField = new JTextField(img_2_date);
			    				        dateTextField.setBounds(839, 335, 150, 30);
			    				        jejuphoto1.add(dateTextField);

			    				        JLabel lblLocation = new JLabel("Location:");
			    				        lblLocation.setBounds(733, 417, 70, 30);
			    				        jejuphoto1.add(lblLocation);
			    				           
			    				        textField = new JTextField("제주");
			    				        textField.setColumns(10);
			    				        textField.setBounds(839, 417, 150, 30);
			    				        jejuphoto1.add(textField);

			    				        JLabel lblMemo = new JLabel("Memo:");
			    				        lblMemo.setBounds(733, 594, 70, 30);
			    				        jejuphoto1.add(lblMemo);
			    				        String img_2_memo=loader2.get_memo(urlArray,index);
			    				        memoTextArea = new JTextArea(img_2_memo);
			    				        memoTextArea.setBounds(839, 573, 300, 70);
			    				        jejuphoto1.add(memoTextArea);
			    					}
			    				});
			             		JLabel countjeju1 = new JLabel("");
			             		JButton goodjeju1 = new JButton(new ImageIcon("C:\\Users\\ebmmq\\Desktop\\good3.png"));
			             		goodjeju1.addActionListener(new ActionListener() {
			             			public void actionPerformed(ActionEvent e) {
			             				updateLabel=()->countjeju1.setText(Integer.toString(counterjeju1));
			             				counterjeju1++;
			             				updateLabel();
			             			}
			             		});
			             		JButton photo1 = new JButton("사진 설명");
			    				photo1.addActionListener(new ActionListener() {
			    					public void actionPerformed(ActionEvent e) {
			    						pagejeju.setVisible(false);
			    						jejuphoto2.setVisible(true);
			    						loader loader2= new loader();
			    						int index=1;
			    				        ImageIcon icon = new ImageIcon(loader2.get_img_url(urlArray,index));
			    				        Image image = icon.getImage().getScaledInstance(600, 600, Image.SCALE_SMOOTH); // 이미지 크기 조정
			    				        imageLabel = new JLabel(new ImageIcon(image));
			    				        imageLabel.setBounds(30, 80, 600, 600);
			    				        jejuphoto2.add(imageLabel);
			    				           
			    				        JLabel lblDate = new JLabel("Date:");
			    				        lblDate.setBounds(733, 334, 70, 30);
			    				        jejuphoto2.add(lblDate);
			    				           
			    				        String img_2_date=loader2.get_img_date(urlArray,index);
			    				        dateTextField = new JTextField(img_2_date);
			    				        dateTextField.setBounds(839, 335, 150, 30);
			    				        jejuphoto2.add(dateTextField);

			    				        JLabel lblLocation = new JLabel("Location:");
			    				        lblLocation.setBounds(733, 417, 70, 30);
			    				        jejuphoto2.add(lblLocation);
			    				           
			    				        textField = new JTextField("제주");
			    				        textField.setColumns(10);
			    				        textField.setBounds(839, 417, 150, 30);
			    				        jejuphoto2.add(textField);

			    				        JLabel lblMemo = new JLabel("Memo:");
			    				        lblMemo.setBounds(733, 594, 70, 30);
			    				        jejuphoto2.add(lblMemo);
			    				        String img_2_memo=loader2.get_memo(urlArray,index);
			    				        memoTextArea = new JTextArea(img_2_memo);
			    				        memoTextArea.setBounds(839, 573, 300, 70);
			    				        jejuphoto2.add(memoTextArea);
			    					}
			    				});
			    				JLabel countjeju2 = new JLabel("");
			             		JButton goodjeju2 = new JButton(new ImageIcon("C:\\Users\\ebmmq\\Desktop\\good3.png"));
			             		goodjeju2.addActionListener(new ActionListener() {
			             			public void actionPerformed(ActionEvent e) {
			             				updateLabel=()->countjeju1.setText(Integer.toString(counterjeju2));
			             				counterjeju2++;
			             				updateLabel();
			             			}
			             		});
			             		JButton photo2 = new JButton("사진 설명");
			    				photo2.addActionListener(new ActionListener() {
			    					public void actionPerformed(ActionEvent e) {
			    						pagejeju.setVisible(false);
			    						jejuphoto3.setVisible(true);
			    						loader loader2= new loader();
			    						int index=2;
			    				        ImageIcon icon = new ImageIcon(loader2.get_img_url(urlArray,index));
			    				        Image image = icon.getImage().getScaledInstance(600, 600, Image.SCALE_SMOOTH); // 이미지 크기 조정
			    				        imageLabel = new JLabel(new ImageIcon(image));
			    				        imageLabel.setBounds(30, 80, 600, 600);
			    				        jejuphoto3.add(imageLabel);
			    				           
			    				        JLabel lblDate = new JLabel("Date:");
			    				        lblDate.setBounds(733, 334, 70, 30);
			    				        jejuphoto3.add(lblDate);
			    				           
			    				        String img_2_date=loader2.get_img_date(urlArray,index);
			    				        dateTextField = new JTextField(img_2_date);
			    				        dateTextField.setBounds(839, 335, 150, 30);
			    				        jejuphoto3.add(dateTextField);

			    				        JLabel lblLocation = new JLabel("Location:");
			    				        lblLocation.setBounds(733, 417, 70, 30);
			    				        jejuphoto3.add(lblLocation);
			    				           
			    				        textField = new JTextField("제주");
			    				        textField.setColumns(10);
			    				        textField.setBounds(839, 417, 150, 30);
			    				        jejuphoto3.add(textField);

			    				        JLabel lblMemo = new JLabel("Memo:");
			    				        lblMemo.setBounds(733, 594, 70, 30);
			    				        jejuphoto3.add(lblMemo);
			    				        String img_2_memo=loader2.get_memo(urlArray,index);
			    				        memoTextArea = new JTextArea(img_2_memo);
			    				        memoTextArea.setBounds(839, 573, 300, 70);
			    				        jejuphoto3.add(memoTextArea);
			    					}
			    				});
			             		 switch(iterationIndex) {
			             		 case 3:
			             			photo2.setBounds(703, 286, 103, 30);
				             		 pagejeju.add(photo2);
			             			 goodjeju2.setBounds(818, 286, 38, 30);
				                     countjeju2.setBounds(870, 295, 57, 15);
				                     pagejeju.add(goodjeju2);
				             		 pagejeju.add(countjeju2);
			             		 case 2:
			             			photo1.setBounds(403, 286, 103, 30);
				             		 pagejeju.add(photo1);
			             			 goodjeju1.setBounds(518, 286, 38, 30);
				                     countjeju1.setBounds(570, 295, 57, 15);
				                     pagejeju.add(goodjeju1);
				             		 pagejeju.add(countjeju1);
			             		 case 1:
			             			 photo.setBounds(103, 286, 103, 30);
				             		 pagejeju.add(photo);
			             			 goodjeju.setBounds(218, 286, 38, 30);
				                     countjeju.setBounds(270, 295, 57, 15);
				                     pagejeju.add(goodjeju);
				             		 pagejeju.add(countjeju);
				             		 
				             		 break;
			             		 }
			                     
			                     
		                     }
		                   }else {
		                      System.out.println("아무것도 없습니다.");
		                   }
		                  
		               }
					
				});
                //gang
                btngang.addActionListener(new ActionListener() {

					@Override
					 public void actionPerformed(ActionEvent e) {
		                  pagegang.setVisible(true);
		                  mainpage.setVisible(false);
		                  loader my_loader= new loader();
		                  ArrayList<String> urlArray = my_loader.downloadImg("강원도");
		                  int iterationIndex=0;
		                  JLabel lblNewLabel = null;
		                   if(!urlArray.isEmpty()) {
		                     Iterator<String> iter = urlArray.iterator(); 
		                     while(iter.hasNext()){
		                     ImageIcon icon = new ImageIcon(iter.next());
		                     Image image = icon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH); // 이미지 크기 조정
		                     lblNewLabel = new JLabel(new ImageIcon(image));
		                     int x=103+300*iterationIndex;
		                     lblNewLabel.setBounds(x, 71, 200, 200);
		                     pagegang.add(lblNewLabel);
		             		 iterationIndex++;
		                     }
		                     for(int i=0;i<iterationIndex;i++) {
		                    	 
			                     JLabel countgang = new JLabel("");
			                     JButton goodgang = new JButton(new ImageIcon("C:\\Users\\ebmmq\\Desktop\\good3.png"));
			             		goodgang.addActionListener(new ActionListener() {
			             			public void actionPerformed(ActionEvent e) {
			             				updateLabel=()->countgang.setText(Integer.toString(countergang));
			             				countergang++;
			             				updateLabel();
			             			}
			             		});
			             		JButton photo = new JButton("사진 설명");
			    				photo.addActionListener(new ActionListener() {
			    					public void actionPerformed(ActionEvent e) {
			    						pagegang.setVisible(false);
			    						gangphoto1.setVisible(true);
			    						loader loader2= new loader();
			    						int index=0;
			    				        ImageIcon icon = new ImageIcon(loader2.get_img_url(urlArray,index));
			    				        Image image = icon.getImage().getScaledInstance(600, 600, Image.SCALE_SMOOTH); // 이미지 크기 조정
			    				        imageLabel = new JLabel(new ImageIcon(image));
			    				        imageLabel.setBounds(30, 80, 600, 600);
			    				        gangphoto1.add(imageLabel);
			    				           
			    				        JLabel lblDate = new JLabel("Date:");
			    				        lblDate.setBounds(733, 334, 70, 30);
			    				        gangphoto1.add(lblDate);
			    				           
			    				        String img_2_date=loader2.get_img_date(urlArray,index);
			    				        dateTextField = new JTextField(img_2_date);
			    				        dateTextField.setBounds(839, 335, 150, 30);
			    				        gangphoto1.add(dateTextField);

			    				        JLabel lblLocation = new JLabel("Location:");
			    				        lblLocation.setBounds(733, 417, 70, 30);
			    				        gangphoto1.add(lblLocation);
			    				           
			    				        textField = new JTextField("강원도");
			    				        textField.setColumns(10);
			    				        textField.setBounds(839, 417, 150, 30);
			    				        gangphoto1.add(textField);

			    				        JLabel lblMemo = new JLabel("Memo:");
			    				        lblMemo.setBounds(733, 594, 70, 30);
			    				        gangphoto1.add(lblMemo);
			    				        String img_2_memo=loader2.get_memo(urlArray,index);
			    				        memoTextArea = new JTextArea(img_2_memo);
			    				        memoTextArea.setBounds(839, 573, 300, 70);
			    				        gangphoto1.add(memoTextArea);
			    					}
			    				});
			             		JLabel countgang1 = new JLabel("");
			             		JButton goodgang1 = new JButton(new ImageIcon("C:\\Users\\ebmmq\\Desktop\\good3.png"));
			             		goodgang1.addActionListener(new ActionListener() {
			             			public void actionPerformed(ActionEvent e) {
			             				updateLabel=()->countgang1.setText(Integer.toString(countergang1));
			             				countergang1++;
			             				updateLabel();
			             			}
			             		});
			             		JButton photo1 = new JButton("사진 설명");
			    				photo1.addActionListener(new ActionListener() {
			    					public void actionPerformed(ActionEvent e) {
			    						pagegang.setVisible(false);
			    						gangphoto2.setVisible(true);
			    						loader loader2= new loader();
			    						int index=1;
			    				        ImageIcon icon = new ImageIcon(loader2.get_img_url(urlArray,index));
			    				        Image image = icon.getImage().getScaledInstance(600, 600, Image.SCALE_SMOOTH); // 이미지 크기 조정
			    				        imageLabel = new JLabel(new ImageIcon(image));
			    				        imageLabel.setBounds(30, 80, 600, 600);
			    				        gangphoto2.add(imageLabel);
			    				           
			    				        JLabel lblDate = new JLabel("Date:");
			    				        lblDate.setBounds(733, 334, 70, 30);
			    				        gangphoto2.add(lblDate);
			    				           
			    				        String img_2_date=loader2.get_img_date(urlArray,index);
			    				        dateTextField = new JTextField(img_2_date);
			    				        dateTextField.setBounds(839, 335, 150, 30);
			    				        gangphoto2.add(dateTextField);

			    				        JLabel lblLocation = new JLabel("Location:");
			    				        lblLocation.setBounds(733, 417, 70, 30);
			    				        gangphoto2.add(lblLocation);
			    				           
			    				        textField = new JTextField("강원도");
			    				        textField.setColumns(10);
			    				        textField.setBounds(839, 417, 150, 30);
			    				        gangphoto2.add(textField);

			    				        JLabel lblMemo = new JLabel("Memo:");
			    				        lblMemo.setBounds(733, 594, 70, 30);
			    				        gangphoto2.add(lblMemo);
			    				        String img_2_memo=loader2.get_memo(urlArray,index);
			    				        memoTextArea = new JTextArea(img_2_memo);
			    				        memoTextArea.setBounds(839, 573, 300, 70);
			    				        gangphoto2.add(memoTextArea);
			    					}
			    				});
			    				JLabel countgang2 = new JLabel("");
			             		JButton goodgang2 = new JButton(new ImageIcon("C:\\Users\\ebmmq\\Desktop\\good3.png"));
			             		goodgang2.addActionListener(new ActionListener() {
			             			public void actionPerformed(ActionEvent e) {
			             				updateLabel=()->countgang1.setText(Integer.toString(countergang2));
			             				countergang2++;
			             				updateLabel();
			             			}
			             		});
			             		JButton photo2 = new JButton("사진 설명");
			    				photo2.addActionListener(new ActionListener() {
			    					public void actionPerformed(ActionEvent e) {
			    						pagegang.setVisible(false);
			    						gangphoto3.setVisible(true);
			    						loader loader2= new loader();
			    						int index=2;
			    				        ImageIcon icon = new ImageIcon(loader2.get_img_url(urlArray,index));
			    				        Image image = icon.getImage().getScaledInstance(600, 600, Image.SCALE_SMOOTH); // 이미지 크기 조정
			    				        imageLabel = new JLabel(new ImageIcon(image));
			    				        imageLabel.setBounds(30, 80, 600, 600);
			    				        gangphoto3.add(imageLabel);
			    				           
			    				        JLabel lblDate = new JLabel("Date:");
			    				        lblDate.setBounds(733, 334, 70, 30);
			    				        gangphoto3.add(lblDate);
			    				           
			    				        String img_2_date=loader2.get_img_date(urlArray,index);
			    				        dateTextField = new JTextField(img_2_date);
			    				        dateTextField.setBounds(839, 335, 150, 30);
			    				        gangphoto3.add(dateTextField);

			    				        JLabel lblLocation = new JLabel("Location:");
			    				        lblLocation.setBounds(733, 417, 70, 30);
			    				        gangphoto3.add(lblLocation);
			    				           
			    				        textField = new JTextField("강원도");
			    				        textField.setColumns(10);
			    				        textField.setBounds(839, 417, 150, 30);
			    				        gangphoto3.add(textField);

			    				        JLabel lblMemo = new JLabel("Memo:");
			    				        lblMemo.setBounds(733, 594, 70, 30);
			    				        gangphoto3.add(lblMemo);
			    				        String img_2_memo=loader2.get_memo(urlArray,index);
			    				        memoTextArea = new JTextArea(img_2_memo);
			    				        memoTextArea.setBounds(839, 573, 300, 70);
			    				        gangphoto3.add(memoTextArea);
			    					}
			    				});
			             		 switch(iterationIndex) {
			             		 case 3:
			             			photo2.setBounds(703, 286, 103, 30);
				             		 pagegang.add(photo2);
			             			 goodgang2.setBounds(818, 286, 38, 30);
				                     countgang2.setBounds(870, 295, 57, 15);
				                     pagegang.add(goodgang2);
				             		 pagegang.add(countgang2);
			             		 case 2:
			             			photo1.setBounds(403, 286, 103, 30);
				             		 pagegang.add(photo1);
			             			 goodgang1.setBounds(518, 286, 38, 30);
				                     countgang1.setBounds(570, 295, 57, 15);
				                     pagegang.add(goodgang1);
				             		 pagegang.add(countgang1);
			             		 case 1:
			             			 photo.setBounds(103, 286, 103, 30);
				             		 pagegang.add(photo);
			             			 goodgang.setBounds(218, 286, 38, 30);
				                     countgang.setBounds(270, 295, 57, 15);
				                     pagegang.add(goodgang);
				             		 pagegang.add(countgang);
				             		 
				             		 break;
			             		 }
			                     
			                     
		                     }
		                   }else {
		                      System.out.println("아무것도 없습니다.");
		                   }
		                  
		               }
					
				});

			
		JButton btnbackjbuk = new JButton("이전화면");
		btnbackjbuk.setBounds(550, 600, 100, 25);
		pagejbuk.add(btnbackjbuk);
		pagejbuk.setVisible(false);
		btnbackjbuk.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pagejbuk.setVisible(false);
				mainpage.setVisible(true);
			}
			
		});				
		
		JButton btnbackcbuk = new JButton("이전화면");
		btnbackcbuk.setBounds(550, 600, 100, 25);
		pagecbuk.add(btnbackcbuk);				
		
		JButton btnbackjeju = new JButton("이전화면");
		btnbackjeju.setBounds(550, 600, 100, 25);
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
		btnbackgnam.setBounds(550, 600, 100, 25);
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
		btnbackgang.setBounds(550, 600, 100, 25);
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
		btnbackgyeong.setBounds(550, 600, 100, 25);
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
		btnbackcnam.setBounds(550, 600, 100, 25);
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
		btnbackjnam.setBounds(550, 600, 100, 25);
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
		btnbackgbuk.setBounds(550, 600, 100, 25);
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
		
		
btnbackgyeong.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pagegyeong.setVisible(false);
				mainpage.setVisible(true);
			}
			
		});
		
backphoto1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				gyeongphoto1.setVisible(false);
				gyeongphoto2.setVisible(false);
				gyeongphoto3.setVisible(false);
				cbukphoto1.setVisible(false);
				cbukphoto2.setVisible(false);
				cbukphoto3.setVisible(false);
				cnamphoto1.setVisible(false);
				cnamphoto2.setVisible(false);
				cnamphoto3.setVisible(false);
				jbukphoto1.setVisible(false);
				jbukphoto2.setVisible(false);
				jbukphoto3.setVisible(false);
				jnamphoto1.setVisible(false);
				jnamphoto2.setVisible(false);
				jnamphoto3.setVisible(false);
				gbukphoto1.setVisible(false);
				gbukphoto2.setVisible(false);
				gbukphoto3.setVisible(false);
				gnamphoto1.setVisible(false);
				gnamphoto2.setVisible(false);
				gnamphoto3.setVisible(false);
				gangphoto1.setVisible(false);
				gangphoto2.setVisible(false);
				gangphoto3.setVisible(false);
				jejuphoto1.setVisible(false);
				jejuphoto2.setVisible(false);
				jejuphoto3.setVisible(false);
				pagegyeong.setVisible(true);
			}
			
		});
		
backphoto2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				gyeongphoto1.setVisible(false);
				gyeongphoto2.setVisible(false);
				gyeongphoto3.setVisible(false);
				cbukphoto1.setVisible(false);
				cbukphoto2.setVisible(false);
				cbukphoto3.setVisible(false);
				cnamphoto1.setVisible(false);
				cnamphoto2.setVisible(false);
				cnamphoto3.setVisible(false);
				jbukphoto1.setVisible(false);
				jbukphoto2.setVisible(false);
				jbukphoto3.setVisible(false);
				jnamphoto1.setVisible(false);
				jnamphoto2.setVisible(false);
				jnamphoto3.setVisible(false);
				gbukphoto1.setVisible(false);
				gbukphoto2.setVisible(false);
				gbukphoto3.setVisible(false);
				gnamphoto1.setVisible(false);
				gnamphoto2.setVisible(false);
				gnamphoto3.setVisible(false);
				gangphoto1.setVisible(false);
				gangphoto2.setVisible(false);
				gangphoto3.setVisible(false);
				jejuphoto1.setVisible(false);
				jejuphoto2.setVisible(false);
				jejuphoto3.setVisible(false);
				pagegyeong.setVisible(true);
			}
			
		});
		
backphoto3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				gyeongphoto1.setVisible(false);
				gyeongphoto2.setVisible(false);
				gyeongphoto3.setVisible(false);
				cbukphoto1.setVisible(false);
				cbukphoto2.setVisible(false);
				cbukphoto3.setVisible(false);
				cnamphoto1.setVisible(false);
				cnamphoto2.setVisible(false);
				cnamphoto3.setVisible(false);
				jbukphoto1.setVisible(false);
				jbukphoto2.setVisible(false);
				jbukphoto3.setVisible(false);
				jnamphoto1.setVisible(false);
				jnamphoto2.setVisible(false);
				jnamphoto3.setVisible(false);
				gbukphoto1.setVisible(false);
				gbukphoto2.setVisible(false);
				gbukphoto3.setVisible(false);
				gnamphoto1.setVisible(false);
				gnamphoto2.setVisible(false);
				gnamphoto3.setVisible(false);
				gangphoto1.setVisible(false);
				gangphoto2.setVisible(false);
				gangphoto3.setVisible(false);
				jejuphoto1.setVisible(false);
				jejuphoto2.setVisible(false);
				jejuphoto3.setVisible(false);
				pagegyeong.setVisible(true);
			}
			
		});
		
backcbukphoto1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				gyeongphoto1.setVisible(false);
				gyeongphoto2.setVisible(false);
				gyeongphoto3.setVisible(false);
				cbukphoto1.setVisible(false);
				cbukphoto2.setVisible(false);
				cbukphoto3.setVisible(false);
				cnamphoto1.setVisible(false);
				cnamphoto2.setVisible(false);
				cnamphoto3.setVisible(false);
				jbukphoto1.setVisible(false);
				jbukphoto2.setVisible(false);
				jbukphoto3.setVisible(false);
				jnamphoto1.setVisible(false);
				jnamphoto2.setVisible(false);
				jnamphoto3.setVisible(false);
				gbukphoto1.setVisible(false);
				gbukphoto2.setVisible(false);
				gbukphoto3.setVisible(false);
				gnamphoto1.setVisible(false);
				gnamphoto2.setVisible(false);
				gnamphoto3.setVisible(false);
				gangphoto1.setVisible(false);
				gangphoto2.setVisible(false);
				gangphoto3.setVisible(false);
				jejuphoto1.setVisible(false);
				jejuphoto2.setVisible(false);
				jejuphoto3.setVisible(false);
				pagecbuk.setVisible(true);
			}
			
		});
		
backcbukphoto2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				gyeongphoto1.setVisible(false);
				gyeongphoto2.setVisible(false);
				gyeongphoto3.setVisible(false);
				cbukphoto1.setVisible(false);
				cbukphoto2.setVisible(false);
				cbukphoto3.setVisible(false);
				cnamphoto1.setVisible(false);
				cnamphoto2.setVisible(false);
				cnamphoto3.setVisible(false);
				jbukphoto1.setVisible(false);
				jbukphoto2.setVisible(false);
				jbukphoto3.setVisible(false);
				jnamphoto1.setVisible(false);
				jnamphoto2.setVisible(false);
				jnamphoto3.setVisible(false);
				gbukphoto1.setVisible(false);
				gbukphoto2.setVisible(false);
				gbukphoto3.setVisible(false);
				gnamphoto1.setVisible(false);
				gnamphoto2.setVisible(false);
				gnamphoto3.setVisible(false);
				gangphoto1.setVisible(false);
				gangphoto2.setVisible(false);
				gangphoto3.setVisible(false);
				jejuphoto1.setVisible(false);
				jejuphoto2.setVisible(false);
				jejuphoto3.setVisible(false);
				pagecbuk.setVisible(true);
			}
			
		});

backcbukphoto3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				gyeongphoto1.setVisible(false);
				gyeongphoto2.setVisible(false);
				gyeongphoto3.setVisible(false);
				cbukphoto1.setVisible(false);
				cbukphoto2.setVisible(false);
				cbukphoto3.setVisible(false);
				cnamphoto1.setVisible(false);
				cnamphoto2.setVisible(false);
				cnamphoto3.setVisible(false);
				jbukphoto1.setVisible(false);
				jbukphoto2.setVisible(false);
				jbukphoto3.setVisible(false);
				jnamphoto1.setVisible(false);
				jnamphoto2.setVisible(false);
				jnamphoto3.setVisible(false);
				gbukphoto1.setVisible(false);
				gbukphoto2.setVisible(false);
				gbukphoto3.setVisible(false);
				gnamphoto1.setVisible(false);
				gnamphoto2.setVisible(false);
				gnamphoto3.setVisible(false);
				gangphoto1.setVisible(false);
				gangphoto2.setVisible(false);
				gangphoto3.setVisible(false);
				jejuphoto1.setVisible(false);
				jejuphoto2.setVisible(false);
				jejuphoto3.setVisible(false);
				pagecbuk.setVisible(true);
			}
			
		});

backcnamphoto1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				gyeongphoto1.setVisible(false);
				gyeongphoto2.setVisible(false);
				gyeongphoto3.setVisible(false);
				cbukphoto1.setVisible(false);
				cbukphoto2.setVisible(false);
				cbukphoto3.setVisible(false);
				cnamphoto1.setVisible(false);
				cnamphoto2.setVisible(false);
				cnamphoto3.setVisible(false);
				jbukphoto1.setVisible(false);
				jbukphoto2.setVisible(false);
				jbukphoto3.setVisible(false);
				jnamphoto1.setVisible(false);
				jnamphoto2.setVisible(false);
				jnamphoto3.setVisible(false);
				gbukphoto1.setVisible(false);
				gbukphoto2.setVisible(false);
				gbukphoto3.setVisible(false);
				gnamphoto1.setVisible(false);
				gnamphoto2.setVisible(false);
				gnamphoto3.setVisible(false);
				gangphoto1.setVisible(false);
				gangphoto2.setVisible(false);
				gangphoto3.setVisible(false);
				jejuphoto1.setVisible(false);
				jejuphoto2.setVisible(false);
				jejuphoto3.setVisible(false);
				pagecnam.setVisible(true);
			}
			
		});

backcnamphoto2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				gyeongphoto1.setVisible(false);
				gyeongphoto2.setVisible(false);
				gyeongphoto3.setVisible(false);
				cbukphoto1.setVisible(false);
				cbukphoto2.setVisible(false);
				cbukphoto3.setVisible(false);
				cnamphoto1.setVisible(false);
				cnamphoto2.setVisible(false);
				cnamphoto3.setVisible(false);
				jbukphoto1.setVisible(false);
				jbukphoto2.setVisible(false);
				jbukphoto3.setVisible(false);
				jnamphoto1.setVisible(false);
				jnamphoto2.setVisible(false);
				jnamphoto3.setVisible(false);
				gbukphoto1.setVisible(false);
				gbukphoto2.setVisible(false);
				gbukphoto3.setVisible(false);
				gnamphoto1.setVisible(false);
				gnamphoto2.setVisible(false);
				gnamphoto3.setVisible(false);
				gangphoto1.setVisible(false);
				gangphoto2.setVisible(false);
				gangphoto3.setVisible(false);
				jejuphoto1.setVisible(false);
				jejuphoto2.setVisible(false);
				jejuphoto3.setVisible(false);
				pagecnam.setVisible(true);
			}
			
		});

backcnamphoto3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				gyeongphoto1.setVisible(false);
				gyeongphoto2.setVisible(false);
				gyeongphoto3.setVisible(false);
				cbukphoto1.setVisible(false);
				cbukphoto2.setVisible(false);
				cbukphoto3.setVisible(false);
				cnamphoto1.setVisible(false);
				cnamphoto2.setVisible(false);
				cnamphoto3.setVisible(false);
				jbukphoto1.setVisible(false);
				jbukphoto2.setVisible(false);
				jbukphoto3.setVisible(false);
				jnamphoto1.setVisible(false);
				jnamphoto2.setVisible(false);
				jnamphoto3.setVisible(false);
				gbukphoto1.setVisible(false);
				gbukphoto2.setVisible(false);
				gbukphoto3.setVisible(false);
				gnamphoto1.setVisible(false);
				gnamphoto2.setVisible(false);
				gnamphoto3.setVisible(false);
				gangphoto1.setVisible(false);
				gangphoto2.setVisible(false);
				gangphoto3.setVisible(false);
				jejuphoto1.setVisible(false);
				jejuphoto2.setVisible(false);
				jejuphoto3.setVisible(false);
				pagecnam.setVisible(true);
			}
			
		});

backjbukphoto1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				gyeongphoto1.setVisible(false);
				gyeongphoto2.setVisible(false);
				gyeongphoto3.setVisible(false);
				cbukphoto1.setVisible(false);
				cbukphoto2.setVisible(false);
				cbukphoto3.setVisible(false);
				cnamphoto1.setVisible(false);
				cnamphoto2.setVisible(false);
				cnamphoto3.setVisible(false);
				jbukphoto1.setVisible(false);
				jbukphoto2.setVisible(false);
				jbukphoto3.setVisible(false);
				jnamphoto1.setVisible(false);
				jnamphoto2.setVisible(false);
				jnamphoto3.setVisible(false);
				gbukphoto1.setVisible(false);
				gbukphoto2.setVisible(false);
				gbukphoto3.setVisible(false);
				gnamphoto1.setVisible(false);
				gnamphoto2.setVisible(false);
				gnamphoto3.setVisible(false);
				gangphoto1.setVisible(false);
				gangphoto2.setVisible(false);
				gangphoto3.setVisible(false);
				jejuphoto1.setVisible(false);
				jejuphoto2.setVisible(false);
				jejuphoto3.setVisible(false);
				pagejbuk.setVisible(true);
			}
			
		});

backjbukphoto2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				gyeongphoto1.setVisible(false);
				gyeongphoto2.setVisible(false);
				gyeongphoto3.setVisible(false);
				cbukphoto1.setVisible(false);
				cbukphoto2.setVisible(false);
				cbukphoto3.setVisible(false);
				cnamphoto1.setVisible(false);
				cnamphoto2.setVisible(false);
				cnamphoto3.setVisible(false);
				jbukphoto1.setVisible(false);
				jbukphoto2.setVisible(false);
				jbukphoto3.setVisible(false);
				jnamphoto1.setVisible(false);
				jnamphoto2.setVisible(false);
				jnamphoto3.setVisible(false);
				gbukphoto1.setVisible(false);
				gbukphoto2.setVisible(false);
				gbukphoto3.setVisible(false);
				gnamphoto1.setVisible(false);
				gnamphoto2.setVisible(false);
				gnamphoto3.setVisible(false);
				gangphoto1.setVisible(false);
				gangphoto2.setVisible(false);
				gangphoto3.setVisible(false);
				jejuphoto1.setVisible(false);
				jejuphoto2.setVisible(false);
				jejuphoto3.setVisible(false);
				pagejbuk.setVisible(true);
			}
			
		});

backjbukphoto3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				gyeongphoto1.setVisible(false);
				gyeongphoto2.setVisible(false);
				gyeongphoto3.setVisible(false);
				cbukphoto1.setVisible(false);
				cbukphoto2.setVisible(false);
				cbukphoto3.setVisible(false);
				cnamphoto1.setVisible(false);
				cnamphoto2.setVisible(false);
				cnamphoto3.setVisible(false);
				jbukphoto1.setVisible(false);
				jbukphoto2.setVisible(false);
				jbukphoto3.setVisible(false);
				jnamphoto1.setVisible(false);
				jnamphoto2.setVisible(false);
				jnamphoto3.setVisible(false);
				gbukphoto1.setVisible(false);
				gbukphoto2.setVisible(false);
				gbukphoto3.setVisible(false);
				gnamphoto1.setVisible(false);
				gnamphoto2.setVisible(false);
				gnamphoto3.setVisible(false);
				gangphoto1.setVisible(false);
				gangphoto2.setVisible(false);
				gangphoto3.setVisible(false);
				jejuphoto1.setVisible(false);
				jejuphoto2.setVisible(false);
				jejuphoto3.setVisible(false);
				pagejbuk.setVisible(true);
			}
			
		});

backjnamphoto1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				gyeongphoto1.setVisible(false);
				gyeongphoto2.setVisible(false);
				gyeongphoto3.setVisible(false);
				cbukphoto1.setVisible(false);
				cbukphoto2.setVisible(false);
				cbukphoto3.setVisible(false);
				cnamphoto1.setVisible(false);
				cnamphoto2.setVisible(false);
				cnamphoto3.setVisible(false);
				jbukphoto1.setVisible(false);
				jbukphoto2.setVisible(false);
				jbukphoto3.setVisible(false);
				jnamphoto1.setVisible(false);
				jnamphoto2.setVisible(false);
				jnamphoto3.setVisible(false);
				gbukphoto1.setVisible(false);
				gbukphoto2.setVisible(false);
				gbukphoto3.setVisible(false);
				gnamphoto1.setVisible(false);
				gnamphoto2.setVisible(false);
				gnamphoto3.setVisible(false);
				gangphoto1.setVisible(false);
				gangphoto2.setVisible(false);
				gangphoto3.setVisible(false);
				jejuphoto1.setVisible(false);
				jejuphoto2.setVisible(false);
				jejuphoto3.setVisible(false);
				pagejnam.setVisible(true);
			}
			
		});

backjnamphoto2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				gyeongphoto1.setVisible(false);
				gyeongphoto2.setVisible(false);
				gyeongphoto3.setVisible(false);
				cbukphoto1.setVisible(false);
				cbukphoto2.setVisible(false);
				cbukphoto3.setVisible(false);
				cnamphoto1.setVisible(false);
				cnamphoto2.setVisible(false);
				cnamphoto3.setVisible(false);
				jbukphoto1.setVisible(false);
				jbukphoto2.setVisible(false);
				jbukphoto3.setVisible(false);
				jnamphoto1.setVisible(false);
				jnamphoto2.setVisible(false);
				jnamphoto3.setVisible(false);
				gbukphoto1.setVisible(false);
				gbukphoto2.setVisible(false);
				gbukphoto3.setVisible(false);
				gnamphoto1.setVisible(false);
				gnamphoto2.setVisible(false);
				gnamphoto3.setVisible(false);
				gangphoto1.setVisible(false);
				gangphoto2.setVisible(false);
				gangphoto3.setVisible(false);
				jejuphoto1.setVisible(false);
				jejuphoto2.setVisible(false);
				jejuphoto3.setVisible(false);
				pagejnam.setVisible(true);
			}
			
		});

backjnamphoto3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				gyeongphoto1.setVisible(false);
				gyeongphoto2.setVisible(false);
				gyeongphoto3.setVisible(false);
				cbukphoto1.setVisible(false);
				cbukphoto2.setVisible(false);
				cbukphoto3.setVisible(false);
				cnamphoto1.setVisible(false);
				cnamphoto2.setVisible(false);
				cnamphoto3.setVisible(false);
				jbukphoto1.setVisible(false);
				jbukphoto2.setVisible(false);
				jbukphoto3.setVisible(false);
				jnamphoto1.setVisible(false);
				jnamphoto2.setVisible(false);
				jnamphoto3.setVisible(false);
				gbukphoto1.setVisible(false);
				gbukphoto2.setVisible(false);
				gbukphoto3.setVisible(false);
				gnamphoto1.setVisible(false);
				gnamphoto2.setVisible(false);
				gnamphoto3.setVisible(false);
				gangphoto1.setVisible(false);
				gangphoto2.setVisible(false);
				gangphoto3.setVisible(false);
				jejuphoto1.setVisible(false);
				jejuphoto2.setVisible(false);
				jejuphoto3.setVisible(false);
				pagejnam.setVisible(true);
			}
			
		});

backgbukphoto1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				gyeongphoto1.setVisible(false);
				gyeongphoto2.setVisible(false);
				gyeongphoto3.setVisible(false);
				cbukphoto1.setVisible(false);
				cbukphoto2.setVisible(false);
				cbukphoto3.setVisible(false);
				cnamphoto1.setVisible(false);
				cnamphoto2.setVisible(false);
				cnamphoto3.setVisible(false);
				jbukphoto1.setVisible(false);
				jbukphoto2.setVisible(false);
				jbukphoto3.setVisible(false);
				jnamphoto1.setVisible(false);
				jnamphoto2.setVisible(false);
				jnamphoto3.setVisible(false);
				gbukphoto1.setVisible(false);
				gbukphoto2.setVisible(false);
				gbukphoto3.setVisible(false);
				gnamphoto1.setVisible(false);
				gnamphoto2.setVisible(false);
				gnamphoto3.setVisible(false);
				gangphoto1.setVisible(false);
				gangphoto2.setVisible(false);
				gangphoto3.setVisible(false);
				jejuphoto1.setVisible(false);
				jejuphoto2.setVisible(false);
				jejuphoto3.setVisible(false);
				pagegbuk.setVisible(true);
			}
			
		});

backgbukphoto2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				gyeongphoto1.setVisible(false);
				gyeongphoto2.setVisible(false);
				gyeongphoto3.setVisible(false);
				cbukphoto1.setVisible(false);
				cbukphoto2.setVisible(false);
				cbukphoto3.setVisible(false);
				cnamphoto1.setVisible(false);
				cnamphoto2.setVisible(false);
				cnamphoto3.setVisible(false);
				jbukphoto1.setVisible(false);
				jbukphoto2.setVisible(false);
				jbukphoto3.setVisible(false);
				jnamphoto1.setVisible(false);
				jnamphoto2.setVisible(false);
				jnamphoto3.setVisible(false);
				gbukphoto1.setVisible(false);
				gbukphoto2.setVisible(false);
				gbukphoto3.setVisible(false);
				gnamphoto1.setVisible(false);
				gnamphoto2.setVisible(false);
				gnamphoto3.setVisible(false);
				gangphoto1.setVisible(false);
				gangphoto2.setVisible(false);
				gangphoto3.setVisible(false);
				jejuphoto1.setVisible(false);
				jejuphoto2.setVisible(false);
				jejuphoto3.setVisible(false);
				pagegbuk.setVisible(true);
			}
			
		});

backgbukphoto3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				gyeongphoto1.setVisible(false);
				gyeongphoto2.setVisible(false);
				gyeongphoto3.setVisible(false);
				cbukphoto1.setVisible(false);
				cbukphoto2.setVisible(false);
				cbukphoto3.setVisible(false);
				cnamphoto1.setVisible(false);
				cnamphoto2.setVisible(false);
				cnamphoto3.setVisible(false);
				jbukphoto1.setVisible(false);
				jbukphoto2.setVisible(false);
				jbukphoto3.setVisible(false);
				jnamphoto1.setVisible(false);
				jnamphoto2.setVisible(false);
				jnamphoto3.setVisible(false);
				gbukphoto1.setVisible(false);
				gbukphoto2.setVisible(false);
				gbukphoto3.setVisible(false);
				gnamphoto1.setVisible(false);
				gnamphoto2.setVisible(false);
				gnamphoto3.setVisible(false);
				gangphoto1.setVisible(false);
				gangphoto2.setVisible(false);
				gangphoto3.setVisible(false);
				jejuphoto1.setVisible(false);
				jejuphoto2.setVisible(false);
				jejuphoto3.setVisible(false);
				pagegbuk.setVisible(true);
			}
			
		});

backgnamphoto1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				gyeongphoto1.setVisible(false);
				gyeongphoto2.setVisible(false);
				gyeongphoto3.setVisible(false);
				cbukphoto1.setVisible(false);
				cbukphoto2.setVisible(false);
				cbukphoto3.setVisible(false);
				cnamphoto1.setVisible(false);
				cnamphoto2.setVisible(false);
				cnamphoto3.setVisible(false);
				jbukphoto1.setVisible(false);
				jbukphoto2.setVisible(false);
				jbukphoto3.setVisible(false);
				jnamphoto1.setVisible(false);
				jnamphoto2.setVisible(false);
				jnamphoto3.setVisible(false);
				gbukphoto1.setVisible(false);
				gbukphoto2.setVisible(false);
				gbukphoto3.setVisible(false);
				gnamphoto1.setVisible(false);
				gnamphoto2.setVisible(false);
				gnamphoto3.setVisible(false);
				gangphoto1.setVisible(false);
				gangphoto2.setVisible(false);
				gangphoto3.setVisible(false);
				jejuphoto1.setVisible(false);
				jejuphoto2.setVisible(false);
				jejuphoto3.setVisible(false);
				pagegnam.setVisible(true);
			}
			
		});

	backgnamphoto2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				gyeongphoto1.setVisible(false);
				gyeongphoto2.setVisible(false);
				gyeongphoto3.setVisible(false);
				cbukphoto1.setVisible(false);
				cbukphoto2.setVisible(false);
				cbukphoto3.setVisible(false);
				cnamphoto1.setVisible(false);
				cnamphoto2.setVisible(false);
				cnamphoto3.setVisible(false);
				jbukphoto1.setVisible(false);
				jbukphoto2.setVisible(false);
				jbukphoto3.setVisible(false);
				jnamphoto1.setVisible(false);
				jnamphoto2.setVisible(false);
				jnamphoto3.setVisible(false);
				gbukphoto1.setVisible(false);
				gbukphoto2.setVisible(false);
				gbukphoto3.setVisible(false);
				gnamphoto1.setVisible(false);
				gnamphoto2.setVisible(false);
				gnamphoto3.setVisible(false);
				gangphoto1.setVisible(false);
				gangphoto2.setVisible(false);
				gangphoto3.setVisible(false);
				jejuphoto1.setVisible(false);
				jejuphoto2.setVisible(false);
				jejuphoto3.setVisible(false);
				pagegnam.setVisible(true);
			}
			
		});

backgnamphoto3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				gyeongphoto1.setVisible(false);
				gyeongphoto2.setVisible(false);
				gyeongphoto3.setVisible(false);
				cbukphoto1.setVisible(false);
				cbukphoto2.setVisible(false);
				cbukphoto3.setVisible(false);
				cnamphoto1.setVisible(false);
				cnamphoto2.setVisible(false);
				cnamphoto3.setVisible(false);
				jbukphoto1.setVisible(false);
				jbukphoto2.setVisible(false);
				jbukphoto3.setVisible(false);
				jnamphoto1.setVisible(false);
				jnamphoto2.setVisible(false);
				jnamphoto3.setVisible(false);
				gbukphoto1.setVisible(false);
				gbukphoto2.setVisible(false);
				gbukphoto3.setVisible(false);
				gnamphoto1.setVisible(false);
				gnamphoto2.setVisible(false);
				gnamphoto3.setVisible(false);
				gangphoto1.setVisible(false);
				gangphoto2.setVisible(false);
				gangphoto3.setVisible(false);
				jejuphoto1.setVisible(false);
				jejuphoto2.setVisible(false);
				jejuphoto3.setVisible(false);
				pagegnam.setVisible(true);
			}
			
		});

	backgangphoto1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				gyeongphoto1.setVisible(false);
				gyeongphoto2.setVisible(false);
				gyeongphoto3.setVisible(false);
				cbukphoto1.setVisible(false);
				cbukphoto2.setVisible(false);
				cbukphoto3.setVisible(false);
				cnamphoto1.setVisible(false);
				cnamphoto2.setVisible(false);
				cnamphoto3.setVisible(false);
				jbukphoto1.setVisible(false);
				jbukphoto2.setVisible(false);
				jbukphoto3.setVisible(false);
				jnamphoto1.setVisible(false);
				jnamphoto2.setVisible(false);
				jnamphoto3.setVisible(false);
				gbukphoto1.setVisible(false);
				gbukphoto2.setVisible(false);
				gbukphoto3.setVisible(false);
				gnamphoto1.setVisible(false);
				gnamphoto2.setVisible(false);
				gnamphoto3.setVisible(false);
				gangphoto1.setVisible(false);
				gangphoto2.setVisible(false);
				gangphoto3.setVisible(false);
				jejuphoto1.setVisible(false);
				jejuphoto2.setVisible(false);
				jejuphoto3.setVisible(false);
				pagegang.setVisible(true);
			}
			
		});

	backgangphoto2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				gyeongphoto1.setVisible(false);
				gyeongphoto2.setVisible(false);
				gyeongphoto3.setVisible(false);
				cbukphoto1.setVisible(false);
				cbukphoto2.setVisible(false);
				cbukphoto3.setVisible(false);
				cnamphoto1.setVisible(false);
				cnamphoto2.setVisible(false);
				cnamphoto3.setVisible(false);
				jbukphoto1.setVisible(false);
				jbukphoto2.setVisible(false);
				jbukphoto3.setVisible(false);
				jnamphoto1.setVisible(false);
				jnamphoto2.setVisible(false);
				jnamphoto3.setVisible(false);
				gbukphoto1.setVisible(false);
				gbukphoto2.setVisible(false);
				gbukphoto3.setVisible(false);
				gnamphoto1.setVisible(false);
				gnamphoto2.setVisible(false);
				gnamphoto3.setVisible(false);
				gangphoto1.setVisible(false);
				gangphoto2.setVisible(false);
				gangphoto3.setVisible(false);
				jejuphoto1.setVisible(false);
				jejuphoto2.setVisible(false);
				jejuphoto3.setVisible(false);
				pagegang.setVisible(true);
			}
			
		});

	backgangphoto3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				gyeongphoto1.setVisible(false);
				gyeongphoto2.setVisible(false);
				gyeongphoto3.setVisible(false);
				cbukphoto1.setVisible(false);
				cbukphoto2.setVisible(false);
				cbukphoto3.setVisible(false);
				cnamphoto1.setVisible(false);
				cnamphoto2.setVisible(false);
				cnamphoto3.setVisible(false);
				jbukphoto1.setVisible(false);
				jbukphoto2.setVisible(false);
				jbukphoto3.setVisible(false);
				jnamphoto1.setVisible(false);
				jnamphoto2.setVisible(false);
				jnamphoto3.setVisible(false);
				gbukphoto1.setVisible(false);
				gbukphoto2.setVisible(false);
				gbukphoto3.setVisible(false);
				gnamphoto1.setVisible(false);
				gnamphoto2.setVisible(false);
				gnamphoto3.setVisible(false);
				gangphoto1.setVisible(false);
				gangphoto2.setVisible(false);
				gangphoto3.setVisible(false);
				jejuphoto1.setVisible(false);
				jejuphoto2.setVisible(false);
				jejuphoto3.setVisible(false);
				pagegang.setVisible(true);
			}
			
		});
backjejuphoto1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				gyeongphoto1.setVisible(false);
				gyeongphoto2.setVisible(false);
				gyeongphoto3.setVisible(false);
				cbukphoto1.setVisible(false);
				cbukphoto2.setVisible(false);
				cbukphoto3.setVisible(false);
				cnamphoto1.setVisible(false);
				cnamphoto2.setVisible(false);
				cnamphoto3.setVisible(false);
				jbukphoto1.setVisible(false);
				jbukphoto2.setVisible(false);
				jbukphoto3.setVisible(false);
				jnamphoto1.setVisible(false);
				jnamphoto2.setVisible(false);
				jnamphoto3.setVisible(false);
				gbukphoto1.setVisible(false);
				gbukphoto2.setVisible(false);
				gbukphoto3.setVisible(false);
				gnamphoto1.setVisible(false);
				gnamphoto2.setVisible(false);
				gnamphoto3.setVisible(false);
				gangphoto1.setVisible(false);
				gangphoto2.setVisible(false);
				gangphoto3.setVisible(false);
				jejuphoto1.setVisible(false);
				jejuphoto2.setVisible(false);
				jejuphoto3.setVisible(false);
				pagejeju.setVisible(true);
			}
			
		});
backjejuphoto2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				gyeongphoto1.setVisible(false);
				gyeongphoto2.setVisible(false);
				gyeongphoto3.setVisible(false);
				cbukphoto1.setVisible(false);
				cbukphoto2.setVisible(false);
				cbukphoto3.setVisible(false);
				cnamphoto1.setVisible(false);
				cnamphoto2.setVisible(false);
				cnamphoto3.setVisible(false);
				jbukphoto1.setVisible(false);
				jbukphoto2.setVisible(false);
				jbukphoto3.setVisible(false);
				jnamphoto1.setVisible(false);
				jnamphoto2.setVisible(false);
				jnamphoto3.setVisible(false);
				gbukphoto1.setVisible(false);
				gbukphoto2.setVisible(false);
				gbukphoto3.setVisible(false);
				gnamphoto1.setVisible(false);
				gnamphoto2.setVisible(false);
				gnamphoto3.setVisible(false);
				gangphoto1.setVisible(false);
				gangphoto2.setVisible(false);
				gangphoto3.setVisible(false);
				jejuphoto1.setVisible(false);
				jejuphoto2.setVisible(false);
				jejuphoto3.setVisible(false);
				pagejeju.setVisible(true);
			}
			
		});
backjejuphoto3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				gyeongphoto1.setVisible(false);
				gyeongphoto2.setVisible(false);
				gyeongphoto3.setVisible(false);
				cbukphoto1.setVisible(false);
				cbukphoto2.setVisible(false);
				cbukphoto3.setVisible(false);
				cnamphoto1.setVisible(false);
				cnamphoto2.setVisible(false);
				cnamphoto3.setVisible(false);
				jbukphoto1.setVisible(false);
				jbukphoto2.setVisible(false);
				jbukphoto3.setVisible(false);
				jnamphoto1.setVisible(false);
				jnamphoto2.setVisible(false);
				jnamphoto3.setVisible(false);
				gbukphoto1.setVisible(false);
				gbukphoto2.setVisible(false);
				gbukphoto3.setVisible(false);
				gnamphoto1.setVisible(false);
				gnamphoto2.setVisible(false);
				gnamphoto3.setVisible(false);
				gangphoto1.setVisible(false);
				gangphoto2.setVisible(false);
				gangphoto3.setVisible(false);
				jejuphoto1.setVisible(false);
				jejuphoto2.setVisible(false);
				jejuphoto3.setVisible(false);
				pagejeju.setVisible(true);
			}
			
		});
	}

	private Runnable updateLabel;
	private void updateLabel() {
        if (updateLabel != null) {
            updateLabel.run();
        }
    }
}
