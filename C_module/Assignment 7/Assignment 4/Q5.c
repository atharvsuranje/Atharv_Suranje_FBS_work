#include <stdio.h>

void isEven(int*);
void isPrime(int*);
void isPalindrome(int*);
void posiNeg(int*);
void reverse(int*);
void digitSum(int*);
void main()
{
    int num,choice;

    printf("Enter a number: ");
    scanf("%d", &num);

    printf("\nChoose an operation:\n");
    printf("1. Check Even or Odd\n");
    printf("2. Check Prime or Not\n");
    printf("3. Check Palindrome or Not\n");
    printf("4. Check Positive, Negative or Zero\n");
    printf("5. Reverse the Number\n");
    printf("6. Sum of Digits\n");
    printf("Enter your choice (1-6): ");
    scanf("%d", &choice);

    if (choice == 1) isEven(&num);

    else if (choice == 2) isPrime(&num);

    else if (choice == 3) isPalindrome(&num);

    else if (choice == 4) posiNeg(&num);

    else if (choice == 5) reverse(&num);

    else if (choice == 6) digitSum(&num);

    else printf("Invalid choice.\n");
}

void isEven(int* num){
    if (*num % 2 == 0) printf("EVEN");
    else printf("ODD");
}

void isPrime(int* num){
    int isPrime = 1;
    if (*num <= 1) isPrime = 0;
    else
    {
        for (int i = 2; i * i <= *num; i++)
        {
            if (*num % i == 0)
            {
                isPrime = 0;
                break;
            }
        }
    }
    if (isPrime) printf("PRIME");
    else printf("NON PRIME");
}

void isPalindrome(int* num){
    int temp = *num, rev = 0;
    while (temp != 0){
        rev = rev * 10 + temp % 10;
        temp /= 10;
    }
    if (rev == *num) printf("PALINDROME");
    else printf("NOT PALINDROME");
}

void posiNeg(int* num){
    if (*num > 0) printf("Positive\n");
    else if (*num < 0) printf("Negative\n");
    else printf("Zero\n");
}

void reverse(int* num){
    int rev = 0, temp = *num;
        while (temp != 0)
        {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        printf("REVERSE is :: %d",rev);
    }
    
    void digitSum(int* num){
        int sum = 0, temp = (*num < 0) ? -(*num) : *num;
        while (temp != 0)
        {
            sum += temp % 10;
            temp /= 10;
        }
        printf("SUM is :: %d",sum);
}
