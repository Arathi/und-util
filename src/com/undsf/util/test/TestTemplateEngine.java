package com.undsf.util.test;

import com.undsf.util.TemplateEngine;

/**
 * Created by Arathi on 2015/6/27.
 */
public class TestTemplateEngine {
    public static void main(String[] args) {
        TemplateEngine te = new TemplateEngine("\\$<", ">");
        te.assign("msisdn", "13500899512");
        te.assign("start_month", "5");
        te.assign("total_month", "3");
        String result = te.parse("话单查询(186)，手机号：$<msisdn>，开始月份：$<start_month>，查询月数：$<total_month>");

        System.out.println(result);
    }
}
