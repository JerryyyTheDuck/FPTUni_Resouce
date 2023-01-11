#include<stdio.h>
double checkFibo(int n){
	int t1 = 1, t2 = 1, other = 1;
	if(n==1){
		printf("Fibonanci number");
	}else{
		for(int i = 3; i<=n;i++){
			other = t1+t2;
			t2 = t1;
			t1 =other;
	}
	}return n==other;
}


int main(){
	int n; 
	scanf("%d",&n);
	while(n<1);
	if(checkFibo(n) ==1){
		printf("Fibo number");
	}else{
		printf("Not Fibo number");
	}
	return 0;
}
