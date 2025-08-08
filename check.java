//wap to check wheather the chharacter is in upper class or in lower class
import java .util.Scanner;
class check{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the character");
        char ch=sc.next().charAt(0);
        if(ch>='A'&&ch<='Z'){
            System.out.println("the character is in upper class");
        
        }else if(ch>='a'&&ch<='z'){
            System.out.println("the character is in lower class");
        }
        else{
            System.out.println("not a valid character");
        }
    }
}