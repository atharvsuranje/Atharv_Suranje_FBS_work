#include <stdio.h>

void main() {
    int n;
    printf("Size of array :: ");
    scanf("%d",&n);
    int arr[n];
    printf("Enter array Elements :: ");
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    printf("Array Elements :: ");
    for(int i=0;i<n;i++){
        printf("%d ",arr[i]);
    }
    int left=0,right=n-1;
    while (left<right)
    {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
    }
    printf("\nArray Elements Reversed :: ");
    for(int i=0;i<n;i++){
        printf("%d ",arr[i]);
    }
    
}