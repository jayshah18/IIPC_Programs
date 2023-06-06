package LEC01;

public class Acc {
	private String name;
	private int bal;
	
	
	public Acc() {
		name = "HDFC_holder";
		bal = 1000;
	}
	public Acc(String n,int b) {
		name = n;
		bal = b;
	}
	
	public String getName() {
		return name;
	}
	public int checkBal() {
		return bal;
	}
	public void setBal(int new_bal) {
		bal=new_bal;
	}
	public void setName(String new_name) {
		name=new_name;
	}
	public void withdraw(int i) {
		if((bal-i)>1000) {
			bal = bal-i;
		}
		else {
			System.out.println("Not Enough Balance!!");
		}
	}
	@Override
	   public String toString() {
		   return  ("Name = "+ getName() + "Balance =" + checkBal());
	   }
	public void Deposite(int i) {
		bal+=i;
	}
}

