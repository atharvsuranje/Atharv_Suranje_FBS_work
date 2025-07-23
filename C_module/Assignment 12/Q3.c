#include <stdio.h>

char* remover(char*,int);
void main() {
    char str[20];
    int index;
    printf("Enter string : ");
    scanf("%s",str);
    printf("Enter Index to remove : ");
    scanf("%d",&index);
    printf("Converted String : %s",remover(str,index));
}

char* remover(char* str,int index){
    // int i=0;
    while(str[index] != '\0'){
        str[index] = str[index+1];
        index++;
        // i++;
    }
    str[index]='\0';
    return str;
}