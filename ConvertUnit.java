// wap that is used to perform the folowing operation ;
//-convert feet to inch
//- convert kg to pound
import java.util.Scanner;
class ConvertUnit{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("choose the conversion you want:");
        System.out.println("1. feet to inch");
        System.out.println("2. kg to pound");
        int choice=sc.nextInt();
        if(choice==1){
            System.out.println("enter the value in feet");
            double feet=sc.nextDouble();
            double inch= feet*12;
            System.out.println(feet+"feet is equal to "+inch+"inch");

        }
        else if(choice==2){
            System.out.println("enter the value in kg:");
            double kg =sc.nextDouble();
            double pound=kg*20462;
            System.out.println(kg+"kg is equal to "+pound+"pound");
        }
        else{
            System.out.println("enter either 1 or 2");
        }

    }
}
