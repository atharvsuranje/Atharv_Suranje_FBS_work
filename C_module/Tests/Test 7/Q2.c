#include <stdio.h>

int isPalindrome(int*,int);
void main() {
    int size;
    printf("Enter Size : ");
    scanf("%d",&size);
    int arr[size];
    printf("Enter Elements : ");
    for(int i=0;i<size;i++){
        scanf("%d",&arr[i]);
    }
    printf("Elements are : ");
    for(int i=0;i<size;i++){
        printf("%d ",arr[i]);
    }
    int res=isPalindrome(arr,size);
    if(res==1) printf("\nPALINDROME");
    else printf("\nNOT PALINDROME");
}

int isPalindrome(int* arr,int size){
    int i=0;
    while(i<size/2){
        if(arr[i] != arr[size-i-1]) return 0;
        i++;
    }
    return 1;
}