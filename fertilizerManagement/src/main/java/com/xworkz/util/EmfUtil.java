package com.xworkz.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmfUtil {


        private static EntityManagerFactory entitymanager;

        public static EntityManagerFactory getEntitymanager() {
            return entitymanager;
        }

        static {
            entitymanager= Persistence.createEntityManagerFactory("x-workz");
        }
    }


