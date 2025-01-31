import java.sql.SQLOutput;
import java.util.*;
public class Calculator {


    public static class cal{
        Scanner sc = new Scanner(System.in);
        void add(){
            System.out.println("Enter a and b :");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a+b);
        }
        void sub(){
            System.out.println("Enter a and b :");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a-b);
        }
        void mul(){
            System.out.println("Enter a and b ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("The product of a and b is :"+ " "+a*b);

        }
        void div() {
            System.out.println("Enter a and b ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == 0 && b == 0) {
                System.out.println("Invalid division");
            } else {
                System.out.println("The division of a and b is :" + " " + a / b);

            }
        }
        void rem(){
            System.out.println("Enter a and b ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a==0 && b==0) System.out.println("Invalid ");
            System.out.println("The remender of "+a+"and "+b+"is :"+a%b);

        }
        void sqrt(){
            int a  = sc.nextInt();
            System.out.println(Math.sqrt(a));

        }
        void expo(){
            System.out.println("Enter the value");
            int a = sc.nextInt();
            System.out.println("The exponential value of "+a+" "+ "is : "+Math.exp(a)); ;
        }
        void convert() {
            System.out.println("For unit conversion = 1");
            System.out.println("For currency conversion = 2");
            System.out.println("For height conversion = 3");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    unit();
                    break;
                case 2:
                    currenc();
                    break;
                default:
                    System.out.println("Invalid choice ");
            }

            return ;
         }


       void unit(){
            System.out.println("For cm to M conversion = 1");
            System.out.println("For m to cm  conversion = 2");
            System.out.println("For m to km  conversion = 3");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            System.out.println("Enter your value ");
            int val= sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("cm to m is :"+" "+ val/100);
                case 2:
                    System.out.println("m to cm"+" "+ val*100);
                case 3:
                    System.out.println("M to km"+" "+ val/1000);
            }
       }
        void currenc(){
            System.out.println("For INR to $ conversion = 1");
            System.out.println("For $ to INR conversion = 2");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            System.out.println("Enter your value ");
            double val= sc.nextDouble();
            switch(choice) {
                case 1:
                    System.out.println("Inr to $ is :"+" "+ val/88);
                case 2:
                    System.out.println("$ to INR"+" "+ val*88);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice");
         String c = sc.next();
         cal c1 = new cal();
         switch(c){
             case "+":
                 c1.add();
                 break;
             case "-":
                 c1.sub();
                 break;
             case "*":
                 c1.mul();
                 break;
             case "/":
                c1.div();
                 break;
             case "%":
                 c1.rem();
                 break;
             case "sq":
                 c1.sqrt();
                 break;
             case "e":
                 c1.expo();
                 break;
             case "conversion":
                c1.convert();
                 break;
             default:
                 System.out.println("Invalid choice");
         }
    }
}
