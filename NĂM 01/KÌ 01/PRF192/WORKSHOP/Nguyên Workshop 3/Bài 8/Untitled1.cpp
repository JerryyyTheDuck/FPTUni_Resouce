#include<stdio.h>
double check(int interger, int fraction){
	double fraction1 = fraction;
	while(fraction1>1){
		fraction1 = fraction1/10;
		if(interger<0){
			return interger - fraction1;
		}else{
			return interger + fraction1;
		}
	}
}

int main(){
	int interger,fraction;
	do{
		printf("nhap interger : "); scanf("%d",&interger);
		printf("nhap fraction : "); scanf("%d",&fraction);
	}
	while(fraction<0);
	float value = check(interger,fraction);
	printf("%f", value);
	return 0;
}
