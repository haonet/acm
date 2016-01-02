#include <iostream>

using namespace std;

int main()
{
	int a, b, c;
	for ( a=0; a<3; a++ )
		for ( b=0; b<5; b++) 
			for ( c=0; c<7; c++ )	{
				cout << a << " " << b << " " << c <<  ": ";
				int n = (a * 70 + b * 21 + c * 15) % 105;
				if ( n >= 10 && n <= 100 ){
					cout << "answer" << ": "<< n << endl;
				}else{
					cout << "No answer" << endl;
				}
	   		}
	
	return 0;
}
