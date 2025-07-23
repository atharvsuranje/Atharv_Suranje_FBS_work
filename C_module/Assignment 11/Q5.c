#include <stdio.h>

char* mystrncpy(char*,char*, int);
void main() {
    char src[20],dest[20];
    int n;
    printf("Enter string :: ");
    scanf("%s",src);
    printf("Copy string till :: ");
    scanf("%d",&n);
    printf("Copied string :: %s",mystrncpy(dest,src,n));
}

char* mystrncpy(char* dest,char* src, int n){
    int i=0;
    while(src[i]!='\0' && i<n){
        dest[i]=src[i];
        i++;
    }
    dest[i]='\0';
    return dest;
}