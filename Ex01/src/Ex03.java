import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        /*
        [M2S01] Ex. 03 - Sistema de Radares
        O governo do Estado de Santa Catarina está contratando você para desenvolver
        o sistema dos radares das estradas.  Nesse sistema, haverá um sensor que entrará
        com o tempo que o veículo leva para se deslocar entre uma placa e outra. Sabendo que
        a distância entre as placas é de 1 metro, ao sensor entrar com o valor referente ao
        tempo de deslocamento, o seu algoritmo deverá retornar a velocidade média do veículo.
        OBS: Velocidade média = distância/tempo
        Tempo: segundos.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tempo de deslocamento (em segundos): ");
        double tempo = scanner.nextDouble();

        double distancia = 1.0;
        double velocidadeMedia = distancia / tempo;
        System.out.printf("A velocidade média do veículo é %.3f metros por segundo.%n", velocidadeMedia);

        scanner.close();
    }
}
