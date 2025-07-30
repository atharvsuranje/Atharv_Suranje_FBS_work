#include <stdio.h>

void modifier(int*,int,int);
void main() {
    int size;
    printf("Enter Size : ");
    scanf("%d",&size);
    int arr[size];
    printf("\nEnter Elements : ");
    for(int i=0;i<size;i++){
        scanf("%d",&arr[i]);
    }
    printf("\nElements are : ");
    for(int i=0;i<size;i++){
        printf("%d ",arr[i]);
    }
    int xth,yth;
    printf("\nEnter xth index : ");
    scanf("%d",&xth);
    printf("\nEnter yth index : ");
    scanf("%d",&yth);
    modifier(arr,xth,yth);
    printf("\nModified Elements are : ");
    for(int i=0;i<size;i++){
        printf("%d ",arr[i]);
    }
}

void modifier(int* arr,int xth,int yth){
    int temp=arr[xth-1];
    arr[xth-1] = arr[yth-1];
    arr[yth-1] = temp;
}