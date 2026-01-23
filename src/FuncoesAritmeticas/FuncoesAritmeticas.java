package FuncoesAritmeticas;

import java.util.Scanner;

public class FuncoesAritmeticas {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n1 = sc.nextInt();

        System.out.print("Digite outro número: ");
        int n2 = sc.nextInt();

        double resultado = Math.pow(n1,n2);

        System.out.print(n1 + " elevado a " + n2 + "é igual a " + resultado);

        /*
        int resto = num % 2;

        if (resto == 0){
            System.out.println("Esse número é par.");
        }
        else  if (resto == 1){
            System.out.println("Esse número é ímpar.");
        }
        */



    }

}
