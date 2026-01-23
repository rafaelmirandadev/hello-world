package ManipulandoStrings;

import java.util.Scanner;

public class ManipulandoStrings {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite algo: ");
        String frase = sc.nextLine();

        sc.close();

        System.out.print("Essa frase tem " + frase.length() + " caracteres.");


    }
}
