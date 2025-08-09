//evaluate the sum of squares of the n natural numbers
import java.util.Scanner;
    class Sumofsquares{
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the value of n:");
            int n=sc.nextInt();
            int sum=0;
            for(int i=1;i<=n;i++){
                sum=sum+i*i;
            }
            System.out.println("the sum of the given natural number is:"+sum);
        }
    }
