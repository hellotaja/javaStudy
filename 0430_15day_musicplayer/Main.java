import java.util.Scanner;

public class Main {
// View :
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MusicPlayer mp = new MusicPlayer();
		
		
		while(true) {
			System.out.print("[1]재생 [2]정지 [3]다음곡 [4]이전곡 [5]종료 >> ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				Music m = mp.play();
				System.out.println(printMusicInfo(m));
				
			}else if(menu == 2) {
				String s = mp.stop();
				System.out.println(s);
				
			}else if(menu == 3) {
				Music m = mp.nextPlay();
				System.out.println(printMusicInfo(m));
				
			}else if(menu == 4) {
				Music m = mp.prePlay();
				System.out.println(printMusicInfo(m));
			}else {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
	
	// 음악정보 출력 기능(메서드)
	public static String printMusicInfo(Music m) {
		String s = m.getMusicName()+", "+m.getSinger()+", "+changeTime(m);
		return s;
	}
	
	// 초 -> 분/초
	// static, 반환타입 String, 매개인자(Music)
	// 기능 : 문자열 time = Music(playTime) -> 분 / 초 == (100 -> 1분 40초)
	// 반환 time
	static String changeTime(Music m) {
		int min = m.getPlayTime()/60;
		int sec = m.getPlayTime()%60;
		String time = min+"분 "+sec+"초";
		return time;
	}

}
