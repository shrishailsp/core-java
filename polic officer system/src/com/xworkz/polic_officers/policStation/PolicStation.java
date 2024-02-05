    package com.xworkz.polic_officers.policStation;

    import com.xworkz.polic_officers.officers.Officer;

    import java.util.Arrays;

    public interface PolicStation {



        public boolean addofficers(Officer officers);
      public void getAllOfficers();
             public  String getAddressById(int id);
             public Officer getOfficerInfoById(int id);
    public int getOfficerAgeByName(String name);
    public String getPostByName(String name);
    public  String getPostNmaeById(int id);
    public boolean updatePostnameByName(String updatedPost ,String name);

    public void deleateOfficerById(int id);
    public void getnewOfficerslist(Officer[]officers);

      }


