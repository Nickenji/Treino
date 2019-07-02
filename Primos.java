/********************************************************
  Escreva um método que receba dois números inteiros
  "a" e "b" e imprima todos os números primos de a até b
  (inclusive)        
  a = 5
  b = 18
  output: 5, 7, 11, 13, 17
********************************************************/
// a = 18 e b = 5
import java.util.Scanner;

public class Primos {

    public static Boolean ehPrimo(int n) { /* Método que verifica se n é primo */

        int aux = 0;

        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                aux++;
            }
        }

        if(aux == 2) {
            return true;
        }
        
        return false;
    }

    public static void imprimePrimo(int a, int b) { /* Método que imprime os números primos dentro de um intervalo a ~ b */

        int aux = 0;

        if(a > b) {
            for(int i = b; i <= a; i++) {
                if(ehPrimo(i) == true) {
                    System.out.print(i + " | ");
                    aux++;
                }
            }
            if(aux == 0) {
                System.out.println("Não existem primos |");
            }
            System.out.print("\nEntre " + a + " e " + b + " existem " + aux + " números primos");
        }

        if(a < b) {
            for(int i = a; i <= b; i++) {
                if(ehPrimo(i) == true) {
                    System.out.print(i + " | ");
                    aux++;
                }
            }
            if(aux == 0) {
                System.out.println("Não existem primos |");
            }
            System.out.print("\nEntre " + a + " e " + b + " existem " + aux + " números primos");
        }

        if(a == b) {
            if(ehPrimo(a) == true) {
                System.out.println(a);
            }
            else {
                System.out.println("Não é primo!");
            }
        }
    }

    public static void main(String[] args) {

        int a,b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        a = sc.nextInt();
        System.out.println(a);

        System.out.println("Digite o segundo número");
        b = sc.nextInt();
        System.out.println(b);

        System.out.println("Vamos verificar todos os números primos entre " + a + " e " + b);

        System.out.print("| ");
        imprimePrimo(a,b);
    }
}