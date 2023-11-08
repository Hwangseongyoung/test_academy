package prj03;

import java.sql.*;

public class SelectDao {
	public void selectDB() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/hwang";
			String id = "root";
			String pwd = "1234";
			
			conn = DriverManager.getConnection(url, id, pwd);
			
			String sql = "select * from member;";
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.println("나이 : "+rs.getInt(1));
				System.out.println("이름 : "+rs.getString(2));
				System.out.println("거주지 : "+rs.getString(3));
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
