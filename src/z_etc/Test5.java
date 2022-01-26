package z_etc;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class MySwing {
	//1.멤버변수 선언
	JFrame f;
	JButton b1, b2;
	JTextField tf;
	JTextArea ta;
	JList color;   // 뻐ㅏㄹ강 노랑 초록 리스트를 화면에 출력
	String[] data = {"빨강", "노랑", "초록", "파랑"};
	JComboBox<String> combo;
	//2. 객체 생성
	MySwing(){
		f = new JFrame("나의 화면");
		b1 = new JButton("확인");
		b2 = new JButton("취소");
		tf = new JTextField("본명을 입력하세요", 40);
		ta = new JTextArea("뭔데 이게", 10 ,30);
		color = new JList<String>(data);
		combo = new JComboBox<String>(data);
	}
	//3. 화면 붙이기
	void addLayout(){
		
		
		
		//f.setLayout(new FlowLayout());
		//f.setLayout(new GridLayout(3, 2));
		f.setLayout(new BorderLayout());  // center/north/south/west/east 영역붙이기
		f.add(b1, BorderLayout.WEST);
		f.add(b2, BorderLayout.EAST);
		f.add(tf, BorderLayout.NORTH);
		f.add(ta, BorderLayout.CENTER);
		//패널 
		JPanel p = new JPanel();
		p.add(new JLabel("주소입력"));
		p.add(color);
		//f.add(combo);
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100, 200, 500, 350);
		f.setVisible(true);
	}
	//4. 이벤트 처리
	void eventProc() {
		
	}
}

public class Test5 {
	public static void main(String[] args) {
		
		MySwing my = new MySwing();
		my.addLayout();
		my.eventProc();
	}
	

}
