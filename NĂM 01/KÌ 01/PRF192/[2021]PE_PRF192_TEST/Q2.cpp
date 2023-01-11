#include <stdio.h>
void reverse(int a[], int n){
	int b[6];
	int j = 0;
	for(int i = n-1; i>= n-6;i--){
		b[j] = a[i];
		j++; //123456 --> //654321
	}	

	for(int i = n-6; i<n;i++){
		a[i] = b[j];
		j++;
	}
}
int main(){
	int n;
	printf("input n: ");
	scanf("%d",&n);
	int a[n];
	for(int i=0; i<n; i++){
		printf("input arr[%d]: ",i);
		scanf("%d",&a[i]);
	}
	printf("\nBefore reverse: \n");
	for(int i=0; i<n; i++){
		printf("%d ",a[i]);
	}
	reverse(a, n);
	printf("\nAfter reverse: \n");
	for(int i=0; i<n; i++){
		printf("%d ",a[i]);
	}

}

