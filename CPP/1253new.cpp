#include <iostream>
#include <string.h>

using namespace std;

int main()
{
	char s[10001];
	bool p = false;
	while ( gets(s) )
	{
		p = false;
		int a[26] = {0};
//		for ( int i=0; i<26; i++ ){
//			a[i] = 0;
//		}
		for ( int i=0; i<strlen(s); i++ ){
			a[s[i]-'A']++;
		}
		for (int i=0; i<strlen(s); i++ ){
			if ( a[s[i]-'A'] == 1 ){
				cout << i << endl;
				p = true;
				break;
			}
		}
		if (!p)
			cout << "-1" << endl;
	}
	
	return 0;
}
