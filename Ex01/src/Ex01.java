import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        /* [M2S01] Ex. 01 - Calcular Área
           Desenvolva um programa para calcular a área de um terreno.
           O usuário deverá informar a largura e o comprimento do terreno e,
           o seu algoritmo, deverá retornar a área.
           Ex: O terreno possui 10 m² de área.
        */
        Scanner input = new Scanner(System.in);

        System.out.println("Bem-vindo à calculadora de área de terreno!");
        System.out.print("Informe a largura do terreno (em metros): ");
        double largura = input.nextDouble();

        System.out.print("Informe o comprimento do terreno (em metros): ");
        double comprimento = input.nextDouble();

        double area = largura * comprimento;

        System.out.println("A área do terreno é: " + area + " metros quadrados.");

        input.close();
    }
}