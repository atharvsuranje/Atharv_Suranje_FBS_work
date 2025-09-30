#include <stdio.h>

char* converter(char*);
void main() {
    char str[20],ch;
    int i=0;
    printf("Enter string : ");
    // while(i<20 && scanf(" %c",&ch)==1 && ch != '\0'){
    //     str[i]=ch;
    //     printf("%c",str[i]);
    //     i++;
    // }
    // str[i]='\0';
    // scanf(" %[^\n]",str);
    gets(str);
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