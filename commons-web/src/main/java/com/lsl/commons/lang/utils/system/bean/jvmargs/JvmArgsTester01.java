package com.lsl.commons.lang.utils.system.bean.jvmargs;

import com.lsl.commons.lang.utils.system.management.JvmUtil;

public class JvmArgsTester01 {

    public static void main(String[] args) throws Exception {

        /*
        
        -verbose:class 
        -verbose:gc 
        
        -Xms20m -Xmx20m 
        -XX:NewRatio=1 -XX:SurvivorRatio=3
        -XX:PermSize=6M
        -XX:+PrintGCDetails  
        -XX:+PrintCommandLineFlags
        -XX:+UseSerialGC 
        */

        System.out.println("max memory:" + (Runtime.getRuntime().maxMemory()/*/(8*1024*1024)*/) + "");
        System.out.println("free memory:" + (Runtime.getRuntime().freeMemory()/*/(8*1024*1024)*/) + "");
        System.out.println("total memory:" + (Runtime.getRuntime().totalMemory()/*/(8*1024*1024)*/) + "");

        byte[] b1 = new byte[1 * 1024 * 1024];
        System.out.println("1M");
        System.out.println("max memory:" + Runtime.getRuntime().maxMemory());
        System.out.println("free memory:" + Runtime.getRuntime().freeMemory());
        System.out.println("total memory:" + Runtime.getRuntime().totalMemory());
        //
        byte[] b2 = new byte[3 * 1024 * 1024];
        System.out.println("4M");
        System.out.println("max memory:" + Runtime.getRuntime().maxMemory());
        System.out.println("free memory:" + Runtime.getRuntime().freeMemory());
        System.out.println("total memory:" + Runtime.getRuntime().totalMemory());
        System.out.println("VMPid：" + JvmUtil.getVMPid());
        System.in.read();
        //
    }

}