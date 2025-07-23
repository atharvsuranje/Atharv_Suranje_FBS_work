#include <stdio.h>

char* mystrstr(char*,char*);
void main() {
    char str[20],substr[20];
    printf("Enter string :: ");
    scanf("%s",str);
    printf("Enter substring :: ");
    scanf(" %s",&substr);
    char *ptr = mystrstr(str,substr);
    if (ptr != NULL) printf("Substring Found at index: %d\n", ptr - str);
    else printf("Not Found");
}

char* mystrstr(char* str,char* substr){
    int i=0,j=0;
    while(str[i]!='\0'){
        while(str[j]!='\0'){
            if (str[i+j] != substr[j]) break;
            j++;
        }
        if (substr[j] == '\0') return &str[i];
        i++;
    }
    return NULL;
}