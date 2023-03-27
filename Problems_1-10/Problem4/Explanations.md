## C++ Solution:
  In this solution we first begin by defining a function that test whether a given number is a palindrome,
  it does this by utilizing the modulus operator to "cut" the number's lowest digit and multiplies it 
  to move it to its corresponding place and adds it to its new total (MD), this is all done within this code:
  ```c++
  while(new_num > 0){
        digit = new_num % 10;
        reverse_num = (reverse_num * 10) + digit;
        new_num /= 10;
  }
  ```
  After this we may do some simple comparisons, in a way, brute forcing our answer starting at the highest number
  possible to reach the solution while helping to remove some inefficiency (MD). The comparisons consist of checking if
  the number is palindrome and the if it is greater than the previous `largest_palindrome_num`:
  ```c++
  if((if_palindrome_num((i*j)) == true) && (largest_palindrome_num<(i*j)))
  ```
  
## Python Solution:
  In this Solution there is a difference in how the palindrome is tested; unlike the other two solutions
  which focus mainly on a mathematical method of calculating the reverse of the number, in a more 
  pythonic fashion we simply convert the integer: 
  ```python
  i * j 
  ``` 
  to a *string* int which the we can compare
  it to its reverse using `n[::-1]` as this creates a string by moving backwards through the initial *string*
  and direcly compares itself with the initial `n`
  
## Java Solution:
  This solution is in essence the same as the C++ solution.
