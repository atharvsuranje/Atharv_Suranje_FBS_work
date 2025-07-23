#include <stdio.h>

int comparer(char*,char*);
void main() {
    char str1[20],str2[20];
    printf("Enter string 1 : ");
    scanf("%s",str1);
    printf("Enter string 2 : ");
    scanf("%s",str2);
    int result=comparer(str1,str2);
    if(result == 0) printf("Both Strings are same.\n");
    else if (result>0) printf("%s",str1);
    else printf("%s",str2);
}

int comparer(char* str1,char* str2){
    int i=0;
    while(str1[i] && str2[i]){
        if(str1[i] != str2[i]) return(str1[i] - str2[i]);
        i++;
    }
    return(str1[i] - str2[i]);
}