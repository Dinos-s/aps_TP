import java.util.Scanner;

/**
 * ex3
 */
public class ex3 {

    public static void main(String[] args) {
        double x = 1, elev = 2, fat = 2;
        double divi, ax, ax2, y;
        Scanner h = new Scanner(System.in);
        
       System.out.println("Digite o dividendo: ");
        y = h.nextDouble();
        y = Math.pow(y, 2);
        divi = y;
        for (int i = 0; i <= 100; i++){
            ax2 = 0;
            ax = fat;
            while (fat > 1) {
                ax = ax * (fat - 1);
                if (fat > 1) {
                     ax2++;
                }
                fat --;
            }
            if (i % 2 == 0) {
                x -= divi / ax;
            }else{
                x += divi / ax;
            }
            System.out.println(divi + "/"+ax+" = " + x);
            fat += 2 + ax2;
            elev += elev + 2;
            divi = divi * y;
        }
        h.close();
    }
  }
