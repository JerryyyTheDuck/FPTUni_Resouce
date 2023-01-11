#include<stdio.h>
int main(){
	int n, sum =0;
	do{
		printf("nhap n: "); scanf("%d",&n);
		if(n!=0){
			sum = sum + n;
		}
	}
	while(n!=0);
	printf("Tong la: %d",sum);
	return 0;
}
