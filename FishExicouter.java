class FishExicouter{

public static void main(String args[]){

Fish fi=new Fish(); 
 
 fi.setName("goldFish");
 fi.setColor("orange");
 fi.setSize("small");
 fi.setWight(15);
 
 Water pani=new Water();
 pani.fish=fi;
 
 
 System.out.println(pani.fish.getName());
System.out.println(pani.fish.getColor());
System.out.println(pani.fish.getSize());
System.out.println(pani.fish.getWight()+"gram");
}



}