package com.fom;

import org.apache.struts.action.ActionForm;

public class Registrationfrom extends ActionForm {
	
		public String Emp_name;
		public int Emp_No;
		public String Address;
		public String Department;
		public int Salary;
		public int Experience;
		public String Experties;
		public String getEmp_name() {
			return Emp_name;
		}
		public void setEmp_name(String emp_name) {
			Emp_name = emp_name;
		}
		public int getEmp_No() {
			return Emp_No;
		}
		public void setEmp_No(int emp_No) {
			Emp_No = emp_No;
		}
		public String getAddress() {
			return Address;
		}
		public void setAddress(String address) {
			Address = address;
		}
		public String getDepartment() {
			return Department;
		}
		public void setDepartment(String department) {
			Department = department;
		}
		public int getSalary() {
			return Salary;
		}
		public void setSalary(int salary) {
			Salary = salary;
		}
		public int getExperience() {
			return Experience;
		}
		public void setExperience(int experience) {
			Experience = experience;
		}
		public String getExperties() {
			return Experties;
		}
		public void setExperties(String experties) {
			Experties = experties;
		}
	
	
	
}
