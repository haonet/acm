#include <iostream>

using namespace std;

int main()
{
	int m, n, k;
	double l;
	while ( cin >> m >> n >> k )
	{
		l = k + (m -n)*5/2.0;
		if ( l >= m ) cout << "You have slain an enemy" << endl;
		else cout << "You have been slayed" << endl;
	}
	
	return 0;
}
