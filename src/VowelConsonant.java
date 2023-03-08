import java.util.Scanner;
public class VowelConsonant {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the alphabet: ");
        char alphabet=sc.next().charAt(0);
        String result="It is a Vowel";
            switch(alphabet){
                case 'a':
                case 'A':
                    System.out.println(result);
                    break;
                case 'e':
                case 'E':
                    System.out.println(result);
                    break;
                case 'i':
                case 'I':
                    System.out.println(result);
                    break;
                case 'o':
                case 'O':
                    System.out.println(result);
                    break;
                case 'u':
                case 'U':
                    System.out.println(result);
                    break;
                default:
                    System.out.println("It is a Consonant");
            }
        }
    }
