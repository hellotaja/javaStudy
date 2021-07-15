import java.util.ArrayList;
import javazoom.jl.player.MP3Player;

public class MusicPlayer {
// Controller : ������(model)�� ����� �������̽�(view)�� �մ� �ٸ������� ��
// ����ڰ� �߻���Ų �̺�Ʈ�� ó���ϴ� �κ�
	
	ArrayList<Music> musicList = new ArrayList<Music>();
	MP3Player mp3 = new MP3Player();
	int currentMusicIndex = 0;
	
	public MusicPlayer() {
		// MusicPlayer ��ü ������ �⺻��(Music��ü ����)���� ����ְ� ����
		musicList.add(new Music("���϶�", "������", 40, "C://music//IU(������) - ���϶�.mp3"));
		musicList.add(new Music("On the groud", "����", 90, "C://music/����(ROSE) - On the ground.mp3"));
		musicList.add(new Music("parachute", "John K", 90, "C://music/John K - parachute.mp3"));
		musicList.add(new Music("peaches", "Justin Bieber", 10, "C://music/Justin Bieber - Peaches.mp3"));
		musicList.add(new Music("rollin", "�극�̺� �ɽ�", 117, "C://music/�극�̺�ɽ� - �Ѹ�(Rollin').mp3"));
	}
	
	// ���
	public Music play() {
		// 1. musicList(arraylist)���� ����� ���� ��������
		Music m = musicList.get(currentMusicIndex);
		// 2. MP3Player Ŭ������ play �޼ҵ� Ȱ���ؼ� ���� ���
		if(!mp3.isPlaying()) { //�Ҹ���Ÿ�� �޼���
			mp3.play(m.getMusicPath());
		}
		// 3. ���� ������� ���� ��ü ��ȯ
		return m;
		
	}
	// ����
	public String stop() {
		// ���� ����ǰ� �ִ� �뷡 ����(MP3Player Ŭ���� - stop())
		if(mp3.isPlaying()) {
			mp3.stop();
		}
		return "�뷡�� �����Ǿ����ϴ�"; 
	}
	// ������ ���
	public Music nextPlay() {
		if(mp3.isPlaying()) {
			mp3.stop();
		}
		// musiclist ������ ��� ��� currentmusicindex�� 0���� �ٲ��ֱ�
		if(currentMusicIndex >= musicList.size()-1) {
			currentMusicIndex = 0;
		}else {
			currentMusicIndex++;
		}
		Music m = musicList.get(currentMusicIndex);
		mp3.play(m.getMusicPath());
		return m;	
	}
	// ������ ���
	public Music prePlay() {
		if(mp3.isPlaying()) {
			mp3.stop();
		}
		// musiclist ������ ��� ��� currentmusicindex�� 0���� �ٲ��ֱ�
		if(currentMusicIndex > 0) {
			currentMusicIndex--;
		}else {
			currentMusicIndex = musicList.size()-1;
		}
		Music m = musicList.get(currentMusicIndex);
		mp3.play(m.getMusicPath());
		return m;
		
	}
}
