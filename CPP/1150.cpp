#include <cstdio>
#include <string.h>
#include <iostream>
#define LL long long
char a[20];
LL n;
int k;
using namespace std;
LL f(LL n)
{
	LL num = 0, max = 0;;
	char s[100];
	sprintf(s, "%I64d", n);
	int k = strlen(s);
	for (int i=0; i<k; i++){
		num = 0;
		for (int j=0; j<k; j++){
			if (i != j){
				num = num * 10 + s[j] - '0';
			}
		}
		if (max < num)
			max = num;
	}
	return max;
}

void solve()
{
	while (k--){
		n = f(n);
	}
	cout << n << endl;
}
int main()
{
	int t;
	while (cin >> t)
	{
		while (t--)
		{
			scanf("%I64d %d", &n, &k);
			solve();
		}
	}
	return 0;
}
