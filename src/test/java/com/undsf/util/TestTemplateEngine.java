package com.undsf.util;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Arathi on 2015/6/27.
 */
public class TestTemplateEngine {
    @Test
    public void testTemplateEngine() {
        TemplateEngine te = new TemplateEngine("\\$<", ">");
        te.assign("msisdn", "13500899512");
        te.assign("start_month", "5");
        te.assign("total_month", "3");
        String result = te.parse("话单查询(186)，手机号：$<msisdn>，开始月份：$<start_month>，查询月数：$<total_month>");

        assertEquals(result, "话单查询(186)，手机号：13500899512，开始月份：5，查询月数：3");
    }
}
