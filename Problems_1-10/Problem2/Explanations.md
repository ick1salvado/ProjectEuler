## C++
For this solution two variables are initialized to start *sum* and *temp*, fom there we can 
see a for loop: 
``` C++
for(int i=1,j=2;j<4000000;temp=j,j+=i,i=temp){
```
This loop consists of two variables *i* (which is the previous term in the sequence) and *j*
(which is the current term in the sequence), where per every loop (until *j* is less than 4000000) *j* 
assigns to the value of *j + i* (this adds the previous term with the current term to get the next term
of the sequence) and assigns the value of *i* to the current *j* (using the help of *temp* as to not 
provide the wrong sum for *j*). From here we just check to see if the current term (*j*) is even
``` C++ 
if(j % 2 == 0)
```
if so we add it to the variable *sum*.

## Python
This solution is in essence the same as the C++ solution. Their is a slight difference in that in 
Python we do not need a *temp* variable as we can direcly switch values without the use of an auxilary
variable:
``` Python
i,j = j,i+j
```

## Java
This solution is in essence the same as the C++ solution. The only difference being the variable 
assignment, the loop, and the modulus condition are all in one line:
``` Java
for(int i=1,j=2,temp;j<4000000;temp=j,j+=i,i=temp) if(j % 2 == 0) sum += j;
```
The similarites are apparent as we view the names of the variables.
