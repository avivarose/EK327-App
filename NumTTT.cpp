#include "NumTTT.h"

using namespace std;

//Class implemendation for numerical tic-tac-toe

NumTTT::NumTTT()
	{
		int a = 1;
		int b = 2;
		for (int i = 0; i < 4; i++)
			{
				odds[i] = a;
				a = a+2;
			}
		for (int i = 0; i < 5; i++)
			{
				evens[i] = b;
				b = b+2;
			}
		for (int i = 0; i < 3; i++)
			{
				for (int j = 0; j < 3; j++)
				{
					board[i][j] = 0;
				}
			}
		this -> testforend = false;
		size = 0;
	}

int NumTTT::getr()
{
    return r;
}

void NumTTT::setr(int r) //Sets row for value to be placed
{
    this->r = r;
}

int NumTTT::getc()
{
    return c;
}

void NumTTT::setc(int c) //Sets column for value to be placed
{
    this->c = c;
}

int NumTTT::getnum()
{
    return num;
}

void NumTTT::setnum(int num) //Sets value to be placed on board
{
    this->num = num;
}


int NumTTT::horizontalCheck(int last)
{
	for (int i = 0; i < 3; i ++)
	{
		if (((board[i][0]+board[i][1]+board[i][2])==15)&&(board[i][0]!=0 && board[i][1]!=0 && board[i][2] != 0))
			{
			this -> testforend = 1;
            if (last%2 == 0)
            {
                winner = 2;
            }
            else
            {
                winner = 1;
            }
			return this -> testforend;
			}
	}
return 0;
}

int NumTTT::verticalCheck(int last)
{
	for (int i = 0; i < 3; i ++)
	{
		if (((board[0][i]+board[1][i]+board[2][i])==15)&&(board[0][i]!=0 && board[1][i]!=0 && board[2][i] != 0))
			{
			this -> testforend = 1;
            if (last%2 == 0)
            {
                winner = 2;
            }
            else
            {
                winner = 1;
            }
			return this -> testforend;
			}
	}
    return 0;
}

int NumTTT::diagonalCheck( int last)
{
	if (((board[0][0]+board[1][1]+board[2][2])==15)&&(board[0][0]!=0 && board[1][1]!=0 && board[2][2] != 0))
			{
			this -> testforend = 1;
            if (last%2 == 0)
            {
                winner = 2;
            }
            else
            {
                winner = 1;
            }
			return this -> testforend;
			}
	else if (((board[0][2]+board[1][1]+board[2][0])==15)&&(board[0][2]!=0 && board[1][1]!=0 && board[2][0] != 0))
			{
			this -> testforend = 1;
            if (last%2 == 0)
            {
                winner = 2;
            }
            else
            {
                winner = 1;
            }
			return this -> testforend;
			}
	else
			{
			return this -> testforend;
			}
}

void NumTTT::move()
{
    if (board[r][c] != 0)
    {
	board[r][c] = num;
    }
    else
    {
        cout << "Error!" << endl;
    }
	if (num%2 == 0)
	{
		for (int i = 0; i < 4; i++)
		{
			if (evens[i] == num)
			{
				evens[i] = 0;
				used[size] = num;
				size ++;
			}
		}
	}
	else
	{
		for (int i = 0; i < 5; i++)
		{
			if (odds[i] == num)
			{
				odds[i] = 0;
				used[size] = num;
				size ++;
			}
		}
	}
}

int NumTTT::getwinner()
{
    return winner;
}
