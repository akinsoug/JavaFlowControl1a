package javaclassesobjects1;
/**
 * pet.java Create a Pet Class with the following instance variables: 
 * name (PRIVATE) age (PRIVATE) location (PRIVATE) type (PRIVATE) two constructors empty all attributes 
 * 
 * Code to be able to access the following (Get Methods): name age type 
 * Code to be able to change (Set Methods):		   		  name age location 
 * 
 * Submit a link to your GitHub repository
 *
 */
public class Pet {
	
	private String name = "";
	private int age = -1;
	private String location = "";
	private String type = "";
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getType() {
		return type;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	public void setType(String type) {
		this.type = type;
	}
	

}
