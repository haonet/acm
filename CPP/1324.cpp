#include <iostream>
#include <cstdio>
#include <algorithm>
#include <math.h>

int a[110];

using namespace std;

int judge(int a, int b, int c)
{
	int p = 0;
	if ( a + b > c && abs(a-b) < c )
		p = 1;
	return p;
}

int main()
{
	int n, p = 0;
	while ( cin >> n )
	{
		p = 0;
		for ( int i=0; i<n; i++ ){
			cin >> a[i];
		}
		sort(a, a+n);
		for ( int i=n-1; i>=2;i-- ){
			for ( int j=i-1; j>=1; j-- ){
				for ( int k = j-1; k>=0;k--){
					if ( judge(a[i], a[j], a[k]) ){
						cout << a[i] + a[j] + a[k] << endl;
						p = 1;
						break;
					}
				}
				if ( p ) break;
			}
			if ( p ) break;
		}
		if ( p == 0 ) cout << "0" << endl;
	}
	
	return 0;
}
