import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileInputStream;
/**
 * ex10
 */
public class ex10 {

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        String p;
        int preço, qutd;
        PrintWriter ew = null;
        FileWriter o = null;

        try {
            o = new FileWriter("Estoque.txt",true);
            ew = new PrintWriter(o);

            System.out.println("Insira o nome do produto ou y para sair: ");
            p = r.nextLine();

            while (p.equals("y")== false) {

                System.out.print("Preço do produto R$: ");
                preço = r.nextInt();
                
                System.out.print("Quntidade disponivel no estoque: ");
                qutd = r.nextInt();

                ew.println("------------EM ESTOQUE-------------");
                ew.println("Produto: "+p);
                ew.println("Preço R$: "+preço); 
                ew.println("Quantidade em estoque: "+qutd);

                
              System.out.println("Insira o nome do produto ou y para sair: ");

              p = System.console().readLine();

            }
        } catch (Exception e) {
            System.out.println(e);
        }finally{
            ew.close();
        }  
            try {
               FileInputStream ar = new FileInputStream("Estoque.txt");
                InputStreamReader in = new InputStreamReader(ar);
                BufferedReader  br = new BufferedReader(in);
                String ps;
                 do {
                     ps = br.readLine();
                     if (ps != null) {
                         System.out.println(ps);
                     }
                 } while (ps != null);
                 br.close();
            } catch (Exception e) {
               System.out.println(e);
            }
            r.close();
    }
}