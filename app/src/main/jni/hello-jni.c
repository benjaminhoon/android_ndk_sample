#include <jni.h>

JNIEXPORT jstring JNICALL
Java_com_android_sample_ndk_MainActivity_getNDKMsg(JNIEnv *env, jobject instance) {

    // TODO


    return (*env)->NewStringUTF(env, "NDK Sample!!");
}