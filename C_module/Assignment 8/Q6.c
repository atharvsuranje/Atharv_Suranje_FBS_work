#include <stdio.h>

void main() {
    int n,flag=0;
    printf("Size of array :: ");
    scanf("%d",&n);
    int arr[n];
    printf("Enter array Elements :: ");
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }

    printf("Prime Elements are :: ");
    for(int i=1;i<n;i++){
        for(int j=2;j*j<arr[i];j++){
            if(arr[i]%j == 0){
                flag=1;
                break;
            }
        }
        if(flag == 0) printf("%d ",arr[i]);
    }
}
