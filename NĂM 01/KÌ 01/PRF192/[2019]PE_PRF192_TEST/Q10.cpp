#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
int checkPrime(int n){
  int loop = sqrt(n);     
  for(int i = 2;i<loop; i++){ // số nguyên tố là chia hết cho nó và 1
    if(n%i == 0){           
      return 0; //False
    }
  }
  return 1; //True
}

int main() {
  system("cls");
  //INPUT - @STUDENT:ADD YOUR CODE FOR INPUT HERE:
  int n; scanf("%d",&n);
	if(checkPrime(n) == 1){ //True
    printf("not prime");
  }else{
    printf("prime");
  }
	
	
	
	
	 
  // Fixed Do not edit anything here.
  printf("\nOUTPUT:\n");
  //@STUDENT: WRITE YOUR OUTPUT HERE:
	
	
	

  //--FIXED PART - DO NOT EDIT ANY THINGS HERE
  printf("\n");
  system ("pause");
  return(0);
}
