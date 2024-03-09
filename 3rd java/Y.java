public class Y{

	public static void main(String args[]){
		
		//Accessing Instance Variable and method

		X ko = new X(); // Create a object to accsess X.java instance variable
		System.out.println(ko.oya);
		System.out.println(ko.meya);
		
		ko.cancan(); // access instance method
		
		//Accessing Static Variable
	
		System.out.println(X.eya); // access X.java static variable

		X.can(); // access static method
		
	}
}