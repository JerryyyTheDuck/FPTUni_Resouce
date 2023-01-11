#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>


int main() {
  	system("cls");
  //INPUT - @STUDENT:ADD YOUR CODE FOR INPUT HERE:
	int dong; scanf("%d",&dong);
   //khai báo số dòng input = 5
  for(int i = 0; i<dong;i++){ //i là cột dọc
    for(int j = 0; j<i;j++){ // j là hàng ngang
          printf(" ");
      }
      for(int j = i; j<dong;j++){ // ban đầu j =i = 0 đk 0<5 in ra dấu sao đầu 
        printf("*");
      }
      printf("\n");
  }
  
  
  
  
  // Fixed Do not edit anything here.
  printf("\nOUTPUT:\n");
  //@STUDENT: WRITE YOUR OUTPUT HERE:
	







  
  
  //--FIXED PART - DO NOT EDIT ANY THINGS HERE
  printf("\n");
  system ("pause");
  return(0);
}
