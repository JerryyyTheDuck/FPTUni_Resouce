#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
//B1: tìm ra là số được in nhiều nhất
//B2: số được in nhiều có thõa mãn số có hai chữ số k

int main() {
	system("cls");
	//INPUT - @STUDENT:ADD YOUR CODE FOR INPUT HERE:
	int a[7],max = 0, count = 0; //max là số lần số đó xuất hiện nhiều nhất
	for(int i=0; i<7; i++) {
		scanf("%d",&a[i]);
	}
//tìm số lần mà số lớn nhất xuất hiện
	for(int i = 0; i<6; i++) {
		for(int j = i+1; j<7; j++) {
			if(a[i] == a[j]	 && a[i]>9 && a[i]<100) {
				count = count +1; 
			}
		}
		if(max<count) {
			max = count;
		}
	}







	// Fixed Do not edit anything here.
	printf("\nOUTPUT:\n");
	//@STUDENT: WRITE YOUR OUTPUT HERE:
	for(int i = 0; i<6; i++) {
		for(int j = i+1; j<7; j++) {
			if(a[i] == a[j] && a[i]>9 && a[i]<100) {
				count ++;
			}
		}
		if(count == max) {
			printf("%d",a[i]);
	}
	if(count == 0) {
		printf("No two digit number");
	}




	
	//--FIXED PART - DO NOT EDIT ANY THINGS HERE
	printf("\n");
	system ("pause");
	return(0);
}


