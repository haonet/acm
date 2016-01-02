#include <stdio.h>

double g(int n, int m)
{
	double k = 1.0;
	for (int i = n; i >= m; i--)
		k *= (double)i;
	return k;
}

double f(int n) 
{
	double k = 1.0;
	for (int i = 1; i <= n; i++)
		k *= (double)i;
	return k;
}

 double Cnm(int n, int m)
{
	int min = (n - m) <= m ? n - m : m;
	int max = (n - m) > m ? n - m : m;
	return g(n, max + 1) / f(min);
}

int main()
{
	int n, m;
	while (~scanf("%d%d", &n, &m) )
	{
		if (n == 0 && m == 0)
			break;
		printf("%.f\n", Cnm(n+m, m));
	}
	return 0;
}
