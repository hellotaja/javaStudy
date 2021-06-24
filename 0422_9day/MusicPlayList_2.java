import java.util.ArrayList;
import java.util.Scanner;

public class MusicPlayList_2 {
	import java.util.ArrayList;
	import java.util.Scanner;
// 쌤 답!
	public class MusicPlayList {
	   // main ctrl + space > main method 선택
	   public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      ArrayList<String> arr = new ArrayList<String>(); // 노래를 담아줄 arraylist
	      while(true) {
	         System.out.print("[1] 노래추가 [2] 노래삭제 [3] 노래조회 [4] 종료 >> ");
	         int num = sc.nextInt();
	         if(num == 1) {
	            playlist(arr);
//	            System.out.println("=========현재 재생 목록==========");
//	            if(arr.size() == 0) {
//	               // 목록안에 노래가 없으면 재생목록이 없습니다 를 출력
//	               System.out.println("재생 목록이 없습니다!");
//	            }else {
//	               // 목록안에 노래가 있으면 노래를 출력
//	               // 몇개의 노래가 있는지 모름 
//	               // arr.size() 몇개의 노래가 있는지 알수 있음 
//	               for(int i = 0; i<arr.size();i++) {
//	                  System.out.println((i+1)+"."+arr.get(i));
//	               }
//	            }
//	            System.out.println("==============================");
	            System.out.print("[1] 마지막 위치에 추가 [2] 원하는 위치에 추가 >> ");
	            int inputNum = sc.nextInt();
	            
	            if(inputNum == 1) {
	               // 마지막 위치에 노래 추가
	               System.out.print("추가할 노래 입력 >> ");
	               String newSong = sc.next();
	               arr.add(newSong); // index를 적지 않으면 마지막에 데이터 추가
	               System.out.println("추가가 완료되었습니다.");
	            }else if(inputNum == 2) {
	               // 원하는 위치에 노래 추가
	               System.out.print("추가할 노래 입력 >> ");
	               String newSong = sc.next(); // 노래 입력받은 변수
	               System.out.print("추가할 위치를 입력 >> ");
	               int addNum = sc.nextInt(); // 추가할 위치를 입력받은 변수
	               arr.add(addNum-1,newSong);
	               
	            }
	            
	         }else if(num == 2) {
	            // 노래 삭제
	            playlist(arr);
	            System.out.print("[1] 선택삭제 [2] 전체삭제 >> ");
	            int removeNum = sc.nextInt();
	            if(removeNum == 1) {
	               // 선택삭제
	               System.out.print("삭제할 노래 번호 입력 >> ");
	               int delNum = sc.nextInt();
	               arr.remove(delNum-1);
	               System.out.println("노래가 삭제되었습니다.");
	            }else if(removeNum == 2) {
	               // 전체삭제
	               arr.removeAll(arr);
	               System.out.println("전체 리스트가 삭제되었습니다.");
	            }
	         }else if(num == 3) {
	            // 전체 노래 조회
	            playlist(arr);
	         }else if(num == 4) {
	            // 프로그램 종료
	            // while 종료
	            System.out.println("뮤직플레이리스트를 종료합니다");
	            break;
	            
	         }
	      }
	   }
	   
	   public static void playlist(ArrayList<String> arr) {
	      System.out.println("=========현재 재생 목록==========");
	      if(arr.size() == 0) { // 노래 없음
	         System.out.println("재생 목록이 없습니다!");
	      }else { // 노래 있음
	         for(int i = 0; i<arr.size();i++) {
	            System.out.println((i+1)+"."+arr.get(i));
	         }
	      }
	      System.out.println("==============================");
	   }
	   
	      
	   

	   
	
	   
	   
	}
}
