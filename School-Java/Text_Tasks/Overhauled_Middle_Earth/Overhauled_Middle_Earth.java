public class Overhauled_Middle_Earth{	
	private Human aragon;
	private Dummy gronkh; //Yeah, I did take some inspiration (My creativity may be terrible but my capability of giving names is an utter clusterfuck...)
	private Dummy dummy1;
	private Dummy ladsy;
	private Dummy ulm; //Making ulm a cave troll, turns gronkh into one stead. What The Fuck... Just why?! HOW?!?!
	//private Human test;
	public void play(){
		//gronkh = new Lesser_Orc("gronkh");
		//gronkh.test();
		//In order to avoid having to duplicate classes, they can be given names ("aragon" and "gronkh" in this case)
		
		//test = new Dummy ("name of character", attack strength, "weapon name", x position, y position, health, money);
		
		gronkh = new Dummy("Gronkh the Lesser Orc", 1, "Club", 0, 0, 5, 0);
		dummy1 = new Dummy("dummy1", 2, "Club", 0, 0, 20, 0); //Jonas is godsend
		aragon = new Human("Aragon the Ranger", 3.0, "Knife", 0, 0, 10.0, 0);
		ulm = new Dummy("Ulm the Cave Troll", 2.5, "Bone", 0, 0, 15, 0);
		ladsy = new Dummy("Ladsy the Uruk Hai", 1.5, "Dagger", 0, 0, 10, 0);
		//test = new Human();
		
		System.out.print("\n class_debug (2.0): " + dummy1.get_attack_strength()); //2.0
		
		aragon.showMoney();  //These are the methods used by their respective classes
		aragon.takeMoney(5); 
		aragon.showMoney(); //weird flex but ok
		aragon.showPosition();
		aragon.move(10,20);
		aragon.showPosition(); //OH BOY I CANT WAIT TO MAKE A COMPUTER GAME VERSION OF DnD!!!... Oh wait...
		aragon.showWeapon();
		aragon.showHealth();
		aragon.suffer(2, "The game lord"); //"We'd like the courts to recognize that 2 of the people the defendants is accused of killing, were in actually commiting suicide at the time." Darkest joke I have laughed at yet. (Don't code and watch comedy at the same time kids.)
		aragon.showHealth();
		aragon.say("I seem to be wounded, but I can keep going :)");
		aragon.suffer(3, "The game lord"); //There may come a time where over half of my "code" mainly consist of comments.
		aragon.showHealth();
		aragon.say("*inhales* STAHP!!!");
		gronkh.showHealth(); //This really doesn't seem to be an intuitive game at the moment...
		gronkh.suffer(4, "The game lord");
		gronkh.showHealth();
		aragon.takeWeapon("Spoon");
		aragon.showWeapon();
		gronkh.say("I am in grave danger.");
		dummy1.say("I am a proof of concept.");
		dummy1.showHealth();
		dummy1.suffer(3.2 , "The game lord");
		dummy1.showHealth();
		dummy1.showWeapon();
		dummy1.takeWeapon("Greatsword");
		dummy1.showWeapon();
		ulm.say("Imma just pop by.");
		ulm.showHealth();
		ladsy.showHealth();
		aragon.suffer(dummy1.get_attack_strength(), "dummy1"); //It just works!
		aragon.showHealth();
		dummy1.suffer(dummy1.get_attack_strength(), "The dummy1 itself"); //I will get my special place in hell for writing such code.
		dummy1.showStats();
		aragon.showStats();
		gronkh.showStats();
		ulm.showStats();
		ladsy.showStats();
		aragon.spell("I have a bird head!!! You're already dead!");
		
		////////////
		//Removing classes by making the Dummy class customizable made adding new characters a WHOLE lot more easier!
		////////////
	}
	public static void main(String [] args){
		Overhauled_Middle_Earth me = new Overhauled_Middle_Earth();
		me.play();
		System.out.print("\n\n --This code has been provided by my teach and has been modified by TheBoringEdward with the great help of Jonas-- \n\n");
	}
}
/////////////////////////////////////////////////////////////////////////////////////
//  This code has been provided by teach and has been modified by TheBoringEdward  // 
/////////////////////////////////////////////////////////////////////////////////////