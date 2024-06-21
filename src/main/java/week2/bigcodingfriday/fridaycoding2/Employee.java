package week2.bigcodingfriday.fridaycoding2;

class Employee {
	   // Instance variable to store salary
	  	private int salary;
	   
	   // Instance variable to store hours per day worked by employee
	   private  int hoursPerDay;
	   
	   int [] num = {1 ,2 , 3, 4, 5, 6, 7,};

	   // Constructor to set instance variables(salary and hoursPerDay) value 
		public Employee(int salary, int hoursPerDay) {
			setSalary(salary);
			setHoursPerDay(hoursPerDay);
			//super();
			//this.salary = salary;
			//this.hoursPerDay = hoursPerDay;
		}

	   // Set method to update salary
		public void setSalary(int salary) {
			if (salary < 500) {   //if block to check if salary is lower than 500 
				this.salary = salary+10;  /// add 10 if lower than 500 
			}else {
				this.salary = salary;	/// return same salary if more than 500
			}
		}
	   
	   // Set method to update hoursPerDay
		public void setHoursPerDay(int hoursPerDay) {
			this.hoursPerDay = hoursPerDay;
			if (hoursPerDay > 6) {  /// if condition to add 5 to salary when employee works over 6 hrs per day
				this.salary += 5;  
			}
		}

	   // Get method to return salary
		public int getSalary() {
			return salary;
		}
	   
}
