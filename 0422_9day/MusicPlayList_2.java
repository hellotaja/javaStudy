import java.util.ArrayList;
import java.util.Scanner;

public class MusicPlayList_2 {
	import java.util.ArrayList;
	import java.util.Scanner;
// �� ��!
	public class MusicPlayList {
	   // main ctrl + space > main method ����
	   public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      ArrayList<String> arr = new ArrayList<String>(); // �뷡�� ����� arraylist
	      while(true) {
	         System.out.print("[1] �뷡�߰� [2] �뷡���� [3] �뷡��ȸ [4] ���� >> ");
	         int num = sc.nextInt();
	         if(num == 1) {
	            playlist(arr);
//	            System.out.println("=========���� ��� ���==========");
//	            if(arr.size() == 0) {
//	               // ��Ͼȿ� �뷡�� ������ �������� �����ϴ� �� ���
//	               System.out.println("��� ����� �����ϴ�!");
//	            }else {
//	               // ��Ͼȿ� �뷡�� ������ �뷡�� ���
//	               // ��� �뷡�� �ִ��� �� 
//	               // arr.size() ��� �뷡�� �ִ��� �˼� ���� 
//	               for(int i = 0; i<arr.size();i++) {
//	                  System.out.println((i+1)+"."+arr.get(i));
//	               }
//	            }
//	            System.out.println("==============================");
	            System.out.print("[1] ������ ��ġ�� �߰� [2] ���ϴ� ��ġ�� �߰� >> ");
	            int inputNum = sc.nextInt();
	            
	            if(inputNum == 1) {
	               // ������ ��ġ�� �뷡 �߰�
	               System.out.print("�߰��� �뷡 �Է� >> ");
	               String newSong = sc.next();
	               arr.add(newSong); // index�� ���� ������ �������� ������ �߰�
	               System.out.println("�߰��� �Ϸ�Ǿ����ϴ�.");
	            }else if(inputNum == 2) {
	               // ���ϴ� ��ġ�� �뷡 �߰�
	               System.out.print("�߰��� �뷡 �Է� >> ");
	               String newSong = sc.next(); // �뷡 �Է¹��� ����
	               System.out.print("�߰��� ��ġ�� �Է� >> ");
	               int addNum = sc.nextInt(); // �߰��� ��ġ�� �Է¹��� ����
	               arr.add(addNum-1,newSong);
	               
	            }
	            
	         }else if(num == 2) {
	            // �뷡 ����
	            playlist(arr);
	            System.out.print("[1] ���û��� [2] ��ü���� >> ");
	            int removeNum = sc.nextInt();
	            if(removeNum == 1) {
	               // ���û���
	               System.out.print("������ �뷡 ��ȣ �Է� >> ");
	               int delNum = sc.nextInt();
	               arr.remove(delNum-1);
	               System.out.println("�뷡�� �����Ǿ����ϴ�.");
	            }else if(removeNum == 2) {
	               // ��ü����
	               arr.removeAll(arr);
	               System.out.println("��ü ����Ʈ�� �����Ǿ����ϴ�.");
	            }
	         }else if(num == 3) {
	            // ��ü �뷡 ��ȸ
	            playlist(arr);
	         }else if(num == 4) {
	            // ���α׷� ����
	            // while ����
	            System.out.println("�����÷��̸���Ʈ�� �����մϴ�");
	            break;
	            
	         }
	      }
	   }
	   
	   public static void playlist(ArrayList<String> arr) {
	      System.out.println("=========���� ��� ���==========");
	      if(arr.size() == 0) { // �뷡 ����
	         System.out.println("��� ����� �����ϴ�!");
	      }else { // �뷡 ����
	         for(int i = 0; i<arr.size();i++) {
	            System.out.println((i+1)+"."+arr.get(i));
	         }
	      }
	      System.out.println("==============================");
	   }
	   
	      
	   

	   
	
	   
	   
	}
}
