#include <iostream>

using namespace std;

int f(int n)
{
	int s = 1, count = 1;
	while (s % n)
	{
		s = (s * 10 + 1) % n;
		count++;
	}
	return count;
}

int main()
{
	int n;
	while (cin >> n)
	{
		cout << f(n) << endl;
	}
	return 0;
}
