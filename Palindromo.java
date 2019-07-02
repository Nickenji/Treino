/*******************************************
    Escreva um método que receba uma String
    e responda se ela é um palíndromo.
*******************************************/

import java.util.Scanner;
import java.util.Arrays;

public class Palindromo {

    public static Boolean palindromo(String p) {
        
        char arr[] = p.toCharArray();
        int j = arr.length - 1;
    
        for(int i = 0; i < arr.length; i++) {       /* Verifica a iguldade nos extremos do Array */
            if(arr[i] != arr[j]) {                  /* e vai iterando até comparar todos os chars*/
                System.out.print(arr[i] + " != ");  /* a[0] a[4] -> a[1] a[3] -> a[2] a[2]...    */
                System.out.print(arr[j] + " | ");
                return false;
            }
            System.out.print(arr[i] + " = ");
            System.out.print(arr[j] + " | ");
            j--;
        }
        return true;
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos verificar se uma palavra é um palíndromo. \n Escreva a palavra:");
        String palavra = sc.nextLine();

        System.out.println(palindromo(palavra));
    }
}