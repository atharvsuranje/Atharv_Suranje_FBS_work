#include <stdio.h>

void merge(int*,int*,int,int);
void main() {
    int n1, n2;

    printf("Enter size of first array: ");
    scanf("%d", &n1);

    printf("Enter size of second array: ");
    scanf("%d", &n2);

    int arr[n1], brr[n2];

    printf("Enter %d elements for first array:\n", n1);
    for (int i = 0; i < n1; i++) {
        scanf("%d", &arr[i]);
    }

    printf("Enter %d elements for second array:\n", n2);
    for (int i = 0; i < n2; i++) {
        scanf("%d", &brr[i]);
    }
    merge(arr,brr,n1,n2);
}

void merge(int* arr,int* brr,int n1,int n2){
    int crr[n1 + n2];
    for (int i = 0; i < n1; i++) {
        crr[i] = arr[i];
    }

    for (int i = 0; i < n2; i++) {
        crr[n1 + i] = brr[i];
    }

    printf("Merged array:\n");
    for (int i = 0; i < n1 + n2; i++) {
        printf("%d ", crr[i]);
    }
}