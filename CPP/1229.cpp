#include <iostream>
#include <cstdio>

using namespace std;

const char STAR = '*';

int isPrime(int n)
{
	int p = 1;
	if ( n == 1 || (n % 2 == 0 && n != 2)) p = 0;
	else {
		for ( int i=2; i*i<=n; i++){
			if ( n % i == 0 ){
				p = 0;
				break;
			}
		}
	}
	return p;
}

int main()
{
	int n, first = 1;
	while ( cin >> n )
	{
		first = 1;
		if ( n == 0 ) break;
		if ( n == 1 ) cout << n << endl;
		else if ( isPrime(n) ){
			cout << n << endl;
		}
		else {
			while ( n % 2 == 0 && n != 0 )
			{
				if ( first ){
					cout << "2";
					first = 0;
				}
				else {
					cout << STAR << "2";
				}
				n /= 2;
			}
			if ( n != 1 ){
				for ( int i=3; ;){
					if ( isPrime(i) ){
						if ( n % i == 0 ) {
							if ( first ){
								cout << i;
								first = 0;
							}
							else {
								cout << STAR << i;
							}
							n /= i;
						}
						else i+=2;
					}
					else i += 2;
					if ( isPrime(n) ) {
						cout << STAR << n;
						break;
					}
					if ( n == 1 ) break;
				}
		    }
		    cout << endl;
		}
	}
	
	return 0;
}
