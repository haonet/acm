#include <iostream>

using namespace std;

typedef struct _cuboid{
	int No;
	int length;
	int width;
} cuboid; 

void Sort(cuboid *pA, int n)
{
	cuboid temp;
	for ( int i=0; i<n-1; i++ )
		for ( int j=i+1; j<n; j++ )
		{
			if ( pA[i].No > pA[i].No )
			{
				temp = pA[i];
				pA[i] = pA[j];
				pA[j] = temp;
			}
			else if ( pA[i].No == pA[j].No )
			{
				if ( pA[i].length > pA[j].length )
				{
					temp = pA[i];
					pA[i] = pA[j];
					pA[j] = temp;
				}
				else if (pA[i].length == pA[j].length)
				{
					if ( pA[i].width > pA[j].width )
					{
						temp = pA[i];
						pA[i] = pA[j];
						pA[j] = temp;
					}
				}
			}
		}
}

int main()
{
	int t;
	cin >> t;
	while (t--)
	{
		int n, tempLength, tempWidth;
		cin >> n;
		cuboid *p = new cuboid[n];
		for ( int i=0; i<n; i++ ) 
		{
			cin >> p[i].No >> tempLength >> tempWidth;
			if( tempLength < tempWidth )
			{
				p[i].width = tempLength;
				p[i].length = tempWidth;
			}
			else {
				p[i].width = tempWidth;
				p[i].length = tempLength;
			}
		}
		Sort(p, n);
		cout << p[0].No << " " << p[0].length << " " << p[0].width << endl;
		for ( int i=1; i<n; i++ )
		{
			if ( p[i].No == p[i-1].No && p[i].length == p[i-1].length && p[i].width == p[i-1].width )
				continue;
			cout << p[i].No << " " << p[i].length << " " << p[i].width << endl;
		}
		delete []p;
	}
	return 0;
}
