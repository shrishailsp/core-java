package com.xworkz.appstore.hub.Impl;

import com.xworkz.appstore.application.Applications;
import com.xworkz.appstore.hub.SoftwareHub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class playStoreImpl implements SoftwareHub {


   // Applications applications[] = new Applications[5];
    List<Applications> list=new ArrayList<>();
    int index;
@Override
    public boolean addAppliction(Applications applications) {
        boolean isAdded = false;
        if (applications != null) {
            this.list.add(applications);
            isAdded = true;
        }
        return isAdded;
    }
@Override
    public void getApp() {
//        for (int index = 0; index < applications.length; index++) {
//            System.out.println(applications[index].getAppName() +" "+applications[index].getAppId()+" "+
//                    applications[index].getAppVersion() +" "+applications[index].getAppType() +" "+
//                    applications[index].getComName() +" "+applications[index].getSizeInMb() +" " +
//                    applications[index].getReleaseDate());
//
//        }
    for (Applications app:list) {
        System.out.println(app);

    }
    }
@Override
    public Applications getApplicationByName(String appName) {
        System.out.println("invoking getApplication by name");
        Applications applications1 = null;
//        for (int index = 0; index < this.applications.length; index++) {
//            if (applications[index].getAppName() == appName) {
//                applications1 = applications[index];
//            }
//
//        }
    for (Applications app1:list) {
        if(app1.getAppName().equals(appName)){
            applications1=app1;
        }
    }
        return applications1;
    }

@Override
    public Applications getApplicationByAppType(String appType) {
        Applications appli = null;
//        for (int index = 0; index < applications.length; index++) {
//            if (applications[index].getAppType() == appType) {
//                appli = applications[index];
//            }
//      }
    for (Applications app2:list) {
        if(app2.getAppType().equals(appType)){
            appli=app2;
        }

    }
        return appli;
    }
@Override
    public String getAppNameByType(String appType) {
        String appl = null;
//        for (int index = 0; index < this.applications.length; index++) {
//            if (applications[index].getAppType() == appType) {
//                appl = applications[index].getAppName();
//
//            }
//
//        }
    for (Applications app3:list) {
        if(app3.getAppType().equals(appType)){
            appl=app3.getAppName();
        }

    }
        return appl;
    }
    @Override
    public Applications getApplicationById(int appId) {
        System.out.println("invoking getApplication by appid");
        Applications app = null;
//        for (int index = 0; index < this.applications.length; index++) {
//            if (applications[index].getAppId() == appId) {
//                app = applications[index];
//            }
//
//        }
        for (Applications app4:list) {
            if(app4.getAppId()==appId){
                app=app4;
            }

        }
        return app;
    }
    @Override
    public String getAppTypeByName(String appName) {
        String appl = null;
//        for (int index = 0; index < this.applications.length; index++) {
//            if (applications[index].getAppName() == appName) {
//                appl = applications[index].getAppType();
//
//            }
//
//        }
        for (Applications hi:list) {
            if (hi.getAppName().equals(appName)){
                appl=hi.getAppType();
            }

        }
        return appl;
    }
    @Override
    public int getAppSizeByName(String appName) {
        int aa = 0;
//        for (int index = 0; index < this.applications.length; index++) {
//            if (applications[index].getAppName() == appName) {
//                aa = applications[index].getSizeInMb();
//
//            }
//
//        }
        for (Applications app5:list) {
            if(app5.getAppName().equals(appName)){
                aa=app5.getSizeInMb();
            }

        }
        return aa;

    }
    @Override
    public String getAppComopanyNameName(String appName) {
        String ap = null;
//        for (int index = 0; index < this.applications.length; index++) {
//            if (applications[index].getAppName() == appName) {
//                ap = applications[index].getComName();
//
//            }
//
//        }
        for (Applications app6:list) {
            if(app6.getAppName().equals(appName)){
                ap=app6.getComName();
            }

        }
        return ap;
    }
    @Override
    public boolean  updateNewVersionByName(String updatedVersion ,String exestingAppName){
        boolean isUppaded=false;
//        for (int index = 0; index < this.applications.length; index++) {
//            if (applications[index].getAppName() ==exestingAppName ) {
//                applications[index].setAppVersion(updatedVersion);
//                isUppaded=true;
//                System.out.println("app version updated successfully");
//            }
//
//        }
        for (Applications app7:list) {
            if(app7.getAppName().equals(exestingAppName)){
                app7.setAppVersion(updatedVersion);
            }

        }
        return isUppaded;
    }
@Override
    public boolean updateCompanyNameById(String updatedCompanyname,int existingAppId){
        boolean isupdateb=false;
//        for (int index = 0; index < this.applications.length; index++) {
//            if (applications[index].getAppId() ==existingAppId ) {
//                applications[index].setComName(updatedCompanyname);
//                isupdateb =true;
//                System.out.println("app Name Updated successfully");
//            }
//
//        }
    for (Applications app8:list) {
        if(app8.getAppId()==existingAppId){
            app8.setComName(updatedCompanyname);
        }

    }
        return isupdateb;

    }
   @Override
   public void deleteapplicationbyName(String AppName){

        System.out.println("invoking deleteapplicationbyName ");

//        int index,newIndex;
//        for (index=0,newIndex = 0; index<this.applications.length ; index++) {
//            if(applications[index].getAppName() !=AppName){
//                applications[newIndex++]=applications[index];
//
//            }
//            else {
//                System.out.println("given app is deleated from the software");
//
//            }
//        }
//        applications= Arrays.copyOf(applications,newIndex);
//        getalNewApplication(applications);

       Iterator<Applications> iterator=list.iterator();
       while(iterator.hasNext()){
           if(iterator.next().getAppName().equals(AppName)){
               iterator.remove();
           }
       }
}

   @Override
    public void getalNewApplication(Applications[]application){
//        System.out.println("new application list");
//        for (int i = 0; i <applications.length ; i++) {
//            System.out.println(application[i].getAppId()+" "+applications[i].getAppName()+" "+applications[i].getAppType()+"  "+
//                    applications[i].getAppVersion()+" "+applications[i].getReleaseDate()+" "+applications[i].getComName());
//
      }
   }




