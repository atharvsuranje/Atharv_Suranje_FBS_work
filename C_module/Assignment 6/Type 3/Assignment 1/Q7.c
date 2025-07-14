#include <stdio.h>

void totalSalary(float);
void main() { 
    float basic;
    printf("Enter basic salary :: ");
    scanf("%f", &basic);
    totalSalary(basic);
}

void totalSalary(float basic){
    float da, ta, hra;
    if (basic <= 5000) {
        da = 0.10 * basic;
        ta = 0.20 * basic;
        hra = 0.25 * basic;
    } else {
        da = 0.15 * basic;
        ta = 0.25 * basic;
        hra = 0.30 * basic;
    }

    float total = basic + da + ta + hra;
    printf("Total salary is :: %.2f",total);

}