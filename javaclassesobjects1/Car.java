package javaclassesobjects1;
/**
 * \.java Create a Custom Class (anything you want - car, phone, holiday, etc.). 
 * 
 * Requirements: Minimum 3 private instance variables An empty constructor 
 * 
 * A constructor that uses only 2 of your 3 variables 
 * A constructor that uses all 3 of your 
 * instance variables Get methods for all 3 of your instance variables Set methods for all 3 of your instance variables 
 * 
 * A method that returns a Boolean 
 * A method that returns a String For example, 
 * if I created a Santa Custom Class, my code would look something like the attached Santa.java file. 
 *
 */
public class Car {

	private String type = "";
	private String Color;
	private int NumberOfDoors;
 
	
	
	
    public Car() {
    	
	}

	public Car(String color, int numberOfDoors) {
		Color = color;
		NumberOfDoors = numberOfDoors;
	}

	public Car(String type, String color, int numberOfDoors) {
		this.type = type;
		Color = color;
		NumberOfDoors = numberOfDoors;
	}

	//-----------------------------------------
	public Boolean doesCarHasColor()
    {
        return this.Color.length() > 0 ? true : false;
    }
 
    public String whatIsTheColor()
    {
        return this.Color.length() > 0 ? "No Color" : this.Color;
    }
 
    //----------------------------------------------------------

	public String getType() {
		return type;
	}

	public String getColor() {
		return Color;
	}

	public int getNumberOfDoors() {
		return NumberOfDoors;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setColor(String color) {
		Color = color;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		NumberOfDoors = numberOfDoors;
	}
    
    
    
}