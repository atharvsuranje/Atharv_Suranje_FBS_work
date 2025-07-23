#include <stdio.h>

int mystrlen(char*);
void main() {
    char str[20];
    printf("Enter string :: ");
    scanf("%s",str);
    printf("Length is :: %d",mystrlen(str));
}

int mystrlen(char* str){
    int i=0;
    while(str[i]!='\0'){
        i++;
    }
    return i;
}