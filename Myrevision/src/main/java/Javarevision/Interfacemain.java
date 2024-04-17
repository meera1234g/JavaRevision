package Javarevision;

public class Interfacemain implements Interface1,Interface2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Interface1 obj = new Interfacemain();
	        obj.show();
	     
		}

		@Override
		public void hide() {
			System.out.println("Please hide");
			
		}

		@Override
		public void show() {
			// TODO Auto-generated method stub
			System.out.println("Please show");
		}

	}



