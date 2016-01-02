#include <iostream>
#include <string.h>
#include <cstdio>

using namespace std;

char str[100002];


int main()
{
	while ( gets(str) )
	{
		int a = 0, b = 0, c = 0, d = 0;
		for ( int i=0; i<strlen(str); i++ ){
			if ( str[i] >= 'a' && str[i] <= 'z' || str[i] >= 'A' && str[i] <= 'Z' )
				a++;
			else if ( str[i] >= '0' && str[i] <= '9' )
				b++;
			else if ( str[i] == ' ' )
				c++;
			else 
				d++;
		}
		cout << a << " " << b << " " << c << " " << d << endl;
	}
	
	return 0;
}
