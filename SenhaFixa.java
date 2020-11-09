import java.io.IOException;
import java.util.*;

public class SenhaFixa{
    public static void main(String[] args)throws IOException{
    
        Scanner ler = new Scanner(System.in);

        int senha;
        
        senha = ler.nextInt();
        
        while(senha != 2002)
        {
            System.out.printf("Senha Invalida\n");
            senha = ler.nextInt();
        }

        System.out.printf("Acesso Permitido\n");

        ler.close();
    }
}
