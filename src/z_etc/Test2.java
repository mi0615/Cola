package z_etc;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JOptionPane;

class MyForm2 extends Frame{
	Button b;
	
	MyForm2(){
		super("나의 두번째 창");
		b = new Button("ok");
		
	}
	void addlayout() {
		
		setLayout(new FlowLayout());
		add(b);
		
		setBounds(100, 200, 300, 200);
		setVisible(true);
		
		MyEvent evt = new MyEvent();
		b.addActionListener(evt);
		
	}
	class MyEvent implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "버튼이 눌렸습니다.");
		}
}
}
public class Test2 {

	public static void main(String[] args) {
		MyForm2 my2 = new MyForm2();
		my2.addlayout();

	}

}
