/****************************************************
    Escreva um método que recebe um número inteiro N
    e imprima o valor de N!(fatorial).
****************************************************/

import java.util.Scanner;

public class Fatorial{

    public static int calculaFatorial(int n) { /* Método que usa recursão para calculo do fatorial de n */

        if(n < 0) { /* Não existe fatorial negativo */
            return -1;
        }

        if(n > 1) { /* Enquanto n > 1, faça chamadas recursivas */
            return calculaFatorial(n - 1) * n;
        }

        return 1;
    }

    public static void main(String[] args) {
        
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um valor para calcular o seu fatorial:");
        n = sc.nextInt();
        System.out.println(n);

        if(calculaFatorial(n) == -1) {
            System.out.println("Não existe fatorial negativo!");
        }
        else{
            System.out.println("Fatorial de " + n + " = " + calculaFatorial(n));
        }
    }
}