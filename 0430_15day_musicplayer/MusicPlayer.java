import java.util.ArrayList;
import javazoom.jl.player.MP3Player;

public class MusicPlayer {
// Controller : 데이터(model)와 사용자 인터페이스(view)를 잇는 다리역할을 함
// 사용자가 발생시킨 이벤트를 처리하는 부분
	
	ArrayList<Music> musicList = new ArrayList<Music>();
	MP3Player mp3 = new MP3Player();
	int currentMusicIndex = 0;
	
	public MusicPlayer() {
		// MusicPlayer 객체 생성시 기본곡(Music객체 생성)들이 들어있게 구현
		musicList.add(new Music("라일락", "아이유", 40, "C://music//IU(아이유) - 라일락.mp3"));
		musicList.add(new Music("On the groud", "로제", 90, "C://music/로제(ROSE) - On the ground.mp3"));
		musicList.add(new Music("parachute", "John K", 90, "C://music/John K - parachute.mp3"));
		musicList.add(new Music("peaches", "Justin Bieber", 10, "C://music/Justin Bieber - Peaches.mp3"));
		musicList.add(new Music("rollin", "브레이브 걸스", 117, "C://music/브레이브걸스 - 롤린(Rollin').mp3"));
	}
	
	// 재생
	public Music play() {
		// 1. musicList(arraylist)에서 재생할 음악 가져오기
		Music m = musicList.get(currentMusicIndex);
		// 2. MP3Player 클래스의 play 메소드 활용해서 음악 재생
		if(!mp3.isPlaying()) { //불리언타입 메서드
			mp3.play(m.getMusicPath());
		}
		// 3. 현재 재생중인 음악 객체 반환
		return m;
		
	}
	// 정지
	public String stop() {
		// 현재 재생되고 있는 노래 정지(MP3Player 클래스 - stop())
		if(mp3.isPlaying()) {
			mp3.stop();
		}
		return "노래가 정지되었습니다"; 
	}
	// 다음곡 재생
	public Music nextPlay() {
		if(mp3.isPlaying()) {
			mp3.stop();
		}
		// musiclist 범위를 벗어날 경우 currentmusicindex를 0으로 바꿔주기
		if(currentMusicIndex >= musicList.size()-1) {
			currentMusicIndex = 0;
		}else {
			currentMusicIndex++;
		}
		Music m = musicList.get(currentMusicIndex);
		mp3.play(m.getMusicPath());
		return m;	
	}
	// 이전곡 재생
	public Music prePlay() {
		if(mp3.isPlaying()) {
			mp3.stop();
		}
		// musiclist 범위를 벗어날 경우 currentmusicindex를 0으로 바꿔주기
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
