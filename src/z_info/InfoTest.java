package z_info;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class InfoTest {
	
	//--------------------------------
			//[1] 멤버변수 선언
			JFrame f;
			JTextField tfName, tfId, tfTel, tfSex, tfAge, tfHome;
			JTextArea ta;
			JButton bAdd, bShow, bSearch, bDelete, bCancle, bExit;
			
			//--------------------------------
			//[2] 멤버변수 객체 생성
			InfoTest(){
				f = new JFrame("DBTest");
				tfName = new JTextField(15);
				tfId = new JTextField(15);
				tfTel = new JTextField(15);
				tfSex = new JTextField(15);
				tfAge = new JTextField(15);
				tfHome = new JTextField(15);
				ta = new JTextArea();
				bAdd = new JButton("Add");
				//bAdd.setRolloverIcon(new ImageIcon("src/z_info/imgs/dragon.png"));
				//bAdd.setPressedIcon(new ImageIcon("src/z_info/imgs/dragon2.png"));
				//bAdd.setToolTipText("정보를 입력합니다.");
				bShow = new JButton("Show");
				bSearch = new JButton("Search");
				bDelete = new JButton("Delete");
				bCancle = new JButton("Cancle");
				bExit = new JButton("Exit");
				
				
				
			}
			
			//-------------------------------
			//[3] 화면 붙이기
			void addLayout() {
				
				f.setLayout(new BorderLayout());
				f.add(ta, BorderLayout.CENTER);
				
				JPanel p = new JPanel();
				p.setLayout(new GridLayout(6, 2));
				p.add(new JLabel("Name"));
				p.add(tfName);
				p.add(new JLabel("Id"));
				p.add(tfId);
				p.add(new JLabel("Tel"));
				p.add(tfTel);
				p.add(new JLabel("Sex"));
				p.add(tfSex);
				p.add(new JLabel("Age"));
				p.add(tfAge);
				p.add(new JLabel("Home"));
				p.add(tfHome);
				
				f.add(p, BorderLayout.WEST);
				JPanel p2 = new JPanel(); 
				p2.setLayout(new GridLayout(1, 6));
				p2.add(bAdd);
				p2.add(bShow);
				p2.add(bSearch);
				p2.add(bDelete);
				p2.add(bCancle);
				p2.add(bExit);
				
				f.add(p2, BorderLayout.SOUTH);
				//JPanel pwest = new JPanel();
				//pwest.setLayout(new GridLayout(6, 2));
				//pwest.add
				
				
				
				
				
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				f.setBounds(100, 200, 500, 350);
				f.setVisible(true);
			}
			
		void eventProc() {
			// 주민번호 입력창 (tfId) 에서 엔터 쳤을때
			tfId.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e) {
					String id = tfId.getText();
					ta.setText(id);
					// 성별을 구해서
					tfSex.setText("남자");
					// 출신지를 구해서
					tfHome.setText("서울");
					//----------------------------------------
					//[선택] 나이를 구해서
					tfAge.setText(String.valueOf(30));
				}		
			});

			
			
			//취소버튼이 눌렸을때
			bCancle.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e) {
					tfName.setText("");
					
				}		
			});

			//종료버튼이 눌렸을때 프로그램 종료함
			bExit.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
					
				}		
			});

			
		}
			

	public static void main(String[] args) {
		InfoTest info = new InfoTest();
		info.addLayout();
		info.eventProc();

	}

}
