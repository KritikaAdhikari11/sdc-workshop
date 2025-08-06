import java.util.Scanner;
class abc{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 'n' number:");
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){
            System.out.println("Enter number"+i+"i");
            
            int n=sc.nextInt();
            sum+=n;

        }
    
        System.out.println("the sum of number is:"+sum);
    }
}