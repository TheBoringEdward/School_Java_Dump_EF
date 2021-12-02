public class Ranger{
	private int money; //Integer for storing full numbers
	private String weapon; //Strings are for storing text within parenthesies
	private int pos_x;
	private int pos_y;
	private String spch;
	private double dmgd;
	private double dmgg;
	private double health; //An integer for broken Numbers
	private boolean alive; //Self explanatory
	//public boolean attack_strength; //Has now been replaced with damagegiven (dmgg)
	
	public Ranger(){
		spch = ""; //Kinda an unnecessary given that I can just use the parameters
		dmgd = 0; //"Damage Dealt" Recieved damage. Useless for the same reason as above. 
		dmgg = 1; //"Damage Given" Unused Var for dealing damage to enemies
		money = 0; //Amount of coins
		weapon = "Knife"; //Knive...
		pos_x = 0;
		pos_y = 0;
		health = 10;
		alive = true;
	}
	public void takeMoney(int x){ //"public void Whatever(){};" are meant for methods.
		money= money+x;			  //Methods are basically just small packets of pieces of code
	}
	public void takeWeapon(String s){
		weapon = s;
		System.out.print("\n\n The player collects: "+s);
	}
	public void say(String wrd){
		spch = wrd;
		System.out.print("\n\n The player says: "+spch);
		spch = ""; //This is completely nonesensical. Just leave me alone pls.
	}
	public void move(int x,  int y){ //The brackets are "connected" to the main method
		pos_x =  pos_x+x;			 //Here, the integers x and y get set to 10 and 20
		pos_y = pos_y+y;
	}
	public void recover(double x){
		health = health+x;
		if(health>10.){health=10.;}
	}
	public void suffer(double x){
		health = health-x;
		dmgd = dmgd + x;
		System.out.print("\n\n The player takes "+dmgd+" damage.");
		dmgd = 0;
		if(health<=0.){alive = false;}
	}
	public void showMoney(){
		System.out.print("\n\n The player has "+money+" coins.");
	}
	public void showPosition(){
		System.out.print("\n\n The player's position is at ("+pos_x+","+pos_y+") .");
	}
	public void showWeapon(){
		System.out.print("\n\n Beware! The player has a "+weapon+"!");
	}
	public void showHealth(){
		System.out.print("\n\n The player's health is at ("+health+").");
	}
	public boolean hasMoney(){  //I am not entirely sure what the purpose of this method is
		if (money>0){return true;} //I know what it does, but I don't know, why it does...
		else{return false;} //Doesn't "showMoney" kinda nullify this method?
	}
}
/////////////////////////////////////////////////////////////////////////////////////
//  This code has been provided by teach and has been modified by TheBoringEdward  // 
/////////////////////////////////////////////////////////////////////////////////////