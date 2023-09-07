class Museum{

int id;
String typeOfMuseum;
String musemeName;
int openingTime;
int closingTime;
int noOfItems;

public Museum(){
this(1,"old itms","bng museum",10,6,25);
System.out.println("defoult constructor invoked");
} 
public Museum(int id,String typeOfMuseum,String musemeName,int openingTime,int closingTime,int noOfItems){
System.out.println("parameterized constructor invoked");
this.id=id;
this.typeOfMuseum=typeOfMuseum;
this.musemeName=musemeName;
this.openingTime=openingTime;
this.closingTime=closingTime;
this.noOfItems=noOfItems;

}
public void displayDetailes(){

System.out.println("museme id is "+id);
System.out.println("and type of museme is "+typeOfMuseum);
System.out.println("and the name is "+musemeName);
System.out.println("museme openingTime is "+openingTime);
System.out.println("and closingTime is "+closingTime);
System.out.println("and no itens are"+noOfItems);


}
}