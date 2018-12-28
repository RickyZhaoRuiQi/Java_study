package com.ixaut.memory;

/**
 * Java栈溢出测试
 * 将Java栈大小限制为180K
 * 定义大量的本地变量
 * */

public class JavaVMStackSOF {

    private int stackLength = 1;

    public void stackLeak(){
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) throws Throwable{
        JavaVMStackSOF oom = new JavaVMStackSOF();
        try{
            oom.stackLeak();
        }catch(Throwable e){
            System.out.println("stack length:"+oom.stackLength);
            throw e;
        }
    }
}
