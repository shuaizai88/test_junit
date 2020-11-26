package com.xhb;

public class TestMain {
    public static void main(String[] args){
        System.out.println("启动成功");
        try {
            Thread.sleep(1000*60*60);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
