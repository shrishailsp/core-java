package com.xworkz.appstore.application;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Applications {

    private int appId;
    private String appName;
    private String appType;
    private String appVersion;
    private  String comName;
    private  int sizeInMb;
    private  String releaseDate;


}
