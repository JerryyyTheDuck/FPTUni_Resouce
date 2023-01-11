#include<stdio.h>
void checkMaxMin(int n){
	int min,max,digit;
	digit = n%10;
	n = n/10;
	min=digit;
	max=digit;
	while(n>0){
		digit = n%10;
		n = n/10;
		if(min > digit){
			min = digit;
		}if(digit > max){
			digit = max;
		}
	}printf("Max: %d",max);
	 printf("\nMin: %d",min);
}


int main(){
	int n;
	do{
		printf("nhap so n: "); scanf("%d",&n);
		checkMaxMin(n);
	}while(n<0);
	return 0;
}
