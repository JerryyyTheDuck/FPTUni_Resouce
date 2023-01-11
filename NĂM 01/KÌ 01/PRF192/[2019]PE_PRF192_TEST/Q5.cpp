#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>


int main() {
  system("cls");
  //INPUT - @STUDENT:ADD YOUR CODE FOR INPUT HERE:
  int n,a[n]; scanf("%d",&n); //input n = 5 --> mảng a có 5 phần tử a[5]
  int sum = 0; 
  for(int i = 0; i<n; i++){
    scanf("%d",&a[i]); 
  }
  for(int i = 0; i<n;i++){// i chạy từ 0-n
    if(a[i]% 2 == 0){
      sum = sum + pow(a[i],2);
    }
  }
  
  // Fixed Do not edit anything here.
  printf("\nOUTPUT:\n");
  //@STUDENT: WRITE YOUR OUTPUT HERE:
	printf("%d",sum);






  
  
  //--FIXED PART - DO NOT EDIT ANY THINGS HERE
  printf("\n");
  system ("pause");
  return(0);
}
