/* Create num1 and num2 local variables inside the class Calculator. num1's value is 5 and num2's value is 3. There are four instance methods inside the class calculator. Those are addition, subtraction, multiplication, and division.

Do specific arithmetic operations inside relevant methods using num1 and num2. */

public class Calculator{

	public Calculator(){
		System.out.println("Inside constructor");
	}

	public static void main(String args[]){

		int num1=5;
		int num2=3;
		
		Calculator x = new Calculator(); // Create a object
		x.addition(num1,num2); // asign to object
		x.subtraction(num1,num2);
		x.multiplication(num1,num2);
		x.division(num1,num2);
	}
	
	public void addition(int x,int y){
		System.out.println("Addition: " + (x+y));
	}
	
	public void subtraction(int x,int y){
		System.out.println("Subtraction: " + (x-y));
	}

	public void multiplication(int x,int y){
		System.out.println("Multiplication: " + (x*y));
	}

	public void division(int x,int y){
		System.out.println("Division: " + (x/y));
	}

}