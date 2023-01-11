#include<stdio.h>
int gcd(int a, int b){
	while(a!=b){
		if(b>a){
			b = b-a;
		}else{
			a=a-b;
		}return a;
	}
}

int lcm(int a, int b){
	return a*b/(gcd(a,b));
}

int main(){
	int a,b;
	do{
		printf("nhap a:"); scanf("%d",&a);
		printf("nhap b:"); scanf("%d",&b);
	}while(a<=0 || b<= 0);
	int d = gcd(a,b);
	int c = lcm(a,b);
	printf("GCD: %d",d); printf("\nLCM: %d",c);
	return 0;
}
