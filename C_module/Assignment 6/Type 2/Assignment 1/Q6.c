#include <stdio.h>

int isUppercase();
void main() {
    if(isUppercase()) printf("UPPERCASE letter.");
    else printf("LOWERCASE letter");
    

}
int isUppercase(){
    char ch;
    printf("Enter a character: ");
    scanf("%c", &ch); 
    if (ch >= 'A' && ch <= 'Z') return 1;
    else if (ch >= 'a' && ch <= 'z') return 0;
}
