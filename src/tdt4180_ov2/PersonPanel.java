package tdt4180_ov2;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.jar.Attributes.Name;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;

public class PersonPanel extends JPanel{
	
	JTextField NamePropertyComponent;
	JTextField EmailPropertyComponent;
	JTextField DateOfBirthPropertyComponent;
	JComboBox GenderPropertyComponent;
	JSlider HeightPropertyComponent;
	Person person;
	
	public PersonPanel(){
		
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		c.anchor = GridBagConstraints.NORTHWEST;
		c.weightx=0.2;
		c.weighty=1.0;
		c.gridy=0;
		c.gridx=0;
		c.insets = new Insets(2, 5, 0, 5);
		
		add(new JLabel("Name:"),c);
		c.gridy=1;
		add(new JLabel("Email:"),c);
		c.gridy=2;
		add(new JLabel("Birthday:"),c);
		c.gridy=3;
		add(new JLabel("Gender:"),c);
		c.gridy=4;
		add(new JLabel("Height:"),c);
		
		NamePropertyComponent = new JTextField("Troll",50);
		EmailPropertyComponent = new JTextField("",50);
		DateOfBirthPropertyComponent = new JTextField("",50);
		GenderPropertyComponent = new JComboBox(Person.Gender.values());
		HeightPropertyComponent = new JSlider(0,250,170);
		HeightPropertyComponent.setMajorTickSpacing(50);
		HeightPropertyComponent.setMinorTickSpacing(10);
		HeightPropertyComponent.setPaintTicks(true);
		HeightPropertyComponent.setPaintLabels(true);
		
		c.gridx=1;
		c.gridy=0;
		c.weightx=0.8;
		c.fill = GridBagConstraints.HORIZONTAL;
		add(NamePropertyComponent,c);
		c.gridy=1;
		add(EmailPropertyComponent,c);
		c.gridy=2;
		add(DateOfBirthPropertyComponent,c);
		c.gridy=3;
		add(GenderPropertyComponent,c);
		c.gridy=4;
		add(HeightPropertyComponent,c);
		
		
		
		
		
		
		
		
		
		
	}
}
