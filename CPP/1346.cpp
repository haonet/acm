#include <iostream>
#include <cstdio>

using namespace std;

int main()
{
	int n;
	while ( cin >> n)
	{
		if ( n  % 2 == 0)
		{
			double sum = 0;
			for ( int i=2; i<=n; i+=2 ){
				sum += (1/(double)i);
			}
			printf("%.6lf\n", sum);
		}else{
			double sum = 0;
			for ( int i=1; i<=n; i+=2 ){
				sum += (1/(double)i);
			}
			printf("%.6lf\n", sum);
		}
	}	
	
	return 0;
}
