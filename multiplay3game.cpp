#include "NumTTT.h"
using namespace std;

int main()
{
    int win, player1count=0, player2count=0;
    NumTTT game1;
    while (game1.testforend!=true)
    {
        //Access r,c,num data members to set before move
        game1.move();
        //Check for win
        game1.diagonalCheck();
        game1.verticalCheck();
        game1.horizontalCheck();
    }
    
    //Keep count of best out of three
    win = game1.getwinner();
    if (win==1)
    {
        player1count++;
    }
    else
    {
        player2count++;
    }
    
    NumTTT game2;
    while (game2.testforend!=true)
    {
        game2.move();
        game2.diagonalCheck();
        game2.verticalCheck();
        game2.horizontalCheck();
    }
    
    win = game2.getwinner();
    if (win==1)
    {
        player1count++;
            if (player1count == 2)
            {
                return win;
            }
    }
    else
    {
        player2count++;
            if (player2count == 2)
            {
                return win;
            }
    }
    
    NumTTT game3;
    while (game3.testforend!=true)
    {
        game3.move();
        game3.diagonalCheck();
        game3.verticalCheck();
        game3.horizontalCheck();
    }
    
    win = game3.getwinner();
    if (win==1)
    {
        player1count++;
            if (player1count == 2)
            {
                return win;
            }
    }
    else
    {
        player2count++;
            if (player2count == 2)
            {
                return win;
            }
    }
    
}
