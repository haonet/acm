#include <iostream>
#include <string>
#include <string.h>
#include <cstdio>

using namespace std;

int main()
{
	string s1, s2;
	while (cin >> s1 >> s2)
	{
		for (int i=0; i<s1.length(); i++){
			if (s1[i] >= 'A' && s1[i] <= 'Z'){
				s1[i] = s1[i] + 32;
			}
		}
		for (int i=0; i<s2.length(); i++){
			if (s2[i] >= 'A' && s2[i] <= 'Z'){
				s2[i] = s2[i] + 32;
			}
		}
		if (s1 == s2){
			cout << "yes" << endl;
		}else if (s1.length() + 1 == s2.length()) {
			bool first = true;
			int i = 0, j = 0;
			for (i=0, j=0; i<s1.length() && j<s2.length(); i++, j++){
				if (s1[i] != s2[j] && first){
						j++;
						first = false;
					}else if (s1[i] != s2[j] && !first){
						break;
					}
			}
			if (i != s1.length() && j != s2.length()){
				cout << "no" << endl;
			}else {
				cout << "yes" << endl;
			}
		}else if (s1.length() == s2.length() + 1){
			bool first = true;
			int i = 0, j = 0;
			for (i=0, j=0; i<s1.length() && j<s2.length(); i++, j++){
				if (s1[i] != s2[j] && first){
						i++;
						first = false;
					}else if (s1[i] != s2[j] && !first){
						break;
					}
			}
			if (i != s1.length() && j != s2.length()){
				cout << "no" << endl;
			}else {
				cout << "yes" << endl;
			}
		}else {
			cout << "no" << endl;
		}
	}
	return 0;
}
