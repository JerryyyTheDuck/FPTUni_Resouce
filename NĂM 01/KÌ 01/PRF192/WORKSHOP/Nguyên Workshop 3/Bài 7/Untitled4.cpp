#include<stdio.h>
int sumdigit(int n){
	int sum =0;
	do{
		int remind= n%10;
		n= n/10;
		sum = sum + remind;
	}while(n>0);
	 return sum;
}

int main(){
	int n,s;
	do {
		printf("\nNhap n: "); scanf("%d",&n);
		if(n>0){
			s= sumdigit(n);
			printf("%d",s);
		}
	}
	while(n>=0);
	return 0;
}
