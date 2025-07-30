#include <stdio.h>
#include <stdlib.h>

void main() {
    int n;
    printf("Size of array :: ");
    scanf("%d",&n);
    int* arr=(int*) malloc(sizeof(int)*n); 
    printf("Enter array Elements :: ");
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }

    printf("\nElements are :: ");
    for(int i=0;i<n;i++){
        printf("%d ",arr[i]);
    }

    int maxi=arr[0],mini=arr[0];
    for(int i=1;i<n;i++){
        if(arr[i]>maxi) maxi=arr[i];
        if(arr[i]<mini) mini=arr[i];
        
    }
    printf("\nMaximum is :: %d \n",maxi);
    printf("Minimum is :: %d",mini);
}