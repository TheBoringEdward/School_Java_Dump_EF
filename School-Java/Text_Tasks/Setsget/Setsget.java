public class Setsget{
	private Object obj1, obj2;
	Setsget(){
		obj1 = new Object();
		obj2 = new Object(5, -0.1, "xyz");
		System.out.print("");
		System.out.print("\n\n Properties of obj1:");
		System.out.print("\n Number = " + obj1.get_number());
		System.out.print("\n Value = " + obj1.get_value());
		System.out.print("\n Name = " + obj1.get_name());
		System.out.print("\n\n Properties of obj2:");
		System.out.print("\n Number = " + obj2.get_number());
		System.out.print("\n Value = " + obj2.get_value());
		System.out.print("\n Name = " + obj2.get_name());
		obj1.set_number(2);
		obj1.set_value(3.1416);
		obj1.set_name("pi");
		System.out.print("\n\n Properties of obj1:"); //
		System.out.print("\n Number = " + obj1.get_number());
		System.out.print("\n Value = " + obj1.get_value());
		System.out.print("\n Name = " + obj1.get_name());
	}
	public static void main(String [] args){
		Setsget h = new Setsget();
		System.out.print("\n\n This code has been provided by teach and has been modified by TheBoringEdward with help from Jonas \n\n");
	}
}
/////////////////////////////////////////////////////////////////////////////////////
//  This code has been provided by teach and has been modified by TheBoringEdward  // 
/////////////////////////////////////////////////////////////////////////////////////