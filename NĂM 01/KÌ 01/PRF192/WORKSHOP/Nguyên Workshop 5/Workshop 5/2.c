#include<stdio.h>
#include<stdlib.h>
#include<time.h>
int main(){
    int ball1,ball2,choice;
    int count1 = -1, count2 = 0;
    srand(time(0));
    printf("Ball Lottery");
    printf("\n==========");
    do
    {
        printf("\nTotal Sought: "); scanf("%d",&choice);
    } while (choice <2 || choice >20);
    do
    {
        ball1 = rand()%20 + 1;
        ball2 = rand()%20 + 1;
        count1 = count1 +2;
        count2 = count2 + 2;
        printf("\nResult of pick %d  and %d: %d + %d ",count1, count2,ball1,ball2);
    } while (ball1 + ball2 != choice);

    if(ball1 + ball2 == choice){
        printf("\nYou got your total in %d picks!",count2);
    }
    return 0;
}