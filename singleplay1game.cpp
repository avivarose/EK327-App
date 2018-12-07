#include "NumTTT.h"
#include <cstdlib>
#include <ctime>
#include <vector>
using namespace std;

int main()
{
    std::vector<int> options;
    options.push_back(2);
    options.push_back(4);
    options.push_back(6);
    options.push_back(8);

    int optNum = 4, randNum, usedNum, randr, randc, win;
    srand(time(NULL));
    
    NumTTT game1;
    while (game1.testforend!=true)
    {
        //Access r,c,num data members to set before move
        game1.move(); //User moves
        //Check for win
        game1.diagonalCheck(); //Check diagonals for win
        game1.verticalCheck(); //Check verticals for win
        game1.horizontalCheck(); //Check horizontals for win
        randNum = (rand() % optNum); //Generate index
        usedNum = options[randNum]; //Get computer number
        optNum--; //decrement possible indices
        randr = (rand() % 3) + 1; //get row
        randc = (rand() % 3) + 1; //get column
        game1.setc(randc); //set column
        game1.setr(randr); //set row
        game1.setnum(usedNum); //set number
        delay(1000)
        game1.move(); //Computer moves
        //Check for win
        game1.diagonalCheck(); //Check diagonals for win
        game1.verticalCheck(); //Check verticals for win
        game1.horizontalCheck(); //Check horizontals for win
    }
    return game1.getwinner();
}
