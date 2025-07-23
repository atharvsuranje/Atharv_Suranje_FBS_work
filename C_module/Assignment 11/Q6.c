#include <stdio.h>
#include <string.h>

char* mystrncat(char*,char*,int);
void main() {
    char str1[20];
    char str2[20];
    int n;
    printf("Enter string 1 :: ");
    scanf("%s",str1);
    printf("Enter string 2 :: ");
    scanf("%s",str2);
    printf("Concate till index in string 2 :: ");
    scanf("%d",&n);
    printf("%s",mystrncat(str1,str2,n));
}

char* mystrncat(char* str1,char* str2,int n){
    int i=0;
    int length=strlen(str1);
    while(str2[i]!='\0' && i<n){
        str1[length]=str2[i];
        i++;
        length++;
    }
    str1[length]='\0';
    return str1;
}