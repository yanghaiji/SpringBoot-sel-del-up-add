package com.yanghj.demo.md5;

import org.junit.Test;
import org.springframework.util.DigestUtils;

public class StringUtilTest {  
	  
    static final String TARGET = "yanghaiji";      
      
    /* 
     * 自带的MD5 
     * spring -> MD5  
     */    
    @Test    
    public void Md5(){    
        String str = DigestUtils.md5DigestAsHex(TARGET.getBytes());
        System.out.println("md5Hex -> "+str);
    }    
}  
