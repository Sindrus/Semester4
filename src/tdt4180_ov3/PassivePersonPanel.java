package tdt4180_ov3;

import java.awt.GridBagConstraints;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JTextField;

public class PassivePersonPanel extends PersonPanel implements PropertyChangeListener{
	private JTextField genderText, heightText;
	
	public PassivePersonPanel(){
		super();
		
		NamePropertyComponent.setEditable(false);
		EmailPropertyComponent.setEditable(false);
		DateOfBirthPropertyComponent.setEditable(false);
		remove(GenderPropertyComponent);
		remove(HeightPropertyComponent);
		
		GridBagConstraints left = new GridBagConstraints();
		
		left.weightx=0.2;
		left.weighty=1.0;
		left.gridx=1;
		left.gridy=3;
		
		genderText = new JTextField("",50);
		genderText.addPropertyChangeListener(this);
		genderText.setEditable(false);
		add(genderText, left);
		
		left.gridy=4;
		heightText = new JTextField("",50);
		heightText.addPropertyChangeListener(this);
		heightText.setEditable(false);
		add(heightText, left);
	}
	
	@Override
	public void setModel(Person person){
		super.setModel(person);
		if(model.getGender()!=null)
			genderText.setText(model.getGender().toString());
		heightText.setText(Integer.toString(model.getHeight()));
	}
	
	public void propertyChange(PropertyChangeEvent evt){
		if(evt.getPropertyName() == Person.GENDER_PROPERTY){
			if (model.getGender()!=null)
				genderText.setText(model.getGender().toString());
		}
		else if(evt.getPropertyName() == Person.HEIGHT_PROPERTY)
			heightText.setText(Integer.toString(model.getHeight()));
		else
			super.propertyChange(evt);
		
	}
}