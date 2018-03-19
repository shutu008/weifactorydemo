package com;

import org.junit.Test;

/**
 * @author ssj
 * @create 2017-11-12 9:50
 */
public class BytesDefaultTEst {
    @Test
    public void bytesTest(){
        byte[] bytes = new byte[10];
        for (byte b:bytes) {
            System.out.println(b);
        }
    }
}
