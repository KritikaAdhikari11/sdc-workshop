//wap to print the multiplication table of a given number
import java.util.Scanner;
class multiplicationTable{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter any number:");
        int num=sc.nextInt();
        System.out.println("multiplication table of"+num+"is:");
        for(int i =1; i <=10;i++){
            System.out.println(num+"*"+i+"="+(num*i));
        }
    }
}