#include <stdio.h>
#include <string.h>

int isPalindrome(char*);
void main() {
    char str[20];
    printf("Enter string : ");
    scanf("%s",str);
    int result=isPalindrome(str);
    if(result==1) printf("String is Palindrome");
    else printf("String is NOT Palindrome");
}

int isPalindrome(char* str){
    int i=0,length=strlen(str);
    while(i<length/2){
        if(str[i] != str[length-i-1]) return 0;
        i++;
    }
    return 1;
}