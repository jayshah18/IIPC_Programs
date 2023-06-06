package LEC01;

public class emp {
	private int year_join;
	private String name;
	private String Add;
	
	public emp(String n,int y,String A) {
		Add=A;
		year_join = y;
		name=n;
	}
	public void Display() {
		System.out.print(name+" "+year_join+" "+Add);
		System.out.println();
	}
}
