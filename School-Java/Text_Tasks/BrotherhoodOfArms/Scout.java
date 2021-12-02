public class Scout extends PClass{
	
	public Scout(String nn, int atksg){
		super(nn, atksg);
		this.hp = this.hp - 30; //70  hp
	}
	
	public void scoot(){
		System.out.print("\n\n "+name+" is out off the box.");
	}
	public void showStats(){
		System.out.print("\n\n "+name+" the Scout has "+hp+" hp. They deal "+atks+" dmg.");
	}
}