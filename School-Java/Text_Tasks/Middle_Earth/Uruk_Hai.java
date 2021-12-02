public class Uruk_Hai{
	//private int money;
	private String weapon;
	private int pos_x;
	private int pos_y;
	private double health;
	private boolean alive;
	private double dmgg;
	private boolean attack_strength;
	private String name;
	
	public Uruk_Hai(){ 
		//money = 0;
		weapon = "Dagger";
		pos_x = 0;
		pos_y = 0;
		health = 10;
		dmgg = 1;
		alive = true;
		name = "Uruk Hai"; //Makes creating new classes a tad bit easier
	}
	//public void takeMoney(int x){
	//	money= money+x;
	//}
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
	public void suffer(double x){
		health = health-x;
		System.out.print("\n\n The "+name+" takes "+x+" damage."); 
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