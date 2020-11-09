import java.io.IOException;
import java.util.*;
import java.util.Arrays;


public class Ex7 {
    public static void main(String[] args)throws IOException{

        Scanner ler = new Scanner(System.in);

        double[] altura = new double[10];
        double soma = 0;

        System.out.printf("Insira as alturas -->\n");
        for(int i = 0; i < altura.length; i++){
            altura[i] = ler.nextDouble();
            soma+=altura[i];
        }

        double media = soma / 10;

        System.out.printf("Atletas maiores que a média: ");
        for(double alt: altura)
            if(alt > media) System.out.printf("%.2f ", alt);
            System.out.println();

        ler.close();
    }
}
