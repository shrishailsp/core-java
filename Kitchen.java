class Kitchen{

private String id;
private String type;
private int noOfChefs;
private int noOfHelper;
private String owner;

 public Kitchen(){
	 
 } 
public void setId(String id){
	this.id=id;
} 
public String getId(){
	return id;
}

public void setType(String type){
	this.type=type;
}
public String getType(){
	return type;
}

public void setNoOfChefs(int noOfChefs){
	this.noOfChefs=noOfChefs;
}
public int getNoOfChefs(){
	return noOfChefs;
}

public void setNoOfHelper(int noOfHelper){
	this.noOfHelper=noOfHelper;
}
public int getNoOfHelper(){
	return noOfHelper;
}

public void setOwner(String owner){
	this.owner=owner;
}
public String getOwner(){
	return owner;
}
}