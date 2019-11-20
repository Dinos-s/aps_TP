import java.time.LocalDate;
/**
 * ex7
 */
public class ex7 {

    public static void main(String[] args) {
        String  dataini = "02/12/2012";
        String  datafim = "30/01/2001";
        int res_ano = 0;
        int res_mes = 0;
        int res_dia = 0;
        
        
        String[] sep = dataini.split("/"), x = datafim.split("/");
        
        res_ano = Integer.parseInt(sep[2]) - Integer.parseInt(x[2]);
        System.out.println("Diferença entre anos: "+res_ano*365);
        
        res_mes = Integer.parseInt(sep[1]) - Integer.parseInt(x[1]);
        System.out.println("Diferença entre messes: "+res_mes*30);
        
        res_dia = Integer.parseInt(sep[0]) - Integer.parseInt(x[0]);
        System.out.println("Diferença entre dias: "+res_dia);
        

        System.out.println("Somatório: "+res_dia+(res_mes*30)+(res_ano*365));

       LocalDate dia = LocalDate.of(Integer.parseInt(sep[2]), Integer.parseInt(sep[1]), Integer.parseInt(sep[0]));
       LocalDate y = LocalDate.of(Integer.parseInt(x[2]), Integer.parseInt(x[1]),Integer.parseInt(x[0]));
       
        
        System.out.println(dia);
        System.out.println(y);

    } 
}