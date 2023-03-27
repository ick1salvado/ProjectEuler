# Problem 4 :: Largest palindrome product

def isPalindromeNumber(n):
    n = str(n)
    return n == n[::-1]
    

if __name__ == "__main__":
    largestPalindrome = 0
    for i in range(900,1001):
        for j in range(900, 1001):
            if isPalindromeNumber(i*j) and largestPalindrome < (i*j): largestPalindrome = (i*j)
    print(largestPalindrome)
