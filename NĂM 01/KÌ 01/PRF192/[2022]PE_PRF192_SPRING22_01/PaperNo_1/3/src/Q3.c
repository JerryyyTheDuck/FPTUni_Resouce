#include <stdio.h>
#include <stdlib.h>
int checkPrime(int n){
  int check = 0;
  		for(int i = 1; i <=n;i++){
			if(n%i==0){
				check = check +1;
			}
		}if(check ==2){
			return n;	
    }
    return 0;
}


int main()
{
  system("cls");
  printf("\nTEST Q3 (2 marks):\n");
  int n,sum,i, result = 0;
  printf("Enter n = "); scanf("%d",&n); 
  //============================================================
  
  // Write your statements here
  //......
  sum =0;
  for(int i =2; i<=n;i++){
    if(checkPrime(i)){
      sum = sum + i;
    }    
  }
  
  
  
  
  //End your statements
  
  
  //====DO NOT ADD NEW OR CHANGE STATEMENTS AFTER THIS LINE====
  //==THE OUTPUT AFTER THIS LINE WILL BE USED TO MARK YOUR PROGRAM==
  printf("\nOUTPUT:\n");
  printf("%d",sum); 
  printf("\n");
  system ("pause");
  return(0);
}
