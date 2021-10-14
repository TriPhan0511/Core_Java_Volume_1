package com.triphan.variables;

public class Person 
{
	private String country = "VietNam";
	
	public String getInfo()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Hello! I come from ");
		builder.append(getCountry());
		
		return builder.toString(); 
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
