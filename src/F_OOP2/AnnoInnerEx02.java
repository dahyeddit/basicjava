package F_OOP2;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnnoInnerEx02 {

	public static void main(String[] args) {
		Button b = new Button();
		
		b.addActionListener(new ActionListener() {//클래스선언과 동시에 객체생성, 클래스 이름 필요없다.
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼눌림");
			}
		});
		
		
	}
}