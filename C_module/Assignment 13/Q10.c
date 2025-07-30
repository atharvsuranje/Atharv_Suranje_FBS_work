#include <stdio.h>
#include <stdlib.h>

void main()
{
    int n;
    printf("Size of array :: ");
    scanf("%d", &n);
    int* arr=(int*) malloc(sizeof(int)*n); 
    printf("Enter array Elements :: ");
    for (int i = 0; i < n; i++){
        scanf("%d", &arr[i]);
    }
    printf("Array Elements :: ");
    for (int i = 0; i < n; i++){
        printf("%d ", arr[i]);
    }

    for (int i = 0; i < n - 1; i++){
        for (int j = 0; j < n - i - 1; j++)
            if (arr[j] > arr[j + 1])
            {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
    }
    printf("\nSorted Array Elements :: ");
    for (int i = 0; i < n; i++){
        printf("%d ", arr[i]);
    }
}