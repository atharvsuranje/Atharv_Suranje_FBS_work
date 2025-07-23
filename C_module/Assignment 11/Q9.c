#include <stdio.h>
#include <string.h>

char* mystrrchr(char*,char);

void main() {
    char str[20],target;
    printf("Enter string :: ");
    scanf("%s",str);
    printf("Enter target character :: ");
    scanf(" %c",&target);
    char *ptr = mystrrchr(str,target);
    if (ptr != NULL) printf("Last Found at index: %d\n", ptr - str);
    else printf("Not Found");
}

char* mystrrchr(char* str,char target){
    int i=0,length=strlen(str);
    while(str[length-i-1]!='\0'){
        if(str[length-i-1] == target) return &str[length-i-1];
        i++;
    }
    return NULL;
}