import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("** Conversor **");
        System.out.println("Escolha o tipo da conversão: \n1. Medidas \n2. Peso");
        int conversor = scanner.nextInt();

        if (conversor == 1) {
            System.out.println("Escolha a conversão:" +
                    "\n 1. Metro para Centímetro" +
                    "\n 2. Metro para Polegada" +
                    "\n 3. Centímetro para Metro" +
                    "\n 4. Centímetro para Polegada" +
                    "\n 5. Polegada para Metro" +
                    "\n 6. Polegada para Centímetro");

            int conversao = scanner.nextInt();

            switch (conversao){
                case 1:
                    System.out.print("Digite o valor em metros: ");
                    double metroParaCm = scanner.nextDouble();
                    double cm = metroParaCm * 100;
                    System.out.println("Valor em centímetros: " + cm);
                    break;
                case 2:
                    System.out.print("Digite o valor em metros: ");
                    double metroParaPol = scanner.nextDouble();
                    double pol = metroParaPol * 39.37;
                    System.out.println("Valor em Polegadas: " + pol);
                    break;
                case 3:
                    System.out.print("Digite o valor em centímetros: ");
                    double cmParaMetro = scanner.nextDouble();
                    double metro = cmParaMetro / 100;
                    System.out.println("Valor em Metros: " + metro);
                    break;
                case 4:
                    System.out.print("Digite o valor em centímetros: ");
                    double cmParaPol = scanner.nextDouble();
                    double in = cmParaPol * 0.393701;
                    System.out.println("Valor em Polegadas: " + in);
                    break;
                case 5:
                    System.out.print("Digite o valor em Polegadas: ");
                    double polParaMetro = scanner.nextDouble();
                    double m = polParaMetro  * 0.0254;
                    System.out.println("Valor em Metros: " + m);
                    break;
                case 6:
                    System.out.println("Digite o valor em Polegadas: ");
                    double polParaCm = scanner.nextDouble();
                    double cent = polParaCm * 2.54;
                    System.out.println("Valor em Centímetros: " + cent);
                    break;
                default:
                    System.out.println("Opção Inválida.");
            }
        } else if (conversor == 2) {
            System.out.println("Escolha a unidade de origem:" +
                    "\n kg. Quilogramas" +
                    "\n g. Gramas" +
                    "\n lb. Libras");
            String unidadeOrigem = scanner.next();
            System.out.println("Escolha a unidade de destino:" +
                    "\n kg. Quilogramas" +
                    "\n g. Gramas" +
                    "\n lb. Libras");
            String unidadeDestino = scanner.next();

            System.out.println("Insira o valor para conversão:");
            double valor = scanner.nextDouble();

            double resultado = converter(unidadeOrigem, unidadeDestino, valor);
            System.out.printf("Resultado da conversão: %.2f %s\n", resultado, unidadeDestino);
        }
        scanner.close();
    }
    public static double converter(String origem, String destino, double valor) {
        switch (origem) {
            case "kg":
                return converterPeso(destino, valor);
            case "g":
                return converterPeso(destino, valor / 1000);
            case "lb":
                return converterPeso(destino, valor / 2.205);
            default:
                System.out.println("Unidade de origem não reconhecida.");
                return 0;
        }
    }

    public static double converterPeso(String destino, double valor) {
        switch (destino) {
            case "kg":
                return valor;
            case "g":
                return valor * 1000;
            case "lb":
                return valor * 2.205;
            default:
                System.out.println("Unidade de destino não reconhecida para peso.");
                return 0;
        }
    }
}