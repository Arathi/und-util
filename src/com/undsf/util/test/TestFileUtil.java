package com.undsf.util.test;

import com.undsf.util.FileUtil;

import java.io.File;

/**
 * Created by Arathi on 2015/6/27.
 */
public class TestFileUtil {
    public static void main(String[] args) {
        File f = new File("D:\\Workspace\\VisualStudio\\Projects\\shadowsocks-csharp\\test\\bin\\x86\\Release\\gui-config.json");
        String fileCotnent = FileUtil.readFile(f, "UTF-8");
        System.out.println(fileCotnent);
    }
}
