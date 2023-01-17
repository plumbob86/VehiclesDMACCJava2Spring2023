package model;

/**
 * @author sylw - srglod
 * CIS175 - Spring 2023
 * Jan 16, 2023
 */


public class AlfaRomeo {
	
	private String model;
	private String year;
	private String color;
	private String bodyType;
	
	
	
	public AlfaRomeo() {
		super();
		// TODO Auto-generated constructor stub
	}


	public AlfaRomeo(String model, String year, String color, String bodyType) {
		super();
		this.model = model;
		this.year = year;
		this.color = color;
		this.bodyType = bodyType;
	}
	
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getYear() {
		return year;
	}
	
	public void setYear(String year) {
		this.year = year;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getBodyType() {
		return bodyType;
	}
	
	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "For this Alfa Romeo, we have: [model=" + model + ", year=" + year + "color=" + color + "body type=" + "bodyType";
	}
	public String makeNoise() {
		return "Vroooom Vroooom Vrooooom!";
	}
	
}
