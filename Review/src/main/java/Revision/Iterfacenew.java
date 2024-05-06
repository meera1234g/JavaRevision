package Revision;

public class Iterfacenew implements InterfaceSample, Interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface2	 obj = new  Iterfacenew ();
		//obj.display();
		//obj.hi();
		obj.hello();
	}    

	@Override
	public void hi() {
		System.out.println("Hi");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("display");
		
	}

	@Override
	public void hello() {
		// TODO Auto-generated method stub
System.out.println("hello");
		
	}
	}

