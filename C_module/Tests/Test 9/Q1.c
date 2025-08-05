#include <stdio.h>

char* removeDuplicate(char* str){
    int flag[256]={0},i=0,j=0;    
    while(str[i] != '\0'){
        if(flag[(int) str[i]] != 1){
            flag[(int) str[i]] =1;
            str[j]=str[i];
            j++;
        }
        i++;
    }
    str[j]='\0';
    return str;
}

void main() {
    char str[30];
    printf("Enter string : ");
    gets(str);
    printf("Original String : %s",str);
    printf("\nModified String : %s",removeDuplicate(str));
    
}