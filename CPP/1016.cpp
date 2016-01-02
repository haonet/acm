#include <iostream>

using namespace std;

int main()
{
	int n, m;
	while ( cin >> n >> m )
	{
		if ( n == 0 && m == 0 ) break;
		if ( n != 0 && m == 0 ) {
			cout << n-1 << endl; continue;
		}
		int p, q, count = 1, a[201] = {0};
		cin >> p >> q;
		a[p] = a[q] = count;
		for ( int i=1; i<m; i++ ){
			cin >> p >> q;
			if ( a[p] ) a[q] = count;
			else if ( a[q] ) a[p] = count;
			else {
				count++;
				a[p] = a[q] = count;
			}
		}
		for ( int i=1; i<=n; i++ )
			if ( !a[i] )
				count++;
		cout << count-1 << endl;
	}
	
	return 0;
}
/*#include<iostream>
using namespace std;
int main()
{
    int n,m;
    while(cin>>n>>m){
          int p,q,a[201]= {0},count=1;
        if(n==0&&m==0)break;
        if(m==0&&n!=0){cout<<n-1<<endl;continue;}
        cin>>p>>q;
        a[p]=a[q]=count;
        for(int i=1; i<m; i++){
            cin>>p>>q;
            if(a[p]!=0)a[q]=count;
            else if(a[q]!=0)a[p]=count;
            else {
                count++;
                a[p]=count;
                a[q]=a[p];
            }
        }
        for(int i=1; i<=n; i++)if(a[i]==0)count++;//这里是判断1...n，第一次写成0...n-1，wrong了一次
        cout<<count-1<<endl;
    }
    return 0;
}*/
