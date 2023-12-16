package GUI;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import DB.imageDBconnection;

public class mapdemo {

   private JFrame frame;
   private int countercbuk = 0;
   private int countercnam = 0;
   private int counterjnam = 0;
   private int counterjbuk = 0;
   private int countergnam = 0;
   private int countergbuk = 0;
   private int countergang = 0;
   private int countergyeong = 0;
   /**
    * Launch the application.
    */
   
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               mapdemo window = new mapdemo();
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
   public mapdemo() {
      initialize();
   }

   /**
    * Initialize the contents of the frame.
    */
   
   
   private void initialize() {
     
      
     //imageDBconnection test = new imageDBconnection("충북");
     //ArrayList<String> urlArray = test.downloadImg("충북");
     //String Gyeongimgurl = urlArray.get(0);
     
     
      frame = new JFrame();
      frame.setBounds(100, 100, 1200, 800);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLocationRelativeTo(null);
      frame.setResizable(false);
      frame.getContentPane().setLayout(null);
      ImageIcon backgroundImage = new ImageIcon("./image/지도.jpg");
      
      JPanel pagegyeong = new JPanel();
      pagegyeong.setBounds(0, 0, 1184, 761);
      frame.getContentPane().add(pagegyeong);
      pagegyeong.setLayout(null);
      
      JLabel countgyeong = new JLabel("0");
      countgyeong.setBounds(221, 166, 57, 15);
      JButton goodgyeong = new JButton("");
      goodgyeong.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            updateLabel=()->countgyeong.setText(Integer.toString(countergyeong));
            countergyeong++;
            updateLabel();
         }
      });
      goodgyeong.setIcon(new ImageIcon("./image/heart.png"));
      goodgyeong.setBounds(218, 186, 38, 30);
      pagegyeong.add(goodgyeong);
      pagegyeong.add(countgyeong);
      
        
      
      JButton btnbackgyeong = new JButton("이전화면");
      btnbackgyeong.setBounds(550, 600, 100, 25);
      pagegyeong.add(btnbackgyeong);
      
      
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
      
      JLabel countcbuk = new JLabel("0");
      countcbuk.setBounds(221, 166, 57, 15);
      JButton goodcbuk = new JButton("");
      goodcbuk.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            updateLabel=()->countcbuk.setText(Integer.toString(countercbuk));
            countercbuk++;
            updateLabel();
         }
      });
      goodcbuk.setIcon(new ImageIcon("./image/heart.png"));
      goodcbuk.setBounds(218, 186, 38, 30);
      pagecbuk.add(goodcbuk);
      pagecbuk.add(countcbuk);
      
      JLabel countcnam = new JLabel("0");
      countcnam.setBounds(221, 166, 57, 15);
      JButton goodcnam = new JButton("");
      goodcnam.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
             updateLabel = () -> countcnam.setText(Integer.toString(countercnam));
              countercnam++;
              updateLabel();
          }
      });
      goodcnam.setIcon(new ImageIcon("./image/heart.png"));
      goodcnam.setBounds(218, 186, 38, 30);
      pagecnam.add(goodcnam);
      pagecnam.add(countcnam);
      
      JLabel countgbuk = new JLabel("0");
      countgbuk.setBounds(221, 166, 57, 15);
      JButton goodgbuk = new JButton("");
      goodgbuk.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            updateLabel=()->countgbuk.setText(Integer.toString(countergbuk));
            countergbuk++;
            updateLabel();
         }
      });
      goodgbuk.setIcon(new ImageIcon("./image/heart.png"));
      goodgbuk.setBounds(218, 186, 38, 30);
      pagegbuk.add(goodgbuk);
      pagegbuk.add(countgbuk);
      
      JLabel countgnam = new JLabel("0");
      countgnam.setBounds(221, 166, 57, 15);
      JButton goodgnam = new JButton("");
      goodgnam.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
             updateLabel = () -> countgnam.setText(Integer.toString(countergnam));
              countergnam++;
              updateLabel();
          }
      });
      goodgnam.setIcon(new ImageIcon("./image/heart.png"));
      goodgnam.setBounds(218, 186, 38, 30);
      pagegnam.add(goodgnam);
      pagegnam.add(countgnam);
      
      JLabel countjbuk = new JLabel("0");
      countjbuk.setBounds(221, 166, 57, 15);
      JButton goodjbuk = new JButton("");
      goodjbuk.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            updateLabel=()->countjbuk.setText(Integer.toString(counterjbuk));
            counterjbuk++;
            updateLabel();
         }
      });
      goodjbuk.setIcon(new ImageIcon("./image/heart.png"));
      goodjbuk.setBounds(218, 186, 38, 30);
      pagejbuk.add(goodjbuk);
      pagejbuk.add(countjbuk);
      
      JLabel countjnam = new JLabel("0");
      countjnam.setBounds(221, 166, 57, 15);
      JButton goodjnam = new JButton("");
      goodjnam.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
             updateLabel = () -> countjnam.setText(Integer.toString(counterjnam));
              countercnam++;
              updateLabel();
          }
      });
      goodjnam.setIcon(new ImageIcon("./image/heart.png"));
      goodjnam.setBounds(218, 186, 38, 30);
      pagejnam.add(goodjnam);
      pagejnam.add(countjnam);
      
      JLabel countgang = new JLabel("0");
      countgang.setBounds(221, 166, 57, 15);
      JButton goodgang = new JButton("");
      goodgang.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            updateLabel=()->countgang.setText(Integer.toString(countergang));
            countergang++;
            updateLabel();
         }
      });
      goodgang.setIcon(new ImageIcon("./image/heart.png"));
      goodgang.setBounds(218, 186, 38, 30);
      pagegang.add(goodgang);
      pagegang.add(countgang);

   
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
      
      JPanel pagephoto1 = new JPanel();
      pagephoto1.setBounds(0, 0, 1184, 761);
      frame.getContentPane().add(pagephoto1);
      pagephoto1.setLayout(null);
      
      JButton backphoto1 = new JButton("New button");
      backphoto1.setBounds(100, 180, 97, 23);
      pagephoto1.add(backphoto1);
      backphoto1.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            pagephoto1.setVisible(false);
            pagegyeong.setVisible(true);
         }
         
      });
      pagegbuk.setVisible(false);
      btnbackgbuk.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            pagegbuk.setVisible(false);
            mainpage.setVisible(true);
         }
         
      });
      
      JButton photo1 = new JButton("사진 설명");
      photo1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            pagegyeong.setVisible(false);
            pagephoto1.setVisible(true);
            
         }
      });
      photo1.setBounds(103, 186, 103, 30);
      pagegyeong.add(photo1);
      

      
      
      JLabel lblNewLabel = new JLabel("");
      //ImageIcon icon = new ImageIcon();
      //Image image = icon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH); // 이미지 크기 조정
      //lblNewLabel.setIcon(new ImageIcon(image));

      lblNewLabel.setBounds(103, 71, 100, 100);
      pagegyeong.add(lblNewLabel);
      pagegyeong.setVisible(false);
      btnbackgyeong.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            pagegyeong.setVisible(false);
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
   private Runnable updateLabel;
   private void updateLabel() {
        if (updateLabel != null) {
            updateLabel.run();
        }
    }
   
   
   
}