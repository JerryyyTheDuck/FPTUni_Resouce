#include<stdio.h>
int main(){
	int n, check = 0; 
	scanf("%d",&n);
	if(n<2){
		printf("non prime");
	}else{
		for(int i = 1; i <=n;i++){
			if(n%i==0){
				check = check +1;
			}
		}if(check ==2){
			printf("prime");	
		}else{
			printf("non prime");
		}
	}
		return 0;
}

