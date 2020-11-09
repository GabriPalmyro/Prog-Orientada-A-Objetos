import java.io.IOException;
import java.util.*;

public class Tabuada {
    public static void main(String[] args)throws IOException{
    
        Scanner ler = new Scanner(System.in);

        int tam;

        tam = ler.nextInt();

        for(int i = 1; i <= 10; i++)
        {
            System.out.printf("%d x %d = %d\n", i, tam, (i*tam));
        }

        ler.close();
    }
}
