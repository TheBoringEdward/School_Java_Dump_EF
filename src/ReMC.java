import static java.lang.Math.*;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ReMC{

    private int a;
    Scanner scn2 = new Scanner(System.in);

    public void play(){

        final Zahl z1 = new Zahl("z1", 4);
        final Zahl z2 = new Zahl("z2", 4);
        final Zahl z3 = new Zahl("z3", 2.5);    //Thanks

        final Bruch b1 = new Bruch("b1", 2, 5);

        boolean rn = true;

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

        System.out.print("\n\n Debugging");

        z1.show();
        z1.add(2);
        z1.sub(1);
        z1.div(2);
        z1.mul(2);
        z2.show();
        z2.siz(8);
        z1.add(z2.get_n());
        z1.siz(7);
        z1.gSiz(7); //Why? Just why?
        z3.show();
        z3.rnd();
        z1.add(1);
        z2.sqrt();
        z1.sqrt();
        z2.rnd();
        z1.prim();
        z1.set(17);
        z1.prim();
        z1.set(127);
        z1.prim();
        z1.set(511);
        z1.prim();
        z1.set(2);
        /*
        z1.qAdd();
        z1.qSub();
        z1.qMul();
        z1.qSiz();
        z1.qDiv();
        */

        b1.show();
        b1.sDec();

        System.out.print("\n\n Debugging End"); //I'm a genius /s

        while(rn) {
            System.out.print("\n\n Commands at your disposal: \n 0: Quit\n 1: Set\n 2: Add\n 3: Subtract\n 4: Multiply\n 5: Divide\n 6: Round\n 7: Check for quadrant\n 8: Check for prime\n 9: Compare size");
            System.out.print("\n\n Please enter what you wish to do with z1 ("+ z1.get_n()+"):\n");
            a = scn2.nextInt();     //I'd do unspeakable things to z1

            switch(a){
                case 0: System.out.print("\n Quitting...");
                    rn = false;
                    break;
                case 1: z1.qSet();
                        break;
                case 2: z1.qAdd();
                        break;
                case 3: z1.qSub();
                        break;
                case 4: z1.qMul();
                        break;
                case 5: z1.qDiv();
                        break;
                case 6: z1.rnd();
                        break;
                case 7: z1.sqrt();
                        break;
                case 8: z1.prim();
                        break;
                case 9: z1.qSiz();
                        break;
                            //I owe Jonas so bloody much
                default:
                    System.out.print("\n " + a + " is not a valid command");
                    break;
            }

            /*
            if (a == 0) {
                System.out.print("\n Quitting...");
                rn = false;
            }else if(a == 1){       //If only such things as lists exist...
                z1.qSet();
            }else if(a == 2){
                z1.qAdd();
            }else if(a == 3){
                z1.qSub();
            }else if(a == 4){
                z1.qMul();
            }else if(a == 5){        //I deserve to burn in hell for this...
                z1.qDiv();
            }else if(a == 6){
                z1.rnd();
            }else if(a == 7){
                z1.sqrt();
            }else if(a == 8){
                z1.prim();
            }else if(a == 9){
                z1.qSiz();
            }else{
                System.out.print("\n " + a + " is not a valid command");//Using anything but integers as
            }
                                                                   //input crashes the entire program
             */
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
//TODO: add Bruch.java (Sth like Bruch b1 = new Bruch ("b1", 1, 2); for a half)

//      This code has been provided by TheBoringEdward with the help of a great fellow
//      This code is under the license of the Unlicense
//      Cheers