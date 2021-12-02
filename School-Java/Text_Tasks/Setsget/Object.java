public class Object{
	private int number;
	private double value;
	private String name; 
	public Object(int number, double value, String name){
		this.number = number;
		this.value = value; //this -Every Facebook Mom ever
		this.name = name; //To properly get behind what setters and getters are, I'll have to experiment with them
	}										//In other terms, I have to fuck around and find out.
	public Object(){
		number = 1;			//My best way to get aquainted with this stuff, would be to implement it into my "Game" as a fight functionality
		value = 2.5;
		name = "Max";
	}
	public int get_number(){
		return number;
	}
	public double get_value(){
		return value;
	}
	public String get_name(){
		return name;
	}
	public int set_number(int nu){
		number = nu;
		return number;
	}
	public double set_value(double va){
		value = va;
		return value;
	}
	public String set_name(String na){
		name = na;
		return name;
	}
}
/////////////////////////////////////////////////////////////////////////////////////
//  This code has been provided by teach and has been modified by TheBoringEdward  // 
/////////////////////////////////////////////////////////////////////////////////////

//       Many thanks to Jonas for helping me out on this one!!!!!!