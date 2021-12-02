public class Dummy{
	//private int money;
	private String weapon;
	private int pos_x;
	private int pos_y;
	private double health;
	private boolean alive;
	private double dmgg;
	private double attack_strength;
	private String name;
	
	public Dummy(double attack_strength){
		this.attack_strength = attack_strength;
	}
	public Dummy(String newname){ //Jonas is godsend 
		//money = 0;
		attack_strength = 2;
		weapon = "Club";
		pos_x = 0;
		pos_y = 0;
		health = 20;
		dmgg = 1;
		alive = true;
		name = newname; //"Dummy"; //Makes creating new classes a tad bit easier
		
	}
	//public void takeMoney(int x){
	//	money= money+x;
	//}
	public double get_attack_strength(){
		return attack_strength;
	}
	public double set_attack_strength(double ass){
		attack_strength = ass;
		return attack_strength;
	}
	public void takeWeapon(String s){
		weapon = s;
		System.out.print("\n\n The "+name+" collects: "+s);
	}
	public void move(int x,  int y){
		pos_x =  pos_x+x;
		pos_y = pos_y+y;
	}
	public void recover(double x){
		health = health+x;
		if(health>10.){health=10.;}
	}
	public void suffer(double x, String oppon){
		health = health-x;
		System.out.print("\n\n The "+name+" takes "+x+" damage from "+oppon+"."); 
		if(health<=0.){alive = false;}
	}
	//public void showMoney(){
	//	System.out.print("\n\n I have "+money+" coins.");
	//}
	public void showPosition(){
		System.out.print("\n\n The "+name+" is at ("+pos_x+","+pos_y+") .");
	}
	public void showWeapon(){
		System.out.print("\n\n Beware! The "+name+" has a "+weapon+"!");
	}
	public void showHealth(){
		System.out.print("\n\n The "+name+"'s health is at ("+health+").");
	}
		public void say(String wrd){
		System.out.print("\n\n The "+name+" says: "+wrd);
	}
	//public boolean hasMoney(){
	//	if (money>0){return true;}
	//	else{return false;}
	//}
}
/////////////////////////////////////////////////////////////////////////////////////
//  This code has been provided by teach and has been modified by TheBoringEdward  // 
/////////////////////////////////////////////////////////////////////////////////////