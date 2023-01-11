#include<stdio.h>
#include<math.h>
#include<stdlib.h>
void add (char codes[][9],char names[][21], double salaries[], double allowances[], int*pn);
void printBasedName( char name[], char codes[][9],char names[][21], double salaries[], double allowances[], int n);
int findCode (char code[], char codes[][9], int n);
void removePos (int pos, char codes[][9],char names[][21], double salaries[], double allowances[], int *pn);
void sort(char codes[][9],char names[][21], double salaries[], double allowances[], int n);
void print(char codes[][9],char names[][21], double salaries[], double allowances[], int n);

int main(){

    return 0;
}
void print(char codes[][9],char names[][21], double salaries[], double allowances[], int n)
{
    for(int i = 0; i<= n; i++){
        printf("%s %s %s %f %f\n",codes[i][9],names[i][21],salaries[i],allowances[i]);
    }
}

void add (char codes[][9],char names[][21], double salaries[], double allowances[], int*pn)
{
    int n;
    printf("Nhap so thanh vien muon them"); scanf("%d",&n);
    for(int i = 0 ; i<n; i++){
        printf("STT: %d",i);
        printf("\nTen: "); scanf("%s",&names);
        printf("\nCode: "); scanf("%s",&codes);
        printf("\nLuong: "); scanf("%f",&salaries);
        printf("\nTien thuong: "); scanf("%f",&allowances);
    }
    printf("Danh sach hien tai la:\n");
    print();
}
