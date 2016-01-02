#include <iostream>
#include <cstdio>

using namespace std;

int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        double n;
        cin >> n;
        printf("%.2f%%\n", n*100);
    }
    return 0;
}

