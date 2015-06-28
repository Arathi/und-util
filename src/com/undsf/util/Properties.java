package com.undsf.util;

import java.io.UnsupportedEncodingException;

/**
 * Created by Arathi on 2015/06/26.
 */
public abstract class Properties extends java.util.Properties {
    public static final String INTERNAL_ENCODING = "ISO8859-1";
    public abstract String getTargetEncoding();

    @Override
    public String getProperty(String key) {
        String raw = super.getProperty(key);
        String target = null;
        try {
            target = new String(raw.getBytes(INTERNAL_ENCODING), getTargetEncoding());
        }
        catch (UnsupportedEncodingException e){
            e.printStackTrace();
        }
        return target;
    }
}
