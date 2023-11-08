package prj03;

import java.sql.*;

public class InsertDao {
	public void insertDB() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/hwang";
			String id = "root";
			String pwd = "1234";
			
			conn = DriverManager.getConnection(url, id, pwd);
			
			String sql = "insert into member values(?, ?, ?);";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, 27);
			pstmt.setString(2, "황성영");
			pstmt.setString(3, "양산");
			
			int row = pstmt.executeUpdate();
			
			if(row>0) {
				System.out.println("등록완료");
			} else {
				System.out.println("등록실패");
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
