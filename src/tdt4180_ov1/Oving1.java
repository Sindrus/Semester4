package tdt4180_ov1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Oving1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		JFrame jf = new JFrame();
		jf.setSize(500, 60);
		jf.setVisible(true);
		
		JPanel jp = new JPanel();
		JButton btn1 = new JButton();
		btn1.setText("Trykk her");
		
		
		jp.add(btn1);
		jf.add(jp);
	}

}
