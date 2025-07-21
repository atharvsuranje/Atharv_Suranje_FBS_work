#include <stdio.h>

void deposit(int*);
void withdraw(int*);
void display(int);
void main() {
    int balance=8000,choice;

    while(1){
        printf("\n*****MENU*****\n");
        printf("1. Deposit\n");
        printf("2. Withdraw\n");
        printf("3. Display balance\n");
        printf("4. Exit\n");
        printf("\nEnter your choice :: ");
        scanf("%d", &choice);
        if(choice==1){
            deposit(&balance);
        }
        else if(choice==2){
            withdraw(&balance);
        }
        else if(choice==3){
            display(balance);
        }
        else if(choice==4){
            printf("Thanks.");
            break;
        }
        else {
            printf("Invalid choice.\n");
            fflush(stdin);
        }
    }
}

void deposit(int* balance){
    int depositMoney;
    printf("Enter the amount you want to deposit :: ");
    scanf("%d",&depositMoney);
    *balance = *balance + depositMoney;
}

void withdraw(int* balance){
    int withdrawMoney;
    printf("Enter the amount you want to withdraw :: ");
    scanf("%d",&withdrawMoney);
    if(*balance <= 3000 || *balance<=withdrawMoney) {
        printf("Can't withdraw the amount balance is not sufficient");
    }
    else {
        *balance = *balance - withdrawMoney;
    }
}

void display(int balance){
    printf("Your balance is :: %d",balance);
}