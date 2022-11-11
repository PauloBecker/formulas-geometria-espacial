package FormasGeometricas;

import java.util.Scanner;

public class Cubo extends Formas{

    Scanner scan = new Scanner(System.in);
    private double areaLateral;
    private boolean flag = true;

    Operacao operacao;
    public Cubo() {
    }

    public Cubo(double areaLateral) {
        this.areaLateral = areaLateral;
    }

    public double getAreaLateral() {
        return areaLateral;
    }

    public void setAreaLateral(double areaLateral) {
        this.areaLateral = areaLateral;
    }

    public void cadastrarDados(){

        System.out.print("Informe o tamanho da aresta: ");
        setAresta(scan.nextDouble());
    }

    public void calcularFormasCubo(){

        String opc;
        while (flag){
            System.out.println("Digite em minúsculo, uma das letras abaixo para calcular as formas do Cubo:");
            System.out.println(
                    "L - Calcular a área lateral do Cubo: \n" +
                    "T - Calcular a área total do Cubo: \n" +
                    "V - Calcular o volume do Cubo: \n" +
                    "N - Retornar ao menu: ");
            opc = scan.next();
            switch (opc){
                case "l":
                    System.out.println("============ Área total do Cubo ============");
                    cadastrarDados();
                    setAreaTotal(6 * Math.pow(getAresta(),2));

                    System.out.println("Área total do Cubo: " + getAreaTotal() + " m²");
                    break;
                case "t":
                    System.out.println("============ Área lateral do Cubo ============");
                    cadastrarDados();
                    setAreaTotal(4 * Math.pow(getAresta(),2));
                    System.out.println("Área lateral do Cubo: " + getAreaTotal() + " m²");
                    break;

                case "v":
                    System.out.println("============ Volume do Cubo ============");
                    cadastrarDados();
                    setAreaTotal(Math.pow(getAresta(),3));
                    System.out.println("Volume do Cubo: " + getAreaTotal() + " m³");
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
