#include <cstdio>
#include <iostream>
#include <string.h>

using namespace std;

char a[130], b[30];
int main()
{
	int t;
	while (cin >> t)
	{
		while (t--)
		{
			scanf("%s%s", a, b);
			if (strstr(a, b)){
				printf("%d\n", strstr(a, b) - a);
			} else 
			printf("-1\n");
		}
	}
	return 0;
}
