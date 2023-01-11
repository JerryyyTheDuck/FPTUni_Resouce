#include<stdio.h>
#include<stdlib.h>
#include<time.h>
int main(){
    int num1,num2,sought;
    int count =0;
    srand(time(0));
    printf("Dice Thrower");
    printf("==============");
    do
    {
        printf("\nTotal Sought: ");  scanf("%d",&sought);
    } while (sought<2 || sought >12);
    
    do{
        num1= rand()%6 +1;
        num2= rand()%6 +1;
        count ++;
        printf("\nResult of throw %d: %d + %d",count,num1,num2); 
    }while(num1 + num2 != sought);
   
    if(num1+num2 == sought){
        printf("\nYou got your total in %d throws",count);
    }
    return 0;
}