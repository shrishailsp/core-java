class Mixer1{

static boolean isconnected;
static int maxspeed=3;
static int currenspeed=1;
static int minspeed;
public static boolean onoroff(){
System.out.println("invoking mixer on");
 if(isconnected==false){
  isconnected=true;
  System.out.println("mixer is turned on");
 }
 else if(isconnected==true){
  isconnected=false;
  System.out.println("mixer is turned off");
 }
 return isconnected;
}

public static void maximum(){
	if(isconnected==true){
	if(currenspeed<maxspeed){
		currenspeed=currenspeed+1;
	System.out.println("the currenspeed speed is "+currenspeed);
		
	}
	else{
		System.out.println("ti reached max speed");
	}	
	}
	else{
		System.out.println("pleasr  turn on the mixer");
		
	}
	
	
	
}
public static void minimum(){
	
	if(isconnected=true){
		
		if(currenspeed>minspeed){
			currenspeed=currenspeed-1;
			System.out.println("the current speed is "+currenspeed);
		}
		else{
			System.out.println("it reached maxmum speed");
		}	
		}
		else{
			System.out.println("please turn on the mixer");
		}
	
}
}