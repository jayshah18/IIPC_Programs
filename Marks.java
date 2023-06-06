import java.util.*;
public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		int marks1 = obj.nextInt();
		int marks2 = obj.nextInt();
		int marks3 = obj.nextInt();
		int add = (marks1+marks2+marks3);
		int avg = add/3;
		if(avg>90 && avg<=100) {
			System.out.println("Grade A");
		}
		else if(avg>80 && avg<=90) {
			System.out.println("Grade B");
		}
		else if(avg>70 && avg<=80) {
			System.out.println("Grade C");
		}
		else {
			System.out.println("Grade D");
		}
		
	}

}
