#include<stdio.h>
int main(){
	int a,b;
	do{
		printf("\nNhap a:"); scanf("%d",&a);
		printf("\nNhap b:"); scanf("%d",&b);
		int temp = a;
		a = b;
		b = temp;
		printf("Sau khi swap la: a = %d, b =%d",a,b);
	}while(a!=0 && b!=0);
	return 0;
}
