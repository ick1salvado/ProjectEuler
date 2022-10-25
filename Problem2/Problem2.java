//Even Fibonacci Numbers

public class Main{
    public static void main(String[] args){
        int sum = 0;
        for(int i=1,j=2,temp;j<4000000;temp=j,j+=i,i=temp) if(j % 2 == 0) sum += j;
        System.out.println(sum);
    }
}
