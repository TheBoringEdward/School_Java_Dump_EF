import java.awt.*;
import javax.swing.*; 

public class eins extends JFrame{

    void a1(){
        for(int i=1;i<5;i=i+1){
            for(int j=1;j<5;j=j+1){
                System.out.print(i*j);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }  

    public static void main(String[] args){ 
        eins h = new eins();

        h.setSize(600,600);
        h.setResizable(true);
        h.setTitle("eins"); //Creative, I know
        h.setVisible(true);
        h.a1();
    }
}