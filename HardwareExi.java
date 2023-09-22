class HardwareExi{


public  static void main(String args[]){

Hardware hard =new Hardware();
hard.setId(01);
hard.setType("keyboard");
hard.setNoOfKeys(80);
hard.setNoOfFkeys(12);

Software soft=new Software();
soft.hardware=hard;


System.out.println(soft.hardware.getId());
System.out.println(soft.hardware.getType());
System.out.println(soft.hardware.getNoOfKeys());
System.out.println(soft.hardware.getNoOfFkeys());

}



}