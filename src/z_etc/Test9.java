package z_etc;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

class MyForm9{
	Frame f;
	Button b;
	TextField tf;
	
	MyForm9(){
		f = new Frame("나의 첫 화면");
		b = new Button("OK!!!!");
		tf = new TextField(20);
	}
	void layout() {
		
		f.setLayout(new FlowLayout());
		f.add(b);
		f.add(tf);
		
		f.setBounds(100, 200, 300, 200);
		f.setVisible(true);
		
		// 이벤트 처리
		//MyEvent evt = new MyEvent();
		//b.addActionListener(evt);
		
		b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "버튼이 눌렸습니다.");
				
			}		
		});
		
		tf.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "엔터를 쳤습니다");
				
			}		
		});
		
	}
	
//	class MyEvent implements ActionListener{
//		public void actionPerformed(ActionEvent e) {
//			JOptionPane.showMessageDialog(null, "버튼이 눌렸습니다.");
//			
//		}		
//	}
}

public class Test9 {

	public static void main(String[] args) {
		MyForm9 my = new MyForm9();
		my.layout();
	}

}
