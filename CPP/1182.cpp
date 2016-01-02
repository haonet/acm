#include <iostream>

using namespace std;

int main()
{
	int n, k, p = 0;
	while ( cin >> n >> k )
	{
		p = 0;
		if ( n == 0 && k == 0 ) break;
		int i = 1, j = n-1, r;
		while ( i <= j )
		{
			if ( i * j == k ) 
			{
				p = 1;
				break;
		    }
			i++; j--;
		}
		if ( p ) cout << "YES" << endl;
		else cout << "NO" << endl;
	}
	
	return 0;
}
