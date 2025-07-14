#include <stdio.h>

int isUppercase(char);
void main() {
    char ch;
    printf("Enter a character: ");
    scanf("%c", &ch); 
    int flag=isUppercase(ch);
    if(flag) printf("UPPERCASE letter.");
    else printf("LOWERCASE letter");
}
int isUppercase(char ch){
    if (ch >= 'A' && ch <= 'Z') return 1;
    else if (ch >= 'a' && ch <= 'z') return 0;
}
