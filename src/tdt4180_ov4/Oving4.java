package tdt4180_ov4;

import javax.swing.JFrame;

public class Oving4 {
	
	public static void main(String args[]){
		
		JFrame jf = new JFrame("Oving 4");
		PersonListPanel plp = new PersonListPanel();
		jf.setSize(400, 400);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.add(plp);
		jf.pack();
		jf.setVisible(true);
		
		
	}
	
	
}
