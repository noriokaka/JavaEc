package model;

import java.io.Serializable;

public class Todo implements Serializable{
	private int id;
	private String title;
	private int importance;
	public Todo() {}
	public Todo(String title,int importance) {
		this.title=title;
		this.importance=importance;
	}

}
