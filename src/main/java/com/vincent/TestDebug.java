package com.vincent;

public class TestDebug {

    public void test(){
        int i= 1;
        String s = "abc";
        System.out.println("Hello,"+s+"---"+i);
        System.out.println("---------");
        System.out.println("Bye,"+s+"---"+i);

        System.out.println("aaaaaa");
    }

    public static void main(String[] args) {
        TestDebug t = new TestDebug();
        t.test();
        System.out.println("args = [" + t + "]");
    }
}
