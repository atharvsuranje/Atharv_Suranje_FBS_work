#include <stdio.h>
#include <string.h>

struct Admin{
    int id,salary,allowance;
    char name[20];
};


struct Admin storeData(){
    struct Admin temp;
    printf("Enter id,name,salary of Admin : ");
    scanf("%d %s %d %d",&temp.id,&temp.name,&temp.salary,&temp.allowance);
    return temp;
}

struct Admin displayData(struct Admin temp){
    printf("Details of Admin : \n");
    printf("ID : %d\nName : %s\nsalary : %d\nallowance : %d\n",temp.id,temp.name,temp.salary,temp.allowance);
}

void main() {
    struct Admin A1,A2;
    A1=storeData();
    A2=storeData();
    displayData(A1);
    displayData(A2);
}