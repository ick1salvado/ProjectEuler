// Problem 4 :: Largest Palindrome Product
#include <iostream>

bool if_palindrome_num(int num){
    int new_num = num, digit, reverse_num = 0;
    while(new_num > 0){
        digit = new_num % 10;
        reverse_num = (reverse_num * 10) + digit;
        new_num /= 10;
    }
    return reverse_num == num;
}

int main(){
    int largest_palindrome_num = 0;
    for(int i=900;i<1000;i++){
        for(int j=900;j<1000;j++){
            if((if_palindrome_num((i*j)) == true) && (largest_palindrome_num<(i*j))){
                largest_palindrome_num = i*j;
            }
        }
    }
    std::cout<<largest_palindrome_num;
    return 0;
}
