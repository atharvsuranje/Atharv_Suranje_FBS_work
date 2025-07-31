#include <stdio.h>

void main() {
    char userId[30] = "atharvsuranje@gmail.com";
    char password[30] = "Pass@1234";
    char userIdInput[30],passwordInput[30];
    printf("Enter user Id :");
    gets(userIdInput);
    printf("Enter Password :");
    gets(passwordInput);

    if(strcmp(userId,userIdInput)==0){
        printf("Id Valid");
    } 
    else{
        printf("Id NOT Valid");
    } 
    if(strcmp(password,passwordInput)==0){
        printf("password Valid");
    } 
    else{
        printf("password NOT Valid");
    } 

    int capcha=1234,capchaInput;
    printf("Enter capcha : ");
    scanf("%d",&capchaInput);
    if(capcha == capchaInput){
        printf("SUCCESS");
    }
    else printf("FAILED");
}
