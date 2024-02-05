package com.xworkz.appstore;

import com.xworkz.appstore.application.Applications;
import com.xworkz.appstore.hub.SoftwareHub;
import com.xworkz.appstore.hub.Impl.playStoreImpl;


public class AppExecutor {

    public static void main(String[] args) {


        Applications applications = new Applications();

        applications.setAppId(1);
        applications.setAppName("whatsApp");
        applications.setAppType("socialMedia");
        applications.setAppVersion("v1");
        applications.setComName("meta");
        applications.setSizeInMb(65);
        applications.setReleaseDate("8-9-2025");

        Applications applications1 = new Applications();
        applications1.setAppId(2);
        applications1.setAppName("facebook");
        applications1.setAppType("socialMedia");
        applications1.setAppVersion("v1");
        applications1.setComName("meta");
        applications1.setSizeInMb(65);
        applications1.setReleaseDate("8-9-2008");

        Applications applications2 = new Applications();
        applications2.setAppId(2);
        applications2.setAppName("instagram");
        applications2.setAppType("socialMedia");
        applications2.setAppVersion("0.023v");
        applications2.setComName("meta");
        applications2.setSizeInMb(85);
        applications2.setReleaseDate("8-9-2010");

        Applications applications3 = new Applications();
        applications3.setAppId(2);
        applications3.setAppName("yono");
        applications3.setAppType("finTech");
        applications3.setAppVersion("0.011");
        applications3.setComName("SBI");
        applications3.setSizeInMb(100);
        applications3.setReleaseDate("8-9-2016");

        Applications applications4 = new Applications();
        applications4.setAppId(2);
        applications4.setAppName("Paytm");
        applications4.setAppType("finTech");
        applications4.setAppVersion("0.023");
        applications4.setComName("one93");
        applications4.setSizeInMb(85);
        applications4.setReleaseDate("8-9-2014");

        SoftwareHub softwareHub = new playStoreImpl();
        softwareHub.addAppliction(applications);
        softwareHub.addAppliction(applications1);
        softwareHub.addAppliction(applications2);
        softwareHub.addAppliction(applications3);
        softwareHub.addAppliction(applications4);


        softwareHub.getApp();
        Applications app = softwareHub.getApplicationByName("Paytm");
        System.out.println(app.getAppName() + "  " + app.getAppType() + "   " + app.getAppId()
                + "  " + app.getAppVersion() + "  " + app.getComName() + "  " + app.getReleaseDate());

        Applications ap = softwareHub.getApplicationById(1);

        System.out.println(ap.getAppName()+"  "+ap.getAppType()+" "+ap.getAppVersion()+" "+ap.getComName()
        +" "+ap.getReleaseDate());

        String   abc  = softwareHub.getAppNameByType("socialMedia");
        System.out.println("Application Name"+abc);

           Applications aa=softwareHub.getApplicationByAppType("socialMedia");
        System.out.println(aa.getAppName() + "  " + aa.getAppType() + "   " + aa.getAppId());

       String aapp = softwareHub.getAppTypeByName("yono");
        System.out.println("application type is "+aapp);


         boolean versionUpdated=   softwareHub.updateNewVersionByName("v1.1","facebook");
              boolean updatecompany=softwareHub.updateCompanyNameById("sun micro",1);
        softwareHub.getApp();

softwareHub.deleteapplicationbyName("Paytm");

    }





}
