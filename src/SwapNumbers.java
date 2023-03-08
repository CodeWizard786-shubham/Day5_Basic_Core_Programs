import java.util.Scanner;
public class SwapNumbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int first_num=sc.nextInt();
        System.out.print("Enter Second Number: ");
        int second_num=sc.nextInt();
        System.out.println("The numbers before swapping are: ") ;
        System.out.println("First Number="+first_num+" Second Number="+second_num);
        int temp=first_num;
        first_num=second_num;
        second_num=temp;
        System.out.println("The numbers after swapping are: ") ;
        System.out.println("First Number="+first_num+" Second Number="+second_num);

    }
}
