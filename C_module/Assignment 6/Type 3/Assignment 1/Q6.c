#include <stdio.h>

void isUppercase(char);
void main() {
    char ch;
    printf("Enter a character: ");
    scanf("%c", &ch); 
    isUppercase(ch);
    

}
void isUppercase(char ch){
    if (ch >= 'A' && ch <= 'Z') printf("UPPERCASE letter.");
    else if (ch >= 'a' && ch <= 'z') printf("LOWERCASE letter");
}
