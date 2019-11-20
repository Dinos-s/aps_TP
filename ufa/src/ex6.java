import java.util.Scanner;

/**
 * ex6
 */
public class ex6 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int m = 0, t = 0, N;
        System.out.println("Insira um valor para N: ");
        N = leia.nextInt();
        while (m<N) {
            m = m + 1;
            t = t + m;
        }
        System.out.println(t);
        leia.close();
    }
}