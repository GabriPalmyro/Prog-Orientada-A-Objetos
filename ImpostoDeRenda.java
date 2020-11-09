import java.io.IOException;
import java.util.*;

public class ImpostoDeRenda{
    public static void main(String[] args)throws IOException{

        Scanner ler = new Scanner(System.in);

        double salario, soma;

        salario = ler.nextFloat();

        if(salario >= 0 && salario <= 2000.00)   System.out.printf("Isento\n");  

        else if(salario > 2000.00 && salario <= 3000.00)
        {
            soma = ((salario - 2000.00) * 0.08);
            System.out.printf("R$ %.2f\n", soma);
        }
        else if(salario > 3000.00 && salario <= 4500.00)
        {
            soma = ((salario - 3000.00) * 0.18);
            salario = salario - (salario - 3000.00);
            soma = soma + ((salario - 2000.00) * 0.08);
            System.out.printf("R$ %.2f\n", soma);
        }
        else if(salario > 4500.00)          
        {
            soma = ((salario - 4500.00) * 0.28);
            salario = salario - (salario - 4500.00);
            soma = soma + ((salario - 3000.00) * 0.18);
            salario = salario - (salario - 3000.00);
            soma = soma + ((salario - 2000.00) * 0.08);
            System.out.printf("R$ %.2f\n", soma);
        }
        
        ler.close();
    }
}