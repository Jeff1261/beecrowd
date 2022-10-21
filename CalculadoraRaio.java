import java.util.Scanner; 

// Resolução Beecrowd 1002
// https://www.beecrowd.com.br/judge/pt/problems/view/1002
// https://www.beecrowd.com.br/judge/pt/profile/746157

public class CalculadoraRaio {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        double raio = teclado.nextFloat();
        double n = 3.14159;
        double area = n * Math.pow(raio, 2);
        System.out.printf("A=%.4f\n", area);

    }
}
