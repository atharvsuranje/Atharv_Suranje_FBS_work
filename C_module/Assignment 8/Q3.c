#include <stdio.h>

void main() {
    int n,sum=0;
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
    for(int i =0;i<n;i++) sum+=arr[i];
    printf("\nSum is :: %d",sum);
}