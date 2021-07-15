import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Exam01_insert {

	public static void main(String[] args) {
		// ���̵�, ��й�ȣ, �̸�, ���̸� �Է¹޾Ƽ� DB�� �����Ű��
		
		Connection conn = null;
		PreparedStatement psmt = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̵� : ");
		String id = sc.next();
		
		System.out.print("��й�ȣ : ");
		String pw = sc.next();
		
		System.out.print("�̸� : ");
		String name = sc.next();
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		
//		// �ϳ��� ���� : id : smhrd , pw : 1234
//		if(id.equals("smhrd")) {
//			System.out.println("�α��ο� �����߽��ϴ�");
//			System.out.println(id+"�� ȯ���մϴ� !");
//		// �� ����� ���� ������ ������ ���� �� �����ɸ� ����!
//		}
		
		// �ڹٿ� JDBC�� �����ϴ� ��� �����!
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// ������ �������� ���������� ���ٰ���
			// ��� ����
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
					
			// ���̵�
			String db_id = "hr";
			
			// ��й�ȣ
			String db_pw = "hr";
			
			// ���� �����
			try {
				conn = DriverManager.getConnection(url, db_id, db_pw);
			// ����� ���� sql�� ���� (insert�� ���)
			// �ҿ����� ������ ����� ���Ŀ� ä����
			String sql = "insert into member values(?, ?, ?, ?)";//id, pw, name, age ��
			
				psmt = conn.prepareStatement(sql);
				
				psmt.setString(1, id); // db�� index��ȣ�� 1���� �����ϱ� ������
										// ù��° ��ȣ ���� id���� ����ְڴٴ� ��.
				psmt.setString(2, pw);
				psmt.setString(3, name);
				psmt.setInt(4, age);
				// ���״�� set���� �Ѱ�! (������)
				
				int cnt = psmt.executeUpdate(); //table�� ��ȭ�� ������ ��� (���� �þ��)
												// cnt : �þ ���� ����
				if(cnt > 0) {
					System.out.println("ȸ������ ����");
				}else {
					System.out.println("ȸ������ ����");
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} // try/catch �� ������� ���� ��� ����ó���� �Ǿ����� �ʾƼ� ���� �߻� 
		finally {
			try {
				psmt.close(); // �Ѵ� ���������� ����������
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} 
		}
		
		
		

	}
}
