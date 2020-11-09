import java.io.IOException;
import java.util.*;

public class Uri1154 {
    public static void main(String[] args)throws IOException{

        Scanner ler = new Scanner(System.in);

        double idade, vzs = 0, soma = 0;

        double media;

        idade = ler.nextInt();

        while (idade > 0) 
        {
            soma = soma + idade;
            vzs++;
            idade = ler.nextInt();
        }

        media = soma/vzs;

        System.out.printf("%.2f\n", media);

        ler.close();

    }

}
