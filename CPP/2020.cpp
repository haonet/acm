#include <stdio.h>
#include <algorithm>

int a[1000];
int b[1000];

int main()
{
	int n;
	while (~scanf("%d", &n))
	{
		for (int i=0; i<n; i++){
			scanf("%d", &a[i]);
			if (a[i] < 0)
				b[i] = -a[i];
			else 
				b[i] = a[i];
		}
		
	
	}
	return 0;
}
