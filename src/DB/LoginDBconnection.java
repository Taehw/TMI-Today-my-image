package DB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDBconnection extends DB_connection{
	public LoginDBconnection() {
		super();
	}
	
    public int sign_in(String user_id, String pwd) {
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT id_num FROM user_table WHERE user_id=? AND pwd=?");
            ps.setString(1, user_id);
            ps.setString(2, pwd);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int id_num = rs.getInt("id_num");
                System.out.println("로그인 성공");
                return id_num;
            } else {
                System.out.println("로그인 실패");
                return 0;
            }
        } catch (SQLException e) {
            System.out.println("로그인 실패");
            return 0;
        }
    }
    public void sign_up(String user_id, String pwd) {
        try {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO user_table (user_id, pwd) VALUES (?, ?)");
            ps.setString(1, user_id); 
            ps.setString(2, pwd);    

            ps.execute();
            System.out.println("회원가입 성공");
        } catch (SQLException e) {
            System.out.println("회원가입 에러");
            e.printStackTrace();
        }
    }

}