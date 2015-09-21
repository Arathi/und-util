package com.undsf.util;

import java.io.*;

/**
 * Created by Arathi on 2015/9/15.
 */
public class StringFileWriter extends OutputStreamWriter {
    private File file;

    public StringFileWriter(String fileName, String charsetName) throws IOException {
        super(new FileOutputStream(fileName), charsetName);
        file = new File(fileName);
    }
}
