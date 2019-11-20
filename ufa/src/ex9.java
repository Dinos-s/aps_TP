import java.io.PrintWriter;
import java.util.Scanner;



import java.io.FileWriter;
/**
 * ex9
 */
public class ex9 {

    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        PrintWriter ESC = null;
        String aluno;
        int op = 0, m = 0, nota1 = 0, nota2 = 0, senha, d, ef = 0, mf = 0, z=0;
        try {
            FileWriter ou = new FileWriter("Alunos.txt", true);
            ESC = new PrintWriter(ou);         
            
            System.out.println("Crie uma senha para continuar: ");
            senha = q.nextInt();
            d = senha;

            System.out.println("Digite sua senha: ");
            senha = q.nextInt();
            if (senha !=d) {
                System.out.println("Digite sua senha: ");
                senha = q.nextInt();
            }
                while (senha == d && senha !=z) {
                    System.out.println("Digíte o nome do aluno: ");
                    aluno = System.console().readLine();

                    System.out.println("1°nota do aluno: ");
                    nota1 = q.nextInt();

                    System.out.println("2°nota do aluno: ");
                    nota2 = q.nextInt();

                    m = (nota1 + nota2) / 2;
                    if (m >= 7) {
                        System.out.println(m);
                        System.out.println("Aluno aprovado!");
                    } else {
                        System.out.println(m);
                        System.out.println("O aluno nescessitará fazer o exame final? ");
                        System.out.println("1- Sim");
                        System.out.println("0- Não");
                        op = q.nextInt();
                        switch (op) {
                        case 1:
                            System.out.println("Nota do exame final: ");
                            ef = q.nextInt();
                            mf = m + ef/2;
                            break;

                        default:
                            break;
                        }
                        if (mf >= 5) {
                            System.out.println("Aluno aprovado pelo exame final!");
                        } else {
                            System.out.println("Aluno reprovado!");
                        }
                    }
                    ESC.println("-----------------");
                    ESC.println("Aluno: " + aluno);
                    ESC.println("1°Nota: " + nota1);
                    ESC.println("2°Nota: " + nota2);
                    ESC.println("Média sem exame final: " + m);
                    ESC.println("Nota do exame final: " + ef);
                    ESC.println("Média com exame final: " + mf);

                    System.out.println("Digite sua senha ou z para sair: ");
                    senha = q.nextInt();

                }     
            } catch (Exception e) {
            System.out.println(e);
            }finally{
              ESC.close();
            }
        q.close();
    }
}
