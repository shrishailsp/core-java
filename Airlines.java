class Airlines{
int airLinesid;
int noOfPlanes;
int noOfPailets;
 int noOfWorkrs;
String ownername;
String airLinesName;
int noOfFlits;

public Airlines(){
	this(15, 1, 35, 100, "shrishail","Shreeair"  );
	System.out.println("default cons of Airlines is invoked");
}

public Airlines(int noOfPlanes,int airLinesid,int noOfPailets,int noOfWorkrs,String ownername,String airLinesName){
	
System.out.println("parameterized cons of Airlines is invoked");
this.airLinesid=airLinesid;
 this.noOfPlanes=noOfPlanes;
this.noOfPailets=noOfPailets;
this.noOfWorkrs=noOfWorkrs;
this.ownername=ownername;
this.airLinesName=airLinesName;
this.noOfFlits=noOfFlits;
}


public void displayDetails(){

System.out.println("id is "+this.airLinesid+" name is "+this.airLinesName+"and "+this.ownername+"and no fo palnes are"+this.noOfPlanes+"is"+this.noOfPailets+"and"+this.noOfFlits+"and"+this.noOfWorkrs);

}

}