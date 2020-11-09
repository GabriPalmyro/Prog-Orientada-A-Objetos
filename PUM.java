import java.io.IOException;
import java.util.*;

public class PUM{
    public static void main(String[] args)throws IOException{
    
        Scanner ler = new Scanner(System.in);

        int num, seq;
        int i = 0;
        seq = 1;

        num = ler.nextInt();

        while(i < num)
        {
            if(seq % 4 == 0)
            {
                System.out.printf("PUM\n");  
                seq++;
                i++;
            } else 
            {
                System.out.printf("%d ", seq);  
                seq++;
            }
        }

        ler.close();
    }
}
