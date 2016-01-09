package fields;

public abstract class Person {
	private String name;
	private double color, introvert, outdoors;
	
	public double getColor() {
		return color;
	
	}
	
	public void setColor(double color) {
		this.color = color;
	
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	
	}
	
	public double getIntrovert() {
		return introvert;
	
	}
	
	public void setIntrovert(double introvert) {
		this.introvert = introvert;
	
	}
	
	
	public double getOutdoors() {
		return outdoors;
	
	}
	
	public void setOutdoors(double outdoors) {
		this.outdoors = outdoors;
	
	}
	
}
