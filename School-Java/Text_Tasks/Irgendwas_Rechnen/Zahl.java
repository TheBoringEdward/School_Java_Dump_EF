public class Zahl{
	
	protected double n;
	protected String name;
	
	public Zahl(String nam, double num){
		
		name = nam;
		n = num;
		
	}
	
	public double get_n(){
		return n;
	}
	
	public double set_n(int ass){ // We dont speak about this one
		n = ass;
		return n;
		//System.out.print("\n\n Value of "+name+" is now "+n);		//I'm dumb
	}
	
	public void show(){
		System.out.print("\n\n Value of "+name+" is at: "+n);
		//System.out.print("\n\n Value of "+name+" is at: "+Math.sqrt(n));
	}
	
	public void rnd(){
		n = Math.round(n);
		System.out.print("\n\n Value of "+name+" now is at: "+n);
	}
	
	public void add(double a){
		System.out.print("\n\n Adding "+a+" to "+name);
		n = n + a;
		System.out.print("\n\n Value of "+name+" now is at: "+n);
	}
	
	public void sub(double s){
		System.out.print("\n\n Subtracting "+s+" from "+name);
		n = n - s;
		System.out.print("\n\n Value of "+name+" now is at: "+n);
	}
	
	public void div(double d){
		System.out.print("\n\n Dividing "+name+" into "+d);
		n = n / d;
		System.out.print("\n\n Value of "+name+" now is at: "+n);
	}
	
	public void mul(double m){
		System.out.print("\n\n Multiplying "+name+" "+m+" times.");
		n = n * m;
		System.out.print("\n\n Value of "+name+" now is at: "+n);
	}
	
	public void siz(double q){
		if(n > q){
			System.out.print("\n\n "+name+" ("+n+") is bigger than: "+q);
    	}else{
			System.out.print("\n\n "+name+" ("+n+") is smaller than: "+q);
    	}
	}
	
	public boolean gSiz(double q){
		if (n > q){return true;}		//I dont get it... What the fuck?
		else{return false;}
	}
	
	public void sqrt(){
		if(Math.round(Math.sqrt(n)) == Math.sqrt(n)){
			System.out.print("\n\n "+name+" ("+n+") is a proper square ("+Math.sqrt(n)+") ");
		}else{
			System.out.print("\n\n "+name+" ("+n+") is not a proper square ("+Math.sqrt(n)+") ");
		}
	}
	
	public boolean gSqrt(){
		if(Math.round(Math.sqrt(n)) == Math.sqrt(n)){return true;}		//WHY?!?!?
		else{return false;}
	}
	
}
