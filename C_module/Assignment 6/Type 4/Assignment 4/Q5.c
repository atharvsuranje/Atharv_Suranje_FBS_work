#include <stdio.h>

int isEven(int);
int isPrime(int);
int isPalindrome(int);
int posiNeg(int);
int reverse(int);
int digitSum(int);
void main()
{
    int num,choice,flag;

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

    if (choice == 1){
        flag=isEven(num);
        if (flag) printf("EVEN");
        else printf("ODD");
    }

    else if (choice == 2) {
        flag=isPrime(num);
        if (flag) printf("PRIME");
        else printf("NON PRIME");
    }

    else if (choice == 3) {
        flag=isPalindrome(num);
        if (flag) printf("PALINDROME");
        else printf("NOT PALINDROME");
    }

    else if (choice == 4) {
        flag=posiNeg(num);
        if(flag==1) printf("Positive\n");
        else if (flag) printf("Negative\n");
        else printf("Zero\n");
    }

    else if (choice == 5) printf("REVERSE is :: %d",reverse(num));

    else if (choice == 6) printf("SUM is :: %d",digitSum(num));

    else printf("Invalid choice.\n");
}

int isEven(int num){
    if (num % 2 == 0) return 1;
    else return 0;
}

int isPrime(int num){
    int isPrime = 1;
    if (num <= 1) isPrime = 0;
    else
    {
        for (int i = 2; i * i <= num; i++)
        {
            if (num % i == 0)
            {
                isPrime = 0;
                break;
            }
        }
    }
    if (isPrime) return 1;
    else return 0;;
}

int isPalindrome(int num){
    int temp = num, rev = 0;
    while (temp != 0){
        rev = rev * 10 + temp % 10;
        temp /= 10;
    }
    if (rev == num) return 1;
    else return 0;
}

int posiNeg(int num){
    if (num > 0) return 1;
    else if (num < 0) return 2;
    else return 0;
}

int reverse(int num){
    int rev = 0, temp = num;
        while (temp != 0)
        {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        return rev;
    }
    
    int digitSum(int num){
        int sum = 0, temp = (num < 0) ? -num : num;
        while (temp != 0)
        {
            sum += temp % 10;
            temp /= 10;
        }
        return sum;
}
