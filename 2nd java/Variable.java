public class Variable {

int Y=10; //instance variable
static int Z=15; //static variable

public static void main (String args[]) {

	int x=12; //local variable
	System.out.println(x); //accessing local

	System.out.println(Z); //accessing static variable

	Methodx(); //method call

	}

public static void Methodx() {
	System.out.println(Z);
	System.out.println("Inside static mothod");
}

}