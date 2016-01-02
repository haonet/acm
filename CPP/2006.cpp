#include <stdio.h>

int main()
{
	int sum = 1;
	int n;
	while (~scanf("%d", &n))
	{
		int temp;
		sum = 1;
		bool judge = false;
		for (int i=0; i<n; i++){
			scanf("%d", &temp);
			if (temp % 2 == 1){
				sum *= temp;
				judge = true;
			}
		}
		if (judge){
			printf("%d\n", sum);
		}else 
			printf("0\n");
	}
	return 0;
} 
