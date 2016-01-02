#include <cstdio>

int main()
{
	int a, b;
	while (~scanf("%d%d", &a, &b))
	{
		if ( a % b == 0 )
			printf("%d\n", a/b);
		else
			printf("%.2lf\n", (double)a/(double)b);
	}
	return 0;
}
