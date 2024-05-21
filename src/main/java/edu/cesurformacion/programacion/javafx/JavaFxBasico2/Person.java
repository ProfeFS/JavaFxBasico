package edu.cesurformacion.programacion.javafx.JavaFxBasico2;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {

	private StringProperty name = new SimpleStringProperty(this, "name", "");
	private IntegerProperty age = new SimpleIntegerProperty(this, "age", 0);

	public Person() {
		this.name = new SimpleStringProperty(this, "name", null);
		this.age = new SimpleIntegerProperty(this, "age", 0);
	}

	public String getName() {
		return name.get();
	}

	public void setName(String name) {
		this.name.set(name);
	}

	public StringProperty nameProperty() {
		return name;
	}

	public int getAge() {
		return age.get();
	}

	public void setAge(int age) {
		this.age.set(age);
	}

	public IntegerProperty ageProperty() {
		return age;
	}

}
