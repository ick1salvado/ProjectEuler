# Problem 3 :: Largest Prime Factor

from math import sqrt

def isPrime(n):
    if n < 0: return False
    if n <= 3: return True
    if n % 2 == 0 or n % 3 == 0: return False
    i = 5
    while i*i < n:
        if n % i == 0 or n % (i+2) == 0: return False
        i += 6
    return True
    
if __name__ == "__main__":
    for i in range(int(sqrt(600851475143)),0,-1):
        if 600851475143 % i == 0:
            if isPrime(i):
                print(i)
                break
