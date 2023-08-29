class LenskartExicouter{

public static void main(String args[]){

Lenskart lens=new Lenskart();

lens.lenskartid =1;
lens.shopName="rroptics";
lens.location ="rrNagar";
lens.avaliableQuantity=100;
lens.ownerName="prakash";

System.out.println("the lenskaetshid is "+lens.lenskartid);
System.out.println("the lenskaet shop name is"+lens.shopName);
System.out.println("the lenskaet shop location is"+lens.location);
System.out.println("the avaliableQuantity is"+lens.avaliableQuantity);
System.out.println("the onwerName is "+lens.ownerName);
lens.providinGlasses();
System.out.println("----------------------------------------------------------");
}




}