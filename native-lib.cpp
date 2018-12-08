#include <jni.h>
#include <string>
#include "NumTTT.h"

extern "C" JNIEXPORT jboolean JNICALL Java_com_example_yuanziwen_ttt_MainActivity_single1(
        JNIEnv *env,
        jobject /* this */, jint one, jint two, jint three, jint four, jint five, jint six, jint seven, jint eight, jint nine) {
    NumTTT game();
    game().board[0][0] = one;
    game().board[0][1] = two;
    game().board[0][2] = three;
    game().board[1][0] = four;
    game().board[1][1] = five;
    game().board[1][2] = six;
    game().board[2][0] = seven;
    game().board[2][1] = eight;
    game().board[2][2] = nine;

    return static_cast<jboolean>(game().testforend);
}

JNIEXPORT jint JNICALL Java_com_example_yuanziwen_ttt_MainActivity_winner(
        JNIEnv *env,
        jobject /* this */, jint one, jint two, jint three, jint four, jint five, jint six, jint seven, jint eight, jint nine) {
    NumTTT game();
    game().board[0][0] = one;
    game().board[0][1] = two;
    game().board[0][2] = three;
    game().board[1][0] = four;
    game().board[1][1] = five;
    game().board[1][2] = six;
    game().board[2][0] = seven;
    game().board[2][1] = eight;
    game().board[2][2] = nine;

    return game().getwinner();
}








