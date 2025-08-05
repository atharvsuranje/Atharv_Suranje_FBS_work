#include <stdio.h>

typedef struct Passenger
{
    int age;
    float payable;
}Passenger;

void ticketcalculate(Passenger* pasArr,int n,int ticket){
    for(int i=0;i<n;i++){
        if(pasArr[i].age<12 && pasArr[i].age>0){
            pasArr[i].payable = ticket - ((ticket*30)/100);
        }
        else if(pasArr[i].age>59){
            pasArr[i].payable = ticket - ((ticket*50)/100);
        }
        else{
            pasArr[i].payable = ticket;
        }
    }
}

void main() {
    Passenger pasArr[5];
    float ticket=1000;
    for(int i=0;i<5;i++){
        printf("Enter age for Passenger %d: ",i+1);
        scanf("%d",&pasArr[i].age);
    }
    ticketcalculate(pasArr,5,ticket);
    for(int i=0;i<5;i++){
        printf("Ticket for Passenger %d with age %d is : %.2f\n",i+1,pasArr[i].age,pasArr[i].payable);
    }

}