#include <stdio.h>
#include <string.h>

char* exchanger(char*,char*);
void main() {
    char str[20],modified[20];
    printf("Enter string : ");
    scanf("%s",str);
    printf("Modified string : %s",exchanger(str,modified));
}

char* exchanger(char* str,char* modified){
    strcpy(modified,str);
    int length=strlen(modified);
    if(length>1){
        char temp=modified[0];
        modified[0]=modified[length-1];
        modified[length-1]=temp;
    }
    return modified;
}