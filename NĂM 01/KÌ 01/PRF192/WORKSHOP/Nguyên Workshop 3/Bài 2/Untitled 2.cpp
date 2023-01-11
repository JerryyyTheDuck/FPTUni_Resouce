#include<stdio.h>
int valid(int d, int m, int y){
	int maxd = 31;
	if(d<1 || d>31 || m <1 || m >12 ){
		return 0;
	}else if(m==4 || m ==6 || m ==9 || m == 11){
		maxd = 30;
	}else if(m==2){
		if ( y%400==0 || ( y%4==0 && y%100!=0)){
			maxd=29;
		}else{
			maxd=28;
		}	
	}
	return d<= maxd;
}
int main(){
	int d,m,y;
	printf("input date:"); scanf("%d",&d);
	printf("input month:"); scanf("%d",&m);
	printf("input year:"); scanf("%d",&y);
	if(valid(d,m,y)){
		printf("valid day");
	}else{
		printf("Invalid day");
	}
	return 0;
}
