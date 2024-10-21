package org.example;


import java.util.Scanner;
/* O desafio consiste em escrever um algoritimo, que receba o dia da semana
 e retorne o numero referente a ele.*/
public class DesafioDiaSemana {
    public static void main(String[] args) {
        Scanner c1 = new Scanner(System.in);
        String zero = c1.nextLine().trim().toUpperCase();
        if (zero.equals("DOMINGO")){
            System.out.println("1");
        }else if (zero.equals("SEGUNDA")){
            System.out.println("2");
        } else if (zero.equals("TERÇA")) {
            System.out.println("3");
        } else if (zero.equals("QUARTA")) {
            System.out.println("4");
        } else if (zero.equals("QUINTA")) {
            System.out.println("5");
        } else if (zero.equals("SEXTA")) {
            System.out.println("6");
        } else if (zero.equals("SABADO")) {
            System.out.println("7");
        }


    }
}
