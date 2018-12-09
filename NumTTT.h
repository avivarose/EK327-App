#include <iostream>
using namespace std;

class NumTTT
{
	public:
		NumTTT();
		int horizontalCheck(int last); //Checks for win along horizontals
		int verticalCheck(int last); //Checks for win along verticals
		int diagonalCheck(int last); //Checks for win along diagonals
		void move();
        int getr(); //Returns row for value to be placed
        void setr(int r); //Sets row for value to be placed
        int getc(); //Returns column for value to be placed
        void setc(int c); //Sets column for value to be placed
        int getnum(); //Returns value to be placed on board
        void setnum(int num); //Sets value to be placed on board
        int getwinner(); //Returns 1 (player 1 - odds) or 2 (player 2 - evens)
        int board[3][3]; //Basic 3-by-3 grid
        int odds[5]; //1,3,5,7,9
        int evens[4]; //2,4,6,8
        int num; //Value to place on board
        int r; //Row number
        int c; //Column number
        int winner; //Player 1 is odds, Player 2 is evens
        int testforend = 0; //Boolean value to test if game has been won

	private:
        int size; //Size of array of used numbers
        int used[]; //Stores used numbers
};
