#include<stdio.h>
int check(int d, int m, int y)
{
	int maxd = 31;
	if(d < 1 || d>31 || m<1 || m >12){
		printf("invalid");
	}if(m == 4 || m == 6 || m == 9 || m == 11 ){
		maxd = 30;
	}if(m == 2){
		if ( y%400==0 || ( y%4==0 && y%100!=0)){
			maxd = 29;
		}else{
			maxd = 28;
		}
	}return d<=maxd;
}

void cau1(){
	int d,m,y;
	printf("nhap ngay: "); scanf("%d",&d);
	printf("nhap thang: "); scanf("%d",&m);
	printf("nhap nam: "); scanf("%d",&y);
	if(check(d,m,y)){
		printf("valid");
	}else{
		printf("invalid");
	}
}

int checkFibo(int n){
	int t1 = 1, t2=1, f=0;
	for(int i =3; i<=n; i++){
		f = t1 + t2;
		t1 = t2;
		t2 = f; 
	}
	return f;
}

void cau2(){
	int n; 
	do{
		printf("nhap vi tri n: "); scanf("%d",&n);
	}
	while(n<0);
	printf("gia tri la: %d",checkFibo(n));
}
int main(){
	int choice;
	printf("==Menu==\n");
	printf("1. check date\n");
	printf("2. Fibonanci\n");
	printf("3.Quit\n");
	printf("Nhap lua chon: "); scanf("%d",&choice);
	switch(choice){
		case 1:
			cau1();
			break;
		case 2:
			cau2();
			break;
		case 3:
			printf("bye nha ~~");
			return 0;
			break;
		default:
			printf("sai roi :( nhap lai di");
			return main();
	}
	return 0;
}
