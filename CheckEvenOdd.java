
import java.util.Scanner;
class CheckEvenOdd
{
    public static void main(String[] args) {
     int num;
     System.out.println("Enter an integer number:");
     Scanner input=new Scanner(System.in);
     num=input.nextInt();
     if(num%2==0)
         System.out.println("Entered number is Even");
     else
         System.out.println("Entered number is odd");
    }
