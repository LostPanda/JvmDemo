package com.kidhx.jvmdemo.gc;

/**
 * @Author wb-hx347246
 * @Date 2018/4/8 13:51
 */
public class FinalizeEscapeGC {
    public static FinalizeEscapeGC SAVE_HOOK=null;

    public void isAlive(){
        System.out.println("yes, im alive now");
    }

    @Override
    protected void finalize() throws Throwable{
        super.finalize();
        System.out.println("finalize method executed");
        FinalizeEscapeGC.SAVE_HOOK=this;
    }

    public static void main(String[] args) throws InterruptedException {
        SAVE_HOOK=new FinalizeEscapeGC();

        //对象第一次成功拯救自己
        SAVE_HOOK=null;
        System.gc();
        //因为finalize方法级别很低，停止1秒等待他
        Thread.sleep(1000);

        if(SAVE_HOOK !=null ){
            SAVE_HOOK.isAlive();
        }else
            System.out.println("no, im dead");

        //第二次不会再次调用finalize方法了
        SAVE_HOOK=null;
        System.gc();
        Thread.sleep(1000);

        if(SAVE_HOOK !=null ){
            SAVE_HOOK.isAlive();
        }else
            System.out.println("no, im dead");
    }
}
