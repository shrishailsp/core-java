class ShreeEatsTeaster{
public static void main(String food[]){
System.out.print("main started");

double price=ShreeEats.search("fujiya");
System.out.println("the peice of "+price);

double printWithQuantity=ShreeEats.search("fujiya",6);
System.out.println("the printWithQuantity is "+printWithQuantity);

System.out.println("main ended");

}

}