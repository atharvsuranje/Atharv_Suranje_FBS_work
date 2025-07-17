#include <stdio.h>

void search(int*,int ,int);
void main() {
    int n,num;
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
    printf("\nEnter the number to find :: ");
    scanf("%d",&num);

    search(arr,n,num);
    
} 

void search(int *arr,int n,int num){
    int idx=-1;
    for(int i=0;i<n;i++){
        if(arr[i]==num) {
            idx=i;
            break;
        }
    }
    if(idx== -1) printf("Element not in array");
    else printf("Element found in array at index %d",idx);
}