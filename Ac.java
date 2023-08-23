class Ac{
static boolean isconnecred;
static int currenttemp=1;
static int maxtemp=10;
static int mintemp;
public static boolean onoroff(){
	    System.out.println("invoking of Ac on");
	if(isconnecred==false){
		isconnecred=true;
		System.out.println("turning Ac on");
  }
	else if(isconnecred==true){
	   isconnecred=false;
	   System.out.println("turning Ac off");
		
       System.out.println("invoking of ac off")
  }
	return isconnecred;
  }
public static void  increasetemp(){
	  System.out.println("start of increasing tempratuer");
    if(isconnecred==true){
	if(currenttemp<maxtemp){
		currenttemp=currenttemp+1;
		System.out.println("the  currenttemp is"+currenttemp);
  }
   else{
		System.out.println("the tempratuer is maximum");
  }
	
		
  }
	  System.out.println("end of increasing tempratuer");
  }
public static void decreasetemp(){
	System.out.println("start of decreasing tempratuer");
   if(isconnecred==true){
		
   if(currenttemp>mintemp){
	 currenttemp=currenttemp-1;
	 System.out.println("the  currenttemp is "+currenttemp);
			
  }
	else{
	System.out.println("the tempratuer is mimimum");
  }
		
  }
     System.out.println("end of decreasing tempratuer");	
  }
  }