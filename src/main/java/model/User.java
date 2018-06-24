package model;

@ModelAttribute(value = "user")
public class User{
	public String name;
	public User(String name){
		this.name = name;
	}
}
