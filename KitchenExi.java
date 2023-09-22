class KitchenExi{

public static void main(String args[]){

Kitchen ki=new Kitchen();
ki.setId("01");
ki.setType("master kitchen");
ki.setNoOfChefs(5);
ki.setNoOfHelper(20);
ki.setOwner("shree");


Hotel hotel=new Hotel();
hotel.kitchen=ki;

System.out.println(hotel.kitchen.getId());
System.out.println(hotel.kitchen.getType());
System.out.println(hotel.kitchen.getNoOfChefs());
System.out.println(hotel.kitchen.getNoOfHelper());
System.out.println(hotel.kitchen.getOwner());

}



}