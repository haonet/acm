#include <iostream>
#include <cstdio>

using namespace std;

int main()
{
	int n;
	while (cin >> n)
	{
		for (int i=1; i<=n; i++ ){
				for ( int j=1; j<=i; j++){
					printf("%d*%d=%d ", j, i, i*j);
				}
			printf("\n");
		}
	}
	
	return 0;
}
