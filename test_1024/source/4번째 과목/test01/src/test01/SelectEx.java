package test01;

import java.sql.*;

public class SelectEx {
	public void select () {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://127.0.0.1:3306/kordb";
			String id = "kordb";
			String pwd = "0000";
			
			conn = DriverManager.getConnection(url, id, pwd);
			
			String sql = "select * from kordb_member;";
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.println("회원아이디 : "+rs.getInt(1));
				System.out.println("회원이름 : "+rs.getString(2));
				System.out.println("비밀번호 : "+rs.getString(3));
				System.out.println("가입일 : "+rs.getString(4));
				System.out.println("성별 : "+rs.getString(5));
				System.out.println("자기소개 : "+rs.getString(6));
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		SelectEx slt = new SelectEx();
		slt.select();
	}
}
