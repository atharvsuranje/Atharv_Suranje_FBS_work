#include <stdio.h>

char* oddRemover(char*);
void main() {
    char str[20];
    printf("Enter string : ");
    scanf("%s",str);
    printf("Odd Indices Removed : %s",oddRemover(str));
}

char* oddRemover(char* str){
    int i=0,j=0;
    while(str[i]){
        if(i%2 == 0){
            str[j]=str[i];
            j++;
        }
        i++;
    }
    str[j]='\0';
    return str;
}