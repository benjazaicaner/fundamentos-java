/*
 *leia o primeiro numero real do teclado
 * leia o segundo numero real do teclado
 * some os dois numeros
 * o resultado da soma divida por 2
 * imprima a sua média é: #resultado
 */

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leteclado = new Scanner(System.in);
        int numero1 = leteclado.nextInt();
        int numero2 = leteclado.nextInt();
        int soma = numero1 + numero2;
        float media = (float(soma))/2;
        System.out.println("A soma é " + soma);
        System.out.println("A média é " + media);
    }
}
