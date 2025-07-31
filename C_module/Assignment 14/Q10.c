// Product (id, name, quantity, price)
#include <stdio.h>
#include <string.h>

struct Product{
    int id,quantity,price;
    char name[20];
};

void main() {
    struct Product P1,P2;
    P1.id=101,strcpy(P1.name,"abc"),P1.quantity=6000,P1.price=500;
    printf("Enter id,name,quantity,price of Product 2 : ");
    scanf("%d %s %d %d",&P2.id,&P2.name,&P2.quantity,&P2.price);
    printf("Details of Product 1 : \n");
    printf("id : %d\nName : %s\nquantity : %d\nprice : %d",P1.id,P1.name,P1.quantity,P1.price);
    printf("\nDetails of Product 2 : \n");
    printf("id : %d\nName : %s\nquantity : %d\nprice : %d",P2.id,P2.name,P2.quantity,P2.price);
}