import java.util.*;
public class Large {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		int num1 = myObj.nextInt();
		int num2 = myObj.nextInt();
		int ans = (num1>num2)?num1:num2;
		System.out.println("Bigger Number IS: "+ans);
	}

}
