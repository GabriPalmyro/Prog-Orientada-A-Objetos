import java.io.IOException;
import java.util.*;

public class Ex4 {
    public static void main(String[] args)throws IOException{

        Scanner ler = new Scanner(System.in);

        int num, quant;
        double venda = 0, preco;

        System.out.println("Insira o código, o preço e a quantidade do produto (0 para acabar a compra): ");
        num = ler.nextInt();

        while(num != 0) {
            preco = ler.nextDouble();
            quant = ler.nextInt();
            venda = venda + (preco*quant);
            System.out.println("Insira o código, o preço e a quantidade do produto: ");
            num = ler.nextInt();
        }

        System.out.println("Valor total da venda: "+venda);

        ler.close();
    }
}
