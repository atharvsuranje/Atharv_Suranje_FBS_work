#include <stdio.h>
#include <string.h>

char* mystrcat(char*,char*);
void main() {
    char str1[20];
    char str2[20];
    printf("Enter string 1 :: ");
    scanf("%s",str1);
    printf("Enter string 2 :: ");
    scanf("%s",str2);
    printf("%s",mystrcat(str1,str2));
}

char* mystrcat(char* str1,char* str2){
    int i=0;
    int length=strlen(str1);
    while(str2[i]!='\0'){
        str1[length]=str2[i];
        i++;
        length++;
    }
    str1[length]='\0';
    return str1;
}