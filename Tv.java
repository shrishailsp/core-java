class Tv{
static boolean isconnected;
static int maxvolume=10;
static int currentvlume=1;
static int minvolume;
public static boolean onoroff(){
System.out.println("start of invoking  Tv");
if(isconnected==false){
	isconnected=true;
	System.out.println("Tv is trueon");
	}
else if(isconnected==true){
	isconnected=false;
	System.out.println("Tv is true off");
}
return isconnected;
}
public static void increasevolume(){
	System.out.println("start of increasevolume");
	if(isconnected==true){
	if(currentvlume<maxvolume){
		currentvlume=currentvlume+1;
		System.out.println("the currentvlume is "+currentvlume);
	}	
		
	
	else{
		System.out.println("reached maximum volume");
	}
	System.out.println("end of increasevolume");
	}
}

public static void decreasevolume(){
	
	if(isconnected==true){
	if(currentvlume>minvolume){
		currentvlume=currentvlume-1;
		System.out.println("the currenvolume is "+currentvlume);
		
	}
else{
	System.out.println("reached minimum volume");
}	
		
		
	}
	
	
}




}