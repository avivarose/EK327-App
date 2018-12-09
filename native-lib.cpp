#include <jni.h>
#include <string>
#include "NumTTT.h"
extern "C"{
    JNIEXPORT jint JNICALL Java_com_ec327mtictactoe_tictactoe_Game_checkEnd(JNIEnv *env, jobject instance, jint n1, jint n2, jint n3, jint n4, jint n5, jint n6, jint n7, jint n8, jint n9, jint last){
        NumTTT game;
        game.board[0][0] = n1;
        game.board[0][1] = n2;
        game.board[0][2] = n3;
        game.board[1][0] = n4;
        game.board[1][1] = n5;
        game.board[1][2] = n6;
        game.board[2][0] = n7;
        game.board[2][1] = n8;
        game.board[2][2] = n9;

        game.verticalCheck(last);
        game.horizontalCheck(last);
        game.diagonalCheck(last);

        return game.testforend;

    }

    JNIEXPORT jint JNICALL Java_com_ec327mtictactoe_tictactoe_Game_winner(JNIEnv *env, jobject instance, jint n1, jint n2, jint n3, jint n4, jint n5, jint n6, jint n7, jint n8, jint n9, jint last){
        NumTTT game;
        game.board[0][0] = n1;
        game.board[0][1] = n2;
        game.board[0][2] = n3;
        game.board[1][0] = n4;
        game.board[1][1] = n5;
        game.board[1][2] = n6;
        game.board[2][0] = n7;
        game.board[2][1] = n8;
        game.board[2][2] = n9;

        game.verticalCheck(last);
        game.horizontalCheck(last);
        game.diagonalCheck(last);

        return game.winner;
    }






}
