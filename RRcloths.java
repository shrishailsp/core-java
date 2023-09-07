class RRcloths{

   int id;
   int noOfWorkers;
   String[] brands;
   String location;
   
   
    public RRcloths(){
		System.out.println("the RRcloths object starts created");
	}

 public void sellingCloths(){
	 System.out.println("selling the cloths");
	 
	 
 }
 public void doBusiness(){
	 System.out.println("doing business");
 }
public void getAllBrands(String brands[]){

for( int index=0;index<brands.length;index++ ){
System.out.println(brands[index]);
}
			}

}