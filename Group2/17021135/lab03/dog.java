/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectively;

/**
 *
 * @author Le Quang Vu
 */
public class dog {
    private String name ;
	private int age ;
	private String color ;
	public dog (String name, int age , String color ) {
		this.name = name ;
		this.age = age ;
		this.color = color ;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public dog () {
		this.age = 1 ;
		this.name ="Spike";
		this.color = "grey";
	}

}
