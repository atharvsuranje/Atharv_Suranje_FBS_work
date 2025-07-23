#include <stdio.h>

char* mystrcpy(char*,char*);
void main() {
    char src[20];
    char dest[20];
    printf("Enter string :: ");
    scanf("%s",src);
    printf("Copied string :: %s",mystrcpy(dest,src));
}

char* mystrcpy(char* dest,char* src){
    int i=0;
    while(src[i]!='\0'){
        dest[i]=src[i];
        i++;
    }
    dest[i]='\0';
    return dest;
}