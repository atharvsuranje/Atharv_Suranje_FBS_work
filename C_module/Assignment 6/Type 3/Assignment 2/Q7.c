#include <stdio.h>

void ageClassfication(int);
void main() {
    int age;
    printf("Enter the age :: ");
    scanf("%d", &age);
    ageClassfication(age);
}

void ageClassfication(int age){
    if(age<12) printf("CHILD");
    else if(age>=12 && age<=19) printf("TEENAGER");
    else if(age>19 && age<60) printf("ADULT");
    else printf("SENIOR");
}