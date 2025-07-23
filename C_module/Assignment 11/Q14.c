#include <stdio.h>
#include <string.h>

char* mystrrev(char*);
void main() {
    char str[20];
    printf("Enter string :: ");
    scanf("%s",str);
    printf("%s",mystrrev(str));
}

char* mystrrev(char* str){
    int n=strlen(str);
    int i=0;
    while (i<n/2)
    {
        char temp=str[i];
        str[i]=str[n-i-1];
        str[n-i-1]=temp;
        i++;
    }
    return str; 
}