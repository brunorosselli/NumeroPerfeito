package org.example;

import java.util.Scanner;

public class ehPerfection {

    public static boolean isPerfeito(int numero){
        //Cria uma função bolean que vai retornar true ou false caso o número passado no parâmetro que é uma int seja perfeito.
        int somaDivisores = 0;
        //Cria uma váriavel int e atribui o valor 0 para ela.

        for(int i = 1; i <= numero / 2; i++){
            //Cria um laço de repetição e crua uma váriavel i do tipo int e atribui 1 de valor para ela, indica que se
            //i for menor ou igual a divisão do núero passado no parâmetro da função dividido por 2 faz a soma de + 1 para i
            if(numero % i == 0){
                //Valida se o resto da divisão de i usando o perado módulo (%) é igual a 0.
                somaDivisores+=1;
                //Quando entrar no IF soma +1 para a váriavel somaDivisores.
            }
        }

        return somaDivisores == numero && numero !=0;
        //Valida se o valor de soma de divisores é igual ao npumero e se o npumer for diferente de 0.
    };

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //Cria um scanner a partir da classe Scanner e usa Sytem.in para definir que a entrada do Scanner vai ser o teclado.
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        //Indica que o valor de número é a próxima int que vai ser excrita no teclado.
        if (isPerfeito(numero)) {
            //Verifica se npumero é perfeito.
            System.out.println("O número " + numero + " é perfeito.");
            //Se for perfeito imprime a mesange acima.
        } else {
            System.out.println("O número " + numero + " não é perfeito.");
            //Se não for perfeito imprime a mensagem acima.
        }

    };
}
