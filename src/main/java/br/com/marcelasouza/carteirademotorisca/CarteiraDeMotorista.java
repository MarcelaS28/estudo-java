package br.com.marcelasouza.carteirademotorisca;

public class CarteiraDeMotorista {
    public static void main(String[] args){
        int anoNascimento = 1998;
        int anoAtual = 2022;
        int idade = anoAtual - anoNascimento;
        if(idade >= 18){
            System.out.println("Você tem mais de 18 anos, já pode tirar a carteira!");
        }else{
            System.out.println("Você tem menos de 18 anos, não pode tirar a carteira!");
        }
    }
}
