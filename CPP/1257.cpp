#include <iostream>
#include <math.h>
#include <cstdio>
#define LL long long
using namespace std;

int main()
{
	LL n;
	while (cin >> n)
	{
		double s = 1;
		for (int i=1; i<=n; i++){
			s += log10((double)i);
		}
		printf("%d\n", (int)s);
	}
	return 0;
}
