import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ex01_select {// ����� ����Ŭ���ϸ� Ŭ���� �� ��ü����

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		String name = null;

		// ���̵�� ��й�ȣ�� �Է¹޾� �ش� ȸ���� ���� ���
		Scanner sc = new Scanner(System.in);

		System.out.print("���̵� : ");
		String id = sc.next();

		System.out.print("��й�ȣ : ");
		String pw = sc.next();

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// ������ �������� ���������� ���ٰ���
			// ��� ����
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";

			conn = DriverManager.getConnection(url, db_id, db_pw);
			
			//---------------------------------------------
			// ������ ���� �޶����� �ϴ� �κ�
			String sql = "select * from member where id = ? and pw = ?";//id, pw, name, age ��
			
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, id); // db�� index��ȣ�� 1���� �����ϱ� ������		
			psmt.setString(2, pw);
			
			// executeQuery : db�� �ִ� ���̺� ���� ������ ���� ��
			rs = psmt.executeQuery();
			// ������ ��� executeUpdate�� db�� �ִ� ���� ���� ��
			
			//----------------------------------------------
			if(rs.next()) {// ���� �����ϸ� true, ������ false
				// �̸� ����ϱ�
				name = rs.getString(3);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				psmt.close(); // �Ѵ� ���������� ����������
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} 
			
			
		}
		if(name != null) {
			System.out.println(name+"�� ȯ���մϴ�");
		}else {
			System.out.println("���̵�� ��й�ȣ�� Ȯ�����ּ���");
		}

	}

}
