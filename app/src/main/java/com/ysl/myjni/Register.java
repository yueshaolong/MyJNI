package com.ysl.myjni;

public class Register {

    static {
//        System.load("C:\\Work\\CLionProjects\\JNIRegister\\cmake-build-debug" +
//                "\\libHello.dll");
        System.loadLibrary("Hello");
        System.load("C:\\Work\\CLionProjects\\JNIRegister\\cmake-build-debug" +
                "\\libDyHello.dll");
    }

    public native String helloworld();
    public native String dyHello();

    public static void main(String[] args) {
        Register register = new Register();
        String helloworld = register.helloworld();
        System.out.println(helloworld);
        String dyHello = register.dyHello();
        System.out.println(dyHello);
    }
}
