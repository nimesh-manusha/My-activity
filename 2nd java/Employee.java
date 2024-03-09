/* Create a class called Employee and define a local variable called basicSalary = 80,000. 
That specific employee has worked for 72 hours. According to the company policy, exceeding 60 hours means OT.
Per hour OT rate is 4,000. 
Create an OT calculator method and calculate the OT amount of the employee.
Show the next salary as basic salary + overtime inside the main method. */

public class Employee{

public static void main(String args[]){
	int basicSalary=80000;
		
	Employee x = new Employee();
	int OT = x.OverTimeCal();

	System.out.println("Salary = " + (basicSalary+OT));
}

public int OverTimeCal(){
	int workHours = 72;
	int perHours = 60;
	int OtRate = 4000;

	int OTAmount = (workHours-perHours)*OtRate;

	return OTAmount;
}
}