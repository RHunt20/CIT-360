package com.java2novice.junit.tests;
 
import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.*;
import org.junit.Test;
 
public class MyAssertNullTest {
 
    public String getPropValue(final String key){
        Map<string, string=""> appProps = new HashMap<string, string="">();
        appProps.put("key1", "value 1");
        appProps.put("key2", "value 2");
        appProps.put("key3", "value 3");
        return appProps.get(key);
    }
     
    @Test
    public void test(){
        MyAssertNullTest msnt = new MyAssertNullTest();
        assertNotNull(msnt.getPropValue("key9"));
    }
}
