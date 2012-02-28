package tdt4180_ov4;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;

public class Oving4 {
	
	public static void main(String args[]){
		
		JFrame jf = new JFrame("Oving 4");
		PersonListPanel plp = new PersonListPanel();
		DefaultListModel dlm = (DefaultListModel) plp.getModel();
				
		Person p1 = new Person("Per");
		dlm.addElement(p1);
		Person p2 = new Person("Hans");
		dlm.addElement(p2);
		Person p3 = new Person("Egil");
		dlm.addElement(p3);
		
		jf.setSize(400, 400);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.add(plp);
		jf.pack();
		jf.setVisible(true);
		
		
	}
	
	
}
