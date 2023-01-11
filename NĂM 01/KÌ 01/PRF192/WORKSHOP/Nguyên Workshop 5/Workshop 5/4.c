#include<stdio.h>
#include<stdlib.h>
#include<math.h>

void function1(){
    int x1,x2,a,b,c;
    printf("Nhap he so a: "); scanf("%d",&a);
    printf("\nNhap he so b: "); scanf("%d",&b);
    printf("\nNhap he so c: "); scanf("%d",&c);
    int delta = b^2-(4*a*c);
    if(delta<0){
        printf("Phuong trinh vo nghiem");
    }
    else if(delta == 0){
        x1 = x2 = -b/(2*a);
        printf("\nPhuong trinh co nghiem kep x1 = x2 = %d",x1);
    }
    else{
        x1 = (-b+sqrt(delta))/(2*a);
        x2 = (-b-sqrt(delta))/(2*a);
        printf("\nPhuong trinh co hai nghiem phan biet la:");
        printf("\nx1: %d",x1);
        printf("\nx2: %d",x2);
    }
}
void function2(){
    float deposit,year;
    float rate;
    float value = deposit*pow(1+rate,year);
    do
    {
        printf("Nhap so tien muon tiet kiem: ");
        scanf("%f",&deposit);
    } while (deposit<0);

    do
    {
        printf("Nhap so nam muon tiet kiem: "); scanf("%f",&year);
    } while (year<0);

    do
    {
        printf("Nhap ti le: "); scanf("%f",&rate);
    } while (rate<0 || rate >1);
    printf("So tien thu lai: %f",value);
}
int main(){
    int choice;
    printf("1-Quantic Equation");
    printf("\n2-Bank deposit problem");
    printf("\n3-Quit");
    printf("\nNhap lua chon: ");scanf("%d",&choice);
    switch (choice)
    {
    case 1:
        function1();
        break;
    case 2:
        function2();
        break;
    case 3:
        printf("Bye");
        break;
    default:
        printf("Nhap sai roi nhap lai di");
        break;
    }
    return 0;
}