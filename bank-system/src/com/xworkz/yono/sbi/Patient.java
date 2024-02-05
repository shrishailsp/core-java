package com.xworkz.yono.sbi;

public class Patient {
    private int id;
    private String name;
    private String address;
    private int age;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
   public String toString(){
        return "parient(id="+this.id+",name="+this.name+",address="+this.address+",age="+this.age+")";
    }
}
