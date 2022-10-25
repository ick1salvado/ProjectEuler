//Even Fibonacci Numbers

#include <iostream>

int main(){
    int sum = 0,temp;
    for(int i=1,j=2;j<4000000;temp=j,j+=i,i=temp){
        if(j % 2 == 0) sum += j;
    }
    std::cout<<sum;
}
