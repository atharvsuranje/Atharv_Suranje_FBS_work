#include <stdio.h>

int wordCounter(char*);
void main() {
    char str[20];
    printf("Enter string : ");
    scanf(" %[^\n]",str);
    printf("Number of Words are : %d",wordCounter(str));
}

int wordCounter(char* str){
    int i=0,count=0,inword=0;  //inword is a flag to track if we are inside a word
    while(str[i]){
        if(str[i] != ' ' && inword==0){
            inword=1;
            count++;
        }
        else if (str[i] == ' ') inword=0;
        i++;
    }
    return count;
}