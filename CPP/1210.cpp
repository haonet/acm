#include <stdio.h>
#include <string.h>

char a[10010], b[10010];

int main()
{
	while (gets(a))
	{
		int k = strlen(a);
		int count = 0, j;
		b[0] = a[0];
		for (int i=2; i<k; i++){
			for (j=i-1; j>=0; j--){
				if (a[i] == a[j] && a[i] != ' '){
					break;
				}
			}
			if (j == 0)
				b[++count] = a[i];
		}
		for  (int i=0; i<=count; i++)
			printf("%c ", b[i]);
	}
} 
