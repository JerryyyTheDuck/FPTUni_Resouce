#include<stdio.h>
#include<math.h>
#include<time.h>
#include<stdlib.h>
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

void date(){
    int d,m,y;
    printf("Nhap ngay: "); scanf("%d",&d);
    printf("Nhap thang: "); scanf("%d",&m);
    printf("Nhap nam: "); scanf("%d",&y);
    if(valid(d,m,y)){
        printf("Valid Day");
    }else{
        printf("Invalid Day");
    }
}

void printAscii(char a, char b){
    char c;
    if(a>b){
        c = a;
        a = b;
        b = c;
    }
    for(c = a; c<= b; c++){
          printf("\n%c: %o %X",c,c,c);
    }
}

void check(){
    char a,b;
    printf("Nhap hai so lien tuc: "); scanf("%c%c",&a,&b);
    printAscii(a,b);
}
int main(){
    int choice;
    printf("\n1- Processing date");
    printf("\n2- Character Data");
    printf("\n3- Quit");
    printf("\nNhap lua chon: "); scanf("%d",&choice);
    switch (choice)
    {
    case 1:
        date();
        break;
    case 2:
        check();
        break;
    case 3:
        printf("Bye");
        break;
    default:
        printf("Sai roi nhap lai di");
        break;
    }   
    return 0;
}