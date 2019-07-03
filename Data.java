import java.util.Scanner;
import java.time.LocalDate;

public class Data {

    public static void imprimeData(int anoNascimento) {
        
        LocalDate dataAtual = LocalDate.now(); /* Objeto da classe LocalDate, do pacote java.time */
        int anoAtual = dataAtual.getYear(); /* Atribuindo o ano atual através da função getYear() para uma variável */

        int idade =  anoAtual - anoNascimento; /* Calculo da idade */
        System.out.println(idade);
    }

    public static void main(String[] args) {

        int anoNascimento;
        Scanner sc = new Scanner(System.in);
        anoNascimento = sc.nextInt();

        imprimeData(anoNascimento);
    }
}