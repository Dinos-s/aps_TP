import java.util.Scanner;

/**
 * ex1
 */
public class ex1 {

    public static void main(String[] args) {
        double x, w, r = 0;
        Scanner ui = new Scanner(System.in); 
        System.out.println("Insira o valor N: ");
        w = ui.nextDouble();
        for(double i = 1; i <= w; i++){
            x = 1/i;
            r = r + x;
            System.out.println(r);
        }
        ui.close();
    }
}