public class Cave_Troll extends Dummy{
	private String name;
	public Cave_Troll(String newname, double atks, String wpn, int x, int y, double hlth, int mny){
		super(newname, atks, wpn, x, y, hlth, mny);
		name = newname;
	}
	public void showStats(){
		System.out.print(" They're a Cave Troll.");
	}
}