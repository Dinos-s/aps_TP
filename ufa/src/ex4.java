import java.util.Scanner;

/**
 * ex4
 */
public class ex4 {

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        float media = 0, B, C, O;
        int op = 0, x =0;

        System.out.println("----------------MENU---------------------");
        System.out.println("Escolha o sexo das especies a seguir: ");
        System.out.println("1- bolvinos machos;");
        System.out.println("2- bolvinos fêmeas;");
        System.out.println("3- caprinos machos;");
        System.out.println("4- caprinos fêmeas;");
        System.out.println("5- ovinos machos;");
        System.out.println("6- ovinos fêmeas:");
        op = r.nextInt();

        switch (op) {
            case 1:
                System.out.println("Quantidade de animais: ");
                x = r.nextInt();

                System.out.println("Indique o peso total dos bolvinos total: ");
                B = r.nextFloat();

                media = B / x;
                System.out.println("Média dos Bolvinos machos: "+media);

                break;

            case 3:  
                 System.out.println("Quantidade de animais: ");
                x = r.nextInt();  

                System.out.println("Indique o peso total dos cabrino total: ");
                C = r.nextFloat();

                media = C / x;
                System.out.println("Média dos Caprinos machos: "+media);

                break;

            case 5:
                System.out.println("Quantidade de animais: ");
                x = r.nextInt();    

                System.out.println("Indique o Peso total ovinos total: ");
                O = r.nextFloat();

                media = O / x;
                System.out.println("Média dos Ovinos machos: " + media);

                   break;

            case 2:
                System.out.println("Quantidade de animais: ");
                x = r.nextInt();

                System.out.println("Indique o peso total dos bolvinos fêmeas total: ");
                B = r.nextFloat();

                media = B / x;
                System.out.println("Média dos Bolvinos fêmeas: "+media);

                break;
            case 4:
                System.out.println("Quantidade de animais: ");
                x = r.nextInt();

                System.out.println("Indique o peso total dos cabrinos fêmeas: ");
                C = r.nextFloat();

                media = C / x;
                System.out.println("Média dos Cabrinos fêmeas: "+media);

                break;

            case 6:   
                System.out.println("Quantidade de animais: ");
                x = r.nextInt();

                System.out.println("Indique o peso total dos ovinos fêmeas: ");
                O = r.nextFloat();

                media = O /x;
                System.out.println("Média dos Ovinos fêmeas: " + media);
                    break;

            default:
            System.out.println("Por favor renecie o programa.");
                break;
        }
        r.close();

    }
}