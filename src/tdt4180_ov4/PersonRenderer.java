package tdt4180_ov4;

import java.awt.Component;

import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

import tdt4180_ov4.Person.Gender;

public class PersonRenderer extends DefaultListCellRenderer{
	final ImageIcon female = new ImageIcon(getClass().getResource("female.gif"));
	final ImageIcon male = new ImageIcon(getClass().getResource("male.gif"));
	
	
	public Component getListCellRendererComponent(
			JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
		
		JLabel label = (JLabel)super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
		
		
		String s1 = ((Person) value).getName();
		String s2 = ((Person) value).getEmail();
		label.setText(s1+" "+s2);
		
		if (((Person)value).getGender() == Gender.male)
			label.setIcon(male);
		else if (((Person)value).getGender() == Gender.female)
			label.setIcon(female);
		
		if (isSelected){
			label.setBackground(list.getSelectionBackground());
			label.setForeground(list.getSelectionForeground());
		}
		else{
			label.setBackground(list.getBackground());
			label.setForeground(list.getForeground());
		}
		label.setOpaque(true);
		
		return this;
	}
}
