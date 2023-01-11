#include<stdio.h>
int check(double x, double y, double r){
	int d2,r2;
	d2 = x*x+y*y;
	r2 = r*r;
	if(d2<r2){
		return 1;
	}else if(d2 = r2){
		return 0;
	}else{
		return -1;
	}
}
int main(){
	double x,y,r;
	int result;
	printf("nhap x: "); scanf("%f",&x);
	printf("nhap y: "); scanf("%f",&y);
	printf("nhap r: "); scanf("%f",&r);
	result = check(x,y,r);
	if(result == 1){
		printf("trong vòng tròn");
	}if(result == 0){
		printf("giao duong tron");
	}else{
		printf("ngoai vong tron");
	}
	return 0;
}
