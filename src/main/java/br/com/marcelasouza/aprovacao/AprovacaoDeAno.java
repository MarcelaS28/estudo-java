package br.com.marcelasouza.aprovacao;

public class AprovacaoDeAno {
    public static void main(String[] args){
        double nota1 = 10;
        double nota2 = 9.5;
        double nota3 = 7.1;
        if(nota1 >= 7 && nota2 >= 7 && nota3 >= 7){
            System.out.println("O aluno está aprovado de ano!");
        }else{
            System.out.println("Aluno reprovado!");
        }
    }
}
