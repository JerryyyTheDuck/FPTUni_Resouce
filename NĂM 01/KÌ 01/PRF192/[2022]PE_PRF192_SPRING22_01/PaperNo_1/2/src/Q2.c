#include <stdio.h>
#include <stdlib.h>
#define MAX 100
void inputArray(int a[], int n);
int sumEven(int a[], int n);
int main(int argc, char *argv[]) {
	//=== Do not add new or change statements in the main function.===
	system("cls");
  	printf("\nTEST Q2 (3 marks):\n");
	int n, a[MAX];	
	char c;
	do {
		printf("How many elements do you want to enter into the integer array? [1..100] ");
		fflush(stdin);
		scanf("%d%c", &n, &c);
	} while(n<1 || n>MAX || c != '\n');
	
	inputArray(a,n);	
	//=== The output will be used to mark your program.===============
	printf("\nOUTPUT:\n");
  	printf("%d",sumEven(a,n)); 
  	printf("\n");
  	system ("pause");	
	return 0;
}
//=== Do not add new or change statements in this function.===
void inputArray(int a[], int n) {
    int i;	
	for(i=0; i<n; i++) {
		printf("a[%d] = ", i);
		scanf("%d", &a[i]);
	}
}
//-----------------------------------------------------
int sumEven(int a[], int n) {
	//Begin your codes here=====================
	int sum = 0;
	for(int i = 0; i<=n; i++){
		if(a[i]%2==0){
			sum = sum +a[i]; 
		}
	}
	return sum;
	
	//End your codes============================
}
