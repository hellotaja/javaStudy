import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ex02_delete {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement psmt = null;

		// ���̵�� ��й�ȣ�� �Է¹޾� �ش� ȸ���� ���� ����
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
			String sql = "delete from member where id = ? and pw = ?";
			
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, id);	
			psmt.setString(2, pw);	
			
			int cnt = psmt.executeUpdate();
			// executeUpdate�� db�� �ִ� ���� ���� ��
			
			if(cnt > 0) {
				System.out.println("��������");
			}else {
				System.out.println("��������");
			}
			//----------------------------------------------

		} catch (SQLException e) {
			e.printStackTrace();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				psmt.close(); // �Ѵ� ���������� ����������
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} 	
		}

	}




}
