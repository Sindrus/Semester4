package tdt4180_ov4;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;



public class Person {
	public final static String NAME_PROPERTY = "name";
	public final static String EMAIL_PROPERTY = "email";
	public final static String DOB_PROPERTY = "dob";
	public final static String GENDER_PROPERTY = "gender";
	public final static String HEIGHT_PROPERTY = "height";
	
	
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
		this.dateOfBirth="";
		this.email="";
		this.gender=null;
		this.height=0;
		psc = new PropertyChangeSupport(this);
	}
	
	public String toString(){
		return name;
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
		psc.firePropertyChange(NAME_PROPERTY, oldValue, name);
	}
	
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		String oldValue = this.dateOfBirth;
		this.dateOfBirth = dateOfBirth;
		psc.firePropertyChange(DOB_PROPERTY, oldValue, dateOfBirth);
	}
	
	public String getGenderString(){
		return gender.toString();
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		Gender oldValue = this.gender;
		this.gender = gender;
		psc.firePropertyChange(GENDER_PROPERTY, oldValue, gender);
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		String oldValue = this.email;
		this.email = email;
		psc.firePropertyChange(EMAIL_PROPERTY, oldValue, email);
	}
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		int oldValue = this.height;
		this.height = height;
		psc.firePropertyChange(HEIGHT_PROPERTY, oldValue, height);
	}
}
