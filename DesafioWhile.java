package org.example;

import java.util.Scanner;

public class DesafioWhile {
    /*O desafio consiste em calcular a media de alunos, sem uma quantitade
    de alunos estabelecida, o programa deve considerar a nota como valida
    se ela for '>=0' e '<=10', o programa dever parar quando for digitado '-1'

    * */
    public static void main(String[] args) {
        Scanner c1 = new Scanner(System.in);

        int quantidadeDeNotas = 0;
        double nota = 0;
        double total = 0;


        while (nota!=-1){
            nota = c1.nextDouble();

            if (nota >= 0 && nota <= 10){
                quantidadeDeNotas +=1;
                total +=nota;

            }else if (nota != -1){
                System.out.println("Digite uma nota válida!");
            }

        }

        double calculaMedia = total/quantidadeDeNotas;
        System.out.println(quantidadeDeNotas);
        System.out.println(total);
        System.out.println(calculaMedia);


    }
}
