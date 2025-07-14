#include <stdio.h>

void isUpper();
void main() {
    isUpper();
}
void isUpper(){
    char ch;
    printf("Enter a character: ");
    scanf("%c", &ch); 
    if (ch >= 'A' && ch <= 'Z') printf("UPPERCASE letter.");
    else if (ch >= 'a' && ch <= 'z') printf("LOWERCASE letter");

}
