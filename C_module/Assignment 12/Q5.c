#include <stdio.h>

int counter(char*);
void main() {
    char str[20];
    printf("Enter string : ");
    scanf("%s",str);
    printf("Count of Vowels is : %d",counter(str));
}

int counter(char* str){
    int count=0,i=0;
    while(str[i] != '\0'){
        if( (str[i]=='a') || (str[i]=='e') || (str[i]=='i') || (str[i]=='o') || (str[i]=='u') 
        || (str[i]=='A') || (str[i]=='E') || (str[i]=='I') || (str[i]=='O') || (str[i]=='U') )
        {
            count++;
        } 
        i++;
    }
    return count;
}