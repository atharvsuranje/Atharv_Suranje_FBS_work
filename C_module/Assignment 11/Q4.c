#include <stdio.h>

int mystrcmp(char*,char*);
void main() {
    char str1[20];
    char str2[20];
    printf("Enter string 1 :: ");
    scanf("%s",str1);
    printf("Enter string 2 :: ");
    scanf("%s",str2);
    int result=mystrcmp(str1,str2);
    if (result == 0) printf("Strings are equal\n");
    else printf("Strings are not equal\n");
}

int mystrcmp(char* str1,char* str2){
    int i = 0;
    while (str1[i]!='\0' && str2[i]!='\0') {
        if (str1[i] != str2[i])
            return 1;  
        i++;
    }
    if (str1[i] == '\0' && str2[i] == '\0') return 0;
    else return 1; 
}