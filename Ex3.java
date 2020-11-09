import java.io.IOException;
import java.util.*;

public class Ex3 {
    public static void main(String[] args)throws IOException{

        Scanner ler = new Scanner(System.in);
        
        int contP = 0, contA = 0;    
        double idade, soma = 0, media, peso, altura;

        for(int i = 0; i < 10; i++) {
            System.out.println("\nIdade pessoa "+(i+1)+": ");
            idade = ler.nextInt();
            soma = soma + idade;
            System.out.println("Peso pessoa "+(i+1)+": ");
            peso = ler.nextDouble();
            if(peso > 90) contP++;
            System.out.println("Altura pessoa "+(i+1)+": ");
            altura = ler.nextDouble();
            if(altura < 1.50) contA++;
        }

        media = soma / 10;

        System.out.println("Média = " + media + "\nPessoas com mais de 90 quilos: "+contP+"\nAltura inferior a 1.50m: "+contA);

        ler.close();
    }
}
