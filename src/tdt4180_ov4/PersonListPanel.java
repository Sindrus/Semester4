package tdt4180_ov4;

import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class PersonListPanel extends JPanel implements ListSelectionListener{
	
	PersonPanel pp;
	JList personList;
	DefaultListModel defaultListModel;
	JButton newPersonButton;
	JButton deletePersonButton;
	Person p1;
	Person p2;
	Person p3;
	
	public PersonListPanel() {
		GridBagConstraints g = new GridBagConstraints(); 
		defaultListModel = new DefaultListModel();

		personList = new JList(defaultListModel);
		personList.addListSelectionListener(this);
		personList.setFixedCellWidth(200);
		personList.setSize(400, 400);
		personList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		
		personList.setName("PersonList");
		
		p1 = new Person("Per");
		defaultListModel.addElement(p1);
		p2 = new Person("Hans");
		defaultListModel.addElement(p2);
		p3 = new Person("Egil");
		defaultListModel.addElement(p3);
		
		g.gridx=0;
		g.gridy=0;
		
		this.add(personList,g);
		
		JScrollPane scroll = new JScrollPane(personList);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		add(scroll);
		
		
		newPersonButton = new JButton("Create new person");
		newPersonButton.setName("NewPersonButton");
		newPersonButton.addActionListener(new newPerson());
		
		g.gridx=1;
		this.add(newPersonButton,g);
		
		deletePersonButton = new JButton("Kill person");
		deletePersonButton.setName("DeletePersonButton");
		deletePersonButton.addActionListener(new deletePerson());
		
		g.gridx=2;
		this.add(deletePersonButton,g);
		
		pp = new PersonPanel();
		pp.setName("PersonPanel");
		
		g.gridx=1;
		g.gridy=1;
		
		this.add(pp,g);
	}
	
	class newPerson implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			defaultListModel.addElement(new Person(pp.NamePropertyComponent.getText()));
		}
	}
	class deletePerson implements ActionListener{
		public void actionPerformed(ActionEvent e){
//			personList.remove(personList.getSelectedIndex());
			defaultListModel.removeElementAt(personList.getSelectedIndex());
//			defaultListModel.removeElement(personList.getSelectedIndex());
//			defaultListModel.removeElement(getModel());
//			System.out.println("Størrelsen:"+personList.get);
		}
	}
	
	public void setModel(Person dlm){
		defaultListModel.addElement(dlm);
	}
	public Person getModel(){
		
		
		return (Person)defaultListModel.getElementAt(personList.getSelectedIndex());
	}

	public void valueChanged(ListSelectionEvent e) {

		pp.setModel((Person)defaultListModel.elementAt(personList.getSelectedIndex()));
		
//		pp.setModel(getModel());
	}
	
}
