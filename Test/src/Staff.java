
public class Staff {
	
	private String name,id;
	private char gender;
	private int age;
	private float height,weight;
	public Staff(String name1,String id1){
		name = name1;
		id = id1;
	}
	public void setName(String name1){
		name = name1;
	}
	public String getName(){
		return name;
	}
	public void setID(String id1){
		id = id1;
	}
	public String getID(){
		return id;
	}
	public void setGender(char gender1){
		gender = gender1;
	}
	public char getGender(){
		return gender;
	}
	
	public void setHeight(float height1){
		height = height1;
	}
	public float getHeight(){
		return height;
	}
	public void setWeight(float weight1){
		weight = weight1;
	}
	public float getWeight(){
		return weight;
	}
	
}
