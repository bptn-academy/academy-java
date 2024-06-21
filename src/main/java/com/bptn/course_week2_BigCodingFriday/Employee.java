package com.bptn.course_week2_BigCodingFriday;

class Employee {
	   // Instance variable to store salary
	   private double salary; 
	   // Instance variable to store hours per day worked by employee
	   private double hoursPerDay;
	   // Constructor to set instance variables(salary and hoursPerDay) value 
	   
	   public Employee() {
		   
	   }
	   public Employee(double salary, double hoursPerDay){
	       setSalary(salary);
	       setHoursPerDay( hoursPerDay);

	   }
	   // Set method to update salary
	   public void setSalary(double salary){
	       this.salary = salary;
	       if(salary < 500){
	         this.salary = salary + 10;
	       } else {
	           this.salary = salary;
	       }
	   }
	   // Set method to update hoursPerDay
	    public void setHoursPerDay(double hoursPerDay){
	       this.hoursPerDay = hoursPerDay;
	       if( hoursPerDay > 6){
	          this.salary = salary + 5;
	       } else {
	           this.salary = salary;
	      }
	   }  
	   // Get method to return salary

	   public double getSalary(){
	       return salary;
	   }
	   
	}