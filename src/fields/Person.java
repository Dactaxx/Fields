package fields;

public class Person {
	private String name;
	private double color, introvert, outdoors;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Person(String name, double color, double introvert, double outdoors) {
		super();
		this.name = name;
		this.color = color;
		this.introvert = introvert;
		this.outdoors = outdoors;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getColor() {
		return color;
	}


	public void setColor(double color) {
		this.color = color;
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
