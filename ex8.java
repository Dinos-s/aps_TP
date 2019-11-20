import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Random;

/**
 * ex8
 */
public class ex8 {

    public static void main(final String[] args) {
        Random t = new Random();
        PrintWriter ax = null;
        String nome, cargo, g; 
        double sl = 0; 
        int codgf, sb, r, nd, op = 0;

        try {
            final FileWriter out = new FileWriter("Trabalho.txt", true);
            ax = new PrintWriter(out);

            System.out.println("Digite o nome do trabalhador ou x para sair: ");
            nome = System.console().readLine();

            while (nome.equals("x") == false) {

                System.out.print("Cargo do trabalhador: ");
                cargo = System.console().readLine();

                System.out.print("Digite o codigo fucional do trbalhador: ");
                String d = System.console().readLine();
                codgf = Integer.parseInt(d);

                System.out.println("Data de admição do fucionario: ");
                 g = System.console().readLine();

                 String[] l = g.split("/");
                 
                 LocalDate da = LocalDate.of(Integer.parseInt(l[2]), Integer.parseInt(l[1]), Integer.parseInt(l[0]));
                

                System.out.print("Sálario bruto do fucionário: ");
                 String k = System.console().readLine();
                sb = Integer.parseInt(k);

                System.out.print("Numeros de depedentes do fucionario: ");
                 String j = System.console().readLine();
                nd = Integer.parseInt(j);

                System.out.println("Deseja calcular o sálario liquido? ");
                System.out.println("1- Sim;");
                System.out.println("0- Não;");
                String s = System.console().readLine();
                op = Integer.parseInt(s);
                switch (op) {
                case 1:
                    r = t.nextInt(5)+1;
                    sl = sb - r;
                    break;

                default:
                    break;
                }

                ax.println("------------------");
                ax.println("Nome do trabalhador: "+nome);
                ax.println("Cargo: "+cargo);
                ax.println("Codigo de fucional: "+codgf);
                ax.println("Data de admição: "+da);
                ax.println("Salário bruto: "+sb);
                ax.println("Número de dependentes: "+nd);
                ax.println("Salario liquido: "+ sl);

                System.out.println("Digite o nome do trabalhador ou X para sair: ");
                nome = System.console().readLine();
            }
        } catch (final Exception e) {
            System.out.println(e);
        }finally{
            ax.close();
        }
    }
}