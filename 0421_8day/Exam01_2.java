import java.util.Random;
import java.util.Scanner;

public class Exam01_2 {

	public static void main(String[] args) {
		//�� ���
		
	      // ������ 3���� ���� ��������
	      // 1 ~ 20���� ������ ������ �ؾ���
	      
	      // ���������� �Ǿ main�޼ҵ� ��𿡼��� ��� ����
	      int random_num1 = 0, random_num2 = 0, random_num3 = 0;
	      
	      // ���� 3���� ���ڰ� �ߺ��� ���� ������ while���� ��������
	      // ������ true ����
	      // ������ false ����
	      // 3���� ���ڰ� �ߺ��� ���� ������ False�� ������
	      while(random_num1 == random_num2 || random_num1 == random_num3 || random_num2 == random_num3) {
	         // ���������� �Ǿ while�ȿ����� ����� �� ����
	         random_num1 = new Random().nextInt(20) + 1;
	         random_num2 = new Random().nextInt(20) + 1;
	         random_num3 = new Random().nextInt(20) + 1;
	         
	      }
	      System.out.println(random_num1);
	      System.out.println(random_num2);
	      System.out.println(random_num3);
	      // 0. ��� �ݺ����� �𸣱� ������ while
	      while(true){
	         // S�� B�� �� ����
	         int sCnt = 0, bCnt = 0;
	         
	         // 1. 3���� ���� �Է�
	         System.out.print("1���� ���� �Է� >> ");
	         int input1 = new Scanner(System.in).nextInt();
	         System.out.print("2���� ���� �Է� >> ");
	         int input2 = new Scanner(System.in).nextInt();
	         System.out.print("3���� ���� �Է� >> ");
	         int input3 = new Scanner(System.in).nextInt();
	         
	      // 2. ������ 3���Ǽ��� �񱳸��ؼ� S �� B ���
	         // random_num1 ��
	         if(random_num1 == input1) {
	            sCnt++;
	         }else if(random_num1 == input2 || random_num1 == input3) {
	            bCnt++;
	         }
	         
	         
	         if(random_num2 == input2) {
	            sCnt++;
	         }else if(random_num2 == input1 || random_num2 == input3) {
	            bCnt++;
	         }
	         if(random_num3 == input3) {
	            sCnt++;
	         }else if(random_num3 == input1 || random_num3 == input2) {
	            bCnt++;
	         }
	         System.out.println(sCnt+" S "+bCnt+" B");
	         // 3. 3S�� �Ǹ� while�� ����
	         if(sCnt == 3) {
	            System.out.println("STRIKE");
	            break;            
	         }
	      
	      }
	   }
	}

