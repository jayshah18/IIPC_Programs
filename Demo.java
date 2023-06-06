package LEC03;

class Player{
	String name;
	int id;
	static int cnt=0;
	Player(String n){
		name=n;
		id= ++cnt;
	}
	int to_return()
	{
		return cnt;
	}
}


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player p1 = new Player("Jaxcy");
		Player p2 = new Player("Zaxcy");
		System.out.println(p1.to_return());
		System.out.println(p2.to_return());
	}

}
