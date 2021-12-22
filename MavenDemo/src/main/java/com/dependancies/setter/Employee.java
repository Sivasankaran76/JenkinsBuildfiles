package com.dependancies.setter;

public class Employee {
private String id;
private String name;
private String city;
private String age;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", age=" + age + ", getId()=" + getId()
			+ ", getName()=" + getName() + ", getCity()=" + getCity() + ", getAge()=" + getAge() + ", getClass()="
			+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}
public void setCity(String city) {
	this.city = city;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
}
