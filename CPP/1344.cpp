#include <iostream>

using namespace std;

bool f(int i)
{
	if ( i < 10 ) return true;
	if (i<100 && i >= 10){
			if (i/10 == i%10) 
				return true;
		}
		if ( i < 1000 && i > 100){
			if ( i /100 == i % 10 )
				return true;
		}
		if ( i >= 1000 && i<10000){
			if ( i / 1000 == i % 10 && i/100%10 == i/10%10)
				return true;
		}
		return false;
}

int main()
{
	int m, n;
	while (cin >> m >> n)
	{
		int count = 0;
		for (int i=m; i<=n; i++){
			if (f(i))
				count++;
		}
		cout << count << endl;
	}
	return 0;
}
