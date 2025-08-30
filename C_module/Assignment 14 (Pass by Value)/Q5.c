#include <stdio.h>
#include <string.h>

struct SalesManager{
    int id,salary,incentive,target;
    char name[20];
};

struct SalesManager storeData(){
    struct SalesManager temp;
    printf("Enter id,name,salary of SalesManager : ");
    scanf("%d %s %d %d %d",&temp.id,&temp.name,&temp.salary,&temp.target);
    return temp;
}

struct SalesManager displayData(struct SalesManager temp){
    printf("Details of SalesManager : \n");
    printf("ID : %d\nName : %s\nsalary : %d\nincentive : %d\ntarget : %d\n",temp.id,temp.name,temp.salary,temp.incentive,temp.target);
}

void main() {
    struct SalesManager SM1,SM2;
    SM1=storeData();
    SM2=storeData();
    displayData(SM1);
    displayData(SM2);
}