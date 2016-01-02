#include <iostream>
#include <string>

using namespace std;

int main()
{
	int t, count, cnt;
	while (cin >> t)
	{
		while ( t-- )
		{
			count = cnt = 0;
			string s;
			cin >> s;
			for ( int i=0; i<s.length(); i++ ){
				if ( s[i] != '0' ) count++;
				else{
					count = 0;
				}
				if ( count >= 8 ){
					cnt++;
				}
			}
			cout << cnt << endl;
		}
    }
	
	return 0;
}
