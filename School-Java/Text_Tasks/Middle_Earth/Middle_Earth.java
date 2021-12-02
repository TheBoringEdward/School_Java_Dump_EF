public class Middle_Earth{ //How do I write a programm that automatically compiles all classes automatically?
	private Ranger aragon; //Linux does make it a whole lot easier, yet it is tedious. I may have to take Jonas' offer regarding Intellij 
							
							//----------> On second inspection, it seems like whenever I compile the main function, all subclasses get compiled automatically. Another issue solved. <----------------//
	
	private Lesser_Orc gronkh; //Yeah, I did take some inspiration (My creativity may be terrible but my capability of giving names is an utter clusterfuck...)
	private Dummy dummy1;
	private Uruk_Hai ladsy;
	private Cave_Troll ulm;
	public void play(){
		gronkh = new Lesser_Orc();
		//gronkh = new Lesser_Orc("gronkh");
		//gronkh.test();
		aragon = new Ranger(); //In order to avoid having to duplicate classes, they can be given names ("aragon" and "gronkh" in this case)
		//dummy1 = new Dummy("dummy1");
		dummy1 = new Dummy("dummy1"); //Jonas is godsend
		ulm = new Cave_Troll();
		ladsy = new Uruk_Hai();
		
		System.out.print("\n 2.0 class_debug: " + dummy1.get_attack_strength()); //2.0
		
		aragon.showMoney();  //These are the methods used in their respective classes
		aragon.takeMoney(5); 
		aragon.showMoney(); //weird flex but ok
		aragon.showPosition();
		aragon.move(10,20);
		aragon.showPosition(); //OH BOY I CANT WAIT TO MAKE A COMPUTER GAME VERSION OF DnD!!!... Oh wait...
		aragon.showWeapon();
		aragon.showHealth();
		aragon.suffer(2); //"We'd like the courts to recognize that 2 of the people the defendants is accused of killing, were in actually commiting suicide at the time." Darkest joke I have laughed at yet. (Don't code and watch comedy at the same time kids.)
		aragon.showHealth();
		aragon.say("I seem to be wounded, but I can keep going :)");
		aragon.suffer(3); //There may come a time where over half of my "code" mainly consist of comments.
		aragon.showHealth();
		aragon.say("*inhales* STAHP!!!");
		gronkh.showHealth(); //This really doesn't seem to be an intuitive game at the moment...
		gronkh.suffer(4);
		gronkh.showHealth();
		aragon.takeWeapon("Spoon");
		aragon.showWeapon();
		gronkh.say("I am in grave danger."); //How can I use the names, as in "The Lesser Orc gronkh takes n damage"
											//			or					  "The player aragon does x"	?
		
		//I cant figure out how to make one class fetch the output of another class. 
		//I've read about getters and setters ("getName" and "setName" for example) but I've got no clue how to use them, or if they even are usefull in the first place.
		//I'm imagining sth like "aragon.attack(gronkh);". This would imply I'd somehow have to translate the attack strength (dmgg from the player) to the class referred (Lesser_Orc in this case).
		
		//The issue above has been resolved.
		
		dummy1.say("I am a proof of concept.");
		dummy1.showHealth();
		dummy1.suffer(3.2 , "self");
		dummy1.showHealth();
		dummy1.showWeapon();
		dummy1.takeWeapon("Greatsword");
		dummy1.showWeapon();
		ulm.say("Imma just pop by.");
		ulm.showHealth();
		ladsy.showHealth();
		aragon.suffer(dummy1.get_attack_strength()); //It just works!
		aragon.showHealth();
		dummy1.suffer(dummy1.get_attack_strength(), "self"); //I will get my special place in hell for writing such code.
		
		
	}
	public static void main(String [] args){
		Middle_Earth me = new Middle_Earth();
		me.play();
		System.out.print("\n\n This code has been provided by teach and has been modified by TheBoringEdward with great help from Jonas\n\n");
	}
}
/////////////////////////////////////////////////////////////////////////////////////
//  This code has been provided by teach and has been modified by TheBoringEdward  // 
/////////////////////////////////////////////////////////////////////////////////////