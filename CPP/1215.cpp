#include <iostream>

using namespace std;

bool isPrime(int n) 
{
	if (n == 0 || n == 1) return false;
	for ( int i=2; i*i<=n; i++){
		if ( n  % i == 0) 
			return false;
	}
	return true;
}

int f(int n) {

	int count = 0, sum = 0;
	for ( int i=2; i<=n; i++){
		sum = 0;
		if (isPrime(i)){
			for (int j=i; j<=n; j++){
				if (isPrime(j))
					sum += j;
				if (sum == n){
					count++;
					break;
				}if (sum > n){
					break;
				}
			}
		}
	}
	return count;
}

int main()
{
	int n;
	while (cin >> n)
	{
		if (n == 0) break;
		cout << f(n) << endl;
	}
	return 0;
}
