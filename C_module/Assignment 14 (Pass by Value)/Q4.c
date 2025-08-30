#include <stdio.h>
#include <string.h>

struct HR{
    int id,salary,commission;
    char name[20];
};

struct HR storeData(){
    struct HR temp;
    printf("Enter id,name,salary of HR : ");
    scanf("%d %s %d %d",&temp.id,&temp.name,&temp.salary,&temp.commission);
    return temp;
}

struct HR displayData(struct HR temp){
    printf("Details of HR : \n");
    printf("ID : %d\nName : %s\nsalary : %d\ncommission : %d\n",temp.id,temp.name,temp.salary,temp.commission);
}

void main() {
    struct HR HR1,HR2;
    HR1=storeData();
    HR2=storeData();
    displayData(HR1);
    displayData(HR2);
}