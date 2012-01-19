package tdt4180_ov2;

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
		
		
	}
	
}
