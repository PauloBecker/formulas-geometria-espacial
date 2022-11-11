package FormasGeometricas;

import java.util.Scanner;

public class Dodecaedro extends Formas{
    Scanner scan = new Scanner(System.in);
    private boolean flag = true;
    public void cadastrarDados(){
        System.out.print("Informe o tamanho da aresta: ");
        setAresta(scan.nextDouble());
    }
    public void calcularDodecaedro(){
        String opc;
        while (flag){
            System.out.println("Digite em minúsculo, uma das letras abaixo para calcular as formas do Dodecaedro:");
            System.out.println(
                    "T - Calcular a área total do Dodecaedro: \n" +
                    "V - Calcular o volume do Dodecaedro: \n" +
                    "N - Retornar ao menu: \n");
            opc = scan.next();
            switch (opc){

                case "t":
                    System.out.println("============ Área total do Dodecaedro ============");
                    cadastrarDados();
                    setAreaTotal((3 * Math.sqrt(25 + (10* Math.sqrt((5*getAresta() * 2)))) ));
                    System.out.println("Área total do Dodecaedro: " + String.format("%.3f",getAreaTotal())  + " cm²");
                    break;

                case "v":
                    System.out.println("============ Volume do Dodecaedro ============");
                    cadastrarDados();
                    setAreaTotal((15 + (7* (Math.sqrt(5)) ) * (Math.pow(getAresta(),3))));
                    System.out.println("Volume do Dodecaedro: " + String.format("%.3f", getAreaTotal()) + " cm³");
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
//        System.out.println("Encerrando o sistema...");
    }

//    public void calcularDodecaedro(){
//
//        setAreaTotal((3 * Math.sqrt(25 + (10* Math.sqrt((5*getAresta() * 2)))) ));
//
//        System.out.println("Área total do Dodecaedro: " + String.format("%.3f",getAreaTotal())  + " cm²");
//    }

//    public void calcularVolumeDodecaedro(){
//
//        setAreaTotal((15 + (7* (Math.sqrt(5)) ) * (Math.pow(getAresta(),3))));
//
//        System.out.println("Volume do Dodecaedro: " + String.format("%.3f", getAreaTotal()) + " cm³");
//    }
}
