#include <stdio.h>

int main()
{
    int n;
    bool judge = false;
    int s = 1;
    int i;
    scanf("%d", &n);
    for (i=0; i<n; i++){
        int data;
        scanf("%d", &data);
        if (data % 2 == 0){
            s *= data;
            judge = true;
        }
    }
    if (judge){
        printf("%d\n", s);
    }else
        printf("0\n");

    return 0;
}

