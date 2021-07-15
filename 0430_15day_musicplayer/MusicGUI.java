import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MusicGUI {

	private JFrame frame;
	MusicPlayer mp = new MusicPlayer();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MusicGUI window = new MusicGUI();
					window.frame.setVisible(true); //setVisible : ���� ���̰� �ϴ°�
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	//������
	public MusicGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 422, 164);//setBounds(��ġ, ũ�� ����) (x��, y��, �ʺ�, ����)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBounds(12, 10, 382, 50);
		frame.getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		JLabel lbl_musicinfo = new JLabel("Music info");
		lbl_musicinfo.setBackground(Color.WHITE);
		lbl_musicinfo.setForeground(Color.GRAY);
		lbl_musicinfo.setFont(new Font("����", Font.BOLD, 20));
		lbl_musicinfo.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lbl_musicinfo, "name_8430743702199");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 65, 382, 50);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btn_pre = new JButton("\u25C0\u25C0");
		btn_pre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //���� �̺�Ʈ�߰�
				Music m = mp.prePlay();
				lbl_musicinfo.setText(printMusicInfo(m));
			}
		});
		btn_pre.setBackground(UIManager.getColor("textHighlight"));
		btn_pre.setFont(new Font("����", Font.PLAIN, 15));
		panel_1.add(btn_pre);
		
		JButton btn_play = new JButton("\u25B6");
		btn_play.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Music m = mp.play();
				lbl_musicinfo.setText(printMusicInfo(m));
				System.out.println(lbl_musicinfo.getText()); //�ܼ�â�����
			}
		});
		btn_play.setFont(new Font("����", Font.PLAIN, 15));
		panel_1.add(btn_play);
		
		JButton btn_stop = new JButton("\u25A0");
		btn_stop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // music��ü ������ �ƴ� String��ȯ
				String message = mp.stop();
				lbl_musicinfo.setText(message);
			}
		});
		btn_stop.setFont(new Font("����", Font.PLAIN, 15));
		panel_1.add(btn_stop);
		
		JButton btn_next = new JButton("\u25B6\u25B6");
		btn_next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // ���� �̺�Ʈ�߰�
				Music m = mp.nextPlay();
				lbl_musicinfo.setText(printMusicInfo(m));
			}
		});
		btn_next.setFont(new Font("����", Font.PLAIN, 15));
		panel_1.add(btn_next);
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
