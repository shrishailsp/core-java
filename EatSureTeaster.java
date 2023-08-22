class EatSureTeaster{
public static void main(String food[]){

System.out.print("main started");
double price=UberEats.search("rice");
System.out.println("the peice of "+price);
double priceWithQuantity=EatSure.search("rice",6);
System.out.println("the priceWithQuantity is "+priceWithQuantity);
System.out.println("main ended");

}


}