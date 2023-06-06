package LEC01;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("name"+" "+"year_join"+" "+"Address");
		emp e1 = new emp("Robert",1994,"64C- WallsStreat");
		emp e2 = new emp("Sam",2000,"68D- WallsStreat");
		emp e3 = new emp("John",1999," 26B- WallsStreat");
		e1.Display();
		e2.Display();
		e3.Display();
		
	}

}
