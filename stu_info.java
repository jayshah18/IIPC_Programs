package LEC01;

public class stu_info {
	private int uid;
	private String name;
	private String mobile;
		
		
	public String getName() {
		return name;
	}
	public int getuid() {
		return uid;
	}
	public String getMob() {
		return mobile;
	}
		
	public void setName(String new_name) {
		name=new_name;
	}
	public void setMob(String new_mob) {
		mobile=new_mob;
	}
		
	public void set_uid(int new_uid) {
		uid= new_uid;
	}
			
		
}