class State{

private String id;
private String name;
private int noOfDistict;
private String capital;
private long noOfpeople;

public State(){
	
	
}

public void setId(String id){
	this.id=id;
}
public String getId(){
	return id;
}

public void setName(String name){
	this.name=name;
}
public String getName(){
	return name;
}
public void setNoOfDistict(int noOfDistict){
	this.noOfDistict=noOfDistict;
}
public int getNoOfDistict(){
	return noOfDistict;
}
public void setCapital (String capital){
	this.capital=capital;
}
public String getCapital(){
	return capital;
}
public void setNoOfpeople(long noOfpeople){
	this.noOfpeople=noOfpeople;
}
public long getNoOfpeople(){
	return noOfpeople;
}
}