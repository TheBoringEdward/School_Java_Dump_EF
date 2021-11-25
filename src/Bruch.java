import java.util.Scanner;

public class Bruch {
    Scanner scn = new Scanner(System.in);

    protected double z;
    protected double n;
    protected String name;
    protected double i;

    public Bruch(String nam, double zae, double nen){
        name = nam;
        z = zae;
        n = nen;
        i = 0;
    }

    public void show(){
        System.out.print("\n\n "+name+"'s value is "+z+"/"+n);
        i = z/n;
        System.out.print("\n ("+i+" as a decimal)");
    }
    public double dec(){
        //i = z/n;
        return z/n;
    }
    public void sDec(){
        System.out.print("\n\n "+name+" as a decimal is "+z/n);
    }
}
