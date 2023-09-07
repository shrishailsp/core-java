class BatteAngadiExecutor{

public static void main (String cloths[]){
	String[] brands={"puma","arrow","LP"};
BatteAngadi BA=new BatteAngadi(1,brands,"Mathikere",5);


BA.getBrands(BA.brands);
BA.sellingCloths();
BA.doBusiness();
System.out.println( BA.location+" is the location where id is "+BA.id+ "and  "+BA.noOfWorkers);
System.out.println("\n");
  
  
}
}
