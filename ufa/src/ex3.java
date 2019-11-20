import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

/**
 * ex3
 */
public class ex3 {
 class BDCoseno {
            public BigDecimal cos(BigDecimal x, int scale) {
                List<BigDecimal> fat = new ArrayList<BigDecimal>();
                BigDecimal f = BigDecimal.ONE;
                fat.add (f);
                int n = 1;
                do {
                    f = f.negate().multiply(x.pow(2)).divide(new BigDecimal ((2 * n) * (2 * n - 1)), scale, RoundingMode.HALF_EVEN);
                    n++;
                    fat.add (f);
                } while (f.abs().compareTo(f.ulp()) > 0);
                BigDecimal res = BigDecimal.ZERO;
                for (int i = fat.size() - 1; i >= 0; i--) {
                    res = res.add (fat.get(i));
                }
                return res;
            }
    }
    public static void main(String[] args) {
        double x;
        for (int i = 0; i <= 100; ++i) {
            x = Math.toRadians (i);
            System.out.println (i + "-> " + cos (new BigDecimal (x), 30) + " " + Math.cos (x));
     }         System.out.println();
  }

    private static int cos(BigDecimal bigDecimal, int i) {
        return 0;
    }
}