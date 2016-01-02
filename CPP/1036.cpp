#include <stdio.h>
#include <math.h>
 
void f(int n, char ch)
{
	for (int i=0; i<n; i++){
		printf("%c", ch);
	}
	printf("\n");
}

void g(int n, char ch)
{
	printf("%c", ch);
	for (int i=0; i<n-2; i++){
		printf(" ");
	}
	printf("%c\n", ch);
}

int main()
{
	int n;
	char ch;
	while (~scanf("%d %c", &n, &ch))
	{
		f(n, ch);
		int l = round((double)n / 2.0);
		for (int i=0; i<l-2; i++){
			g(n, ch);
		}
		f(n, ch);
	}
	return 0;
}
