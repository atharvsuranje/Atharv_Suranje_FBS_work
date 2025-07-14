#include <stdio.h>

void finalPrice(float*,char*);
void main() {
    float price;
    char isStudent;
    
    printf("Are you a student? (y/n): ");
    scanf(" %c", &isStudent);
    printf("Enter total purchase amount: ");
    scanf("%f", &price);
    finalPrice(&price,&isStudent); 
    
}

void finalPrice(float* price,char* isStudent){
    float discount;
    if (*isStudent == 'y' || *isStudent == 'Y') {
        if (*price > 500) discount = 0.20 * *price;
        else discount = 0.10 * *price;
    } else {
        if (*price > 600) discount = 0.15 * *price;
        else discount = 0;
    }
    
    float finalAmount = *price - discount;
    
    printf("Discount: %.2f\n", discount);
    printf("Amount to be paid: %.2f\n", finalAmount);
}