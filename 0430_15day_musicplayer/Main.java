import java.util.Scanner;

public class Main {
// View :
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MusicPlayer mp = new MusicPlayer();
		
		
		while(true) {
			System.out.print("[1]��� [2]���� [3]������ [4]������ [5]���� >> ");
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
				System.out.println("���α׷� ����");
				break;
			}
		}
	}
	
	// �������� ��� ���(�޼���)
	public static String printMusicInfo(Music m) {
		String s = m.getMusicName()+", "+m.getSinger()+", "+changeTime(m);
		return s;
	}
	
	// �� -> ��/��
	// static, ��ȯŸ�� String, �Ű�����(Music)
	// ��� : ���ڿ� time = Music(playTime) -> �� / �� == (100 -> 1�� 40��)
	// ��ȯ time
	static String changeTime(Music m) {
		int min = m.getPlayTime()/60;
		int sec = m.getPlayTime()%60;
		String time = min+"�� "+sec+"��";
		return time;
	}

}
