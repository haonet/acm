#include <iostream>

using namespace std;

int main()
{
	int t;
	while (cin >> t)
	{
		while (t--)
		{
			int n, s;
			cin >> n >> s;
			int *a = new int[n];
			for (int i=0; i<n; i++)
				cin >> a[i];
			int count = 0, min = n, sum = 0;
			for (int i=0; i<n; i++) {
				sum = count = 0;
				for (int j=i; j<n; j++){
					sum += a[j];
					count++;
					if (sum >= s)
						break;
				}
				if (sum >= s){
					if (count < min)
						min = count;
				}
			}
			cout << min << endl;
			delete []a;
		}
	}
	return 0;
}
