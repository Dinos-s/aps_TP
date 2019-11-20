import javax.swing.JOptionPane;

/**
 * ex3.1
 */
public class cont3 {

    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de termos da série depois do 1. Quanto mais termos, mais preciso é o resultado."));  
double graus = Double.parseDouble(JOptionPane.showInputDialog("Digite o ângulo em graus:"));  
  
// converter os graus para radianos  
double rad = Math.toRadians(graus);
  
int exp = 2;  
double cos = 1;  
int operacao = -1;  
  
// condição para calcular de acordo com o número de termos que o usuário deseja  
for (int cont = 0; cont < num; cont++)
    {  
        // cálculo do fatorial 
        long fat = 1;  
        for (int i = 1; i <= exp; i++)
            {  
                fat *= i;  
            } 
            // cálculo do cosseno
            cos += operacao * Math.pow(rad, exp) / fat;  
            operacao = -operacao;  
            exp += 2;  
    }
  
// retorna as informações para o usuário  
JOptionPane.showMessageDialog(null, graus + "° " + " = " + rad + " radianos .::. Cosseno de " + rad + " = " + cos);

System.exit(0);

    }  

}
