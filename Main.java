import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args)throws IOException{

        Scanner entrada = new Scanner(System.in);
        double x,s;
        int cont,i;
        cont=0;
        s=0;

        for(i=0; i<6; i++)
        {
            x=entrada.nextDouble();
            if(x>0) {
                cont++;
                s=s+x;
            }
        }
        s=s/cont;
        System.out.println(cont + " valores positivos");
        System.out.printf("%.1f\n", s);
        entrada.close();
    }
}
