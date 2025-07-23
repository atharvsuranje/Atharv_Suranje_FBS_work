#include <stdio.h>

char* mystrlwr(char*);
void main() {
    char str[20];
    printf("Enter string :: ");
    scanf("%s",str);
    printf("In UpperCase : %s",mystrlwr(str));
}

char* mystrlwr(char* str){
    int i = 0;
    while (str[i] != '\0') {
        if (str[i] >= 'a' && str[i] <= 'z') str[i]=str[i]-32;  
        i++;
    }
    return str;
}
