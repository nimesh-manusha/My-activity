public class CalculatorII{
	
	public static void main(String args[]){
		int num1 = 5;
		int num2 = 3;

		CalculatorII cal = new CalculatorII();

		System.out.println("Addition= " +cal.addition(num1,num2));
		System.out.println("Substraction= " +cal.substraction(num1,num2));
		System.out.println("Multiplication= " +cal.multiplication(num1,num2));
		System.out.println("Division= " +cal.division(num1,num2));
	}

	public int addition(int num1, int num2){
		return num1+num2;
	}

	public int substraction(int num1, int num2){
		return num1-num2;
	}

	public int multiplication(int num1, int num2){
		return num1*num2;
	}

	public float division(int num1, int num2){
		return num1/num2;
	}
}