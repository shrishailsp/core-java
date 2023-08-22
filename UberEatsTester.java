class UberEatsTester{
public static void main(String food[]){

System.out.print("main started");
double price=UberEats.search("rice");
System.out.println("the peice of "+price);
double priceWithQuantity=UberEats.search("rice",5);
System.out.println("the priceWithQuantity is "+priceWithQuantity);
System.out.println("main ended");

}


}
