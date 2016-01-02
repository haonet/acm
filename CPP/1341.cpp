#include <iostream>

using namespace std;

int main()
{
	int t;
	while (cin >> t)
	{
		int d, n;
		cin >> d >> n;
		int *a = new int[n];
		int count = 0;
		for (int i=0; i<n; i++){
			cin >> a[i];
			if (a[i] <= t+d)
				count++;
		}
		cout << count << endl;
		delete []a;
	}
	return 0;
 } 
