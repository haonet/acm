#include <stdio.h>
#include <string.h> 

char s[10001];

int main()
{
	while (~scanf("%s", s))
	{
		int k = strlen(s);
		int left = 0, right = 0, max = 1;
		bool judge = false;
		for (int i=0; i<k; i++){
			if (s[i] == '('){
					left++;
				}
				if (s[i] == ')'){
					right++;
				}
				if (left == right){
					if (left > max){
						max = left;
					}
					left = right = 0;
				}
				if ((s[0] != '(' || s[0] == ')') || (s[k-1] != ')' || s[k-1] == '(')|| 
						s[i] != '(' && s[i] != ')' && (s[i-1] == ')' || s[i+1] == '(')){
					judge = true;
					break;
				}
		}
		if (judge || left != 0 || right != 0){
				printf("Error\n");
			}else
				printf("%d\n", max);
	}
	return 0;
}
