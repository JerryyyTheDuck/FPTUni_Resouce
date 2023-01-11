#include <stdio.h>
#include <stdlib.h>
#define MAX 100
void inputArray(int a[], int n);
void printArray(int a[], int n);
void sortArray(int a[], int n);
int main(int argc, char *argv[]) {
	//=== Do not add new or change statements in the main function.===
	system("cls");
  	printf("\nTEST Q4 (3 marks):\n");
	int n, a[MAX];	
	char c;
	do {
		printf("How many elements do you want to enter into the integer array? [1..100] ");
		fflush(stdin);
		scanf("%d%c", &n, &c);
	} while(n<1 || n>MAX || c != '\n');	
	inputArray(a,n);
	sortArray(a,n);	
	
	//=== The output will be used to mark your program.===============
	printf("\nOUTPUT:\n");
  	printArray(a,n); 
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
//=== Do not add new or change statements in this function.===
void printArray(int a[], int n) {	
	int i;
	for(i=0; i<n; i++) 
		printf("%-5d", a[i]);
}
//----------------------------------------------
void sortArray(int a[], int n) {
	//Begin your codes here=====================
	for(int i =0; i<n-1;i++){
		for(int j = i+1;j<n;j++){
			if(a[i]>a[j]){
				int temp = a[i];
				a[i] = a[j];
				a[j]= temp;
			}
		}
	}







	//End your codes============================
}

