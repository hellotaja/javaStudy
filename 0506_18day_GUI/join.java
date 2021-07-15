import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import model.MemberDAO;
import model.MemberDTO;

public class join {

   private JFrame frame;
   private final ButtonGroup buttonGroup = new ButtonGroup();

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               join window = new join();
               window.frame.setVisible(true); //Joinâ�� ���
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   /**
    * Create the application.
    */
   public join() {
      initialize();
   }

   /**
    * Initialize the contents of the frame. // ���α׷��� ���� ��������
    */
   private void initialize() {
      frame = new JFrame();
         frame.setBounds(100, 100, 450, 583);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.getContentPane().setLayout(null);
         
         JPanel panel = new JPanel();
         panel.setBounds(0, 0, 434, 544);
         frame.getContentPane().add(panel);
         panel.setLayout(null);
      
         JLabel lblNewLabel = new JLabel("JOIN");
         lblNewLabel.setFont(new Font("����", Font.PLAIN, 26));
         lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
         lblNewLabel.setBounds(74, 37, 269, 49);
         panel.add(lblNewLabel);
         
         JLabel lbl_id = new JLabel("ID :");
         lbl_id.setBounds(30, 108, 49, 41);
         panel.add(lbl_id);
         
         JTextField  txt_id = new JTextField();
         txt_id.setBounds(110, 104, 233, 45);
         panel.add(txt_id);
         txt_id.setColumns(10);
         
         JLabel lbl_pw = new JLabel("PW :");
         lbl_pw.setBounds(30, 169, 49, 41);
         panel.add(lbl_pw);
         
         JTextField txt_name = new JTextField();
         txt_name.setColumns(10);
         txt_name.setBounds(110, 236, 233, 45);
         panel.add(txt_name);
         
         JLabel lbl_name = new JLabel("NAME :");
         lbl_name.setBounds(30, 240, 49, 41);
         panel.add(lbl_name);
         
         JTextField  txt_pw = new JPasswordField();
         txt_pw.setBounds(110, 166, 233, 47);
         panel.add(txt_pw);
         
         JLabel lbl_gender = new JLabel("Gender :");
         lbl_gender.setBounds(30, 303, 49, 41);
         panel.add(lbl_gender);
         
         JRadioButton rbt_male = new JRadioButton("\uB0A8\uC790");
         buttonGroup.add(rbt_male);
         rbt_male.setBounds(110, 312, 121, 23);
         panel.add(rbt_male);
         
         JRadioButton rbt_female = new JRadioButton("\uC5EC\uC790");
         buttonGroup.add(rbt_female);
         rbt_female.setBounds(246, 312, 121, 23);
         panel.add(rbt_female);
         
         JLabel lbl_hobby = new JLabel("Hobby :");
         lbl_hobby.setBounds(30, 353, 49, 41);
         panel.add(lbl_hobby);
         
         JCheckBox chc_soccer = new JCheckBox("\uCD95\uAD6C");
         chc_soccer.setBounds(99, 362, 58, 23);
         panel.add(chc_soccer);
         
         JCheckBox chc_baseball = new JCheckBox("\uC57C\uAD6C");
         chc_baseball.setBounds(182, 362, 67, 23);
         panel.add(chc_baseball);
         
         JCheckBox chc_basketball = new JCheckBox("\uB18D\uAD6C");
         chc_basketball.setBounds(282, 362, 61, 23);
         panel.add(chc_basketball);
         
         JButton btn_join = new JButton("Join");
         btn_join.addActionListener(new ActionListener() {
         	public void actionPerformed(ActionEvent e) {
         		// join��ư�� �������� �̺�Ʈ �߻�
         		// �Է��� ���� db�� ����
         		String id = txt_id.getText();
         		String pw = txt_pw.getText();
         		String name = txt_name.getText();
         		
         		String gender = "";
         		
         		if(rbt_male.isSelected()){// ���� ���� ��ư�� ���õǾ��ٸ�
         			gender = "����";
         		}else {
         			gender = "����";
         		}
         		
         		String hobby = "";
         		
         		// chc_soccer : �౸, chc_baseball : �߱�, chc_basketball : ��
         		if(chc_soccer.isSelected()) {
         			hobby += "�౸"; // �ߺ��� �����ϱ� ������ �߰��������� ���� 
         		}
         		if(chc_baseball.isSelected()) {
         			hobby += "�߱�";
         		}
         		if(chc_basketball.isSelected()) {
         			hobby += "��";
         		}
         		
         		if(!id.equals("") && !pw.equals("") && !name.equals("") && !gender.equals("") 
         				&& !hobby.equals("")) {
         			// 5���� ���� �Է��� ������, DB�� �� ����
         			MemberDTO dto = new MemberDTO(id,pw,name,gender,hobby);
         			MemberDAO dao = new MemberDAO();
         			
         			// true : db�� �� ����
         			// false : db�� �� ���� �ȵ�
         			boolean result = dao.join(dto);
         			
         			if(result) {//result�� true�϶�
         				JOptionPane.showMessageDialog(null, "ȸ������ ����");
         				// �α��� �������� ���ư���
        				Login Login = new Login(); // joinŸ���� join ���� ����
        				Login.main(null);
        				
        				// ���� â �ݱ� (��ü ������ frame�ݱ�)
        				frame.dispose();
         				
         			}else {
         				JOptionPane.showMessageDialog(null, "ȸ������ ����");
         			}
         			
         		}else {
         			JOptionPane.showMessageDialog(null, "��� ������ �Է��ϼ���", "ȸ������", JOptionPane.ERROR_MESSAGE);
         		}
         		
         		
         	}
         });
         btn_join.setBounds(32, 428, 355, 34);
         panel.add(btn_join);
         
         //login
         JButton btn_login = new JButton("login");
         btn_login.setBounds(32, 464, 355, 34);
         panel.add(btn_login);
   }
}