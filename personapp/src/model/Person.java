package model;

import java.io.Serializable;

public class Person  implements Serializable{
	private int id;
	private String name;
	private String age;
	public Person() {}
	public Person(String name,String age) {
		this.name=name;
		this.age=age;
	}
	public Person(int id,String name,String age) {
		this(name,age);
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}

}
