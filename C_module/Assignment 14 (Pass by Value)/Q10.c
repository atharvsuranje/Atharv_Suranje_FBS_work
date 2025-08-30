#include <stdio.h>
#include <string.h>

struct Product{
    int id,quantity,price;
    char name[20];
};

struct Product storeData(){
    struct Product temp;
    printf("Enter id,name,quantity,price of Product : ");
    scanf("%d %s %d %d",&temp.id,&temp.name,&temp.quantity,&temp.price);
    return temp;
}

struct Product displayData(struct Product temp){
    printf("Details of Product : \n");
    printf("ID : %d\nName : %s\nquantity : %d\nprice : %d\n",temp.id,temp.name,temp.quantity,temp.price);
}

void main() {
    struct Product P1,P2;
    P1=storeData();
    P2=storeData();
    displayData(P1);
    displayData(P2);
}