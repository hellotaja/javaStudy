package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MemberDAO {
	// DAO(Data Access Object
	// ���̺� ���� ���� (�ڹ�-�����ͺ��̽� ����)
	
	Connection conn = null;
	PreparedStatement psmt = null;
	
	public void conn() {
		// �޼ҵ带 ���� �ڵ带 �����ϰ�!
		
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
		} // �Ѵ� ���������� ����������

	}
	
	public boolean join(MemberDTO dto) {
		// ȸ�����Խ� �Է��� ������ DB�� ����
		
		boolean result = false;
		
		conn(); //������ ���� �޼ҵ�
		
		String sql = "insert into GUIMEMBER values(?,?,?,?,?)";
		
		try {
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());
			psmt.setString(3, dto.getName());
			psmt.setString(4, dto.getGender());
			psmt.setString(5, dto.getHobby());
			
			// excuteQuery - select������ ���
			// �׿ܴ� ���� excuteUpdate - delete, insert, update
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
