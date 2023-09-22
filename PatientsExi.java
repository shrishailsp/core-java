class PatientsExi{

public static void main(String args[]){


Patients pat=new Patients();
pat.setId(1);
pat.setName("akash");
pat.setAge(23);
pat.setPurpose("heart pain");
pat.setGender("male");

Hospital ho=new Hospital();
ho.patient=pat;

System.out.println(ho.patient.getId());
System.out.println(ho.patient.getName());
System.out.println(ho.patient.getAge());
System.out.println(ho.patient.getPurpose());
System.out.println(ho.patient.getGender());



}




}