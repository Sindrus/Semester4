package tdt4180_ov4;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.*;
import javax.swing.event.*;

import tdt4180_ov4.Person;
import tdt4180_ov4.Person.Gender;

public class PersonPanel extends JPanel implements PropertyChangeListener{
	
	JTextField NamePropertyComponent;
	JTextField EmailPropertyComponent;
	JTextField DateOfBirthPropertyComponent;
	JComboBox<Gender> GenderPropertyComponent;
	JSlider HeightPropertyComponent;
	Person model;
	
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
		NamePropertyComponent.getDocument().addDocumentListener(new nameAction());
		
		EmailPropertyComponent = new JTextField("",50);
		EmailPropertyComponent.setName("EmailPropertyComponent");
		EmailPropertyComponent.getDocument().addDocumentListener(new emailAction());
		
		DateOfBirthPropertyComponent = new JTextField("",50);
		DateOfBirthPropertyComponent.setName("DateOfBirthPropertyComponent");
		DateOfBirthPropertyComponent.getDocument().addDocumentListener(new dobAction());
		
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
	
	abstract private class DocList implements DocumentListener{
		public void changedUpdate(DocumentEvent evt) {	update(evt);	}
		public void insertUpdate(DocumentEvent evt) {	update(evt);	}
		public void removeUpdate(DocumentEvent evt) {	update(evt);	}
		
		public void update(DocumentEvent documentEvent){
			java.awt.EventQueue.invokeLater(new Runnable() {
				public void run() {
					doUpdate();
				}
			});
		}
		abstract public void doUpdate();
		
	}
	
	class nameAction extends DocList{
		public void doUpdate() {
			if (model != null)
				model.setName(NamePropertyComponent.getText());
		}
	}
	
	class emailAction extends DocList{
		public void doUpdate() {
			if (model != null)
				model.setEmail(EmailPropertyComponent.getText());
		}
	}
	
	class dobAction extends DocList{
		public void doUpdate() {
			if (model != null)
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
		model.addPropertyChangeListener(this);
		NamePropertyComponent.setText(person.getName());
		EmailPropertyComponent.setText(person.getEmail());
		DateOfBirthPropertyComponent.setText(person.getDateOfBirth());
		GenderPropertyComponent.setSelectedItem(person.getGender());
		HeightPropertyComponent.setValue(person.getHeight());
	}
	public Person getModel(){
		return model;
	}
	
	public void propertyChange(PropertyChangeEvent evt){
		if(evt.getPropertyName() == Person.NAME_PROPERTY)
			NamePropertyComponent.setText(model.getName());
		else if(evt.getPropertyName() == Person.EMAIL_PROPERTY)
			EmailPropertyComponent.setText(model.getEmail());
		else if(evt.getPropertyName() == Person.DOB_PROPERTY)
			DateOfBirthPropertyComponent.setText(model.getDateOfBirth());
		else if(evt.getPropertyName() == Person.GENDER_PROPERTY)
			GenderPropertyComponent.setSelectedItem(model.getGender());
		else if(evt.getPropertyName() == Person.HEIGHT_PROPERTY)
			HeightPropertyComponent.setValue(model.getHeight());
	}
}
