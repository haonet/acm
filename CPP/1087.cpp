#include <iostream>

using namespace std;

typedef struct _Point{
	int x;
	int y;
}Point;

int main()
{
	int n;
	while (cin >> n)
	{
		Point *point = new Point[n];
		for (int i=0; i<n; i++){
			cin >> point[i].x >> point[i].y;
		}
		int count = 1, max = 1;
		for (int i=0; i<n; i++){
			count = 1;
			for (int a=i, b=i+1; b<n; ){
				if (point[a].y <= point[b].x){
						count++;
						a++;
						b++;
					}else {
						b++;
					}
			}
			if (count > max)
				max = count;
		}
		cout << max << endl;
		delete []point;
	}
	return 0;
}
