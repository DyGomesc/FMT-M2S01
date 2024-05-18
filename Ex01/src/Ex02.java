import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        /*
        [M2S01] Ex. 02 - Calcular Salário
        Desenvolva um programa para calcular a quantidade de salários mínimos.
        Sabendo que o salário mínimo hoje é R$1.412,00, o usuário deverá informar seu salário e,
        o seu algoritmo, deverá informar quantos salários ele recebe.
        Ex: Você recebe 1 mínimo.
         */

        Scanner input = new Scanner(System.in);

        // Valor do salário mínimo atual (R$1.412,00)
        double salarioMinimo = 1412.0;

        System.out.print("Informe o seu salário: ");
        double salarioUsuario = input.nextDouble();

        // Calculando a quantidade de salários mínimos
        double quantidadeSalarios = salarioUsuario / salarioMinimo;

        System.out.printf("Você recebe aproximadamente %.2f salários mínimos.%n", quantidadeSalarios);

        input.close();
    }
}
