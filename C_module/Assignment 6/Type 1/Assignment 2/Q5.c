#include <stdio.h>
void calculatePrice();
void main() {
    calculatePrice();
}
void calculatePrice(){
    float price, discount = 0;
    char isStudent;
    
    printf("Enter total purchase amount: ");
    scanf("%f", &price);
    printf("Are you a student? (y/n): ");
    scanf(" %c", &isStudent);  
    
    if (isStudent == 'y' || isStudent == 'Y') {
        if (price > 500) discount = 0.20 * price;
        else discount = 0.10 * price;
    } else {
        if (price > 600) discount = 0.15 * price;
        else discount = 0;
    }
    
    float finalAmount = price - discount;
    
    printf("Discount: %.2f\n", discount);
    printf("Amount to be paid: %.2f\n", finalAmount);

}
