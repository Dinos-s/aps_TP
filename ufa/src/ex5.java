import java.util.Arrays;

//import java.util.Random;

/**
 * ex5
 */
public class ex5 {

    public static void main(String[] args) {
        int v[] = new int [101];
        for(int i = 0; i <= 100; i++){
            v[i] = (int) (Math.random()*1000);
        }
        Arrays.sort(v);
        for (int i = 0; i <= 99; i++){
            System.out.println("Ordem -> " + v[i]);
        }
        int x = v[0], s=1, c;
        for(int i = 0; i <= 99; i++){
         c = 0;
          for(int k = 0; k <= 99; k++){
            if(v[i] == v[k]){
            c++;
            }else if (i!=k) {
                c++;
             }
          } 
        if (c > s) {
            x = v[i];
            s++;
        }
        }
        System.out.println((String.format("O maior número sorteado é %d, repitido %d vezes;", x,s)));
    }
    
}