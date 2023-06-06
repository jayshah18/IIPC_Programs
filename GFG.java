package LEC03;

//Java Program to Illustrate Static Access Modifier
/*
 Static access modifier is an access modifier that is applicable for methods and variables but not for classes.
 it can be reinitialized.
 */

//Main class
class GFG {

	// Creating a static variable and
	// initializing a custom value
	static int x = 10;

	// Creating a instance variable and
	// initializing a custom value
	int y = 20;

	// Main driver method
	public static void main(String[] args)
	{

		// Creating an object of class inside main() method
		GFG t1 = new GFG();

		// Accessing and re-initializing the
		// static and instance variable
		// using t1 reference
		t1.x = 88;
		t1.y = 99;

		// Creating an object of class inside main() method
		// again
		GFG t2 = new GFG();

		// Accessing the static and instance variable using
		// t2 reference as we know that for each object
		// there is a separate copy of instance variable
		// created. While a same copy of static variable will
		// be shared between the objects

		// Displaying the value of static and instance
		// variable using t2 object reference
		System.out.println(
			"Value of Static variable x = " + t1.x + "\n"
			+ "Value of Instance variable y = " + t1.y);
	}
}
