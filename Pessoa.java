/************************************************************************************************************
    Faça uma classe Pessoa com dois atributos que representam a data de nascimento e o nome completo
    a)Faça um método que devolva um inteiro informando a idade atual. DICA: utilize a lib de datas e horários
    do Java para fazer a conta na hora que a pessoa chama o método.
    b)Crie um construtor para a classe.
    c)Faça com que o nome da pessoa seja imutável a partir da criação do objeto pessoa(ou seja, só pode ser
    escolhido uma vez e nunca mais mudado).
    d)Mostre a instanciação da classe Pessoa no método main e a utilização de seu método de idade.
 ***********************************************************************************************************/

 import java.util.Scanner;
 import java.util.Date;

 class Pessoa {

    private int dataNasc;
    private String nome;

    Pessoa(int dataNasc, String nome) {
        this.dataNasc = dataNasc;
        this.nome = nome;
    }

    public static Pessoa calcularIdade(Date data) {
        
    }


 }