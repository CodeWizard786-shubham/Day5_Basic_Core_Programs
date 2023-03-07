import java.util.Scanner;
import java.lang.Math;
public class PowerOfTwo {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of N: ");
        int n = sc.nextInt();
        if(n<31) {
            for (int i = 1; i <= n; i++) {
                Double power =Math.pow(i,2);
                System.out.println(i + "^2=" +power);
            }
        }
        else{
            System.out.println("Please enter value between 1 and 30");
        }

    }
}
