public class Human extends Dummy{
	private String name;
	public Human(String newname, double atks, String wpn, int x, int y, double hlth, int mny){
		super(newname, atks, wpn, x, y, hlth, mny);
		name = newname;
	}
	public void spell(String splnm){
		System.out.print("\n\n "+name+" used the following spell: "+splnm);
	}
	public void showStats(){
		System.out.print(" They're a human.");
	}
}