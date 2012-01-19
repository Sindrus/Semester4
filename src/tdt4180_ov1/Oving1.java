package tdt4180_ov1;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Oving1{
	
	public static void main(String[] args){
		
		JFrame jf = new JFrame();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(600, 70);
		JPanel bnt = new ButtonsNText();
	
		jf.add(bnt);
	
		jf.setVisible(true);
	}
	
}
