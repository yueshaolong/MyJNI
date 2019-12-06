package com.ysl.myjni;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Register {

    static {
        System.load("C:\\Work\\CLionProjects\\JNIRegister\\cmake-build-debug" +
                "\\libHello.dll");
        System.load("C:\\Work\\CLionProjects\\JNIRegister\\cmake-build-debug" +
                "\\libDyHello.dll");
    }

    public native String helloworld();
    public native String dyHello();
    public native String dyHello(String s);
//    public native long dyHello0();
//    public native long dyHello0(Long l);
//    public native int dyHello0(int i, String s, long[] l);
//    public native String dyHello1(String string, int i);
//    public native String dyHello2(String string, byte[] i);
//    public native String dyHello3(String string, Object o);
//    public native String dyHello4(String string, List<String> stringList);
//    public native String dyHello5(String string, ArrayList<String> stringList);
//    public native String dyHello6(String string, Map<Integer, String> integerStringMap);
//    public native String dyHello7(String string, LinkedHashMap<Integer, String> integerStringMap);
//    public native String dyHello8(String string, Map<Integer, String> integerStringMap, boolean b);

    public static void main(String[] args) {
//        String property = System.getProperty("java.library.path");
//        System.out.println("java.library.path = "+property);
        Register register = new Register();
//        String helloworld = register.helloworld();
//        System.out.println(helloworld);
//        String dyHello = register.dyHello();
//        System.out.println(dyHello);
        String ysl = register.dyHello("ysl");
        System.out.println("android -------> "+ysl);
    }
}
