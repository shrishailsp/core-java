class RRclothsExicouter{

public static void main(String[]args){

String[]brands={"puma","zara","adidas","arrow"};




 

 RRcloths cloths=new RRcloths();
 cloths.id=1;
 cloths.noOfWorkers=5;
 cloths.location="nagarbhavi";
 cloths.brands=brands;
 
 cloths.doBusiness();
 cloths.sellingCloths();
 System.out.println(cloths.id +" "+cloths.noOfWorkers+" "+cloths.location);
 
 System.out.println("list of avaliadle are");
 cloths.getAllBrands(cloths.brands);
 



}



}