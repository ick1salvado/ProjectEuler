## C++
  This solution to the problem consists of two parts: the first part being the function
  ```isPrime```: now this function can also be seperated into two parts
  ``` C++
    if(num <= 1) return false;
    if(num <= 3) return true;
    if(num % 3 == 0 || num % 2 == 0) return false;
  ```
  These first lines are a few simple checks to see if the target numer is prime, the first `if`
  checks to see if the target number is less than or equal to 1, none of these numbers are prime;
  the next `if` checks to see if the target number is equal to 2 or 3 which are prime numbers; 
  The final `if` checks to see if the target number is divisible by the first two prime numbers,
  if it is that would mean the number has a multiple and is not prime.
  For the next part of the *`isPrime`* function:
  ``` C++
    for (int i=5;i*i<=num;i+=6){
        if (num % i == 0 || num % (i + 2) == 0) return false;
    }
    return true;
  ```
  First we can observe that we search for multiples starting at the number 5, as all previous numbers have 
  already been discarded, this provides us an advantage in the search as it will allow us to only check to
  see if the other prime numbers after it are multiples. Next we can see the end condition `i*i<=num`, this
  condition works due to the fact that a multiple of a number is never greater than its root *(MD)*. The only 
  mutiples that we check are only prime numbers as all other numbers would have already been implicitly checked 
  *(MD)*. If no value checked is a multiple then the number is prime.
  
  The second part of the solution inside the `main` function:
  ``` C++
    for(int i=sqrt(600851475143);i>0;i--){
        if((is_prime(i) == true) && (600851475143 % i == 0)){ 
            std::cout << i;
            break;
        }
    }
  ```
  This `for` loop follows the logic of the isPrime `i*i<=num` the differnce being it starts at the largest possible
  multiple to the target number, this is to find the largest valid value first. The solution is printed out simply 
  when the `ith` number is prime and a multiple of the given target value ***600851475143***
  
## Python

## Java
