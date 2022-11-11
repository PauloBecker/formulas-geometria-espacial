package FormasGeometricas;

import java.util.Scanner;

public class Prisma extends Formas{
    Scanner scan = new Scanner(System.in);
    private boolean flag = true;
    private double areaFace;
    private double areaLateral;
    private double areaBase;

    public double getAreaFace() {
        return areaFace;
    }

    public void setAreaFace(double areaFace) {
        this.areaFace = areaFace;
    }

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

    public void cadastrarDadosAreaFace_AreaLateral(){
        System.out.print("Informe a aresta: ");
        setAresta(scan.nextDouble());
        System.out.print("Informe a altura: ");
        setAltura(scan.nextDouble());
    }

    public void cadastrarDadosAreaBase(){
        System.out.print("Informe a aresta: ");
        setAresta(scan.nextDouble());
    }

    public void cadastrarDadosVolume(){
        System.out.print("Informe a area da base: ");
        setAreaBase(scan.nextDouble());
        System.out.print("Informe a altura: ");
        setAltura(scan.nextDouble());
    }

    public void calcularPrisma(){

        String opc;
        while (flag){
            System.out.println("Digite em minúsculo, uma das letras abaixo para calcular as formas do Prisma:");
            System.out.println(
                    "A - Calcular a área da base do Prisma: \n" +
                    "L - Calcular a área lateral do Prisma: \n" +
                    "F - Calcular a área da face do Prisma: \n" +
                    "V - Calcular o volume do Prisma: \n" +
                    "N - Retornar ao menu: ");
            opc = scan.next();
            switch (opc){
                case "a":
                    System.out.println("============ Área da base do Prisma ============");
                    cadastrarDadosAreaBase();
                    setAreaBase(3 * ((Math.pow(getAresta(),3)) * (Math.sqrt((3/2)))));
                    System.out.println("Área da base do prisma: " + String.format("%.3f", getAreaBase())+ " cm²");
                    break;
                case "l":
                    System.out.println("============ Área lateral do Prisma ============");
                    cadastrarDadosAreaFace_AreaLateral();
                    setAreaLateral(6 * (getAresta() * getAltura()));

                    System.out.println("Área área lateral do Prisma: " + getAreaLateral() + " m²");
                    break;
                case "f":
                    System.out.println("============ Área da face do Prisma ============");
                    cadastrarDadosAreaFace_AreaLateral();
                    setAreaFace(getAresta() * getAltura());
                    System.out.println("Área da face do Prisma: " + getAreaFace() + " m²");
                    break;

                case "v":
                    System.out.println("============ Volume do Prisma ============");
                    cadastrarDadosVolume();
                    setVolume(getAreaBase() * getAltura());
                    System.out.println("Volume do Prisma: " + getVolume() + " cm³");
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
