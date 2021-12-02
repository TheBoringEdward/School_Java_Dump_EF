public class Lesser_Orc{
	//private int money;
	private String weapon;
	private int pos_x;
	private int pos_y;
	private double health;
	private boolean alive;
	//private double dmgd;
	private double dmgg;
	private boolean attack_strength;
	
	public Lesser_Orc(){ //Improved on the Ranger program
		//money = 0;
		weapon = "Club";
		pos_x = 0;
		pos_y = 0;
		health = 5;
		//dmgd = 0;
		dmgg = 1;
		alive = true;
	}
	//public void takeMoney(int x){
	//	money= money+x;
	//}
	public void takeWeapon(String s){
		weapon = s;
		System.out.print("\n\n The Lesser Orc collects: "+s);
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
		health = health-x; //Fixed
		System.out.print("\n\n The Lesser Orc takes "+x+" damage."); 
		if(health<=0.){alive = false;}
	}
	//public void showMoney(){
	//	System.out.print("\n\n I have "+money+" coins.");
	//}
	public void showPosition(){
		System.out.print("\n\n The Lesser Orc is at ("+pos_x+","+pos_y+") .");
	}
	public void showWeapon(){
		System.out.print("\n\n Beware! The Lesser Orc has a "+weapon+"!");
	}
	public void showHealth(){
		System.out.print("\n\n The Lesser Orc's health is at ("+health+").");
	}
		public void say(String wrd){
		System.out.print("\n\n The Lesser Orc says: "+wrd); //Fixed it
	}
	//public boolean hasMoney(){
	//	if (money>0){return true;}
	//	else{return false;}
	//}
}
/////////////////////////////////////////////////////////////////////////////////////
//  This code has been provided by teach and has been modified by TheBoringEdward  // 
/////////////////////////////////////////////////////////////////////////////////////