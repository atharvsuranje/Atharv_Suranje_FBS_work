#include <stdio.h>

void inputarr(int*,int);
void main() {
    int n1,n2;
    printf("Enter size of 1 array :: ");
    scanf("%d",&n1);
    printf("Enter size of 2 array :: ");
    scanf("%d",&n2);
    int arr[n1],brr[n2];
    printf("Enter Elements of 1 array :: ");
    inputarr(arr,n1);
    printf("Enter Elements of 2 array :: ");
    inputarr(brr,n2);

    for(int i=0;i<n1;i++){
        for(int j=0;j<n2;j++){
            if(arr[i]==brr[j]) printf("%d ",arr[i]);
        }
    }
}

void inputarr(int* arr,int size){
    printf("Enter elements of  array :: ");
    for(int i=0;i<size;i++){
        scanf("%d",&arr[i]);
    }
}