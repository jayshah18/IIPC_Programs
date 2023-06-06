package LEC01;

public class My_acc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Acc user1 = new Acc();
		Acc user2 = new Acc("Zaid", 10000);
		
		//user1.setName("Jay");
		//user1.setBal(5000);
		System.out.println(user1);
		System.out.println(user2.getName());
		System.out.println(user2.checkBal());
		System.out.println(user1.getName());
		System.out.println(user1.checkBal());/*
		user1.withdraw(3999);
		System.out.println(user1.checkBal());
		user1.withdraw(400);
		user1.Deposite(10);
		System.out.println(user1.checkBal());
		Acc[] arr= new Acc[5];
		for(int i=0;i<5;i++) {
			arr[i] = new Acc();
			arr[i].setBal(10000);
		}
		System.out.println(arr[1].checkBal());
		arr[1].withdraw(1000);
		System.out.println(arr[1].checkBal());*/
	}

}
