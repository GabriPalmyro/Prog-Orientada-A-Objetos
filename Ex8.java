import java.io.IOException;
import java.util.*;
import java.util.Arrays;


public class Ex8 {
    public static void main(String[] args)throws IOException{

        Scanner ler = new Scanner(System.in);

        int[] vet = new int[10];
        boolean op = true;
        int proc, indice;
        int op2;

        System.out.printf("Insira os inteiros -->\n");
        for(int i = 0; i < vet.length; i++)
            vet[i] = ler.nextInt();

        Arrays.sort(vet);

        System.out.printf("Vetor ordenado: ");
        for(int num: vet)
            System.out.printf("%d ", num);
        System.out.println();

        while(op){
            System.out.printf("Qual elemento deseja procurar --> ");
            proc = ler.nextInt();
            indice = Arrays.binarySearch(vet, proc);

            if(indice > 0) System.out.printf("O elemento procurado foi encontrado e se encontra na posição %d\n", indice+1);
            else if(indice < 0) System.out.printf("O elemento procurado não foi encontrado\n");
            
            System.out.printf("Deseja procurar mais um elemento? (1 - SIM | 0 - NÃO)\n");
            op2 = ler.nextInt();
            if(op2 == 1) op = true;
            else if(op2 == 0) op = false;
        }
        

        ler.close();
    }
}
