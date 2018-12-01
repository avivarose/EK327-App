#include "NumTTT.h"
using namespace std;

int main()
{
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
    
    //Return winning player
    return game1.getwinner();
}
