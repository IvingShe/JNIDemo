//
// Created by AA on 2021/2/27.
//

#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
//语法： Java_包名_类名_方法名
Java_com_iving_myjniapplication_JNIStub_getDataFromJni(
//Java_com_example_view_JNITest_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Hello world, I am a C++ String !";
    return env->NewStringUTF(hello.c_str());
}
