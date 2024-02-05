package com.xworkz.string.array;

public class Array {
    public static void main(String[] args) {
        String Name[] = {"shri", "om", "akash", "prakash"};

        for (int s = 0; s < Name.length; s++) {
            System.out.println(Name[s]);
        }
        for(int s=Name.length-1;s>=0;s--){
            System.out.println(Name[s]);
        }

    }
}

class Exicouter{
    public static void main(String[] args) {
        String str="romeo";
        String str1="romeo";
        System.out.println(str==str1);
        System.out.println(str.equals(str1));
        String str2=new String("romeo");
        System.out.println(str2==str1);

    }
}
