import java.io.IOException;
import java.util.*;

public class Ex2 {
    public static void main(String[] args)throws IOException{

        Scanner ler = new Scanner(System.in);
        
        String turno;

        turno = ler.nextLine();

        if(turno == "M")                System.out.printf("Bom Dia!\n");
        else if(turno == "V")           System.out.printf("Boa Tarde!\n");
        else if(turno == "N")           System.out.printf("Boa Noite!\n");
        else                            System.out.printf("Valor Inválido!\n");

        ler.close();
    }
}
