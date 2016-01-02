#include <iostream>

using namespace std;

int MOD = 10003;

int pow1(int i, int n) 
{
	i %= MOD;
	if ( n == 0 || i == 1 )
		return 1;
	if ( i == 0 )
		return 0;
	if ( n  % 2 == 0 )
		return pow1(i*i, n/2) % MOD;
	else
		return pow1(i*i, n/2)*i % MOD;

}

int pow2(int m, int n) 
{
	m %= MOD;
	int k = 1;
	for ( int i=0; i<n; i++ ) 
	{
		k = (k*m) % MOD;
	}
	return k;
}

int main() {
	int i, n;
	while ( cin >> i >> n ) 
	{
		cout << pow1(i, n) << endl;
		cout << pow2(i, n) << endl;
	}

	return 0;
}
