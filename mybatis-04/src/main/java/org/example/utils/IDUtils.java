package org.example.utils;
import org.testng.annotations.Test;

import java.util.UUID;

public class IDUtils {
    public static String getID(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }

    @Test
    public void test(){
        System.out.println(IDUtils.getID());
    }
}
