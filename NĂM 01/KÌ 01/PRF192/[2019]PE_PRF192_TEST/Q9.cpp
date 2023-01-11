#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
int check(int n){  
  int du, sum = 0;  // n = 12345
  while (n!= 0)
  {
    du = n%10 ; // lấy số ngoài cùng bên phải du = 5,4,3,2,1
    n = n/10;   // n = 1234,5 --> n =1234 --> 123 --> 12 --> 1 --> 0
    sum = sum + du; // sum = 5 --> 9 --> 12 --> 14 --> 15
  }
  return sum; // trả về giá trị sum, sum = 15;
}

int main() {
  system("cls");
  //INPUT - @STUDENT:ADD YOUR CODE FOR INPUT HERE:
	int n; scanf("%d",&n);
  int sum1;
  sum1 = check(n); //return sum; sum1 = sum(biến cục bộ)
 
  
  
  
  // Fixed Do not edit anything here.
  printf("\nOUTPUT:\n");
  //@STUDENT: WRITE YOUR OUTPUT HERE:
	printf("%d",sum1);







  
  
  //--FIXED PART - DO NOT EDIT ANY THINGS HERE
  printf("\n");
  system ("pause");
  return(0);
}
