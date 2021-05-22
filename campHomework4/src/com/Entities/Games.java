package com.Entities;

public class Games {
	public int id;
	public String gameName;
	public double price;
	
	public Games(int id, String gameName, double price) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
