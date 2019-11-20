import java.util.Scanner;

/**
 * ex4
 */
public class ex4 {

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        float media = 0, B, C, O;
        int op = 0;

        System.out.println("-----MENU-----");
        System.out.println("Escolha o sexo das especies: ");
        System.out.println("1- masculino;");
        System.out.println("2- feminino;");
        op = r.nextInt();

        switch (op) {
            case 1:
                System.out.println("Indique o peso bolvino: ");
                B = r.nextFloat();
                System.out.println("Indique Peso cabrino: ");
                C = r.nextFloat();
                System.out.println("Indique Peso ovinos: ");
                O = r.nextFloat();

                media = O + B + C/3;
                System.out.println("A media de pesos entre os animais é: " + media);

                   break;

                case 2:
                System.out.println("Indique o peso bolvino: ");
                B = r.nextFloat();
                System.out.println("Indique Peso cabrino: ");
                C = r.nextFloat();
                System.out.println("Indique Peso ovinos: ");
                O = r.nextFloat();

                media = O + B + C/3;
                System.out.println("A media de pesos entre os animais é: " + media);
                    break;

            default:
            System.out.println("Por favor renecie o programa.");
                break;
        }
        r.close();

    }
}