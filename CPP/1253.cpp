#include <iostream>
#include <string>

using namespace std;

int main()
{
	string s;
	int p = 0;
	while ( cin >> s)
	{
		p = 0;
		int a[26] = {0};
//		for ( int i=0; i<26; i++ ){
//			a[i] = 0;
//		}
		for ( int i=0; i<s.length(); i++ ){
			a[s[i]-'A']++;
		}
		for (int i=0; i<s.length(); i++ ){
			if ( a[s[i]-'A'] == 1 ){
				cout << i << endl;
				p = 1;
				break;
			}
		}
		if (p != 1)
			cout << "-1" << endl;
	}
	
	return 0;
}
