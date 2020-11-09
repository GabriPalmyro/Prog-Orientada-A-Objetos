import java.io.IOException;
//import java.util.*;
//import java.util.Arrays;

public class Ex5 {
    public static void main(String[] args)throws IOException{

        double[] vet = {5, -12, 5, -4, 15, 0, 20, -12, 8, -10};
        int contN = 0;
        double somaP = 0;

        for(double num: vet){
            if(num < 0) contN++;
            else somaP += num;
        }
            
        System.out.println("Foram inseridos "+contN+" números negativos e "+somaP+" foi a soma de todos os números positivos inseridos.");

    }
}
