package io.github.avontsftw;

import io.github.avontsftw.operator.Operator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int a = sc.nextInt();

        System.out.println("Digite o segundo número:");
        int b = sc.nextInt();

        System.out.println("Selecione o tipo do operador: (Coloque o número)");
        System.out.println("1) Adição");
        System.out.println("2) Subtração");
        System.out.println("3) Multiplicação");
        System.out.println("4) Divisão");
        int type = sc.nextInt();

        switch (type) {
            case 1:
                System.out.println("(Adição) Resultado: " + Operator.add(a, b));
                break;
            case 2:
                System.out.println("(Subtração) Resultado: " + Operator.subtract(a, b));
                break;
            case 3:
                System.out.println("(Multiplicação) Resultado: " + Operator.multiply(a, b));
                break;
            case 4:
                System.out.println("(Divisão) Resultado: " + Operator.share(a, b));
                break;
            default:
                System.out.println("Operação não encontrada, tente novamente.");
        }

        // Fechando o Scanner
        sc.close();
    }
}
