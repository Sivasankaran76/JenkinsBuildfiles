package com.maven.MavenDemo;

public class Employee {
private String emp_Name;
private String emp_City;
private int emp_Id;
public void print_Emp_Name() {
	System.out.println("The City is"+emp_Name);
}
public void setEmp_Name(String emp_Name) {
	this.emp_Name = emp_Name;
}
public void print_City() {
	System.out.println("The City is"+emp_City);
}
public void setEmp_City(String emp_City) {
	this.emp_City = emp_City;
}
public void print_Emp_Id() {
	System.out.println("The City is"+emp_Id);
}
public void setEmp_Id(int emp_Id) {
	this.emp_Id = emp_Id;
}

}
