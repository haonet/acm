#include <iostream>
using namespace std;

int main()
{
	for ( int i=10; i<=99; i++){
		for ( int j=0; j<=99; j++ ){
			if ((i+j)*(i+j) == i * 100 + j)
			{
				cout << i;
				if ( j  < 10 )
					cout << "0" << j;
				else 
				cout << j << endl;;
			}
		}
	}
	return 0;
}
