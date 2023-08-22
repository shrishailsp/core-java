class Swiggy3Execouter{

public static void main(String args[]){
	double price = 0.0;
	double pricewithQuantity=0.0;
System.out.println("main started");
// price = Swiggy3.search("pizza");
//System.out.println("The price for pizza "+price);
  pricewithQuantity = Swiggy3.search("pizza",3);
  System.out.println("The  price for pizza with Quantity 3 is "+pricewithQuantity);
  System.out.println("main ended");
  }
  }