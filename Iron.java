class Iron{

static boolean isconnected;
static int maxtemp=4;
static int mintemp;
static int currenttemp=1;
public static boolean onoroff(){



if(isconnected==false){
  isconnected=true;
  System.out.println("the iron is turn on");
  
}
else if(isconnected==true){
     isconnected=false;
	 System.out.println("the iron is turn off");
}
return isconnected;
}
public static void increase(){

 if(isconnected=true){
 if (currenttemp<maxtemp){
     currenttemp=currenttemp+1;
  System.out.println("the currenttemp is "+currenttemp );	 
  
 }
 else{
  System.out.println("reached maxtemp");
 }
 }
 else{
 System.out.println("please turn on iron");
 
 
 }
}

public static void decrease(){

    if (isconnected=true){
	if (currenttemp>mintemp){
     currenttemp=currenttemp-1;
  System.out.println("the mimimumtemp is "+currenttemp);	 
	
	}
	else{
	     System.out.println("mintemp reached");
	}	 
	}
	else{
	 System.out.println("please on the iron");
	
	}
}
}