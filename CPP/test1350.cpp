#include <iostream>
#include <cstdio>

using namespace std;

int main()
{
    int n;
    int i, A = 0, B = 0, C = 0, D = 0, E = 0;
    cin >> n;
    for ( i=0; i<n; i++){
        int temp;
        cin >> temp;
        if (temp >= 90 && temp <= 100){
            A++;
        }else if (temp >= 80 && temp < 90){
            B++;
        }else if (temp >= 70 && temp < 80){
            C++;
        }else if (temp >= 60 && temp < 70){
            D++;
        }else if (temp >= 0){
            E++;
        }
    }
    printf("%d %d %d %d %d\n", A, B, C ,D, E);
    return 0;
}
