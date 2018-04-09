package com.kidhx.jvmdemo.gc.allocation;

import org.junit.jupiter.api.Test;

/**
 * @Author wb-hx347246
 * @Date 2018/4/8 15:32
 */
public class MaxTenuringTest {
    public static final int _1MB = 1024 * 1024;

    //vm args: -verbose:gc -Xms20m -Xmx20m -Xmn10m -XX:+PrintGCDetails -XX:SurvivorRatio=9 -XX:MaxTenuringThreshold=1 -XX:+PrintTenuringDistribution
    // -XX:+UserSerialGC
    @Test
    public void testTenuringThreshold() {
        byte[] allocation1, allocation2, allocation3;
        allocation1 = new byte[_1MB / 4];
        allocation2 = new byte[_1MB * 4];
        allocation3 = new byte[_1MB * 4];
        allocation3 = null;
        allocation3 = new byte[4 * _1MB];
        while (true){}
    }
}
