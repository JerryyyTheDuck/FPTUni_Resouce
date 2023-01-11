#include<stdio.h>
int main(){
	int n, frac =1; 
	scanf("%d",&n);
	for(int i = 1; i <=n;i++){
		frac = frac * i;
	}
	printf("%d",frac);
	return 0;
}
