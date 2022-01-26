package z_etc;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.*;
import javax.swing.JOptionPane;

class MyForm{
	Frame f;
	Button b;
	
	MyForm() {
		f = new Frame("나의 첫 화면");
		b = new Button("OK");
	}
	void layout() {
		
		f.setLayout(new FlowLayout());
		f.add(b);
		
		f.setBounds(100, 200, 300, 200);
		f.setVisible(true);
		
		//이벤트 처리
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

public class Test {
	


	public static void main(String[] args) {
		MyForm my = new MyForm();
		my.layout();

	}

}
