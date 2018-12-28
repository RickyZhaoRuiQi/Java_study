package com.ixaut.memory;

import java.util.ArrayList;
import java.util.List;

/**
 * Java堆溢出测试
 * 将Java堆大小限制为20M，不可扩展
 * 不断申请新对象
 * */
public class HeapOOM {

    static class OOMObject{

    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();

        while(true){
            list.add(new OOMObject());
        }
    }
}
