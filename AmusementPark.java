 class AmusementPark{
 
 String parkName;
 int id;
 int opnimgTime;
 int cloingTime;
 int noOfRids;
 int enteyFees;
 
 public AmusementPark(){
	 this("shreepark",1,10,6,25,500);
 System.out.println("defoult constructor is invoked");
 }
 
 public AmusementPark(String parkName,int id,int opnimgTime,int cloingTime,int noOfRids,int enteyFees){
 System.out.println("parameterized constructor is invoked");
 this.parkName=parkName;
 this.id=id;
 this.opnimgTime=opnimgTime;
 this.cloingTime=cloingTime;
 this.noOfRids=noOfRids;
 this.enteyFees=enteyFees;
 }
 public void displayDetails	(){
 
 System.out.println("the park name is "+parkName);
 System.out.println("and the park id is "+id);
 System.out.println("and the opnimgTime is "+opnimgTime);
 System.out.println("and the closing time is "+cloingTime);
 System.out.println("no Of Rids are"+noOfRids);
 System.out.println("and the entry fees is "+enteyFees);
 
 }
 }