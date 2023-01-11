#include<stdio.h>
int main(){
	int a,b;
	char ope;
	printf("nhap dau: "); scanf("%c",&ope);
	printf("nhap a: "); scanf("%d",&a);
	printf("nhap b: "); scanf("%d",&b);


	switch(ope){
		case '+':
			printf("%d + %d = %d",a,b,a+b);
			break;
		case '-':
			printf("%d - %d = %d",a,b,a-b);
			break;
		case '*':
			printf("%d * %d = %d",a,b,a*b);
			break;
		case '/':
			if(b==0){
				printf("So k hop le");
			}else{
				printf("%d / %d = %d",a,b,a/b);
			}
			break;
		default:
			printf("dau khong hop le");
			break;
	}

	return 0;
}
