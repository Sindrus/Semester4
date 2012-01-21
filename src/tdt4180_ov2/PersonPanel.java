package tdt4180_ov2;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.LayoutManager;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

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
		setLayout(new BorderLayout());
		JLabel lblName = new JLabel("Name:");
		JLabel lblEmail= new JLabel("Email:");
		JLabel lblDOB = new JLabel("Birthday:");
		JLabel lblGender = new JLabel("Gender:");
		JLabel lblHeight = new JLabel("Height:");
		
//		JPanel jp1 = new JPanel();
//		jp1.setLayout(null);

		JPanel jp1 = new JPanel(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		c.gridx=0;
		c.gridy=0;
		jp1.add(lblName,c);
		
		c.gridy=1;
		jp1.add(lblEmail,c);
		
		c.gridy=2;
		jp1.add(lblDOB,c);
		
		c.gridy=3;
		jp1.add(lblGender,c);
		
		c.gridy=4;
//		lblHeight.setBounds(50, 200, 75, 25);
		jp1.add(lblHeight);
		
		add(jp1);
	}

	
}
