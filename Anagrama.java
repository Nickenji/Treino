/***********************************************
  Escreva um método que receba duas Strings e 
  responda se uma String é um anagrama da outra.
  EXEMPLOS:
  "abcdef" "dfebac" = TRUE
  "aaaaaaaaaaa" "aaa" = FALSE           
***********************************************/

import java.util.Scanner;
import java.util.Arrays;

public class Anagrama {

    public static boolean anagrama(String p1, String p2) {

        char arr1[] = p1.toCharArray(); /* Converte as Strings */
        char arr2[] = p2.toCharArray(); /* em um Array de char */

        Arrays.sort(arr1); /* Organiza o array em ordem alfabetica*/ 
        Arrays.sort(arr2); /* utilizando o metodo sort() da biblioteca Arrays*/

        for(int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
        }

        System.out.println();

        for(int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
        }

        System.out.println();

        if(arr1.length != arr2.length) { // Anagramas idênticos possuem tamanho igual
            return false;
        }

        for(int i = 0; i < arr1.length; i++) {
            if(arr1[i] != arr2[i]) {
                return false;
            }
            else {
                return true;
            }

        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos comparar se duas palavras são anagramas.");
        System.out.println("Escreva a primeira palavra: ");
        String palavra1 = sc.nextLine();
        System.out.println("Agora escreva a segunda palavra: ");
        String palavra2 = sc.nextLine();

        System.out.println(anagrama(palavra1,palavra2));
    }
}