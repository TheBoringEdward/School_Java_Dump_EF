public class PClass{
	
	protected String name;
	protected int hp;
	protected int atks;
	
	public PClass(String nn, int atksg){
		
		name = nn;
		atks = atksg;
		hp = 100;
		
	}
	
	public double get_atks(){
		return atks;
	}
	public double set_atks(int ass){ //This method has become completely pointless
		atks = ass;
		return atks;
	}
	
	public void test(int i){
		System.out.print("\n\n We do a little testing. "+name+" "+i+" out.");
	}
}
//Todo: Add armour points