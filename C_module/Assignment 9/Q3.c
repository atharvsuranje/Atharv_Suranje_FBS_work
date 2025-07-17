#include <stdio.h>

void sum(int*,int);
void main() {
    int n;
    printf("Size of array :: ");
    scanf("%d",&n);
    int arr[n];
    printf("Enter array Elements :: ");
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }

    printf("\nElements are :: ");
    for(int i=0;i<n;i++){
        printf("%d ",arr[i]);
    }
    sum(arr,n);
    
}

void sum(int *arr,int n){
    int sum=0;
    for(int i =0;i<n;i++) sum+=arr[i];
    printf("\nSum is :: %d",sum);
}