class PassengerExi{

public static void main(String args[]){
	
	Passenger pas=new Passenger();
	
	pas.setId("01");
	pas.setName("prakash");
	pas.setSource("vijaypur");
	pas.setDestination("bangular");
	pas.setSeatNo(007);
	
	Train rail =new Train();
	rail.passenger=pas;
	
	System.out.println(rail.passenger.getId());
	System.out.println(rail.passenger.getName());
	System.out.println(rail.passenger.getSource());
	System.out.println(rail.passenger.getDestination());
	System.out.println(rail.passenger.getSeatNo());
	
	
}


}