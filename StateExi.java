class StateExi{

public static void main(String args[]){

State ka=new State();
 
 ka.setId("01");
 ka.setName("karnataka");
 ka.setNoOfDistict(32);
 ka.setCapital("bangalur");
 ka.setNoOfpeople(60000000);
 
 
 Country bh=new Country();
 bh.state=ka;
 
 System.out.println(bh.state.getId());
 System.out.println(bh.state.getName());
 System.out.println(bh.state.getNoOfDistict());
 System.out.println(bh.state.getCapital());
 System.out.println(bh.state.getNoOfpeople());
 
 
 
}
}