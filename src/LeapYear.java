
import java.util.Scanner;
public class LeapYear {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year=sc.nextInt();
        boolean flag=false;
        if(year%4==0){
            if(year%100==0) {
                if (year % 400 == 0) {
                    flag = true;
                }
            }
            else{
                  flag=true;
                }
            }
            if(flag){
                System.out.print(year+" is a Leap year");
            }
            else{
                System.out.print(year+" is a not a Leap year");
            }
        }

    }
