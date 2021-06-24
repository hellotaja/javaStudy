import java.util.Random;
import java.util.Scanner;

public class Exam01_2 {

	public static void main(String[] args) {
		//쌤 답안
		
	      // 랜덤한 3개의 숫자 가져오기
	      // 1 ~ 20까지 범위를 갖도록 해야함
	      
	      // 전역변수가 되어서 main메소드 어디에서도 사용 가능
	      int random_num1 = 0, random_num2 = 0, random_num3 = 0;
	      
	      // 랜덤 3개의 숫자가 중복이 되지 않을때 while문을 끝내야함
	      // 조건이 true 실행
	      // 조건이 false 멈춤
	      // 3개의 숫자가 중복이 되지 않을때 False를 만들자
	      while(random_num1 == random_num2 || random_num1 == random_num3 || random_num2 == random_num3) {
	         // 지역변수가 되어서 while안에서만 사용할 수 있음
	         random_num1 = new Random().nextInt(20) + 1;
	         random_num2 = new Random().nextInt(20) + 1;
	         random_num3 = new Random().nextInt(20) + 1;
	         
	      }
	      System.out.println(random_num1);
	      System.out.println(random_num2);
	      System.out.println(random_num3);
	      // 0. 몇번 반복할지 모르기 때문에 while
	      while(true){
	         // S와 B을 셀 변수
	         int sCnt = 0, bCnt = 0;
	         
	         // 1. 3개의 수를 입력
	         System.out.print("1번쨰 정수 입력 >> ");
	         int input1 = new Scanner(System.in).nextInt();
	         System.out.print("2번쨰 정수 입력 >> ");
	         int input2 = new Scanner(System.in).nextInt();
	         System.out.print("3번쨰 정수 입력 >> ");
	         int input3 = new Scanner(System.in).nextInt();
	         
	      // 2. 랜덤한 3개의수와 비교를해서 S 와 B 출력
	         // random_num1 비교
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
	         // 3. 3S가 되면 while문 종료
	         if(sCnt == 3) {
	            System.out.println("STRIKE");
	            break;            
	         }
	      
	      }
	   }
	}

