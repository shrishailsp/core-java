class Hardware{

private int id;
private String type;
private int noOfKeys;
private int noOfFkeys;

public Hardware(){
	
	
}
public void setId(int id){
	this.id=id;
	
}
public int getId(){
	return id;
}

public void setType(String type){
	this.type=type;
}
public String getType(){
	return type;
}

public void setNoOfKeys(int noOfKeys){
	this.noOfKeys=noOfKeys;
} 
public int getNoOfKeys(){
	return noOfKeys;
}

public void setNoOfFkeys(int noOfFkeys){
	this.noOfFkeys=noOfFkeys;
}
public int getNoOfFkeys(){
	return noOfFkeys;
}
}