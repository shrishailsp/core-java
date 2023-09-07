class PlayStation{


String productName;
String ownerName;
String originCoutry;
String market;
String originDate;
String webSite;
public PlayStation(){
	this("video game council","sony","japan","alloverworld","12/3/1994","www.playstation.com");
System.out.println("defoult constructor is invoked");	
}

public PlayStation(String productName,String ownerName,String originCoutry,String market,String originDate,String webSite){
   System.out.println("parameterized constructor is invoked");	
 this.productName= productName;
this. ownerName=ownerName;
 this.originCoutry=originCoutry;
  this.market= market;
   this.originDate=originDate;
    this. webSite= webSite;

}

public void dispayDetails(){

System.out.println("the productName is"+productName+"parent company name is"+ownerName+"and country of origion is "+originCoutry);
System.out.println("and its market is all ower "+market+"and it is started in"+originDate+"and its website is"+webSite);
}
}