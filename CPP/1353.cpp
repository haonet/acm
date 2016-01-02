#include <stdio.h>

int main()
{
	int n;
	while (~scanf("%d", &n))
	{
	
		if (n <= 24){
			printf("Oh yeah\n");
		}else if (n > 24 && n < 50){
			printf("cost = %.2f\n", (double)(n-24)*0.53);
		}else {
			printf("cost = %.2f\n", (double)(50 - 24)*0.53 + (double)(n-50) * 0.60);
		}
	}
	return 0;
}
