import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        /*
        [M2S01] Ex. 04 - Monitoramento de Calorias
        Você faz parte de uma equipe de desenvolvimento de um aplicativo de saúde e bem-estar.
        O aplicativo ajuda os usuários a monitorar sua ingestão calórica diária, a fim de
        promover hábitos alimentares saudáveis. Uma das funcionalidades requeridas é o registro
        e análise do consumo de calorias ao longo de uma semana.
        Desenvolva um programa em Java que permita ao usuário inserir a quantidade de calorias
        consumidas em cada dia da semana e, em seguida, calcule e exiba o total de calorias consumidas
        na semana, a média diária de calorias e os dias em que o usuário consumiu calorias
        acima da recomendação diária.
        Requisitos
        Utilize um array para armazenar a ingestão de calorias para cada dia da semana.
        Implemente um laço de repetição para somar o total de calorias consumidas durante a semana.
        Calcule e exiba a média diária de calorias consumidas.
        Determine e exiba os dias em que o consumo de calorias foi superior à recomendação diária de 2000 calorias.
        Use comentários para documentar o código e explicar a lógica utilizada.
         */

        Scanner scanner = new Scanner(System.in);

        // Array para armazenar a ingestão de calorias para cada dia da semana
        double[] caloriasPorDia = new double[7];
        String[] diasSemana = {"Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado"};

        // Preenchimento do array com as calorias consumidas em cada dia
        for (int i = 0; i < caloriasPorDia.length; i++) {
            System.out.print("Digite a quantidade de calorias consumidas em " + diasSemana[i] + ": ");
            caloriasPorDia[i] = scanner.nextDouble();
        }

        // Cálculo do total de calorias consumidas na semana
        double totalCalorias = 0;
        for (double calorias : caloriasPorDia) {
            totalCalorias += calorias;
        }

        // Cálculo da média diária de calorias
        double mediaCalorias = totalCalorias / caloriasPorDia.length;

        // Dias em que o consumo foi superior a 2000 calorias
        System.out.println("\nDias com consumo superior a 2000 calorias:");
        for (int i = 0; i < caloriasPorDia.length; i++) {
            if (caloriasPorDia[i] > 2000) {
                System.out.println(diasSemana[i]);
            }
        }

        // Exibição dos resultados
        System.out.println("\nTotal de calorias consumidas na semana: " + totalCalorias);
        System.out.printf("Média diária de calorias: %.2f%n", mediaCalorias);

        scanner.close();
    }
}
