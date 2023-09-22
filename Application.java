class Application{

private String name;
private double sizeInMb;
private String version;
private String rating;
private String noOfDownLoads;
private String companyName;

public Application(){

}
public void setName(String name){
    this.name=name;
}
public String getName(){
	return name;
}
public void setSizeInMb(double sizeInMb){
	this.sizeInMb=sizeInMb;
}
public double getSizeInMb(){
	return sizeInMb;
}
public void setVersion(String version){
	this.version=version;
}
public String getVersion(){
	return version;
}
public void setRating(String rating){
	this.rating=rating;
}
public String getRating(){
	return rating;
}
public void setNoOfDownLoads(String noOfDownLoads){
	this.noOfDownLoads=noOfDownLoads;
}
public String getNoOfDownLoads(){
	return noOfDownLoads;
	
}
public void setCompanyName(String companyName){
	this.companyName=companyName;
}
public String getCompanyName(){
	return companyName;
}
}