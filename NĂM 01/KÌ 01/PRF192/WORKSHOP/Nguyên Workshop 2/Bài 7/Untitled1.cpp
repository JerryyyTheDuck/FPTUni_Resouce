#include<stdio.h>
int main(){
	char a,b,temp;
	int d;
	printf("Nhap a "); scanf("%c",&a);
	fflush(stdin);//clear
	printf("Nhap b "); scanf("%c",&b);
	if(a>b){
		temp = a;
		a=b; 
		b=temp;
	}
	d = b-a;
	printf("d: %d\n",d);
	for(char i = a;i<=b;i++){
		printf("%c: %d,%o,%X\n",i,i,i,i);
	}
	return 0;
}
