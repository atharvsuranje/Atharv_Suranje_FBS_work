#include <stdio.h>

int mystrncmp(char*,char*,int);
void main() {
    char str1[20];
    char str2[20];
    int n;
    printf("Enter string 1 :: ");
    scanf("%s",str1);
    printf("Enter string 2 :: ");
    scanf("%s",str2);
    printf("Check till :: ");
    scanf("%d",&n);
    int result=mystrncmp(str1,str2,n);
    if (result == 0) printf("First %d are equal\n",n);
    else printf("Strings are not equal\n");
}

int mystrncmp(char* str1,char* str2,int n){
    int i = 0;
     while (i < n) {
        if (str1[i] != str2[i]) return 1;
        if (str1[i] == '\0' || str2[i] == '\0') break;
        i++;
    } 
    return 0;
}