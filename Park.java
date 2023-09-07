class Park{


int parkId;
String parkName;
String [] flowers={"lotus","rose","hibiskas","mogra","lavander"};
int noOfTrees;
int noOfGates;
String location;


public Park(){
this(1,"shreepark",50,5,"vijaypur");
System.out.println("defoult constructor invoked");
}
public Park(int parkId,String parkName,int noOfTrees,int noOfGates,String location){
System.out.println("parameterized constructor invoked");
this.parkId=parkId;
this.parkName=parkName;
this.noOfTrees=noOfTrees;
this.noOfGates=noOfGates;
this.location=location;


}
public void displayResult(){

System.out.println("the park id is "+parkId);
System.out.println("the park name is "+parkName);
System.out.println("the no of trees  are "+noOfTrees);
System.out.println("the of gates are "+noOfGates);
System.out.println("the park location is "+location);

}

public void treesList(){
System.out.println( "the list of flowers are");
for(int i=0;i<flowers.length;i++){

System.out.println(flowers[i]);

}

}
}