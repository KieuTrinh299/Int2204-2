package chap03.oop;

public class student {
	private String name="Student";
	private String id="000";
	private String group="K62 C-C";
	private String email="uet@vnu.edu.vn";
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getGroup() {
		return this.group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void getInfo() {
		System.out.println("Student INFO :");
		System.out.println("- Name\t\t: "+this.name);
		System.out.println("- Id\t\t: "+this.id);
		System.out.println("- Group \t: "+this.group);
		System.out.println("- Email \t: "+this.email);
	}
	
}

