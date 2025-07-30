#include <stdio.h>
#include <stdlib.h>

void main() {
    int n,num,idx=-1;
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
    printf("\nEnter the number to find :: ");
    scanf("%d",&num);

    for(int i=0;i<n;i++){
        if(arr[i]==num) {
            idx=i;
            break;
        }
    }
    if(idx== -1) printf("Element not in array");
    else printf("Element found in array at index %d",idx);
} 