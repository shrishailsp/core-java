class DunzooTeaster{
public static void main(String food[]){

System.out.print("main started");
double price=Dunzoo.search("palakPanner");
System.out.println("the peice of "+price);
double priceWithQuantity=Dunzoo.search("palakPanner",4);
System.out.println("the priceWithQuantity is "+priceWithQuantity);
System.out.println("main ended");

}


}