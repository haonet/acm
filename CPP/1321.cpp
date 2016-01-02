#include <stdio.h>

const int a[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
const int b[] = { 0, 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334 };

int main()
{
	int year, month, day, t;
	while (~scanf("%d/%d/%d %d", &year, &month, &day, &t))
	{
		int tDay = 10000 % t == 0 ? 10000 / t : 10000 / t + 1;
		int today = b[month] + day;
		int end = today + tDay;
		int tYear = end / 365;
		end %= 365;
		int tMonth = 0, i, j;
		for ( i = 1; i <= 12; i++) {
			for ( j = 1; j <= a[i]; j++) {
				if (j + b[i] == end) {
					tMonth = i;
					tDay = j;
					break;
				}
			}
		}
		printf("%d/%d/%d\n", tYear+year, tMonth, tDay-1);
	}
	return 0;
}
