#include <iostream>
#include <string>

using namespace std;

int main()
{
	string s;
	int p = 0;
	int n;
	cin >> n;
	while ( n-- )
	{
		cin >> s;
		p = 0;
		for ( int i=2; i<s.length();  i++){
			if (s[i-1] == '/' && s[i-2] == '/')
			{
				p =  1;
			}
			if ( p == 1 ){
				cout << s[i];
			}
			if ( i == s.length()-1 || p == 1 && s[i+1] == '/' || s[i+1] == ':' && p == 1) 
				break;
		}
		cout << endl;
	}
	
	return 0;
}
