package com.xworkz.appstore.hub;

import com.xworkz.appstore.application.Applications;


public interface SoftwareHub {



    public  boolean addAppliction(Applications applications) ;

    public void getApp() ;

    public Applications getApplicationByName(String appName) ;
    public Applications getApplicationByAppType(String appType) ;

    public String getAppNameByType(String appType) ;
    public Applications getApplicationById(int appId) ;
    public String getAppTypeByName(String appName) ;
    public int getAppSizeByName(String appName) ;
    public String getAppComopanyNameName(String appName) ;
    public boolean  updateNewVersionByName(String updatedVersion ,String exestingAppName);

    public boolean updateCompanyNameById(String updatedCompanyname,int existingAppId);
    public void deleteapplicationbyName(String AppName);
    public void getalNewApplication(Applications[]application);
}