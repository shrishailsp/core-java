package com.xworkz.collections.mobile;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Mobile implements Comparable<Mobile> {

        private Integer mobileId;
        private String mobileName;
        private String comName;


        @Override
        public int compareTo(Mobile mo ) {
                return this.mobileId -mo.mobileId ;
        }
}

