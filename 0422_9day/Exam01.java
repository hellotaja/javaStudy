import java.util.ArrayList;

public class Exam01 {

	public static void main(String[] args) {
		// ArrayList >> 자바 배열(array)한계를 극복해보기 위해 탄생
		// 자바 배열에서 크기가 고정되어있는 문제를 해결
		// 데이터를 넣을때마다 공간을 자동으로 할당 > 파이썬 리스트와 비슷
		
		// 1. ArrayList 생성하기
		String [] arr = new String[3];
		
		// Arraylist 클래스를 사용
		// <>에 타입의 풀네임 적어주어야 함
		ArrayList<integer> arr2 = new ArrayList<integer>();
		
		// 2. ArrayList 맨 뒤에 데이터 추가하기
		arr2.add("이기성");
		arr2.add("이명훈");
		arr2.add("정세연");
		
		// 3. 데이터 출력
		// get(index) 메소드를 사용해서 값 출력
		System.out.println(arr2.get(0));
		
		// 4. 전체 데이터 출력하기 (반복문 사용)
		System.out.println("=========================");
		for(int i = 0; i < arr2.size(); i++) {
			System.out.println(arr2.get(i));
		}
		
		// 5. 원하는 위치에 데이터 집어 넣기 add(index, 값)
		// 기존데이터가 바뀌는게 아니고 뒤로 밀림
		arr2.add(2, "권누리");
		System.out.println("=========================");
		for(int i = 0; i < arr2.size(); i++) {
			System.out.println(arr2.get(i));
		}
		// 6. 데이터 삭제 
		// 데이터 삭제된 자리로 떙겨짐
		arr2.remove(2);
		System.out.println("========================");
		for(int i = 0; i < arr2.size(); i++) {
			System.out.println(arr2.get(i));
		}
		// 7. 데이터 전체삭제
		arr2.removeAll(arr2);
		System.out.println("========================");
		for(int i = 0; i < arr2.size(); i++) {
			System.out.println(arr2.get(i));
		}	

	}

}
