#include <iostream>
#include <string>
#include <vector>
using namespace std;

int main()
{
    string s;
    while (cin >> s)
    {
        vector<string> v;
        for (int i=0; i<s.length(); i++) {
        	  if (find(s)) != v.end()){
        			v.push_back(s);
			}
		}
    }
    return 0;
}

