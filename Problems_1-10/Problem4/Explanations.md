## java Solution:
  This problem can be seperated into two parts the first part being the test if a number
  is a palindrome. To acheive this I created a method ```isPalindromeNumber``` defined
  as the following:
  ``` java
  private static boolean isPalindromeNumber(int n){
        int temp = n, flipped = 0, i = 0;
        while(temp != 0){
            int digit = temp % 10;
            temp /= 10;
            flipped = (flipped + digit) * 10;
        }
        if(flipped/10 == n) return true;
        return false;
  }
  ```
  This function mathematically flips a number by adding the individual digits calculated by 
  taking a modulus of 10 of the original number and adding the digit to the new number and 
  multiplying it by 10.

  The second part of the solution consist of a nested for loop that is used to to calculate
  the possible products between 900 and 1000. These products are then checked if they are
  palindromic and greater than current largest product. In the end we simply print this variable.
  ```Java
  public static void main(String args[]){
        int largestPalindrome = 0;
        for(int i=1000;i>=900;i--){
            for(int j=1000;j>=900;j--){
                if (i*j > largestPalindrome && isPalindromeNumber(i*j)) largestPalindrome = i*j;
            }
        }
        System.out.println(largestPalindrome);
  }
  ```
  

## Python Solution:
  This solution is also seperated into two parts, the nested loop is essentially the same as the 
  java solution, Where this solution differs is in the conversion of an int data type into a string 
  and using a more pythonic method we compare to see if this string is a palindrome.
  ``` Python
  def isPalindromeNumber(n):
    n = str(n)
    return n == n[::-1]
  ```
  

## C++ Solution:
  This solution is in essence the same as the Java solution.
