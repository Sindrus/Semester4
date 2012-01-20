package tdt4180_ov2;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;

import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PersonPanel extends JPanel{
	
	JTextField NamePropertyComponent;
	JTextField EmailPropertyComponent;
	JTextField DateOfBirthPropertyComponent;
	JComboBox GenderPropertyComponent;
	JSlider HeightPropertyComponent;
	
	public PersonPanel(){
		JLabel lblName = new JLabel("Name:");
		JLabel lblEmail= new JLabel("Email:");
		JLabel lblDOB = new JLabel("Birthday:");
		JLabel lblGender = new JLabel("Gender:");
		JLabel lblHeight = new JLabel("Height:");
		
		JPanel jp1 = new JPanel(new BorderLayout());
		jp1.add(lblName, BorderLayout.AFTER_LAST_LINE);
		jp1.add(lblEmail, BorderLayout.AFTER_LAST_LINE);
		jp1.add(lblDOB, BorderLayout.AFTER_LAST_LINE);
		jp1.add(lblHeight, BorderLayout.AFTER_LAST_LINE);
		add(jp1);
	}
	
}
