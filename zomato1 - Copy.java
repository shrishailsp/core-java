class zomato1{

public static double search(String foodName){

double price= 0.00;
if(foodName=="pizza"){
price=150;
return price;
}
if(foodName=="halwa"){
price=100;
return price;
}
if(foodName=="chicen momo"){
	price=150;
return price;	
}
if(foodName=="chickenRoll"){
	price=75;
	return price;
}
if(foodName=="classicChickenRoll"){
	price=210;
	return price;
}
if(foodName=="shawarmaChickenRoll"){
	price=115;
	return price;
}

public static double search(String foodName,quantity){
	
	double price,quantity=00.00;
if(foodName=="pizza"){
price=150;
return price*quantity;
}
if(foodName=="halwa"){
price=100*quantity;
return price;
}
if(foodName=="chicen momo"){
	price=150*quantity;
return price;	
}
if(foodName=="chickenRoll"){
	price=75*quantity;
	return price;
}
if(foodName=="classicChickenRoll"){
	price=210*quantity;
	return price;
}
if(foodName=="shawarmaChickenRoll"){
	price=115*quantity;
	return price,quantity;
}	
}
}