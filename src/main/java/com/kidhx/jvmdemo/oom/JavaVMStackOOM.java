package com.kidhx.jvmdemo.oom;

/**
 * @Author wb-hx347246
 * @Date 2018/4/8 11:04
 */
// -Xss: 2m
public class JavaVMStackOOM {
    private void dontStop(){
        while (true){

        }
    }

    public  void stackLeakByThread() {
        while (true) {
            new Thread(new Runnable() {
                public void run() {
                    dontStop();
                }
            }).start();
        }
    }

    public static void main(String[] args) {
        JavaVMStackOOM javaVMStackOOM = new JavaVMStackOOM();
        javaVMStackOOM.stackLeakByThread();
    }
}
