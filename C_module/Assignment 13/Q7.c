#include <stdio.h>
#include <stdlib.h>

void main() {
    int n1, n2;

    printf("Enter size of first array: ");
    scanf("%d", &n1);

    printf("Enter size of second array: ");
    scanf("%d", &n2);

    int n = (n1 > n2) ? n1 : n2;  
    int* arr=(int*) malloc(sizeof(int)*n1); 
    int* brr=(int*) malloc(sizeof(int)*n2); 
    int* crr=(int*) malloc(sizeof(int)*n); 

    printf("Enter %d elements for first array:\n", n1);
    for (int i = 0; i < n1; i++) {
        scanf("%d", &arr[i]);
    }

    printf("Enter %d elements for second array:\n", n2);
    for (int i = 0; i < n2; i++) {
        scanf("%d", &brr[i]);
    }

    for (int i = 0; i < n; i++) {
        int a = (i < n1) ? arr[i] : 0;
        int b = (i < n2) ? brr[i] : 0;
        crr[i] = a + b;
    }

    printf("Resultant sum array:\n");
    for (int i = 0; i < n; i++) {
        printf("%d ", crr[i]);
    }

}
