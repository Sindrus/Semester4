package tdt4180_ov2;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Oving2 {

	public static void main(String[] args) {
		
		JFrame jf = new JFrame();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(500, 500);
		jf.add(new PersonPanel());
		jf.setVisible(true);
		jf.addKeyListener(new KeyListener() {
			
			@Override
			public void keyPressed(KeyEvent e) {}

			@Override
			public void keyReleased(KeyEvent e) {}

			@Override
			public void keyTyped(KeyEvent e) {
				if(e.getKeyChar()==KeyEvent.VK_SPACE){
					System.exit(0);
				}
			}
		});
	}
}
