package com.undsf.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * Created by Arathi on 2015/9/19.
 */
@FixMethodOrder(MethodSorters.DEFAULT)
public class TestStringFileReader {

    @Test
    public void testANSI(){
        System.out.println("=====ANSI=====");
        try {
            StringFileReader sfrDefault = new StringFileReader("C:\\temp\\und-util\\sfr-ansi.txt");
            System.out.println(sfrDefault.readAll());
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void testGB2312(){
        System.out.println("=====GB2312=====");
        try {
            StringFileReader sfrGB2312 = new StringFileReader("C:\\temp\\und-util\\sfr-gb2312.txt","GB2312");
            System.out.println(sfrGB2312.readAll());
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void testGBK(){
        System.out.println("=====GBK=====");
        try {
            StringFileReader sfrGBK = new StringFileReader("C:\\temp\\und-util\\sfr-gb2312.txt","GBK");
            System.out.println(sfrGBK.readAll());
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void testUTF8(){
        System.out.println("=====UTF-8=====");
        try {
            StringFileReader sfrUTF8 = new StringFileReader("C:\\temp\\und-util\\sfr-utf8.txt", "UTF-8");
            System.out.println(sfrUTF8.readAll());
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void testUTF8woBOM(){
        System.out.println("=====UTF-8，无BOM=====");
        try {
            StringFileReader sfrUTF8woBom = new StringFileReader("C:\\temp\\und-util\\sfr-utf8wobom.txt", "UTF-8");
            System.out.println(sfrUTF8woBom.readAll());
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
