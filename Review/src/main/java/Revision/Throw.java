package Revision;

public class Throw {
	int age = 18;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Throw obj = new Throw();
	obj.voting();
	}
	
public void voting() {
	if ( age > 18) {
		System.out.println("Eligible");
	}
	if ( age <18) {
		throw new ArithmeticException(" Not eligible");
	}
}
}

	
		

