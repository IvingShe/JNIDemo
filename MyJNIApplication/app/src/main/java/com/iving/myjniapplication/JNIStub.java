package com.iving.myjniapplication;


public class JNIStub {


    static {
        System.loadLibrary("hello_jni");
    }

    public native String getDataFromJni();
}
