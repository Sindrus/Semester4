package tdt4180_ov2;

import javax.swing.JFrame;

public class Oving2 {

	public static void main(String[] args) {
		
		JFrame jf = new JFrame();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(500, 500);
		jf.add(new PersonPanel());
		jf.setVisible(true);
	}
}
