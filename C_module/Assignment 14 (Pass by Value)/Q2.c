#include <stdio.h>
#include <string.h>

struct Employee{
    int id;
    char name[20];
    int salary;
};

struct Employee storeData(){
    struct Employee temp;
    printf("Enter id,name,salary of Employee : ");
    scanf("%d %s %d",&temp.id,&temp.name,&temp.salary);
    return temp;
}

struct Employee displayData(struct Employee temp){
    printf("Details of Employee : \n");
    printf("ID : %d\nName : %s\nsalary : %d\n",temp.id,temp.name,temp.salary);
}

void main() {
    struct Employee E1,E2;
    E1=storeData();
    E2=storeData();
    displayData(E1);
    displayData(E2);
}