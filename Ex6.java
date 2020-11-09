import java.io.IOException;
import java.util.*;
import java.util.Arrays;


public class Ex6 {
    public static void main(String[] args)throws IOException{

        Scanner ler = new Scanner(System.in);

        int[] vet = new int[10];

        System.out.printf("Insira os numeros do vetor --> ");
        for(int i = 0; i < vet.length; i++){
            vet[i] = ler.nextInt();
        }

        Arrays.sort(vet);

        System.out.printf("Vetor ordenado: ");
        for(int num: vet)
            System.out.printf("%d ", num);
        System.out.println();

        ler.close();
    }
}
