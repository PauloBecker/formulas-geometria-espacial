package FormasGeometricas;

import java.util.Scanner;

public class Piramide extends Formas{
    Scanner scan = new Scanner(System.in);
    private boolean flag = true;
    private double areaBase;
    private double areaLateral;

    public double getAreaLateral() {
        return areaLateral;
    }

    public void setAreaLateral(double areaLateral) {
        this.areaLateral = areaLateral;
    }

    public double getAreaBase() {
        return areaBase;
    }

    public void setAreaBase(double areaBase) {
        this.areaBase = areaBase;
    }

    public void cadastrarDadosAreaTotal(){

        System.out.print("Informe a área da base: ");
        setAreaBase(scan.nextDouble());
        System.out.print("Informe a área lateral: ");
        setAreaLateral(scan.nextDouble());
    }

    public void cadastrarDadosVolume(){
        System.out.print("Informe a área da base da Pirâmide: ");
        setAreaBase(scan.nextDouble());
        System.out.print("Informe a altura da Pirâmide: ");
        setAltura(scan.nextDouble());
    }

    public void calcularFormasPiramide() {

        String opc;
        while (flag) {
            System.out.println("Digite em minúsculo, uma das letras abaixo para calcular as formas da Pirâmide:");
            System.out.println(
                    "T - Calcular a área total da Pirâmide: \n" +
                    "V - Calcular o volume do Pirâmide: \n" +
                    "N - Retornar ao menu: ");
            opc = scan.next();
            switch (opc) {

                case "t":
                    System.out.println("============ Área total da Pirâmide ============");
                    cadastrarDadosAreaTotal();
                    setAreaTotal(getAreaBase() + getAreaLateral());
                    System.out.println("Área total Pirâmide: " + getAreaTotal() + " cm²");
                    break;

                case "v":
                    System.out.println("============ Volume da Pirâmide ============");
                    cadastrarDadosVolume();
                    setVolume((getAreaBase() * getAltura()) / 3);
                    System.out.println("Volume da Pirâmide: " + getVolume() + " cm³");
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
