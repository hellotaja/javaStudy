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
	
	// �̹��� �޾ƿ���
	ImageIcon img1 = new ImageIcon("img/1.jpg");
	ImageIcon img2 = new ImageIcon("img/2.jpg");
	
	// �̹��� �ҷ�����
	// ũ�� ������ ����
	Image get_img1 = img1.getImage();
	Image get_img2 = img2.getImage();
	
	// ũ�� ���� �Լ� (����, ����, ����ǰ��)
	// jlabel ũ��� ���� (102, 62)
	// Image scaled_img = get_img1.
	Image scaled_img1 = get_img1.getScaledInstance(154, 119, Image.SCALE_SMOOTH);
	Image scaled_img2 = get_img2.getScaledInstance(154, 119, Image.SCALE_SMOOTH);
	
	// ������ ������ ImageIcon���� ����
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
	private void initialize() { // ������ ù��
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
			public void actionPerformed(ActionEvent e) { //�α��ι�ư�� ������ ��
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
		
		// �̹��� �ֱ�
		JLabel lbl_img = new JLabel(change_img1);
		lbl_img.addMouseListener(new MouseAdapter() {
			
			// mouseEntered : ���콺�� ������Ʈ ������ �������� �̺�Ʈ �߻�
			@Override
			public void mouseEntered(MouseEvent e) {
				// �̹��� ����
				lbl_img.setIcon(change_img2);
				
			}
			// mouseExited : ���콺�� ������Ʈ ������ ������ �̺�Ʈ �߻�
			@Override
			public void mouseExited(MouseEvent e) {
				lbl_img.setIcon(change_img1);
			}
		});
		lbl_img.setBounds(256, 45, 154, 119); //�ڿ� �� ���ڰ� jlabel�� ũ����
		frame.getContentPane().add(lbl_img);
		
		JButton btn_join = new JButton("Join");
		
		// ȸ������ ��ư�� �������� �̺�Ʈ �߻�
		btn_join.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// �̺�Ʈ �߻� : ��ư ������ �� ȸ������(Join) ȭ������ �̵�
				join join = new join(); // joinŸ���� join ���� ����
				join.main(null);
				
				// ���� â �ݱ� (��ü ������ frame�ݱ�)
				frame.dispose();
				
				
			}
		});
		btn_join.setBounds(102, 202, 97, 23);
		frame.getContentPane().add(btn_join);
	}
}
