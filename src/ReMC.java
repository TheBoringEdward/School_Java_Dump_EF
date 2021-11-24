import static java.lang.Math.*;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class ReMC{

    private int a;
    Scanner scn2 = new Scanner(System.in);
    private boolean rn;

    public void play(){

        final Zahl f1 = new Zahl("f1", 4);
        final Zahl f2 = new Zahl("f2", 4);
        final Zahl f3 = new Zahl("f3", 2.5);

        rn = true;

        /*
         show: shows value of class
         get_n: returns value of class
         set: sets value of CV from given value
         add: adds given value to class value
         sub: subtracts given value of class value
         div: divides class value into given value
         mul: multiplies class value by given value
         siz: checks whether class value is smaller or bigger than given value
         gSiz: same as above, but it returns a boolean instead of String
         sqrt: checks whether class value is a square root or not
         gSqrt: same as above, but it returns a boolean
         rnd: rounds class value
         prim: checks whether CV is a prime number

         Any methods that have the prefix "q" are the same as their counterpart
            except that they make request for the value

        qAdd
        qSub
        qMul
        qDiv
        qSiz
        qSet
        */

        System.out.print("\n\n Debug");

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
        f1.prim();
        f1.set(17);
        f1.prim();
        f1.set(127);
        f1.prim();
        f1.set(511);
        f1.prim();
        f1.set(2);
        /*
        f1.qAdd();
        f1.qSub();
        f1.qMul();
        f1.qSiz();
        f1.qDiv();
        */

        System.out.print("\n\n Debug End"); //I'm a genius /s

        while(rn) {
            System.out.print("\n\n Commands at your disposal: \n 0: Quit\n 1: Set\n 2: Add\n 3: Subtract\n 4: Multiply\n 5: Divide\n 6: Round\n 7: Check for quadrant\n 8: Check for prime\n 9: Compare size");
            System.out.print("\n\n Please enter what you wish to do with f1 ("+ f1.get_n()+"):\n");
            a = scn2.nextInt();     //I'd do unspeakable things to f1
            if (a == 0) {
                System.out.print("\n Quitting...");
                rn = false;
            }else if(a == 1){       //If only such things as lists exist...
                f1.qSet();
            }else if(a == 2){
                f1.qAdd();
            }else if(a == 3){
                f1.qSub();
            }else if(a == 4){
                f1.qMul();
            }else if(a == 5){        //I deserve to burn in hell for this...
                f1.qDiv();
            }else if(a == 6){
                f1.rnd();
            }else if(a == 7){
                f1.sqrt();
            }else if(a == 8){
                f1.prim();
            }else if(a == 9){
                f1.qSiz();
            }else{
                System.out.print("\n " + a + " is not a valid command");
            }
        }

        //		I know I'll sound like the meme. Using python for advanced Mathematics would be of a great advantage.
        //      Pls correct me if I'm wrong tho
    }
    public static void main(String [] args){
        ReMC me = new ReMC();
        me.play();
        System.out.print("\n\n --This code has been provided by TheBoringEdward with the help of a great fellow-- \n\n"); //I'm being too clingy to that boi, amn't I?
    }
}