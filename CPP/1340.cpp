#include <iostream>
#include <cstdio>
#include <string.h>
using namespace std;

int main()
{
	int n, i, p = 0, first = 1;
	cin >> n;
	char ch[10], temp[10];
	scanf("%s", ch);
	for (i=1; i<=n; i++ ){
		scanf("%s", temp);
		if (strcmp(temp, ch) == 0 && first){
			p = i;
			first = 0;
		}
	}

	if ( p == 0 )
		cout << "try again" << endl;
	else 
		cout << p << endl;
	return 0;
}
