package com.kidhx.jvmdemo.gc.memanatool;

/**
 * @Author wb-hx347246
 * @Date 2018/4/8 16:57
 */
public class DeadLock {
    public final int i = 1;




    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                public void run() {
                    A.a();
                }
            }).start();
            new Thread(new Runnable() {
                public void run() {
                    B.b();
                }
            }).start();
        }

    }
    static class A{
        public static void a(){
            synchronized (B.class){
                synchronized (A.class){
                    System.out.println("hello world");
                }
            }
        }
    }

    static class B{
        public static void b(){
            synchronized (A.class){
                synchronized (B.class){
                    System.out.println("B method");
                }
            }
        }
    }
}
