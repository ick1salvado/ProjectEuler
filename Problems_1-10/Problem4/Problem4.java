public class Main{
    public static boolean isPalindromeNum(int n){
        int reverseNum = 0, newNum = n, digit;
        while(newNum > 0){
            digit = newNum % 10;
            reverseNum = (reverseNum * 10) + digit;
            newNum /= 10;
        }
        return(reverseNum == n);
    }
    
    public static void main(String args[]){
        int largestPalindrome = 0;
        for(int i=900;i<=1000;i++){
            for(int j=900;j<=1000;j++){
                if(isPalindromeNum(i*j) && largestPalindrome < i*j) largestPalindrome = i*j;
            }
        }
        System.out.println(largestPalindrome);
    }
}
