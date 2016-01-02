#include <iostream>

using namespace std;

int main()
{
	int x, y, m, n;
	long long L;
	while (cin >> x >> y >> m >> n >> L){
	
		int k = 1;
		for (k = 1; ; k++){
			if ((x + m * k) % L == (y + n * k) % L)
			{
				cout << k << endl;
				break;
			}
			if ( (x + m * k) % L == x && (y + n * k) % L == y || k > 50000){
				cout << "Impossible" << endl;
				break;
			}
		}
	}
	return 0;
}
