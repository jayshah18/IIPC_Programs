package LEC03;

abstract class Animal{
	String name;
	int age;
	abstract void makeSound();
}
class Dog extends Animal{
	void makeSound()
	{
		System.out.println("Bhaoo bhaoo");
	}
}
class Cat extends Animal{
	void makeSound()
	{
		System.out.println("Meoww");
	}
}
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1 = new Dog();
		Cat c1 = new Cat();
		d1.makeSound();
		c1.makeSound();
	}

}
