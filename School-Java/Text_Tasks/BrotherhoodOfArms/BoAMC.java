public class BoAMC{
	
	private Scout greg;
	private Scout scunt;
	
	public void play(){
		
		greg = new Scout("Greg", 17);
		scunt = new Scout("Scunt", 17);
		
		greg.test(2);
		greg.scoot();
		greg.showStats();
		
	}
	public static void main(String [] args){
		BoAMC me = new BoAMC();
		me.play();
		System.out.print("\n\n --This code has been provided by TheBoringEdward with the great help of a fellow-- \n\n");
	}
}