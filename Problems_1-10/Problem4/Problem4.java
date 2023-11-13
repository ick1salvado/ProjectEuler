// Problem 4 :: Largest palindrome product

public class Main{
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
    
    public static void main(String args[]){
        int largestPalindrome = 0;
        for(int i=1000;i>=900;i--){
            for(int j=1000;j>=900;j--){
                if (i*j > largestPalindrome && isPalindromeNumber(i*j)) largestPalindrome = i*j;
                
            }
        }
        System.out.println(largestPalindrome);
    }
}
