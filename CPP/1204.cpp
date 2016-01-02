//#include <stdio.h>//这个代码方法也还不错
//int main()
//{
//	int m, n, f[1000], g[1000];
//	int i, j, count;
////	freopen("input.txt","r",stdin);
//	while( scanf("%d %d", &m, &n)!=EOF)
//	{
//		for (i=0; i<m; i++)
//			scanf("%d", &f[i]);
//		for (i=0; i<n; i++)
//			scanf("%d", &g[i]);
//		count = 0;
//		i = 0;
//		j = 0;
//		while (i < m && j < n)
//		{
//			if (f[i] == g[j])
//			{
//				count++;
//				i++;
//				j++;
//			} else if (f[i] < g[j])
//			{
//				i++;
//			} else if (f[i] > g[j])
//			{
//				j++;
//			}
//		}
//		printf("%d\n", count);
//	}
//	return 0;
//}

#include<stdio.h>
int main() 
{
	int f[1001],g[1001],n,m,min,i;
	// freopen("input.txt","r",stdin);
	while(scanf("%d%d",&m,&n)!=EOF) {
		int num=0;
		for(i=1; i<=m; i++)
			scanf("%d",&f[i]);
		for(i=1; i<=n; i++)
			scanf("%d",&g[i]);
		min=m;
		if(n<min) min=n;
		for(i=1; i<=min; i++) {
			if(f[i]==g[i]) num++;
		}
		printf("%d\n",num);
	}
	return 0;
}
