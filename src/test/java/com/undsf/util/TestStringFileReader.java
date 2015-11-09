package com.undsf.util;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.io.IOException;

/**
 * Created by Arathi on 2015/9/19.
 */
@FixMethodOrder(MethodSorters.DEFAULT)
public class TestStringFileReader {
    String userDir;

    @Before
    public void setUserDir() {
        this.userDir = System.getProperty("user.dir") + "/src/test/resources/";
    }

    @Test
    public void testANSI() throws IOException {
        System.out.println("=====ANSI=====");
        StringFileReader sfrDefault = new StringFileReader(userDir + "sfr-ansi.txt");
        System.out.println(sfrDefault.readAll());
    }

    @Test
    public void testGB2312() throws IOException {
        System.out.println("=====GB2312=====");
        StringFileReader sfrGB2312 = new StringFileReader(userDir + "sfr-gb2312.txt","GB2312");
        System.out.println(sfrGB2312.readAll());
    }

    @Test
    public void testGBK() throws IOException {
        System.out.println("=====GBK=====");
        StringFileReader sfrGBK = new StringFileReader(userDir + "sfr-gbk.txt","GBK");
        System.out.println(sfrGBK.readAll());
    }

    @Test
    public void testUTF8() throws IOException {
        System.out.println("=====UTF-8=====");
        StringFileReader sfrUTF8 = new StringFileReader(userDir + "sfr-utf8.txt", "UTF-8");
        System.out.println(sfrUTF8.readAll());
    }

    @Test
    public void testUTF8woBOM() throws IOException {
        System.out.println("=====UTF-8 without BOM=====");
        StringFileReader sfrUTF8woBom = new StringFileReader(userDir + "sfr-utf8wobom.txt", "UTF-8");
        System.out.println(sfrUTF8woBom.readAll());
    }

}
