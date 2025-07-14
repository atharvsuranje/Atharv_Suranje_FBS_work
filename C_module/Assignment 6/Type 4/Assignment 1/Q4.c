#include <stdio.h>

int isVowel(char);
void main() {
    char ch;
    printf("Enter the character :: ");
    scanf("%c",&ch);
    int flag=isVowel(ch);
    if(flag) printf("Char is a  VOWEL ");
    else printf("Char is a CONSONANT");
}

int isVowel(char ch){
    if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
        return 1;
    }
    else return 0;

}