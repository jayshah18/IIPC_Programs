package LEC03;


class ExampleClass {
    void fun() {
    	System.out.println("Example Class");
    }
}

class ExampleClass2 extends ExampleClass{
	void fun() {
		System.out.println("Example Class2");
	}
}

public class Test {
    public static void main(String[] args) {
        ExampleClass e = new ExampleClass();
        e.fun();
        ExampleClass e2 = new ExampleClass2();
        e2.fun();
    }
}