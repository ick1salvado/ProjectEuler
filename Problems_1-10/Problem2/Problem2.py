#Problem 2 :: Even Fibonacci Numbers
i,j,s = 1,2,0

while i < 4000000:
    if(j % 2 == 0): s = s + j
    i,j = j,i+j
print(s)
