import java.io.IOException;
 import java.util.Scanner;

// Resolução Beecrowd 1001
// https://www.beecrowd.com.br/judge/pt/problems/view/1001
// https://www.beecrowd.com.br/judge/pt/profile/746157

public class CalculadoraSoma {
 
    public static void main(String[] args) throws IOException {
    
        Scanner teclado = new Scanner(System.in);
        int A = teclado.nextInt();
        int B = teclado.nextInt();
        teclado.close();
        int X = A + B;
        System.out.println("X = " + X);
    }
 
}