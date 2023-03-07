import java.util.Random;
public class FlipCoin {
    public static void main(String [] args){
        int heads=0;
        int tails=0;
        int num_flips=20;
        Random rand=new Random();
        for(int i=1;i<=num_flips;i++) {
            float result = rand.nextFloat(1);
            System.out.println(result);
            if (result > 0.5) {
                heads++;
            } else {
                tails++;
            }
        }
        float percent_heads=(float)heads/num_flips*100;
        float percent_tails=(float)tails/num_flips*100;
        System.out.println("Number of flips: " + num_flips);
        System.out.println("Heads: " + heads + " (" + percent_heads + "%)");
        System.out.println("Tails: " + tails + " (" + percent_tails + "%)");


        }
    }