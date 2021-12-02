import java.awt.*;
import javax.swing.*; 

PImage img;
void setup(){
    size(768,960);
    shd=loadImg("falsehood_f.png");

}

void draw(){
    background(0);
    image(shd,0,0);
    System.exit(0); //Kills the programm
}
////////////////////////////////////////////////////////
//  This code has been provided by The Boring Edward  //
////////////////////////////////////////////////////////
