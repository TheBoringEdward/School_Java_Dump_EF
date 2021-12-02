public class Dummy{
	protected int money;
	protected String weapon;
	protected int pos_x;
	protected int pos_y;
	protected double health;
	protected boolean alive;
	protected double dmgg; //I have no clue why this variable exists. --> used to be the predecessor of "attack_strength"
	protected double attack_strength;
	protected String name;
	
	public Dummy(double attack_strength){
		this.attack_strength = attack_strength;
	}
	public Dummy(String newname, double atks, String wpn, int x, int y, double hlth, int mny){ //Jonas is godsend 

		attack_strength = atks;
		name = newname;
		weapon = wpn;
		pos_x = x;
		pos_y = y;
		health = hlth;
		dmgg = 1;
		alive = true;
		money = mny; //This may be a bit pointless
		
	}
	public void takeMoney(int x){
		money= money+x;
		System.out.print("\n\n "+name+" collects "+x+" coins.");
	}
	public double get_attack_strength(){
		return attack_strength;
	}
	public double set_attack_strength(double ass){ //This method has become completely pointless
		attack_strength = ass;
		return attack_strength;
	}
	public void takeWeapon(String s){
		weapon = s;
		System.out.print("\n\n "+name+" collects a weapon: "+s);
	}
	public void move(int x,  int y){
		pos_x =  pos_x+x;
		pos_y = pos_y+y;
	}
	
	//	I'm a bit tempted to turn this into an actual game.
	
	public void recover(double x){
		health = health+x;
		if(health>10.){health=10.;}
	}
	public void suffer(double x, String oppon){
		health = health-x;
		System.out.print("\n\n "+oppon+" does "+x+" points of damage to "+name+"."); 
		if(health<=0.){alive = false;}
	}
	public void showMoney(){
		System.out.print("\n\n "+name+" has "+money+" coins.");
	}
	public void showPosition(){
		System.out.print("\n\n "+name+" is at ("+pos_x+","+pos_y+") .");
	}
	public void showWeapon(){
		System.out.print("\n\n Beware! "+name+" has a "+weapon+"!");
	}
	public void showHealth(){
		System.out.print("\n\n "+name+"'s health is at ("+health+").");
	}
		public void say(String wrd){
		System.out.print("\n\n "+name+" says: "+wrd);
	}
	public void showStats(){
		System.out.print("\n\n The stats of "+name+" are "+attack_strength+" dmg and "+health+" hp. They carry a "+weapon+" and possess "+money+" coins.");
	}
	public boolean hasMoney(){
		if (money>0){return true;}
		else{return false;}
	}
}
/////////////////////////////////////////////////////////////////////////////////////
//  This code has been provided by teach and has been modified by TheBoringEdward  // 
/////////////////////////////////////////////////////////////////////////////////////