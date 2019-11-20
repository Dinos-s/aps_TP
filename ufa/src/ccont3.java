/**
 * ccont3
 */
public class ccont3 {

    public static void main(String[] args) {
        int graus = 0;
        double cos = 0, radianos = 0;

        radianos = graus * (Math.PI/180);

        cos = Math.cos(radianos);
        for(cos = 0; cos <= 100; cos-- ){
           System.out.println("Cosseno = " + cos); 
        } 
    }
}