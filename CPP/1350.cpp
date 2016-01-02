#include <stdio.h>


int main()
{
    int n;
    int i, A = 0, B = 0, C = 0, D = 0, E = 0;
    scanf("%d", &n);
    for ( i=0; i<n; i++){
        int a;
        scanf("%d", &a);
        if (a >= 90 && a <= 100){
				A++;
		}else if (a >= 80 && a < 90){
			B++;
		}else if (a >= 70 && a < 80){
			C++;
		}else if (a >= 60 && a < 70){
			D++;
		}else if (a >= 0 && a < 60){
			E++;
		}
    }
    printf("%d %d %d %d %d\n", A, B, C ,D, E);
    return 0;
}

