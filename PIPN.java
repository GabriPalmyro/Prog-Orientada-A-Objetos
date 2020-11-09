import java.io.IOException;
import java.util.*;

public class PIPN{
    public static void main(String[] args)throws IOException{
    
        Scanner ler = new Scanner(System.in);

        float num;
        int pos = 0;
        float soma = 0;

        for(int i = 0; i < 6; i++)
        {
            num = ler.nextFloat();
            if(num > 0)
            {
                pos++;
                soma = soma + num;
            }
        }


        System.out.printf("%d valores positivos\n%.1f\n", pos, soma/pos);
    

        ler.close();
    }
}
