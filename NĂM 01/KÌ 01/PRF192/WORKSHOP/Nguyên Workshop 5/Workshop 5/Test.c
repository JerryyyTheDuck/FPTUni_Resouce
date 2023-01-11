#include<stdio.h>
#include<stdlib.h>
#define MaxN 100
void input(int* a,int n);
void print(int* a,int n);
void printeven(int* a,int n);
int maxValue(int a[],int n);
int main(){
    int a[MaxN];
    int choice,n;
    do
    {
        printf("Nhap so so muon nhap tu 1-99: ");
        scanf("%d",&choice);
    } while (choice <1 || choice > MaxN);
    input(a,n);
    int maxvalue = maxValue(a,n);
    printf("%d",maxvalue);
    printf("\nMang da nhap vao:");
    print(a,n);
    printf("\nEven value in array: ");
    printeven(a,n);
    return 0;
}

void input(int* a,int n){
    for(int i =0; i<=n;i++){
        scanf("%d",a[i]);
    }
}

void print(int* a,int n){
    for(int i = 0; i<=n;i++){
        printf("%d ",a[i]);
    }
}

void printeven(int*a,int n){
    for(int i =0;i<=n;i++){
        if(a[i]%2==0){
            printf("%d",a[i]);
        }
    }
}

int maxValue(int a[],int n){
    int max = a[0];
    for(int i = 0; i<=n;i++){
        if(a[0]<a[i]){
            max = a[i];
        }
    }
    return max;
}