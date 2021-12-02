import static java .lang.Math.*;

public class ReMC{
	
	private Zahl f1;
	private Zahl f2;
	private Zahl f3;
	
	public void play(){
		
		f1 = new Zahl("f1", 4);
		f2 = new Zahl("f2", 4);
		f3 = new Zahl("f3", 2.5);
		
		// show: shows value of class
		// get_n: returns value of class
		// add: adds given value to class value
		// sub: subtracts given value of class value
		// div: divides class value into given value
		// mul: multiplies class value by given value
		// siz: checks whether class value is smaller or bigger than given value
		// gSiz: same as above, but it returns a boolean instead of String
		// sqrt: checks whether or not class value is a square root or not
		// gSqrt: same as above, but it returns a boolean
		// rnd: rounds class value
		
		f1.show();
		f1.add(2);
		f1.sub(1);
		f1.div(2);
		f1.mul(2);
		f2.show();
		f2.siz(8);
		f1.add(f2.get_n());
		f1.siz(7);
		f1.gSiz(7); //Why? Just why?
		f3.show();
		f3.rnd();
		f1.add(1);
		f2.sqrt();
		f1.sqrt();
		f2.rnd();
		
		
		//		I know I'll sound like the meme. Using python for advanced Mathematics would be of great advantage. 
		
	}
	public static void main(String [] args){
		ReMC me = new ReMC();
		me.play();
		System.out.print("\n\n --This code has been provided by TheBoringEdward with the help of a fellow-- \n\n"); //I'm being too clingy to that boi, amn't I?
	}
}