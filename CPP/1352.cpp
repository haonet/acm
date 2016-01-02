#include <stdio.h>

int main()
{
	int n;
	int max = 0, maxIndex = 0;
	scanf("%d", &n);
	int *a = new int[n+1];
	for (int i=0; i<=n; i++){
		a[i] = 0;
	}
	for (int i=0; i<n; i++){
		int index;
		scanf("%d", &index);
		int score;
		scanf("%d", &score);
		a[index] += score;
		if (a[index] > max){
			max = a[index];
			maxIndex = index;
		}
	}
	printf("%d %d\n", maxIndex, max);
	delete []a;
	return 0;
}
