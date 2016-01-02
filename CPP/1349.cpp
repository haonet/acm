#include <iostream>

using namespace std;
const string a[] = { "ling", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
				"twelve", "thirteen", "fourteen", "fifteen", "sisteen", "seventeen", "eighteen", "nineteen", "twenty" };

int main()
{
	string s1, s2;
	
	while (cin >> s1 >> s2)
	{
		int a1 = 0, a2 = 0;
		for (int i=0; i<21; i++){
			if (s1 == a[i])
			{
				a1 = i;
				break;
			}
		}
		for (int j=0; j<21; j++){
			if (s2 == a[j])
			{
				a2 = j;
				break;
			}
		}
		cout << a[a1+a2] << endl;
    }
	return 0;
}
