#include <iostream>

using namespace std;

int toDec(string s) {
	int k = 1, sum = 0;
	for ( int i=0; i<s.length(); i++ ) {
		sum = sum * 2 + (s[i] - '0');
	}
	return sum;
}

void print(int n) {
	int a[33], i;
	for ( i=0; i<32; i++ ) {
		a[i] = n % 2;
		n /= 2;
		if ( n == 0 ) break;
	}
	for ( ; i>=0; i-- ) {
		cout << a[i];
	}
	cout << endl;
}

int main() {
	string s1, s2;
	char op;
	cin >> s1 >> op >> s2;
	if ( op == '+')
		print(toDec(s1)+toDec(s2));
	else
		print(toDec(s1)-toDec(s2));
	return 0;
}
