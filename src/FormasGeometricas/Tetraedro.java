package FormasGeometricas;

import java.util.Scanner;

public class Tetraedro extends Formas{

    Scanner scan = new Scanner(System.in);
    private boolean flag = true;

    public void cadastrarDados(){

        System.out.print("Informe o tamanho da aresta: ");
        setAresta(scan.nextDouble());
    }

    public void calcularFormasTetraedro() {

        String opc;
        while (flag) {
            System.out.println("Digite em minúsculo, uma das letras abaixo para calcular as formas do Tetraedo:");
            System.out.println(
                    "T - Calcular a área total do Tetraedo: \n" +
                    "V - Calcular o volume do Tetraedo: \n" +
                    "N - Retornar ao menu: ");
            opc = scan.next();
            switch (opc) {

                case "t":
                    System.out.println("============ Área total do Tetraedro ============");
                    cadastrarDados();
                    setAreaTotal((4 * (Math.pow(getAresta(), 2))) * (Math.sqrt((3)) / 4));
                    System.out.println("Área total Tetraedro: " + String.format(" %.3f", getAreaTotal()) + " cm²");
                    break;

                case "v":
                    System.out.println("============ Volume do Tetraedro ============");
                    cadastrarDados();
                    setVolume(((Math.pow(getAresta(),3)) * (Math.sqrt(2)))/12);
                    System.out.println("Volume do Tetraedo: " + String.format("%.3f", getVolume()) + " cm³");
                    break;

                case "n":
                    break;

                default:
                    System.out.println("Opção inválida!!!");

            }
            System.out.println("============ FORMAS GEOMÉTRICAS  - GEOMETRIA ESPACIAL ============");
            System.out.println("Deseja realizar outra operação? \n" +
                    "Digite S - para contiunar ou N - para retornar ao menu principal.");
            opc = scan.next();
            if (opc.equalsIgnoreCase("n")) flag = false;
        }
    }
}
