import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ex04_update2 {

   public static void main(String[] args) {
      
      Connection conn = null;
      PreparedStatement psmt = null;
      String pw = null;
      String name = null;
      int age = 0;
      String sql = null;

      // ���̵� �Է¹޾Ƽ�
      // ��й�ȣ ����

      Scanner sc = new Scanner(System.in);

      System.out.print("���̵� : ");
      String id = sc.next();


      try {

         Class.forName("oracle.jdbc.driver.OracleDriver");

         String url = "jdbc:oracle:thin:@localhost:1521:xe";
         String db_id = "hr";
         String db_pw = "hr";

         conn = DriverManager.getConnection(url, db_id, db_pw);
         
         
         // --------------------------------------
         // ������ ���� �ٲ��־�� ��
         System.out.println("������ ����");
         System.out.print("1. ��й�ȣ / 2. �̸� / 3. ���� >> ");
         int num = sc.nextInt();
         
         if (num == 1) {
            System.out.print("������ ��й�ȣ : ");
            pw = sc.next();
            sql = "update member set pw = ? where id = ?";
            psmt = conn.prepareStatement(sql);
            
            psmt.setString(1, pw);
            psmt.setString(2, id);
         }else if(num == 2) {
            System.out.print("������ �̸� : ");
            name = sc.next();
            sql = "update member set name = ? where id = ?";
            psmt = conn.prepareStatement(sql);
            
            psmt.setString(1, name);
            psmt.setString(2, id);
         }else if(num ==3 ) {
            System.out.print("������ ���� : ");
            age = sc.nextInt();
            sql = "update member set age = ? where id = ?";
            psmt = conn.prepareStatement(sql);
            
            psmt.setInt(1, age);
            psmt.setString(2, id);
         }
         
         int cnt = psmt.executeUpdate();
         
         if(cnt > 0) {
            System.out.println("��������");
         }else {
            System.out.println("��������");
         }
         
         // --------------------------------------
         
      } catch (SQLException e) {
         e.printStackTrace();

      } catch (ClassNotFoundException e) {
         e.printStackTrace();
      } finally {
         try {
            psmt.close();
            conn.close();
         } catch (SQLException e) {
            e.printStackTrace();
         }
         
      }
      
   }

}