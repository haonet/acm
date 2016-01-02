#include <iostream>
#include <cstdio>
#include <math.h>
using namespace std;

int main()
{
	double a;
	while ( cin >> a )
	{
		printf("%.3lf\n", 3*sqrt(3)*pow(a, 2)/2.0);
	}
	
	return 0;
 } 
