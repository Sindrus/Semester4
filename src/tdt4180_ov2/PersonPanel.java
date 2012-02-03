package tdt4180_ov2;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import tdt4180_ov2.Person.Gender;

public class PersonPanel extends JPanel{
	
	JTextField NamePropertyComponent;
	JTextField EmailPropertyComponent;
	JTextField DateOfBirthPropertyComponent;
	JComboBox<Gender> GenderPropertyComponent;
	JSlider HeightPropertyComponent;
	private Person model;
	
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
		
		NamePropertyComponent = new JTextField("",50);
		NamePropertyComponent.setName("NamePropertyComponent");
		NamePropertyComponent.addActionListener(new nameAction());
		
		EmailPropertyComponent = new JTextField("",50);
		EmailPropertyComponent.setName("EmailPropertyComponent");
		EmailPropertyComponent.addActionListener(new emailAction());
		
		DateOfBirthPropertyComponent = new JTextField("",50);
		DateOfBirthPropertyComponent.setName("DateOfBirthPropertyComponent");
		DateOfBirthPropertyComponent.addActionListener(new dobAction());
		
		GenderPropertyComponent = new JComboBox<Gender>(Person.Gender.values());
		GenderPropertyComponent.setName("GenderPropertyComponent");
		GenderPropertyComponent.addActionListener(new genderAction());
		
		HeightPropertyComponent = new JSlider(0,250,170);
		HeightPropertyComponent.setName("HeightPropertyComponent");
		HeightPropertyComponent.setMajorTickSpacing(50);
		HeightPropertyComponent.setMinorTickSpacing(10);
		HeightPropertyComponent.setPaintTicks(true);
		HeightPropertyComponent.setPaintLabels(true);
		HeightPropertyComponent.addChangeListener(new heightAction());
		
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
	class nameAction implements ActionListener{
		public void actionPerformed(ActionEvent e){
			model.setName(NamePropertyComponent.getText());
		}
	}
	class emailAction implements ActionListener{
		public void actionPerformed(ActionEvent e){
			model.setEmail(EmailPropertyComponent.getText());
		}
	}
	class dobAction implements ActionListener{
		public void actionPerformed(ActionEvent e){
			model.setDateOfBirth(DateOfBirthPropertyComponent.getText());
		}
	}
	class genderAction implements ActionListener{
		public void actionPerformed(ActionEvent e){
			model.setGender((Gender)GenderPropertyComponent.getSelectedItem());
		}
	}
	class heightAction implements ChangeListener{
		public void stateChanged(ChangeEvent e) {
			model.setHeight(HeightPropertyComponent.getValue());
		}
	}
	
	public void setModel(Person person){
		model = person;
		model.setName(person.getName());
		NamePropertyComponent.setText(person.getName());
		
		model.setEmail(person.getEmail());
		EmailPropertyComponent.setText(person.getEmail());
		
		model.setDateOfBirth(person.getDateOfBirth());
		DateOfBirthPropertyComponent.setText(person.getDateOfBirth());
		
		model.setGender(person.getGender());
		GenderPropertyComponent.setSelectedItem(person.getGender());
		
		model.setHeight(person.getHeight());
		HeightPropertyComponent.setValue(person.getHeight());
		
	}
}
