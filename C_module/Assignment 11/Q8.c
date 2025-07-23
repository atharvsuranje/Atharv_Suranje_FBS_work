#include <stdio.h>

char* mystrchr(char*,char);
void main() {
    char str[20],target;
    printf("Enter string :: ");
    scanf("%s",str);
    printf("Enter target character :: ");
    scanf(" %c",&target);
    char *ptr = mystrchr(str,target);
    if (ptr != NULL) printf("Found at index: %d\n", ptr - str);
    else printf("Not Found");
}

char* mystrchr(char* str,char target){
    int i=0;
    while(str[i]!='\0'){
        if(str[i] == target) return &str[i];
        i++;
    }
    return NULL;
}