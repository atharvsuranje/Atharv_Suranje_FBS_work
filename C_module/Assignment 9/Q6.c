#include <stdio.h>

void prime(int*,int);
void main() {
    int n;
    printf("Size of array :: ");
    scanf("%d",&n);
    int arr[n];
    printf("Enter array Elements :: ");
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    prime(arr,n);
}

void prime(int* arr,int n){
    printf("Prime Elements are :: ");
    for (int i = 0; i < n; i++) {
        if (arr[i] < 2) continue;
        int flag = 0;

        for (int j = 2; j * j <= arr[i]; j++) {
            if (arr[i] % j == 0) {
                flag = 1;
                break;
            }
        }

        if (flag == 0) {
            printf("%d ", arr[i]);
        }
    }

}