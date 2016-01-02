#include <stdio.h>
char index[100];
int iNum[100];
int main()
{
	char ch;
	int num, count = 0;
	while (~scanf("%c = %d", &ch, &num))
	{
		index[count] = ch;
		iNum[count] = num;
		count++;
	}
	return 0;
}
