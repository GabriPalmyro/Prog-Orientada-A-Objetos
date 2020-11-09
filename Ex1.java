import java.io.IOException;
import java.util.*;

public class Ex1 {
    public static void main(String[] args)throws IOException{

        Scanner ler = new Scanner(System.in);
        
        float nota1, nota2, media;

        nota1 = ler.nextFloat();
        nota2 = ler.nextFloat();

        media = (nota1 + nota2) / 2;

        if(media == 10)                 System.out.printf("Aprovado com Distinção\n");
        else if(media >= 7.00)          System.out.printf("Aprovado\n");
        else if(media < 7.00)           System.out.printf("Reprovado\n");

        ler.close();
    }
}
