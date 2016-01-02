#include <iostream>

using namespace std;

int main()
{
	int x, y, z, t;
	while ( cin >> t )
	{	
		while ( t-- )
		{
			cin >> x >> y >> z;
			if ( (x + y - z) % 2 == 0 && (x + z - y) % 2 == 0 && (y + z - x) % 2 == 0)
			{
				int a = (x + y - z) / 2;
				int b = (x + z - y) / 2;
				int c = (y + z - x) / 2;
				if ( a > 0 && b > 0 && c > 0 ){
					cout << a << " " << b << " " << c << endl;
				} 
				else cout << "Impossible" << endl;
		    }
		    else cout<< "Impossible" << endl;
		}
    }
	
	return 0;
}
