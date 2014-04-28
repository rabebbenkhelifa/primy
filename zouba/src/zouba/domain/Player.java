package zouba.domain;

import java.io.Serializable;
import java.util.Date;

public class Player implements Serializable {
	private int id;
	private String name;
	private String login;
	private Integer age;

	
	public Player() {
		// TODO Auto-generated constructor stub
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


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	
	
	
}
