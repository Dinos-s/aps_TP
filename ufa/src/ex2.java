/**
 * 2
 */
public class ex2 {


    public static void main(String[] args) {
        int  j, g;
        float s, termo;

        s=0;
        for(int i = 1; i <=100; i++){
            j = 2*i;
            termo = i;
            for(g = j; g > 1; g--){
                termo = termo/g;     
            }
            if((i % 2)==0){
                termo = -termo;
            }
            s = s +termo;
        }
        System.out.println("S= " + s);
    }
}