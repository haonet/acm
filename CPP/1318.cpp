#include <iostream>

using namespace std;

long long fun(int m) {
	long long k = 1;
	for (int i=1; i<=m; i++)
		k *= i;
	return k;
}

long long Cnm(int n, int m) 
{
	return fun(n)/fun(n-m)/fun(m);
}

long long f(int n) 
{
	long long sum = 1;
	for (int i=1; i<n; i++){
		sum += (i + 1)*Cnm(n-1, i);
	}
	return sum;
}

int main()
{
	int n, t;
	while (cin >> t)
	{
		while (t--) {
			cin >> n;
			cout << f(n) << endl;
		}
	}
	return 0;
}
