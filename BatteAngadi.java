class BatteAngadi{
   int id;
   String brands[];
   String location;
   int noOfWorkers;
   
   
   public BatteAngadi(int id, String brands[],String location,int noOfWorkers){
	    this.id=id;
		this. brands=brands;
		   this.location=location;
		   this.noOfWorkers=noOfWorkers;
   }
   
   public void sellingCloths(){
	   System.out.println("Selling is on peek");
   }
   public void doBusiness(){
	   System.out.println("Business is in upscale");
   }
   public void getBrands(String brand[]){
      for(int i =0;i<brands.length;i++){
	  System.out.println(brands[i]);
   }
 }
}