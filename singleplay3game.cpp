#include "NumTTT.h"
#include <cstdlib>
#include <ctime>
#include <vector>
using namespace std;

int main()
{
    int win, player1count=0, player2count=0;
    std::vector<int> options;
    options.push_back(2);
    options.push_back(4);
    options.push_back(6);
    options.push_back(8);
    int optnum = 4, randNum, usedNum, randr, randc;
    srand(time(NULL));
    
    NumTTT game1;
    if (game1.testforend!=true)
    {
        //Access r,c,num data members to set before move
        game1.move(); //User moves
        //Check for win
        game1.diagonalCheck(); //Check diagonals for win
        game1.verticalCheck(); //Check verticals for win
        game1.horizontalCheck(); //Check horizontals for win
    }
    if (game1.testforend!=true)
    {
        randNum = (rand() % optnum); //Generate index
        usedNum = options[randNum]; //Get computer number
        optnum--; //decrement possible indices
        randr = (rand() % 3) + 1; //get row
        randc = (rand() % 3) + 1; //get column
        game1.setc(randc); //set column
        game1.setr(randr); //set row
        game1.setnum(usedNum); //set number
        delay(1000);
        game1.move(); //Computer moves
        //Check for win
        game1.diagonalCheck(); //Check diagonals for win
        game1.verticalCheck(); //Check verticals for win
        game1.horizontalCheck(); //Check horizontals for win
    }
    
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
    if (game2.testforend!=true)
    {
        //Access r,c,num data members to set before move
        game2.move(); //User moves
        //Check for win
        game2.diagonalCheck(); //Check diagonals for win
        game2.verticalCheck(); //Check verticals for win
        game2.horizontalCheck(); //Check horizontals for win
    }
    if (game2.testforend!=true)
    {
        randNum = (rand() % optnum); //Generate index
        usedNum = options[randNum]; //Get computer number
        optnum--; //decrement possible indices
        randr = (rand() % 3) + 1; //get row
        randc = (rand() % 3) + 1; //get column
        game2.setc(randc); //set column
        game2.setr(randr); //set row
        game2.setnum(usedNum); //set number
        delay(1000);
        game2.move(); //Computer moves
        //Check for win
        game2.diagonalCheck(); //Check diagonals for win
        game2.verticalCheck(); //Check verticals for win
        game2.horizontalCheck(); //Check horizontals for win
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
    if (game3.testforend!=true)
    {
        //Access r,c,num data members to set before move
        game3.move(); //User moves
        //Check for win
        game3.diagonalCheck(); //Check diagonals for win
        game3.verticalCheck(); //Check verticals for win
        game3.horizontalCheck(); //Check horizontals for win
    }
    if (game3.testforend!=true)
    {
        randNum = (rand() % optnum); //Generate index
        usedNum = options[randNum]; //Get computer number
        optnum--; //decrement possible indices
        randr = (rand() % 3) + 1; //get row
        randc = (rand() % 3) + 1; //get column
        game3.setc(randc); //set column
        game3.setr(randr); //set row
        game3.setnum(usedNum); //set number
        delay(1000);
        game3.move(); //Computer moves
        //Check for win
        game3.diagonalCheck(); //Check diagonals for win
        game3.verticalCheck(); //Check verticals for win
        game3.horizontalCheck(); //Check horizontals for win
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
