package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_connection {
        protected Connection conn; //DB 커넥션 연결 객체
        private static final String USERNAME = "root";//DBMS접속 시 아이디
        private static final String PASSWORD = "xldpadkdl";
        private static final String URL = "jdbc:mysql://localhost:3306/test";//DBMS접속할 db명
          

       
       public DB_connection() {
           try {
               this.conn = DriverManager.getConnection(URL,USERNAME, PASSWORD);
               System.out.println("성공");
           } catch (SQLException e) {
               e.printStackTrace(); // Handle the exception appropriately
               System.out.println("실패");

           }
       }

       public void closeConnection() {
           try {
               if (this.conn != null) {
                   this.conn.close();
               }
           } catch (SQLException e) {
               e.printStackTrace(); // Handle the exception appropriately
           }
       }   
}