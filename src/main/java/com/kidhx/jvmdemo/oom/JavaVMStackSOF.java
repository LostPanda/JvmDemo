package com.kidhx.jvmdemo.oom;

/**
 * @Author wb-hx347246
 * @Date 2018/4/8 10:58
 */
// -Xss128k
public class JavaVMStackSOF {
    private int stackLength=1;
    public void stackLeak(){
        stackLength++;
        stackLeak();
    }
    public static void main(String[] args) throws Exception {
        JavaVMStackSOF javaVMStackSOF = new JavaVMStackSOF();
        try {
            javaVMStackSOF.stackLeak();
        } catch (Exception e) {
            System.out.println("stack length:"+javaVMStackSOF.stackLength);
            throw e;
        }
    }
}
