package tdt4180_ov2;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;



public class Person {
	
	public enum Gender{
		male, female
	}
	
	private PropertyChangeSupport psc;
	
	private String name;
	private String dateOfBirth;
	private Gender gender;
	private String email;
	private int height;
	
	public Person(String name){
		this.name = name;
		psc = new PropertyChangeSupport(this);
	}
	
	public void addPropertyChangeListener(PropertyChangeListener listener){
		psc.addPropertyChangeListener(listener);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		String oldValue = this.name;
		this.name = name;
		psc.firePropertyChange(this.name, oldValue, name);
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	 
}
