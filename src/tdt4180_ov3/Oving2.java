package tdt4180_ov3;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Oving2 extends JPanel{
	
	private PersonPanel personPanelA;
	private PassivePersonPanel personPanelB;
	
	private Person model;
	
	public Oving2(){
		model = new Person("Hans");
		personPanelA = new PersonPanel();
		personPanelA.setModel(model);
		personPanelB = new PassivePersonPanel();
		personPanelB.setModel(model);
		add(personPanelA);
		add(personPanelB);
		
		
	}
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.getContentPane().add(new Oving2());
		frame.pack();
		frame.setVisible(true);
		
	}
}
