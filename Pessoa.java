/************************************************************************************************************
    Faça uma classe Pessoa com dois atributos que representam a data de nascimento e o nome completo
    a)Faça um método que devolva um inteiro informando a idade atual. DICA: utilize a lib de datas e horários
    do Java para fazer a conta na hora que a pessoa chama o método. - DONE
    b)Crie um construtor para a classe. - DONE
    c)Faça com que o nome da pessoa seja imutável a partir da criação do objeto pessoa(ou seja, só pode ser
    escolhido uma vez e nunca mais mudado). - DONE
    d)Mostre a instanciação da classe Pessoa no método main e a utilização de seu método de idade. - DONE
 ***********************************************************************************************************/

 import java.util.Scanner;
 import java.time.LocalDate;
 import java.time.Period;

 public class Pessoa {

    private final int anoNascimento; /* Não faz sentido mudar a data de  */
    private final int mesNascimento; /* nascimento , por isso ela também */
    private final int diaNascimento; /* será imutável                    */
    private final String nome; /* Nome da pessoa deve ser imutável */

    public Pessoa(int anoNascimento, int mesNascimento, int diaNascimento, String nome) { /* Construtor */
        this.anoNascimento = anoNascimento;
        this.mesNascimento = mesNascimento;
        this.diaNascimento = diaNascimento;
        this.nome = nome;
    }
    
    /* Não existe necessidade de se ter setters já que os valores dos atributos não devem ser modificados */

    public int getAno() {
        return this.anoNascimento;
    }

    public int getMes() {
        return this.mesNascimento;
    }

    public int getDia() {
        return this.diaNascimento;
    }

    public String getNome() {
        return this.nome;
    }

    public static int calcularIdade(int ano, int mes, int dia) { /* Método que calcula a idade da pessoa */
                                                                 
        LocalDate dataNascimento = LocalDate.of(ano, mes, dia);  /* Guarda o valor da data de nascimento */
        LocalDate dataAtual = LocalDate.now();                   /* Guarda o valor da data atual         */
        Period data = Period.between(dataNascimento, dataAtual); /* Calcula a diferença entre as datas   */

        int idade = data.getYears();       /* Pega somente o valor "importante", no caso a idade em anos */
        return idade;
    }

    public static void main(String[] args) {

        int ano, mes, dia;
        String nome;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome e sua data de nascimento na seguinte ordem: NOME -> ANO -> MES -> DIA:");
        nome = sc.nextLine();
        ano = sc.nextInt();
        mes = sc.nextInt();
        dia = sc.nextInt();

        Pessoa p1 = new Pessoa(ano, mes, dia, nome); /* Instanciação da classe Pessoa -> criação de um objeto */

        System.out.println(p1.getNome() + " tem " + p1.calcularIdade(p1.getAno(), p1.getMes(), p1.getDia()) + " anos.");
    }
 }