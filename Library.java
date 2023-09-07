 class Library{
 
 int id;
 String libraryName;
 String location;
 String type;
 int opningTime;
 int closingTime;
 public Library(){
	 this(1,"ars library","vijaypur","public",9,5);
	 System.out.println("defoult constructor invoked");
 }
 public Library(int id,String libraryName,String location,String type,int opningTime,int closingTime){
  System.out.println("parameterized constructor invoked");
 this.id=id;
 this.libraryName=libraryName;
 this.location=location;
 this.type=type;
 this.opningTime=opningTime;
 this.closingTime=closingTime;
 }
 
 public void displayDetails(){
 
 System.out.println("the library id is "+id);
 System.out.println("the libraryName is "+libraryName);
 System.out.println("and the location is "+location);
 System.out.println("and it is "+type);
 System.out.println("opningTime is "+opningTime);
 System.out.println("and closingTime is"+closingTime);
 }
 }