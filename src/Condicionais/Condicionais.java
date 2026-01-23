package Condicionais;

import java.util.Scanner;

public class Condicionais {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

//        System.out.println("Digite um número de 1 a 7: ");
//        int num = sc.nextInt();
//
//        switch (num){
//            case 1:
//                System.out.println("Domingo.");
//                break;
//            case 2:
//                System.out.println("Segunda-feira.");
//                break;
//            case 3:
//                System.out.println("Terça-feira.");
//                break;
//            case 4:
//                System.out.println("Quarta-feira.");
//                break;
//            case 5:
//                System.out.println("Quinta-feira.");
//                break;
//            case 6:
//                System.out.println("Sexta-feira.");
//                break;
//            case 7:
//                System.out.println("Sábado.");
//                break;
//            default:
//                System.out.println("Número inválido!");
//                break;
//
//        }

        System.out.println("Digite uma palavra: ");
        String palavra = sc.next();

        String palavraCorreta = "sim";

        String palavraRetornada = palavra.equals(palavraCorreta) ? "Parabéns, está correto" : "Infelizmente está errado";

        System.out.println(palavraRetornada);

    }

}
