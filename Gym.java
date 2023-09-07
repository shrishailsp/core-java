class Gym{

int gymid;
String gymName;
String localion;
int noOfEqipment;
String[] eqipmentName = {"dumbals","tredmill","punchingBag","rops"};
String onwerName;

public Gym(){
	this(1,"nationalgym","vijaypur",20,"irfan");

}

public Gym(int gymid,String gymName,String localion,int noOfEqipment ,String onwerName){

this.gymid= gymid;
this.gymName=gymName;
this.localion= localion;
this.noOfEqipment=noOfEqipment;

this.onwerName=onwerName;

}
public void dispalyDetails(){

	System.out.println("the gym name is " +gymName+ "gym id is" +gymid+ "and localion is " +localion+ "and onwerName is " + onwerName );
getEqipmentlist();
}
public void getEqipmentlist(){
	
	for(int name=0;name<eqipmentName.length; name++){
		System.out.println(eqipmentName[name]);
	}
	
	
}
}