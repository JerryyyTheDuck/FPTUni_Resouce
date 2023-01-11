#include<stdio.h>
#include<stdlib.h>
int main(){
    int ngang, doc;
    scanf("%d%d",&ngang,&doc);

    for(int i = 1; i<= doc;i++){
        for(int j = 1; j<=ngang;j++){
            printf("*");
        }
        printf("\n");
    }

    printf("\n");
    printf("\n");
    printf("\n");
    for(int i = 1; i<=doc;i++){
        for(int j = 1; j<=ngang;j++){
            if(i == 1 || i == doc || j == 1 || j == ngang){
                printf("*");
            }else{
                printf(" ");
            }
        }
        printf("\n");
    }
}