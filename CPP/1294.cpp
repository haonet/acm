#include <iostream>
#include <cstdio>
#include <string.h>
#define LL long long
using namespace std;

LL n;
int m, k;
char temp[100];

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
	LL s = 0;
	while (m--)
	{
		s = s * 10 + 9;
	}
	sprintf(temp, "%I64d%I64d", s, n);
	sscanf(temp, "%I64d", &n);
	while (k--)
	{
		n = f(n);
	}
	cout << n << endl;
}

int main()
{
    int t;
    cin >> t;
    while (t--) {
        cin >> n >> m >> k;
        solve();
    }
    return 0;
}
