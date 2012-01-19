package tdt4180_ov1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class ButtonsNText extends JPanel implements KeyListener{

	JToggleButton UpperCaseButton;
	JToggleButton LowerCaseButton;
	JTextField TextLine;
	JCheckBox ContinuousButton;
	ButtonGroup bg;
	
	public ButtonsNText(){

		TextLine = new JTextField();
		TextLine.setColumns(15);
		TextLine.addKeyListener(this);
		TextLine.setName("TextLine");
		
		ContinuousButton = new JCheckBox("Continuous?");
		ContinuousButton.setName("ContinuousButton");
		
		bg = new ButtonGroup();
		
		UpperCaseButton = new JToggleButton("Upper Case");
		UpperCaseButton.setName("UpperCaseButton");
		UpperCaseButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextLine.setText(TextLine.getText().toUpperCase());
				System.out.println(UpperCaseButton.getName() + " skrevet tekst er: " + TextLine.getText());
			}
		});
		
		LowerCaseButton = new JToggleButton("Lower Case");
		LowerCaseButton.setName("LowerCaseButton");
		LowerCaseButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextLine.setText(TextLine.getText().toLowerCase());
				System.out.println(LowerCaseButton.getName());
			}
		});
		
		bg.add(UpperCaseButton);
		bg.add(LowerCaseButton);
		add(TextLine);
		add(UpperCaseButton);
		add(LowerCaseButton);
		add(ContinuousButton);
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {}

	@Override
	public void keyReleased(KeyEvent e) {
		if (ContinuousButton.isSelected()){
			int caret = TextLine.getCaretPosition();
			if (UpperCaseButton.isSelected())
				TextLine.setText(TextLine.getText().toUpperCase());
			else if(LowerCaseButton.isSelected())
				TextLine.setText(TextLine.getText().toLowerCase());
			TextLine.setCaretPosition(caret);
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {}
}


