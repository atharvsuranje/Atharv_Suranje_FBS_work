#include <stdio.h>

void alternate(int*,int);
void main() {
    int n;
    printf("Size of array :: ");
    scanf("%d",&n);
    int arr[n];
    printf("Enter array Elements :: ");
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }

    alternate(arr,n);
}

void alternate(int *arr,int n){
    printf("Alternate Elements are :: ");
    for(int i=1;i<n;i+=2) printf("%d ",arr[i]);
}