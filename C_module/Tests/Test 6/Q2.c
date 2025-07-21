#include <stdio.h>

void main() {
    int n;
    printf("Enter size of array :: ");
    scanf("%d",&n);
    int arr[n];
    printf("Enter elements of  array :: ");
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    int firstMax=arr[0],secondMax=-1;

    for(int i=0;i<n;i++){
        if(arr[i]>firstMax){
            secondMax=firstMax;
            firstMax=arr[i];
        } 
        else if(arr[i]>secondMax && arr[i]!=firstMax) secondMax=arr[i];
    }
    printf("1 max :: %d\n",firstMax);
    printf("2 max :: %d",secondMax);
}