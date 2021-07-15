import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login {
	
	// 이미지 받아오기
	ImageIcon img1 = new ImageIcon("img/1.jpg");
	ImageIcon img2 = new ImageIcon("img/2.jpg");
	
	// 이미지 불러오기
	// 크기 변경을 위해
	Image get_img1 = img1.getImage();
	Image get_img2 = img2.getImage();
	
	// 크기 변경 함수 (가로, 세로, 사진품질)
	// jlabel 크기로 수정 (102, 62)
	// Image scaled_img = get_img1.
	Image scaled_img1 = get_img1.getScaledInstance(154, 119, Image.SCALE_SMOOTH);
	Image scaled_img2 = get_img2.getScaledInstance(154, 119, Image.SCALE_SMOOTH);
	
	// 변경한 사진을 ImageIcon으로 변경
	ImageIcon change_img1 = new ImageIcon(scaled_img1);
	ImageIcon change_img2 = new ImageIcon(scaled_img2);
	
	
	private JFrame frame;
	private JTextField tf_id;
	private JTextField tf_pw;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() { // 설계의 첫단
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID :");
		lblNewLabel.setBounds(42, 74, 57, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password : ");
		lblNewLabel_1.setBounds(42, 121, 83, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		tf_id = new JTextField();
		tf_id.setBounds(116, 71, 116, 21);
		frame.getContentPane().add(tf_id);
		tf_id.setColumns(10);
		
		tf_pw = new JTextField();
		tf_pw.setBounds(116, 118, 116, 21);
		frame.getContentPane().add(tf_pw);
		tf_pw.setColumns(10);
		
		JButton btn_login = new JButton("Login");
		btn_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //로그인버튼을 눌렀을 때
				String id = tf_id.getText();
				String pw = tf_pw.getText();
			
				if(id.equals("test")&&pw.equals("123")) {
					new Main("test");
					frame.dispose();
				}
			}
		});
		btn_login.setBounds(246, 202, 97, 23);
		frame.getContentPane().add(btn_login);
		
		// 이미지 넣기
		JLabel lbl_img = new JLabel(change_img1);
		lbl_img.addMouseListener(new MouseAdapter() {
			
			// mouseEntered : 마우스가 컴포넌트 안으로 들어왔을때 이벤트 발생
			@Override
			public void mouseEntered(MouseEvent e) {
				// 이미지 변경
				lbl_img.setIcon(change_img2);
				
			}
			// mouseExited : 마우스가 컴포넌트 밖으로 나갈때 이벤트 발생
			@Override
			public void mouseExited(MouseEvent e) {
				lbl_img.setIcon(change_img1);
			}
		});
		lbl_img.setBounds(256, 45, 154, 119); //뒤에 두 숫자가 jlabel의 크기임
		frame.getContentPane().add(lbl_img);
		
		JButton btn_join = new JButton("Join");
		
		// 회원가입 버튼을 눌렀을때 이벤트 발생
		btn_join.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 이벤트 발생 : 버튼 눌렀을 때 회원가입(Join) 화면으로 이동
				join join = new join(); // join타입의 join 변수 생성
				join.main(null);
				
				// 기존 창 닫기 (전체 단위인 frame닫기)
				frame.dispose();
				
				
			}
		});
		btn_join.setBounds(102, 202, 97, 23);
		frame.getContentPane().add(btn_join);
	}
}
