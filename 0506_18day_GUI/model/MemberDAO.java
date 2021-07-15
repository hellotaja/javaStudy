package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MemberDAO {
	// DAO(Data Access Object
	// 테이블에 값을 저장 (자바-데이터베이스 연결)
	
	Connection conn = null;
	PreparedStatement psmt = null;
	
	public void conn() {
		// 메소드를 만들어서 코드를 간략하게!
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";
			
			try {
				conn = DriverManager.getConnection(url, db_id, db_pw);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void close() {
		
		try {
			psmt.close();
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 둘다 전역변수로 만들어줘야함

	}
	
	public boolean join(MemberDTO dto) {
		// 회원가입시 입력한 정보를 DB에 저장
		
		boolean result = false;
		
		conn(); //위에서 만든 메소드
		
		String sql = "insert into GUIMEMBER values(?,?,?,?,?)";
		
		try {
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());
			psmt.setString(3, dto.getName());
			psmt.setString(4, dto.getGender());
			psmt.setString(5, dto.getHobby());
			
			// excuteQuery - select문에서 사용
			// 그외는 전부 excuteUpdate - delete, insert, update
			int cnt = psmt.executeUpdate();
			
			if(cnt > 0) {
				result = true;
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
		
		return result;

		
	}
}
