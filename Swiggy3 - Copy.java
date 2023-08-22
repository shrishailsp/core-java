class Swiggy3{
		  public static double search(String foodName , int quantity){
		  double price = 0.0 ;
		  System.out.println("invoked search :foodname(String) quantity(int)");
		  if(foodName=="pizza"){
		   price = 110.0 * quantity;
		  }
		  if(foodName=="farmhouse pizza"){
			price = 260.0 * quantity;  
		  }
		  if(foodName=="biryani"){
			  price = 635.0 * quantity;
		  }
		  if(foodName=="friderice"){
			  price = 160.0 * quantity;
		  }
		  if(foodName=="eggrice"){
			  price = 130.0 * quantity;
		  }
		  if(foodName=="pawbhaji"){
			  price = 100.0 * quantity;
		  }
		   System.out.println("end of search");
		  return price;
		  }
		  }
		  