#include <stdio.h>

char* converter(char*);
void main() {
    char str[20];
    printf("Enter string : ");
    scanf(" %[^\n]",str);
    printf("Converted String : %s",converter(str));
}

char* converter(char* str){
    int i=0;
    while(str[i] !='\0'){
        if(str[i] == ' ') str[i]='$';
        i++;
    }
    return str;
}