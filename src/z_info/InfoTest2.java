package z_info;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class InfoTest2 {
	//------------------------
	// [1] 멤버변수 선언
	
	JFrame f;
	JTextField tfName, tfId, tfTel, tfSex, tfAge, tfHome;
	JTextArea ta;
	JButton bAdd, bShow, bSearch, bDelete, bCancel, bExit;
	
	//-------------------------
	// [2] 멤버변수 객체 생성
	
	InfoTest2() {
		f = new JFrame("DB Test");		
		bAdd = new JButton("Add");
		bShow = new JButton("Show");
		bSearch = new JButton("Search");
		bDelete = new JButton("Delete");
		bCancel = new JButton("Cancel");
		bExit = new JButton("Exit");
		ta = new JTextArea();		
		
		tfName = new JTextField(15);
		tfId = new JTextField();
		tfTel = new JTextField();
		tfSex = new JTextField();
		tfAge = new JTextField();
		tfHome = new JTextField();
		
	}

	
	//---------------------------
	// [3] 화면 붙이기
	void addLayout() {
		 f.setLayout(new BorderLayout());
	     
		 f.add(ta, BorderLayout.CENTER);
	     	      
	         // 버튼영역-south
	         JPanel p = new JPanel();	         
	         p.add(bAdd);
	         p.add(bShow);
	         p.add(bSearch);
	         p.add(bDelete);
	         p.add(bCancel);
	         p.add(bExit);
	      f.add(p, BorderLayout.SOUTH);

	      	// 라벨+텍스트필드 -west
	        JPanel pwest = new JPanel();
	        pwest.setLayout(new GridLayout(6,2));
	        pwest.add(new JLabel("Name"));
	        pwest.add(tfName);
	        pwest.add(new JLabel("Id"));
	        pwest.add(tfId);
	        pwest.add(new JLabel("Tel"));
	        pwest.add(tfTel);
	        pwest.add(new JLabel("Sex"));
	        pwest.add(tfSex);
	        pwest.add(new JLabel("Age"));
	        pwest.add(tfAge);
	        pwest.add(new JLabel("Home"));
	        pwest.add(tfHome);
		
	        f.add(pwest, BorderLayout.WEST);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100,200,800,350);
		f.setVisible(true);
	}
	
	
	//----------------------------
	// [4] 이벤트처리
	void eventProc() {
		
	}
	
	public static void main(String[] args) {
		InfoTest info = new InfoTest();
		info.addLayout();
		info.eventProc();

	}

}
