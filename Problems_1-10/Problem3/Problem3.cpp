//Problem 3 :: Largest Prime Factor
#include <iostream>
#include <math.h>

bool is_prime(int num){
    if(num <= 1) return false;
    if(num <= 3) return true;
    if(num % 3 == 0 || num % 2 == 0) return false;
    for (int i=5;i*i<=num;i+=6){
        if (num % i == 0 || num % (i + 2) == 0) return false;
    }
    return true;
}

int main(){
    for(int i=sqrt(600851475143);i>0;i--){
        if((is_prime(i) == true) && (600851475143 % i == 0)){ 
            std::cout << i;
            break;
        }
    }
    return 0;
}
