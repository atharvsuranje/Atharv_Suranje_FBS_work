#include <stdio.h>

int isPalindrome();
void main() {
    if(isPalindrome()) printf("Palindrome\n");
    else printf("Not Palindrome\n");
}
int isPalindrome(){
    int n = 121, temp = n, rev = 0;
    
    for (n ; n >0; n/=10) rev = rev*10 + (n%10);
    
    // while (n > 0) {
    //     rev = rev*10 + (n%10);
    //     n /= 10;
    // }
    
    if (rev == temp) return 1;
    else return 0;

}