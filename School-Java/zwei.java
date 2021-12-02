import java.awt.*;
import javax.swing.*; 

public class zwei extends JFrame{

    void a1(){
        System.out.print("\f");
        for(int i=1;i<5;i=i+1){ //Grid
            for(int j=1;j<5;j=j+1){
                System.out.print(i*j);
                System.out.print(" ");
            }
            System.out.print("\n");
        }

        System.out.print("\n"); //Break between individual tasks
        System.out.print("\n");

        System.out.print("Hello world."); //Greetings, you wet lump of rock

        System.out.print("\n");
        System.out.print("\n");

        String i = "Hello "; //Same thing as above but complicated
        String j = "World!";
        System.out.print(i+j);

        System.out.print("\n");
        System.out.print("\n");

        for(int m=10;m>0;m=m-1){ //Counting from ten backwards
            System.out.print(m);
            System.out.print(" ");
        }

        System.out.print("\n");
        System.out.print("\n");

        System.out.println("0 is a painfull number."); //Pls
        for(int w=1;w<51;w=w+1){ //Same thing as above but in individual lines 
            if( w/2 == (w/2.) ){ //and differentiating between odd and even numbers (and to 50) (and forwards)
                System.out.println(w+ " is an even number.");
            }
            if( w/2 != (w/2.) ){
                System.out.println(w+ " is an odd number.");  //The upper outputs get swallowed
            }                                                 //I mayhaps have to put some tasks in their respective windows
        }
        
        System.out.print("\n");
        System.out.print("\n");

        int k = 3;
        int k2 = 0; //I couldn't do this without a second variable. Juniors will shit on me for doing so,
        for(int toa=1;toa<11;toa=toa+1){  // but deep below we all know, seniors do it the same way
            k2 = k2 + k;
            System.out.print(k2+" ");
        }
        
        System.out.print("\n");
        System.out.print("\n");
        
        for(int tos=1;tos<101;tos=tos+1){
            if(tos/10==(tos/10.)){
                System.out.println(tos);
            }
            if(tos/10!=(tos/10.)){
                System.out.print(tos+" ");
            }
        }
        
        System.out.print("\n");
        System.out.print("\n");
        
        System.out.print("Das Programm spuckt 300 Sterne auß.");
        System.out.println("\n***************\nusw");//I've got no idea what the last task was trying to tell me...

	    System.out.print("\n");
        System.out.print("\n");
		
		System.out.print("End  of programm");
		
        System.out.print("\n");
	
	
	}  

    void a2(){
    } //Don't ask me WHY I put this here, but since I DID put it here it MUST be important for some reason
      //I haven't got my coffee today, so I barely know what I'm doing or what I am supposed to be doing rn
    public static void main(String[] args){ 
        zwei h = new zwei();

        h.setSize(600,600);
        h.setResizable(true);
        h.setTitle("eins"); //Creative, I know
        h.setVisible(true);
        h.a1();
        h.a2();
		
		System.exit(0); //Kills the programm
    }
}
////////////////////////////////////////////////////////
//  This code has been provided by The Boring Edward  //
////////////////////////////////////////////////////////