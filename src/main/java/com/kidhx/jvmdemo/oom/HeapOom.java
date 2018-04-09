package com.kidhx.jvmdemo.oom;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author wb-hx347246
 * @Date 2018/4/8 10:41
 */
// vm args: -Xms20m 0Xmx20m -XX:+HeapDumpOnOutOfMemeryError
public class HeapOom {
    static class OOMObject {

    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();

        while (true) {
            list.add(new OOMObject());
        }
    }
}
