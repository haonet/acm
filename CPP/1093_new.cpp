#include <iostream>
#include <algorithm>

using namespace std;

struct _cube {
	int N0;
	int length;
	int width;
} cube[100];

bool compare( struct _cube a, struct _cube b) {
	if ( a.N0 < b.N0 || a.N0 == b.N0 && a.length < b.length || a.N0 == b.N0 && a.length == b.length && a.width < b.width )
		return true;
	return false;
}

int main() {
	int t;
	cin >> t;
	while (t--) {
		int n;
		cin >> n;
		for ( int i=0; i<n; i++ ) {
			cin >> cube[i].N0 >> cube[i].length >> cube[i].width;
			if ( cube[i].length < cube[i].width ) {
				int t = cube[i].length;
				cube[i].length = cube[i].width;
				cube[i].width = t;
			}
		}
		sort(cube, cube+n, compare);
		cout << cube[0].N0 << " " << cube[0].length << " " << cube[0].width << endl;
		for ( int i=1; i<n; i++ ) {
			if ( !(cube[i].N0 == cube[i-1].N0 && cube[i].length == cube[i-1].length && cube[i].width == cube[i-1].width)) {
				cout << cube[i].N0 << " " << cube[i].length << " " << cube[i].width << endl;
			}
		}

	}
	return 0;
}
